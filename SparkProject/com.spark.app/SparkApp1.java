
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vamsee.n
 */
public class SparkApp1 {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf().setAppName("JavaRandomForestClassificationExample")
            .setMaster("local[2]").set("spark.executor.memory","2g");
        JavaSparkContext jsc = new JavaSparkContext(sparkConf);
        
    }
    
}
