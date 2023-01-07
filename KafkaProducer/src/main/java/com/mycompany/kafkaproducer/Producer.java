/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kafkaproducer;

import java.net.UnknownHostException;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 *
 * @author vamsee.n
 */
public class Producer {
    
    public static void main(String[] args) throws UnknownHostException {
//        Properties config = new Properties();
//config.put("client.id", InetAddress.getLocalHost().getHostName());
//config.put("bootstrap.servers", "localhost:9092");
//config.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
//config.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//config.put("acks", "all");
//
//        KafkaProducer producer = new KafkaProducer(config);
//       // producer.beginTransaction();
//        producer.send(new ProducerRecord("mytopic", "first message"));
//    }
//    
        Date d = new Date();
        ZonedDateTime date = ZonedDateTime.now();
        Date d1 = Date.from(date.toInstant());
        System.out.println("date  "+date.toString()+"    "+d1);
    }
    
    public void m1(){
        System.out.println("m1 from producer");
    } 
    public static void m2(){
        System.out.println("m2");
    } 
    private void m3(){
        System.out.println("m3");
    } 
    protected void m4(){
        System.out.println("m4");
    } 
}
