package org.example.behavioral.iterator;

import java.util.List;

class Demo {
    public static void main(String[] args) {
        Wallet wallet = new WalletImpl();
        populateNotes().forEach(it -> {
            System.out.println(it);
            wallet.addCashNote(it);
        });
        System.out.println("****************************");

        CashIterator countryIterator = wallet.iterator("Serbia");
        while (countryIterator.hasNext()) {
            System.out.println(countryIterator.next());
        }
        System.out.println("****************************");

        CashIterator nominalIterator = wallet.iterator(100);
        CashNote cashNote = null;
        while (nominalIterator.hasNext()) {
            cashNote = nominalIterator.next();
            System.out.println(cashNote);
        }
        System.out.println("****************************");

        if (cashNote != null) {
            wallet.removeCashNote(cashNote);
        }
    }

    private static List<CashNote> populateNotes() {
        return List.of(
                new CashNote("Russia", 10),
                new CashNote("Russia", 100),
                new CashNote("Russia", 1000),
                new CashNote("USA", 1),
                new CashNote("USA", 5),
                new CashNote("USA", 10),
                new CashNote("USA", 100),
                new CashNote("Serbia", 10),
                new CashNote("Serbia", 50),
                new CashNote("Serbia", 100),
                new CashNote("Serbia", 1000)
        );
    }
}
