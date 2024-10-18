package com.zhenzhang0123.spring.springmicroservices.controller.helloworld;

public class HelloWorldBean {

    private String message;
    public HelloWorldBean(String hellowWorld) {
        this.message = hellowWorld;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HellowWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
