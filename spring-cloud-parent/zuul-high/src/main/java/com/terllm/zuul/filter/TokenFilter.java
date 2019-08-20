package com.terllm.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class TokenFilter extends ZuulFilter{

	Logger log = LoggerFactory.getLogger(TokenFilter.class);
	
	@Override
	public Object run() {
		// TODO Auto-generated method stub
		log.info("hjkl");
		
		  RequestContext ctx = RequestContext.getCurrentContext();
	        HttpServletRequest request = ctx.getRequest();

	        log.info("--->>> TokenFilter {},{}", request.getMethod(), request.getRequestURL().toString());

	        String token = request.getParameter("token");// 获取请求的参数

	        if (StringUtils.isNotBlank(token)) {
	            ctx.setSendZuulResponse(true); //对请求进行路由
	            ctx.setResponseStatusCode(200);
	            ctx.set("isSuccess", true);
	            return null;
	        } else {
	            ctx.setSendZuulResponse(false); //不对其进行路由
	            ctx.setResponseStatusCode(400);
	            ctx.setResponseBody("token is empty");
	            ctx.set("isSuccess", false);
	            return null;
	        }
		
		
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
