# Read Me First
The following was discovered as part of building this project:

* Spring Cloud Gateway requires Spring WebFlux, your choice of Spring Web has been replaced accordingly.
* The following dependencies are not known to work with Spring Native: 'Spring Boot DevTools, Spring Configuration Processor, Spring Batch, Quartz Scheduler, Spring cache abstraction, Spring Shell, Apache Camel, Spring for Apache ActiveMQ Artemis, Spring for Apache ActiveMQ 5, Spring Integration, Spring for RabbitMQ, Spring for Apache Geode, Zipkin Client, Influx, codecentric's Spring Boot Admin (Client), codecentric's Spring Boot Admin (Server), JOOQ Access Layer, Apache Derby Database, Flyway Migration, MyBatis Framework, MS SQL Server Driver, Okta, Task, Cloud Bootstrap, Consul Configuration, Vault Configuration, Apache Zookeeper Configuration, Apache Zookeeper Discovery, Eureka Server, Cloud Foundry Discovery, Eureka Discovery Client, Consul Discovery, Cloud Bus, Cloud Stream, Gateway, Cloud LoadBalancer, OpenFeign, Apache Freemarker, Groovy Templates, Testcontainers, Embedded LDAP Server, Contract Stub Runner, Embedded MongoDB Database, Contract Verifier'. As a result, your application may not work as expected.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/gradle-plugin/reference/html/#build-image)
* [Spring Integration JMS Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jms.html)
* [Spring Integration AMQP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/amqp.html)
* [Spring Integration JDBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jdbc.html)
* [Spring Integration JPA Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jpa.html)
* [Spring Integration MongoDB Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/mongodb.html)
* [Spring Integration R2DBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/r2dbc.html)
* [Spring Integration Redis Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/redis.html)
* [Spring Integration Apache Geode Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/gemfire.html)
* [Spring Integration Test Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/testing.html)
* [Spring Integration Apache Kafka Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/kafka.html)
* [Spring Integration Mail Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/mail.html)
* [Spring Integration Security Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/security.html)
* [Spring Integration WebFlux Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/webflux.html)
* [Spring Integration STOMP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/stomp.html)
* [Spring Integration WebSocket Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/websocket.html)
* [Testcontainers RabbitMQ Module Reference Guide](https://www.testcontainers.org/modules/rabbitmq/)
* [Testcontainers MongoDB Module Reference Guide](https://www.testcontainers.org/modules/databases/mongodb/)
* [Testcontainers R2DBC support Reference Guide](https://www.testcontainers.org/modules/databases/r2dbc/)
* [Testcontainers Kafka Modules Reference Guide](https://www.testcontainers.org/modules/kafka/)
* [Testcontainers MySQL Module Reference Guide](https://www.testcontainers.org/modules/databases/mysql/)
* [Testcontainers MS SQL Server Module Reference Guide](https://www.testcontainers.org/modules/databases/mssqlserver/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#using.devtools)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#howto.batch)
* [Validation](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#io.validation)
* [Quartz Scheduler](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#io.quartz)
* [Spring cache abstraction](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#io.caching)
* [Spring Shell](https://spring.io/projects/spring-shell)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#io.email)
* [Spring for Apache ActiveMQ Artemis](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#messaging.jms.artemis)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#messaging.kafka)
* [WebSocket](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#messaging.websockets)
* [Spring for Apache ActiveMQ 5](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#messaging.jms.activemq)
* [Spring Integration](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#messaging.spring-integration)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#messaging.amqp)
* [Apache Kafka Streams Support](https://docs.spring.io/spring-kafka/docs/current/reference/html/#streams-kafka-streams)
* [Apache Kafka Streams Binding Capabilities of Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/#_kafka_streams_binding_capabilities_of_spring_cloud_stream)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.nosql.mongodb)
* [Spring for Apache Geode](https://docs.spring.io/spring-boot-data-geode-build/current/reference/html5/)
* [Spring Data Reactive Redis](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.nosql.redis)
* [Influx](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#actuator.metrics.export.influx)
* [codecentric's Spring Boot Admin (Client)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [codecentric's Spring Boot Admin (Server)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#actuator)
* [JOOQ Access Layer](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jooq)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.r2dbc)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jdbc)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#howto.data-initialization.migration-tool.flyway)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.security.oauth2.client)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.security)
* [Okta Spring Boot documentation](https://github.com/okta/okta-spring-boot#readme)
* [Function](https://docs.spring.io/spring-cloud-function/docs/current/reference/html/spring-cloud-function.html)
* [Task](https://docs.spring.io/spring-cloud-task/docs/current/reference/html/)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)
* [Resilience4J](https://docs.spring.io/spring-cloud-circuitbreaker/docs/current/reference/html/#configuring-resilience4j-circuit-breakers)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Spring Cloud Consul Quick Start](https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#distributed-configuration-usage)
* [Vault Client Quick Start](https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage)
* [Config Server](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_server)
* [Apache Zookeeper Quick Start](https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#distributed-configuration-usage)
* [Apache Zookeeper Discovery](https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#spring-cloud-zookeeper-discovery)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [Cloud Foundry Discovery](https://docs.spring.io/spring-cloud-cloudfoundry/docs/current/reference/html/)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [Consul Discovery](https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#spring-cloud-consul-discovery)
* [Cloud Bus](https://docs.spring.io/spring-cloud-bus/docs/current/reference/html/)
* [Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/html/spring-cloud-stream.html#spring-cloud-stream-overview-introducing)
* [Gateway](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)
* [Cloud LoadBalancer](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/#spring-cloud-loadbalancer)
* [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)
* [Mustache](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Groovy Templates](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Testcontainers](https://www.testcontainers.org/)
* [Embedded LDAP Server](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.nosql.ldap.embedded)
* [Contract Stub Runner](https://cloud.spring.io/spring-cloud-contract/reference/htmlsingle/#features-stub-runner)
* [Embedded MongoDB Database](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.nosql.mongodb.embedded)
* [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/current/reference/html5/)
* [Contract Verifier](https://cloud.spring.io/spring-cloud-contract/reference/htmlsingle/)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.reactive)

### Guides
The following guides illustrate how to use some features concretely:

* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Using Apache Camel with Spring Boot](https://camel.apache.org/camel-spring-boot/latest/spring-boot.html)
* [Messaging with JMS](https://spring.io/guides/gs/messaging-jms/)
* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
* [Java Message Service API via Apache ActiveMQ Classic.](https://spring.io/guides/gs/messaging-jms/)
* [Integrating Data](https://spring.io/guides/gs/integration/)
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Samples for using Apache Kafka Streams with Spring Cloud stream](https://github.com/spring-cloud/spring-cloud-stream-samples/tree/master/kafka-streams-samples)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Using Spring for Apache Geode](https://github.com/spring-projects/spring-boot-data-geode/tree/master/spring-geode-samples)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Acessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Okta-Hosted Login Page Example](https://github.com/okta/samples-java-spring/tree/master/okta-hosted-login)
* [Custom Login Page Example](https://github.com/okta/samples-java-spring/tree/master/custom-login)
* [Okta Spring Security Resource Server Example](https://github.com/okta/samples-java-spring/tree/master/resource-server)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)
* [Client-side load-balancing with Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#spring-aot-gradle)
* [Switch from Apache Geode to Pivotal Cloud Cache](https://docs.spring.io/spring-boot-data-geode-build/current/reference/html5/#geode-gemfire-switch)
* [R2DBC Homepage](https://r2dbc.io)
* [Various sample apps using Spring Cloud Function](https://github.com/spring-cloud/spring-cloud-function/tree/main/spring-cloud-function-samples)
* [Declarative REST calls with Spring Cloud OpenFeign sample](https://github.com/spring-cloud-samples/feign-eureka)

## OAuth 2.0 and OIDC with Okta

If you don't have a free Okta developer account, you can create one with [the Okta CLI](https://cli.okta.com):

```bash
$ okta register
```

Then, register your Spring Boot app on Okta using:

```bash
$ okta apps create
```

Select **Web** > **Okta Spring Boot Starter** and accept the default redirect URIs.

## Spring Native

This project has been configured to let you generate either a lightweight container or a native executable.

### Lightweight Container with Cloud Native Buildpacks
If you're already familiar with Spring Boot container images support, this is the easiest way to get started with Spring Native.
Docker should be installed and configured on your machine prior to creating the image, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-buildpacks).

To create the image, run the following goal:

```
$ ./gradlew bootBuildImage
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 Item_Microservice:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM native-image compiler should be installed and configured on your machine, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-native-build-tools).

To create the executable, run the following goal:

```
$ ./gradlew nativeBuild
```

Then, you can run the app as follows:
```
$ build/native-image/Item_Microservice
```
