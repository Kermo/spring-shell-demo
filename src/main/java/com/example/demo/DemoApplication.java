package com.example.demo;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Component
    public static class DemoPromptProvider implements PromptProvider {

        @Override
        public AttributedString getPrompt() {
            return new AttributedString("demo-shell:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN));
        }
    }
}
