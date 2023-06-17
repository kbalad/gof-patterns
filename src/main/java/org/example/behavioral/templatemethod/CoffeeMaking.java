package org.example.behavioral.templatemethod;

public class CoffeeMaking extends BeverageMakingTemplate {

    @Override
    protected void getContainerForLiquid() {
        System.out.println("took empty cup...");
    }

    @Override
    protected void getIngredients() {
        System.out.println("took coffee powder...");
    }

    @Override
    protected void getLiquid() {
        System.out.println("took boiling water (90 C)...");
    }
}
