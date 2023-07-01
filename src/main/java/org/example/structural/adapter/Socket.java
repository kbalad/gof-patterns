package org.example.structural.adapter;

class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }

}
