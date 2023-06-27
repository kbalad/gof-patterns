package org.example.behavioral.command;

public class MacOSFileSystem implements FileSystem {

    public static final String MSG = "[Mac] file: ";

    @Override
    public void openFile() {
        System.out.println(MSG + "open");
    }

    @Override
    public void closeFile() {
        System.out.println(MSG + "close");
    }

    @Override
    public void deleteFile() {
        System.out.println(MSG + "delete");
    }
}
