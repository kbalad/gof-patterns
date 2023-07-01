package org.example.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        TextWindow wnd = new TextWindow();
        TextEditor editor = new TextEditor(wnd);
        editor.save();

        System.out.println("Editor:");
        editor.write("hello world!");
        editor.save();
        editor.print();
        System.out.println("Saves: \n" + editor.showSaves());
        System.out.println();
        System.out.println();

        System.out.println("Editor:");
        editor.restore(0);
        editor.write("bye!");
        editor.save();
        editor.print();
        System.out.println("Saves: \n" + editor.showSaves());
        System.out.println();
        System.out.println();
    }
}
