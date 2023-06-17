package org.example.behavioral.templatemethod;

public class ChocolateMilkMaking extends BeverageMakingTemplate {

    @Override
    protected void getContainerForLiquid() {
        System.out.println("took glass");
    }

    @Override
    protected void getIngredients() {
        System.out.println("took chocolate");
    }

    @Override
    protected void getLiquid() {
        System.out.println("took milk");
    }

    @Override
    protected void waitTillPrepared() {
        System.out.println("don't wait for anything!");
    }
}
