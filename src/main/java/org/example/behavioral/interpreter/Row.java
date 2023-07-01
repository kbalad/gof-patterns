package org.example.behavioral.interpreter;

class Row {
    private final String name;
    private final String call;

    public Row(String name, String call) {
        this.name = name;
        this.call = call;
    }

    public String getName() {
        return name;
    }

    public String getCall() {
        return call;
    }

    @Override
    public String toString() {
        return name + " " + call;
    }
}
