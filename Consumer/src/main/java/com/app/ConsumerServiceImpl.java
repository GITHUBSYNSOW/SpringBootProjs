package com.app;

import com.rabbitmq.client.*;
import com.rabbitmq.client.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import java.io.IOException;
import java.util.List;

@Service
public class ConsumerServiceImpl {

    private final ConsumerRepo repo;
    private final OutputStream outputStream;

    @Autowired
    public ConsumerServiceImpl(ConsumerRepo repo, OutputStream outputStream) {
        this.repo = repo;
        this.outputStream = outputStream;
    }


    public String insertConsumer(Consumer1 consumer1) {
        Consumer1 res = repo.save(consumer1);


        if (res != null) {

            try {
                ConsumerEvent event = new ConsumerEvent(res.getPid(), res.getMsg());
                MessageChannel channel = outputStream.publish();
                channel.send(MessageBuilder.withPayload(event)
                        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                        .build());

            } catch (Exception e) {



                e.printStackTrace();
            }

           // boolean autoAck = false;

       /* channel.exchangeDeclare(exchangeName, "direct", true);
        String queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName, exchangeName, routingKey);
        Channel channal = Connection.createChannel();*/
      /* Consumer consumer = new DefaultConsumer(channel) {
         =
       };
        consumer.Received += (ch, ea) =>
        {
            var body = ea.Body;
            // requeue all unacknowledged deliveries up to
            // this delivery tag
            channel.BasicNack(ea.DeliveryTag, true, true);
                String consumerTag = channel.BasicConsume(queueName, false, consumer);
        };*/

    /*  channel.(queueName, autoAck, "a-consumer-tag",
                new DefaultConsumer(channel) {
                    @Override
                    public void handleDelivery(String consumerTag,
                                               Envelope envelope,
                                               AMQP.BasicProperties properties,
                                               byte[] body)
                            throws IOException
                    {
                        long deliveryTag = envelope.getDeliveryTag();
                        // positively acknowledge a single delivery, the message will
                        // be discarded
                        channel.basicAck(deliveryTag, false);
                    }
                });*/
            return "consumer inserted successfully!!";
        }
        return  "consumer  not  inserted !! ";
    }


    public List<Consumer1> getAllConsumers(){
     List<Consumer1> list= repo.findAll();
     return list;


    }

}
