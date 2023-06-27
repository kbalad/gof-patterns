package org.example.behavioral.command.command;

import org.example.behavioral.command.fs.FileSystem;

public class OpenFileCommand implements Command {

    private final FileSystem fs;

    public OpenFileCommand(FileSystem fs) {
        this.fs = fs;
    }

    @Override
    public void execute() {
        fs.openFile();
    }
}
