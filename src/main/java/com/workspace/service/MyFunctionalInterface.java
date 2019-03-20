package com.workspace.service;

@java.lang.FunctionalInterface
public interface MyFunctionalInterface {
    String doSmth(String first, String second);

    default String s(){
        return " ";
    }

    static String t() {
        return "t";
    }
}
