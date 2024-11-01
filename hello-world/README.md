# Hello, Modular World

A simple Hello-World-example for the Java Platform Module System (JPMS).
Learn more about it [in NipAFX's JPMS tutorial](https://blog.codefx.org/java/java-module-system-tutorial).

## JDK commands for jpms-hello-word module

In the directory:  C:\src\NetBeans12\JavaModules\hello-world\jpms-hello-world>

> javac -d .\target\classes\ .\src\main\java\org\codefx\demo\jpms\*.java
> jar --create --file .\target\hello-modules.jar --main-class org.codefx.demo.jpms.HelloModularWorld -C .\target\classes\ .
> java --module-path .\target\hello-modules.jar --module org.codeafx.demo.jpms_hello_world
> java --list-modules
