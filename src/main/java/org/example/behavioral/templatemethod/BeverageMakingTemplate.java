package org.example.behavioral.templatemethod;

abstract class BeverageMakingTemplate {

    public final void makeBeverage() {
        getContainerForLiquid();
        getIngredients();
        getLiquid();
        mixEverythingInContainer();
        waitTillPrepared();
    }

    protected abstract void getContainerForLiquid();
    protected abstract void getIngredients();
    protected abstract void getLiquid();

    protected void mixEverythingInContainer() {
        System.out.println("Mixing everything in container...");
    }

    protected void waitTillPrepared() {
        System.out.println("Waiting 5 minutes...");
    }
}
