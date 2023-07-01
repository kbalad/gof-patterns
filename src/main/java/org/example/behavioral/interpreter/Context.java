package org.example.behavioral.interpreter;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Context {

    private static final Map<String, List<Row>> tables = new HashMap<>();
    private static final Predicate<String> TRUE_PREDICATE = x -> true;

    static {
        List<Row> list = List.of(
                new Row("John", "Doe"),
                new Row("Jan", "Kowalski"),
                new Row("Dominic", "Doom")
        );
        tables.put("people", list);
    }

    private String table;
    private String column;
    private Predicate<String> whereFilter = TRUE_PREDICATE; // always true by default

    public void setTable(String table) {
        this.table = table;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void setWhereFilter(Predicate<String> whereFilter) {
        if (whereFilter == null) {
            throw new IllegalArgumentException("Where filter should not be null");
        }
        this.whereFilter = whereFilter;
    }

    List<String> search() {

        Function<Row, String> columnMapper = row -> switch (column) {
            case "name" -> row.getName();
            case "call" -> row.getCall();
            case "*" -> row.toString();
            default -> throw new IllegalArgumentException("Column with name=" + column + " does not exists");
        };

        List<String> res = tables.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .map(columnMapper)
                .filter(whereFilter)
                .collect(Collectors.toList());

        clear();

        return res;
    }

    private void clear() {
        table = null;
        column = null;
        whereFilter = TRUE_PREDICATE;
    }


}
