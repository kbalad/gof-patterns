package org.example.behavioral.command;

import org.example.behavioral.command.command.CloseFileCommand;
import org.example.behavioral.command.command.Command;
import org.example.behavioral.command.command.DeleteFileCommand;
import org.example.behavioral.command.command.OpenFileCommand;
import org.example.behavioral.command.fs.FileSystem;
import org.example.behavioral.command.fs.MacOSFileSystem;

public class Main {
    public static void main(String[] args) {

        FileSystem fs = new MacOSFileSystem();

        Command command = new OpenFileCommand(fs);
        command.execute();

        command = new CloseFileCommand(fs);
        command.execute();

        command = new DeleteFileCommand(fs);
        command.execute();
    }
}
