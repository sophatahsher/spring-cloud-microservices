## Deploy Java Spring Boot Microservices with Docker

Dockerizing Spring Boot microservices allows you to package each services with its dependencies into an isolated container, eliminating environmental discrepancies across dev, test, and production.

Build all applications as docker images
```bash
./mvnw spring-boot:build-image -DskipTests
```
Or specific demon docker 
```bash
docker context ls
docker context use desktop-linux/default
DOCKER_HOST=unix:///home/user/.docker/desktop/docker.sock ./mvnw spring-boot:build-image -DskipTests
```

## Spring Boot Microservices Images
    - https://hub.docker.com/u/dev09docker (Docker Bub)
	- dev09docker/uranusv1-currency-exchange-microservice:0.0.1-SNAPSHOT (Currency Exchange Microservice)
    - dev09docker/uranusv1-currency-conversion-microservice:0.0.1-SNAPSHOT (Currency Conversion Microservice)
    - dev09docker/uranusv1-naming-server:0.0.1-SNAPSHOT (Eureka Server)
    - dev09docker/uranusv1-api-gateway:0.0.1-SNAPSHOT (API Gateway)

## Testing URLs 
### Currency Exchange Microservice
[http://localhost:8000/currency-exchange/from/USD/to/INR](http://localhost:8000/currency-exchange/from/USD/to/INR)

### Currency Conversion Microservice
[http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10](http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10)
[http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10](http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10)

### API GATEWAY
[http://localhost:8765/currency-exchange/from/USD/to/INR](http://localhost:8765/currency-exchange/from/USD/to/INR)
[http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10](http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10)
[http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10](http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10)
[http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10](http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10)

### Eureka Server
A **Eureka server**, developed by Netflix, is **a central service registry used in microservices architectures**. It allows microservices (Eureka clients) to locate and communicate with each other dynamically without the need to hardcode IP addresses or hostnames.
[http://localhost:8761/](http://localhost:8761/)

### Zipkin Tracing Server
**Zipkin** is a distributed tracing system. It helps gather timing data needed to troubleshoot latency problems in service architectures.

[http://localhost:9411/](http://localhost:9411/)

    