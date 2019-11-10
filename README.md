For #173, Run the services and check out the error.



\$ cd server-side

\$ mvn spring-boot:run



\$ cd client-side

\$ mvn spring-boot:run





------

APPLICATION FAILED TO START

***************************



Description:



The bean 'dupFallback', defined in class path resource [com/sdg/dpd/DupClientConfiguration.class], could not be registered. A bean with that name has already been defined in file [/Users/jkim/Downloads/openfeign-issue-example-master/client-side/target/classes/com/sdg/dpd/DupFallback.class] and overriding is disabled.





\-----





Originally Used For :



This is an example to reproduce the problem reported in [spring-cloud-netflix #3416](https://github.com/spring-cloud/spring-cloud-netflix/issues/3416) and [spring-cloud-openfeign #145](https://github.com/spring-cloud/spring-cloud-openfeign/issues/145).



Steps:

\1. Run the server application

\2. Run the client application

\3. HTTP GET from http://localhost:8002/client/get



Phenomenon:

\1. Under normal circumstances, we will get the normal response, "String from server".

\2. But when we config `server.compression.enabled=true` in server-side and `feign.compression.response.enabled=true` in client-side at the same time, we will get garbled, like ".)??KWH+??U(N-*K-".