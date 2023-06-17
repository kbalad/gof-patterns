package org.example.behavioral.templatemethod;

class BeveragesClient {
    public static void main(String[] args) {
        test(new CoffeeMaking());
        test(new ChocolateMilkMaking());
    }

    private static void test(BeverageMakingTemplate template) {
        template.makeBeverage();
        System.out.println("=========================");
    }
}
