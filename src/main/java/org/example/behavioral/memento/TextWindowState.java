package org.example.behavioral.memento;

class TextWindowState {

    private final String text;

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
