package org.example.behavioral.memento;

import java.util.List;

class TextEditor {

    private final TextWindow textWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void print() {
        System.out.println(textWindow.getText());
    }

    public void write(String s) {
        textWindow.write(s);
    }

    public void save() {
        textWindow.save();
    }

    public void restore() {
        textWindow.restore();
    }

    public void restore(int ind) {
        textWindow.restore(ind);
    }

    public List<String> showSaves() {
        return textWindow.listStates();
    }
}
