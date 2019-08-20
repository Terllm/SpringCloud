package com.terllm.zuul.fallBack;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;


@Component
public class ProducerFallback implements FallbackProvider {

	Logger log = LoggerFactory.getLogger(ProducerFallback.class);
	
	
	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
 		return "spring-cloud-producer";
	}

	@Override
	public ClientHttpResponse fallbackResponse() {
		// TODO Auto-generated method stub
		return new ClientHttpResponse() {

			@Override
			public HttpHeaders getHeaders() {
				// TODO Auto-generated method stub
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				return headers;
			}

			@Override
			public InputStream getBody() throws IOException {
				// TODO Auto-generated method stub
				return new ByteArrayInputStream("ERROR".getBytes());
			}

			@Override
			public String getStatusText() throws IOException {
				// TODO Auto-generated method stub
				return "ok";
			}

			@Override
			public HttpStatus getStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.OK;
			}

			@Override
			public int getRawStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return 200;
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub

			}
		};
	}

	@Override
	public ClientHttpResponse fallbackResponse(Throwable cause) {
		// TODO Auto-generated method stub
		  if (cause != null && cause.getCause() != null) {
	            String reason = cause.getCause().getMessage();
	            log.info("reason:"+reason);
	        }
	        return fallbackResponse();
		
		
	}

}
