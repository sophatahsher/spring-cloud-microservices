
## Open Existing Project in the same window using IntelliJ IDEA
If you want to display multiple projects in the same window then just:
```bash
File → Settings → Appearence & Behavior → System Settings → Project → Ask
```

## Open Existing Project:
```bash
File → New → Module from Existing Sources... → select your project folder → Maven → OK
```

## Re-add Project Into Maven Project (When the IntelliJ lost the Maven module/run configuration):
```bash
Right click pom.xml → Add as Maven Project
```

## Testing URls

Here are the all relevant microservice application's urls

### Currency Exchange Microservice
```bash
http://localhost:8000/currency-exchange/from/USD/to/IND
```

### Currency Conversion Microservice
```bash
http://localhost:8100/currency-conversion/from/USD/to/IND/quantity/10
http://localhost:8100/currency-conversion-feign/from/USD/to/IND/quantity/10
```

### Eureka Server Url
```bash
http://localhost:8761/
```

### API Gateway Application
```bash
http://localhost:8765/
http://localhost:8765/CURRENCY-EXCHANGE-MICROSERVICE/currency-exchange/from/USD/to/IND
http://localhost:8765/CURRENCY-CONVERSION-MICROSERVICE/currency-conversion/from/USD/to/IND/quantity/10
http://localhost:8765/CURRENCY-CONVERSION-MICROSERVICE/currency-conversion-feign/from/USD/to/IND/quantity/10
http://localhost:8765/CURRENCY-CONVERSION-MICROSERVICE/currency-conversion-new/from/USD/to/IND/quantity/10
```

### Zipkin Distributed Tracing Server

Launching Zipkin container using docker.
```bash
docker run -d -p 9411:9411 openzipkin/zipkin
```

Zipkin Server Address
```bash
http://localhost:9411/
```


## Learning Roadmap
Welcome! In this Dialogue, we'll explore the key steps in creating a microservice ecosystem with Spring Cloud. We'll cover how to build different components and connect them to work together seamlessly.

**Here's what we'll cover:**
**Setting up a Configuration Server:** We'll start by creating a centralized place to manage our microservice configurations.
**Building a Limits Microservice:** You'll learn how to create a simple microservice that provides dynamic limits.
**Implementing Service Registration and Discovery:** We'll integrate Eureka to allow our microservices to find each other.
**Creating an API Gateway:** We'll set up a gateway to route external requests to our internal microservices.
**Connecting the Pieces:** We'll bring everything together to form a functional microservice ecosystem.



