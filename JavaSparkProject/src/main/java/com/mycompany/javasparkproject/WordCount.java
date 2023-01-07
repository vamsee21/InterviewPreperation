/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javasparkproject;

import java.util.Arrays;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

/**
 *
 * @author vamsee.n
 */
public class WordCount {
    
    public static void main(String[] args) {
        
        SparkConf sparkConf = new SparkConf().setMaster("local[1]").setAppName("WordCount");
        
        JavaSparkContext context = new JavaSparkContext(sparkConf);
        JavaRDD<String> rdd = context.textFile("C:\\Vamsee\\chapter-4.txt");
        JavaRDD<String> collection = rdd.flatMap(x -> Arrays.asList(x.split(" ")));
        JavaPairRDD pairRdd = collection.mapToPair(t -> new Tuple2<>(t,1)).reduceByKey((x,y) -> (int)x + (int)y);
        pairRdd.saveAsTextFile("countData2");
        System.out.println("total count  =  "+pairRdd.count());
        
    }
}
