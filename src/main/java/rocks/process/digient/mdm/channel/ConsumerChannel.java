/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.digient.mdm.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerChannel {
    String MDM = "input-insurance-mdm";

    @Input(MDM)
    SubscribableChannel mdm();
}
