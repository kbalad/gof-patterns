package org.example.behavioral.interpreter;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {

    private final Predicate<String> filter;

    public Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setWhereFilter(filter);
        return ctx.search();
    }
}
