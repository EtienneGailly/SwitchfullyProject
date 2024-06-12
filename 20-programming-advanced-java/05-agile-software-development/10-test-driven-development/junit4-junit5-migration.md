# JUnit 4 to 5 migration
Spring 5.2 (and Spring Boot 2.2) have arrived 🍾, and they use JUnit 5 as their default unit testing library.

> **BEWARE:** When searching online for JUnit resources, you will encounter a lot of JUnit 4 examples.\
> Although the essence remains the same, these JUnit 4 examples require a translation to JUnit 5.\
> In the table below the actions are described to make the switch.

| | JUnit 4 | JUnit 5 |
|-|-|-|
| Unit test `@Test` | `@Test` requires `import org.junit.Test;` | `@Test` requires `import org.junit.jupiter.api.Test;` |
| Unit test `@Before` becomes `@BeforeEach` | `@Before` requires `import org.junit.Before;` | `@BeforeEach` requires `import org.junit.jupiter.api.BeforeEach;` |
| Assertions | `import static org.junit.Assert.*;` | `import static org.junit.jupiter.api.Assertions.*;` |
| Assert exception | `@Test(expected = NullPointerException.class)` | `assertThrows(NullPointerException.class, () -> { Object o = null; o.toString(); });` |
| `@RunWith` becomes `@ExtendWith` | `@RunWith(MockitoJUnitRunner.class)` | `@ExtendWith(MockitoExtension.class)` |
| Mocking | `@RunWith(MockitoJUnitRunner.class)` | `@ExtendWith(MockitoExtension.class)` |
| Integration Test | `extends AbstractJUnit4SpringContextTests` + `@RunWith(SpringRunner.class)` | `@ExtendWith(SpringExtension.class)` or `@SpringBootTest` |

## Useful Maven dependencies & base configuration
If you work inside `track-java` everything is already properly set up for you, and no fiddling with Maven is required. If you decide to create a java (& maven) project from scratch, the snippets below help you to get your unit tests running smoothly.

### JUnit 5
JUnit is included in Spring. As of Spring 5.2 (& Spring Boot 2.2 (via spring-boot-starter-test)), JUnit 5 is the default version.
```xml
<properties>
    <java.version>12</java.version>
</properties>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>2.2.0</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <version>2.2.0</version>
        <scope>test</scope>
        <exclusions>
            <exclusion>
                <groupId>org.junit.vintage</groupId>
                <artifactId>junit-vintage-engine</artifactId>
            </exclusion>
        </exclusions>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.22.2</version>
            <dependencies>
                <dependency>
                    <groupId>org.junit.platform</groupId>
                    <artifactId>junit-platform-surefire-provider</artifactId>
                    <version>1.3.2</version>
                </dependency>
            </dependencies>
        </plugin>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

Should you need to include JUnit 5 explicitly in your pom file:
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>${junit.version}</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>${junit.version}</version>
    <scope>test</scope>
</dependency>
```
### Mockito
Included in spring-boot-starter-test

Should you need to include Mockito explicitly in your pom file:
```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>3.1.0</version>
    <scope>test</scope>
</dependency>
```

### REST-assured
Useful testing library for REST services.

Maven configuration:
```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>4.1.2</version>
    <scope>test</scope>
</dependency>
```