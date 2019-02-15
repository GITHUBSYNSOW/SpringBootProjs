package com.app.conusmer2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface InputStream {

    String INPUT="MSG-INPUT1";

    @Input(INPUT)
    public SubscribableChannel consume();
}

