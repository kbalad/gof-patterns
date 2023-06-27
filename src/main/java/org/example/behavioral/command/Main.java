package org.example.behavioral.command;

public class Main {
    public static void main(String[] args) {

        FileSystem fs = new MacOSFileSystem();

        fs.openFile();
        fs.closeFile();
        fs.deleteFile();
    }
}
