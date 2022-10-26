package org.example;

import org.example.patterns.proxy.CommandExecutor;
import org.example.patterns.proxy.CommandExecutorProxy;

public class ProxyPatternApp {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Admin", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception message:" + e.getMessage());
        }
    }
}
