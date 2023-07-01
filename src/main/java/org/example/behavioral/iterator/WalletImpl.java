package org.example.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

class WalletImpl implements Wallet {

    private final List<CashNote> cashNotes = new ArrayList<>();

    @Override
    public void addCashNote(CashNote cashNote) {
        cashNotes.add(cashNote);
    }

    @Override
    public void removeCashNote(CashNote cashNote) {
        cashNotes.remove(cashNote);
    }

    @Override
    public CashIterator iterator(int exactNominal) {
        return new CashNoteIteratorImpl(cashNotes, exactNominal);
    }

    @Override
    public CashIterator iterator(String country) {
        return new CashNoteIteratorImpl(cashNotes, country);
    }

    private static final class CashNoteIteratorImpl implements CashIterator {

        private final List<CashNote> cashNotes;
        private String country;
        private int exactNominal;
        private int nextPtr = -1; // not found

        public CashNoteIteratorImpl(List<CashNote> cashNotes, String country) {
            this.cashNotes = cashNotes;
            this.country = country;
            updatePtrToNext();
        }

        public CashNoteIteratorImpl(List<CashNote> cashNotes, int exactNominal) {
            this.cashNotes = cashNotes;
            this.exactNominal = exactNominal;
            updatePtrToNext();
        }

        @Override
        public boolean hasNext() {
            return nextPtr != -1;
        }

        @Override
        public CashNote next() {
            CashNote res = cashNotes.get(nextPtr);
            updatePtrToNext();
            return res;
        }

        private void updatePtrToNext() {
            for (int ptr = nextPtr + 1; ptr < cashNotes.size(); ptr++) {
                CashNote cur = cashNotes.get(ptr);
                boolean nominalFilterRes = exactNominal == 0 || exactNominal == cur.getNominal();
                boolean countryFilterRes = (country == null || country.isBlank()) || country.equalsIgnoreCase(cur.getCountry());
                if (nominalFilterRes && countryFilterRes) {
                    nextPtr = ptr;
                    return;
                }
            }
            nextPtr = -1;
        }
    }
}
