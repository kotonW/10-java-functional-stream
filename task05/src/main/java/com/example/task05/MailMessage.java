package com.example.task05;

import java.util.Objects;

public class MailMessage implements Sendable<String>{
    private String to;
    private String from;
    private String content;

    public MailMessage(String from, String to, String content) {
        Objects.requireNonNull(to);
        Objects.requireNonNull(from);
        Objects.requireNonNull(content);
        this.to = to;
        this.from = from;
        this.content = content;

    }
@Override
    public String getFrom() {
        return this.from;
    }
@Override
    public String getTo() {
        return this.to;
    }
@Override
    public String getContent() {
        return this.content;
    }

}
