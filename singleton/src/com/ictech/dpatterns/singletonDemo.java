package com.ictech.dpatterns;

public class singletonDemo {

    public static void main(String[] args) {
            EagerSingleton eager=EagerSingleton.getInstance();
                eager.showMessage();



                LazySingleton lazy=LazySingleton.getInstance();
                lazy.showMessage();
    }
}
