package com.collinson.qa;

public class VendingMachineFactory {

    private VendingMachineFactory() {

    }

    public static VendingMachine createVendingMachine() {

        return new VendingMachineImpl();
    }
}
