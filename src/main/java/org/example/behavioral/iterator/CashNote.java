package org.example.behavioral.iterator;

class CashNote {

    private final String country;
    private final int nominal;

    public CashNote(String country, int nominal) {
        this.country = country;
        this.nominal = nominal;
    }

    public String getCountry() {
        return country;
    }

    public int getNominal() {
        return nominal;
    }

    @Override
    public String toString() {
        return "CashNote{" +
                "country='" + country + '\'' +
                ", nominal=" + nominal +
                '}';
    }
}
