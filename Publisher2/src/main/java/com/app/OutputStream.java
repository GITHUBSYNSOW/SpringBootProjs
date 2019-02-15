package com.app;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface OutputStream {

    String OUTPUT="MSG-OUTPUT";

    @Output(OUTPUT)
    public MessageChannel publish();
}
