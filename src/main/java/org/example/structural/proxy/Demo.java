package org.example.structural.proxy;

class Demo {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Kirill", "haha");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("echo $0");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
