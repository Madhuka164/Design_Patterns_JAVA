package com.ictech.dpatterns;

public class ComMonitor extends ComputerDecorator{
    Computer moniCom;
    public ComMonitor(Computer com) {
        moniCom = com;
    }

    @Override
    public String description() {
        return moniCom.description() + " and a Monitor ";
    }
}
