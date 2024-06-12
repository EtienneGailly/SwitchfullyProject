# Spring Boot Codelab 02

The goal of this codelab is to read properties from a file.

## Context
Properties are a core part of software development. They allow you to:
- Add data that should not be part of your source files. Like passwords, secrets, etc... .
- Change core parts of your application without needing to recompiling your code. Like urls, e-mail addresses, etc... .

In this example your properties are in your source files, usually this not the case.
Especially the important properties (for your production environment) will never be in your source files.
However, the same principles apply if your properties are in your source files then if they are not. (So this codelab is still useful :) )

## Task list
1. Run `ParametersTest`. It should fail. `Parameters` needs to become a Spring Bean first.
2. Make `ParameterTest` a Spring Boot Test. (Follow the same steps as in the previous codelab)
3. Make `Parameters` a Spring Bean. Either manually or with a component scan. (If stuck go back to the previous codelab)
4. In `ParameterTest` autowire the `parameters` field.
5. Run `ParameterTest`. It should fail. We haven't mapped the properties yet!
6. Initialize `name`, `address` and `url` in Parameters with their corresponding properties. (Use the @Value annotation)
7. Run `ParameterTest` again. This time it should work.

## Extra
Try to make `ParameterProductionTest` work as well.
You'll need the same steps as with `ParameterTest` with the difference that `Parameters` needs to read from `application-production.properties` instead of `application.properties`.
Look at Spring Profiles to help you out.
