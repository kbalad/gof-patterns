package org.example.behavioral.command.command;

import org.example.behavioral.command.fs.FileSystem;

public class DeleteFileCommand implements Command {

    private final FileSystem fs;

    public DeleteFileCommand(FileSystem fs) {
        this.fs = fs;
    }

    @Override
    public void execute() {
        fs.deleteFile();
    }
}
