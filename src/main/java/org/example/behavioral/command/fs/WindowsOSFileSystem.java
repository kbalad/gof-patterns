package org.example.behavioral.command.fs;

public class WindowsOSFileSystem implements FileSystem {

    public static final String MSG = "[Win] file: ";

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
