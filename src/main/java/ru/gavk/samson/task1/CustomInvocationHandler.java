package ru.gavk.samson.task1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        switch (method.getName()) {
            case "buttonSearch":
                return ".//*[@test-attr='button_search']";
            case "textInputSearch":
                return ".//*[@test-attr='input_search']";
        }
        return null;
    }
}
