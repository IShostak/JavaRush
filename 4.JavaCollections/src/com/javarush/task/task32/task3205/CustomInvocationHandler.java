package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler  implements InvocationHandler {
    SomeInterfaceWithMethods interfaceWithMethods;

    public CustomInvocationHandler(SomeInterfaceWithMethods interfaceWithMethods) {
        this.interfaceWithMethods = interfaceWithMethods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
