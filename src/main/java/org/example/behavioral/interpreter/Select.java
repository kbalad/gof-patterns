package org.example.behavioral.interpreter;

import java.util.List;

class Select implements Expression {

    private final String column;
    private final From from;

    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setColumn(column);
        return from.interpret(ctx);
    }
}
