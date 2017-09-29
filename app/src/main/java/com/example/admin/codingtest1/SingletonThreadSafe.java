package com.example.admin.codingtest1;

/**
 * Created by Admin on 9/29/2017.
 */

public class SingletonThreadSafe {

    private static SingletonThreadSafe sing = new SingletonThreadSafe();

    private SingletonThreadSafe() {}

    public static SingletonThreadSafe getInstance() {
        if( sing == null )
            sing = new SingletonThreadSafe();
        return sing;
    }
}
