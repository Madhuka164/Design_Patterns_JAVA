package com.ictech.dpatterns;

public class EagerSingleton {
    //crating a private instance
    private static EagerSingleton es= new EagerSingleton();

    //creating constructor private

    private EagerSingleton() {
    }

    //return only object available
    public static EagerSingleton getInstance() {
        return es;
    }

    //sample method to test
    public void showMessage(){
        System.out.println("hello from eager singleton");
    }
}
