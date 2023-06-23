package org.example.behavioral.chainofresponsibility;

abstract class BaseDispenseChain implements DispenseChain {

    private DispenseChain nextChain;
    private final int banknoteAmount;

    public BaseDispenseChain(int banknoteAmount) {
        this.banknoteAmount = banknoteAmount;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= banknoteAmount) {
            int num = cur.getAmount() / banknoteAmount;
            int rem = cur.getAmount() % banknoteAmount;
            System.out.printf("Dispensing %d %d$ note%n", num, banknoteAmount);
            if (rem != 0) {
                nextChain.dispense(new Currency(rem));
            }
        } else {
            nextChain.dispense(cur);
        }
    }
}
