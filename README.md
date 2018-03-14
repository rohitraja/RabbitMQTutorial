# RabbitMQTutorial

This is a basic tutorial to integrate RabbitMQ using java. 


# Introductoin: 

RabbitMA provide an asynchronous way of communication between components. This is done via messaging queue concept. 


![alt text](https://github.com/rohitraja/RabbitMQTutorial/blob/master/resources/Rabbit%20MQ.jpg)



# Use Case or Scenario

In a good architecture of software desing it is good practice to decouple the software components. Consider a very simple scenario ticket booking system where one of your software component does the ticket booking which is at machine X. As part of the booking sytem is to send the mail to the customer giving some details which may take some time to collect. The software component which sends the mail to those customers, after collecting some importent details is in different machine Y. For this kind of scenio we need a broker in between mostly known as "Messing Queue Server", so RabbitMQ is a kind of messing queue server. In this concept there are mainly three components which plays an importent role producer, broker and consumer. 

# Producer

In our use case the booking macine is the broker which sends the booking details to broker after completing its task which is RabbitMQ and let the "Mailing Software component" to care of the task to send mails to the customer. 

# Broker or Messaging Queue server

Broker or Messaging server (may known as different names) works on queuing mechanism. Its main task is to keep message in queue untill somework request for these messages. After the message is delivered, it dequeued from the queue. 

Note: There are many features provided by Messaging Queue server based on different vendor. 

# Consumer

The "Mailing Software component" in our use case is the "Consumer" who request for the message which is enqueued by "Producer" for each tickets done. These detais are now used to get some more information and the mail is sent to the customers. 

# Java Integration with RebbitMQ

# Setup
In this example we have used CloudAMQP(https://www.cloudamqp.com/) which is hosted on cloude and provided free subscription for few days. Below are the steps to configure this server. 

Step 1. 

