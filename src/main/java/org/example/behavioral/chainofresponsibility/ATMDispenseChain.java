package org.example.behavioral.chainofresponsibility;

public class ATMDispenseChain {

    private final DispenseChain root;

    public ATMDispenseChain() {
        root = new Dollar50Dispenser();
        DispenseChain d2 = new Dollar20Dispenser();
        DispenseChain d3 = new Dollar10Dispenser();

        root.setNextChain(d2);
        d2.setNextChain(d3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atm = new ATMDispenseChain();

        atm.root.dispense(new Currency(130));
    }
}
