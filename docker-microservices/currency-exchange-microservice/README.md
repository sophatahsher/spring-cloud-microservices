### Currency Exchange Service
```bash
http://localhost:8001/currency-exchange/from/USD/to/KHR
```

### Currency Conversion Service
```bash
http://localhost:8002/currency-conversion/from/USD/to/KHR
```

### Open Existing Project in the same window using IntelliJ IDEA
If you want to display multiple projects in the same window then just:
```bash
File → Settings → Appearence & Behavior → System Settings → Project → Ask
```
Open Existing Project:
```bash
File → New → Module from Existing Sources... → select your project folder → Maven → OK
```


### Learning Road Map
Welcome! In this Dialogue, we'll explore the key steps in creating a microservice ecosystem with Spring Cloud. We'll cover how to build different components and connect them to work together seamlessly.

**Here's what we'll cover:**
**Setting up a Configuration Server:** We'll start by creating a centralized place to manage our microservice configurations.
**Building a Limits Microservice:** You'll learn how to create a simple microservice that provides dynamic limits.
**Implementing Service Registration and Discovery:** We'll integrate Eureka to allow our microservices to find each other.
**Creating an API Gateway:** We'll set up a gateway to route external requests to our internal microservices.
**Connecting the Pieces:** We'll bring everything together to form a functional microservice ecosystem.