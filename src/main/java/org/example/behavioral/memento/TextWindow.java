package org.example.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TextWindow {

    private final List<TextWindowState> states;
    private StringBuilder textBuilder;

    public TextWindow() {
        states = new ArrayList<>();
        this.textBuilder = new StringBuilder();
    }

    public String getText() {
        return textBuilder.toString();
    }

    public void write(String text) {
        textBuilder.append(text);
    }

    public void save() {
        states.add(new TextWindowState(textBuilder.toString()));
    }

    // restores last state
    public void restore() {
        restore(states.size() - 1);
    }

    public void restore(int ind) {
        if (ind > states.size()) {
            throw new IllegalArgumentException();
        }
        textBuilder = new StringBuilder(states.get(ind).getText());
    }

    public List<String> listStates() {
        return states.stream().map(TextWindowState::getText).collect(Collectors.toList());
    }
}
