package com.example.demo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import javax.validation.constraints.Size;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

@ShellComponent
public class Commands {

    @ShellMethod(value = "Say hello", key = "greet")
    public String sayHello(String who) {
        return "Hello " + who;
    }

    @ShellMethod(value = "Adds two numbers", key = "sum")
    public int add(int a, int b) {
        return a + b;
    }

    @ShellMethod(value = "Change password", key = "change-password")
    public String changePassword(@Size(min = 8, max = 40) String newPassword) {
        return "Password successfully set to " + newPassword;
    }

    @ShellMethod(value = "Calculate seconds after start", key = "runtime")
    public void runtime() {
        int seconds = 0;

        PrintStream printStream = new PrintStream(System.out);

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);

                seconds++;

                printStream.print("\u001b[1000D");
                printStream.print("Seconds passed: " + seconds);
            } catch (InterruptedException ie) {
                printStream.print("\u001b[1000D");
                return;
            }
        }
    }
}
