package org.example.behavioral.interpreter;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Expression query1 = new Select("name", new From("people"));
        Context ctx = new Context();
        List<String> res = query1.interpret(ctx);
        System.out.println(res);

        Expression query2 = new Select("*", new From("people"));
        res = query2.interpret(ctx);
        System.out.println(res);

        Expression query3 = new Select(
                "name",
                new From(
                        "people",
                        new Where(name -> name.toLowerCase().startsWith("d"))
                )
        );
        res = query3.interpret(ctx);
        System.out.println(res);

    }
}
