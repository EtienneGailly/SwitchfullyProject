# Spring Boot Codelab 01

The goal of this codelab is to use a Spring Beans in your tests.

## Context


## Task list
1. Run TestSuite. If everything is set up correctly SecondCounterTest should fail.
   1. The reason that TestSuite fails is that both tests use a different Counter object.
   2. How can we make sure that all tests use the same object? Spring Beans!
2. Make FirstCounterTest a Sprint Boot Test. What was the annotation again?
   1. Run FirstCounterTest it should fail with an IllegalStateException
   2. Before SpringBoot can start it needs a starting configuration. Provide `TestConfig.class` as a starting point.
   3. Add `@Configuration` to the `TestConfig` file. It's not needed, but it's a good practice to do so.
3. We've enabled Spring Boot! Now let's create are own bean.
   1. Add an `@Bean` definition for `Counter` to `TestConfig`
4. Autowire the Counter Bean object in FirstCounterTest instead of using `new Counter()`
5. Run FirstCounterTest again. It should work.
6. Repeat the same steps for SecondCounterTest
7. Run TestSuite. Everything should pass now.

## Component Scan
1. An alternative to bean definitions is to create them automatically with a component scan.
2. Make Counter a component. What was the annotation?
3. Let spring boot scan do a component scan. Add the correct annotation to TestConfig.
4. Run the TestSuite. It will fail with a BeanDefinitionOverrideException.
   1. The reason is that we have two bean definitions for Counter
5. Remove the original bean definition and run TestSuite again. Everything should pass.
