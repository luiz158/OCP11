package io.javabrain.unit1;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Conrete Class - Hello World!");
    }
}
