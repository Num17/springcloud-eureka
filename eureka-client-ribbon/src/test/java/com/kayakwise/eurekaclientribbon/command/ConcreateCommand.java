package com.kayakwise.eurekaclientribbon.command;

/**
 * 命令实现
 */
public class ConcreateCommand implements Command {

    private Recevier recevier;

    public ConcreateCommand(Recevier recevier) {
        this.recevier = recevier;
    }

    @Override
    public void execute() {
        this.recevier.action();

    }
}
