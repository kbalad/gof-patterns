package org.example.behavioral.iterator;

interface Wallet {

    void addCashNote(CashNote cashNote);
    void removeCashNote(CashNote cashNote);

    CashIterator iterator(int exactNominal);
    CashIterator iterator(String country);
}
