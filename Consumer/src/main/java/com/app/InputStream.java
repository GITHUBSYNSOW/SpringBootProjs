package com.app;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface InputStream {

    String INPUT="MSG-INPUT";

    @Input(INPUT)
    public SubscribableChannel consume();
}
