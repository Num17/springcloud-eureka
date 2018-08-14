package com.kayakwise.eurekaclientribbon.command;

/**
 * 调用者
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }

    public static void main(String[] args) {
        Recevier recevier = new Recevier();
        Command command = new ConcreateCommand(recevier);

        Invoker invoker = new Invoker(command);

        invoker.action();

    }

}
