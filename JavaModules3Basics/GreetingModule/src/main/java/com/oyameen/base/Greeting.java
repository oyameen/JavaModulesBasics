package com.oyameen.base;

import com.oyameen.hello.Hello;
import com.oyameen.hi.Hi;

public class Greeting {

    public static void main(String[] args) {
        Hello hello = new Hello();
        Hi hi = new Hi();
        hello.sayHello();
        hi.sayHi();
    }
}
