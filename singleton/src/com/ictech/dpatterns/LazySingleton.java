package com.ictech.dpatterns;

public class LazySingleton {
    //make private static instance
    private static LazySingleton ls;

    //make constructor private

    private LazySingleton() {
    }

    //return the only object available
    public static LazySingleton getInstance(){
        if(ls==null){
            ls=new LazySingleton();
        }
        return ls;
    }

    //sample method to test
    public void showMessage(){
        System.out.println("hello this is lazy singleton");
    }
}
