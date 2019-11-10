package com.sdg.dpd;

//@Configuration
public class CustomFeignConfiguration {

//	@Autowired
//	private ObjectFactory<HttpMessageConverters> messageConverters;
//	
//	@Bean
//	public RequestInterceptor gzipIntercepter() {
//		return new RequestInterceptor() {
//			
//			@Override
//			public void apply(RequestTemplate template) {
//				template.header("Accept-Encoding", "gzip");
//				
//			}
//		};
//	}
//	
//	@Bean
//	public Decoder customDecoder() {
////		return new CustomDecoder(); // works 
////		return new DefaultGzipDecoder(new SpringDecoder(messageCoverters)); // works
////		return new DefaultGzipDecoder(new OptionalDecoder(new ResponseEntityDecoder(new SpringDecoder(messageConverters))));
//		return new OptionalDecoder(new ResponseEntityDecoder(new DefaultGzipDecoder(new SpringDecoder(messageConverters))));
//	}
}

