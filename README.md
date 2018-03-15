# RabbitMQTutorial

This is a basic tutorial to integrate RabbitMQ using java. 


# Introductoin: 

RabbitMQ provides an asynchronous way of communication between components. This is done via messaging queue mechanism. 


![alt text](https://github.com/rohitraja/RabbitMQTutorial/blob/master/resources/Rabbit%20MQ.jpg)


# Use Case or Scenario

In a good architecture of software desing, it is good practice to decouple the software components. Consider a very simple scenario of ticket booking system where one of your software component does the ticket booking which is at machine X. As part of the booking system it needs to send the mails to the customers giving some details which may take some time to collect. The software component which sends the mail to those customers, after collecting some importent details is in different machine Y. For this kind of scenario we need a broker in between mostly known as "Messing Queue Server", so RabbitMQ is a kind of messing queue server here. In this concept there are mainly three components which plays an importent role ie. producer, broker and consumer. 

# Producer

In our use case the booking macine is a broker which sends the booking details to broker after completing its task which is RabbitMQ and let the "Mailing Software component" to care of the task to send mails to the customer. 

# Broker or Messaging Queue server

Broker or Messaging server (may known as different names) works on queuing mechanism. Its main task is to keep message in queue untill somework request for these messages. After the message is delivered, the message is dequeued from the queue. 

Note: There are many other features provided by Messaging Queue server based on different vendor. 

# Consumer

The "Mailing Software component" in our use case is the "Consumer" who request for the message which is en-queued by "Producer" for each tickets done. These details are now used to get some more information and the mail is sent to the customers. 

# Java Integration with RebbitMQ

# Setup
In this example we have used CloudAMQP(https://www.cloudamqp.com/) which is hosted on cloud and provides free subscription for few days. Below are the steps to configure this server. 

**Step 1.** Login using your google account. 

![Login Screen](https://github.com/rohitraja/RabbitMQTutorial/blob/master/resources/Login.PNG) 


**Step 2.** Create new instance by clicking on "Create new Instance" button.

![alt text](https://github.com/rohitraja/RabbitMQTutorial/blob/master/resources/create%20new%20instance.PNG) 

**Step 3.** Fill the required details. In our case we named it as "MailingQueueTest". 

![alt text](https://github.com/rohitraja/RabbitMQTutorial/blob/master/resources/Create%20details.PNG) 


**Step 4.** After the instance is created you will see the details of the instance as below. Here you will find "AMQP URL", this uri will be used in our program to create a connection with the instance. Copy and use this URL as instructed.  Click on "RabbitMQ Manager" button to create a queue. 

![alt text](https://github.com/rohitraja/RabbitMQTutorial/blob/master/resources/instance%20created.PNG) 

**Step 5.** Now go to Queues tab and create one queue. We named it as "MalingQueue". This name will be used in our java program to specify which queue the message needs to be sent. Keep the other detail as default.

![alt text](https://github.com/rohitraja/RabbitMQTutorial/blob/master/resources/Create%20Queue.PNG) 

Now our RabbitMQ is ready to receive messages. 

# Java Programs

We have two programs one is "Send.java" as "Producer" to send the message. Other one is "Receive.java" as "Consumer" to receive message from queue. 

After you execute "Send.java" you will notice "Queued Message" count is increased. 

![message received](https://github.com/rohitraja/RabbitMQTutorial/blob/master/resources/Send.PNG) 


# Key Points
* Refer Pom.xml for the lib used
* Create an issue if you are finding any issue. 
* Share your repository link and other details if you need help. 
