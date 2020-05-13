/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.digient.mdm.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import rocks.process.digient.domain.Application;
import rocks.process.digient.domain.Billing;
import rocks.process.digient.domain.Customer;
import rocks.process.digient.domain.Policy;
import rocks.process.digient.message.Message;

@Component
@EnableBinding(Sink.class)
public class MessageListener {
    private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @StreamListener(target = Sink.INPUT, condition = "headers['type']=='customer'")
    @Transactional
    public void customerMessage(@Payload Message<Customer> customerMessage) {
        Customer customer = customerMessage.getPayload();
        logger.info("Payload received: " + customer.toString());
    }

    @StreamListener(target = Sink.INPUT, condition = "headers['type']=='application'")
    @Transactional
    public void applicationMessage(@Payload Message<Application> applicationMessage) {
        Application application = applicationMessage.getPayload();
        logger.info("Payload received: " + application.toString());
    }

    @StreamListener(target = Sink.INPUT, condition = "headers['type']=='policy'")
    @Transactional
    public void policyMessage(@Payload Message<Policy> policyMessage) {
        Policy policy = policyMessage.getPayload();
        logger.info("Payload received: " + policy.toString());
    }

    @StreamListener(target = Sink.INPUT, condition = "headers['type']=='billing'")
    @Transactional
    public void billingMessage(@Payload Message<Billing> billingMessage) {
        Billing billing = billingMessage.getPayload();
        logger.info("Payload received: " + billing.toString());
    }

    @StreamListener(target = Sink.INPUT)
    public void defaultListener() {}

}
