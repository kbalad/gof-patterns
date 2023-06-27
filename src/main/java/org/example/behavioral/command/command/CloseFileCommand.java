package org.example.behavioral.command.command;

import org.example.behavioral.command.fs.FileSystem;

public class CloseFileCommand implements Command {

    private final FileSystem fs;

    public CloseFileCommand(FileSystem fs) {
        this.fs = fs;
    }

    @Override
    public void execute() {
        fs.closeFile();
    }
}
