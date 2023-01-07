/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author vamsee.n
 */
public class StringProblems {

    static int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int index = a.length - 1;

    public static void main(String args[]) throws FileNotFoundException, IOException {
//        String s = "i like this program very much";
//        String s1[] = s.split(" ");
//        System.out.println("array  of values "+s1);
//        String concat = "";
//        for(int j =0;j< s1.length-1;j++){
//            System.out.println("print values "+s1[j] + "  "+(s1.length - 1));
//        }
//        for(int i = s1.length-1;i >= 0; i--){
//            System.out.println(" print value "+s1[i]);
//            concat = concat + s1[i] +" ";
//        }
//        System.out.println("reverse string "+concat);

//        System.out.println(" pop value "+pop());
//        System.out.println(" peek value "+peek());
//        System.out.println(" push value "+push(10));
//        String s2 = "geekss@for@geekss";
//        String s3 ="word1, word2 word3@word4?word5.word6";
//        
//        
//        String s[] = s3.split("[, ?.@]+");
//        
//        String s4[] = s2.split("s",4);
//        
//        for (String s1 : s4) {
//            System.out.println("split method   " + s1);
//        }

//        String s = "   geeks for geeks   ";
//        
//        System.out.println("length()    "+s.length());
//        s = s.trim();
//        System.out.println("trim   "+s);
//        System.out.println("after trim length  "+s.length());
//        
        
        
//         File file = new File("C:\\Vamsee\\test.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//  
//        String line;
//        int wordCount = 0;
//        int characterCount = 0;
//        int paraCount = 0;
//        int whiteSpaceCount = 0;
//        int sentenceCount = 0;
//  
//        while ((line = bufferedReader.readLine()) != null) {
//            if (line.equals("")) {
//                paraCount += 1;
//            }
//            else {
//                characterCount += line.length();
//                String words[] = line.split("\\s+");
//                wordCount += words.length;
//                whiteSpaceCount += wordCount - 1;
//                String sentence[] = line.split("[!?.:]+");
//                sentenceCount += sentence.length;
//            }
//        }
//        if (sentenceCount >= 1) {
//            paraCount++;
//        }
//        System.out.println("Total word count = "+ wordCount);
//        System.out.println("Total number of sentences = "+ sentenceCount);
//        System.out.println("Total number of characters = "+ characterCount);
//        System.out.println("Number of paragraphs = "+ paraCount);
//        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
//        
        
        String s = "Rakuten1IndiaPvtLtd";
        System.out.println(" print character "+s.chars().allMatch(Character::isLetter));
        System.out.println("ascii value "+(char)96);
        
        
    }

    private static int pop() {
        if (a.length <= 0) {
            throw new RuntimeException("stack is empty");
        }
        int i = a[index];
        a[index] = 0;
        index--;
        return i;
    }

    private static int peek() {
        if (a.length <= 0) {
            throw new RuntimeException("stack is empty");
        }
        return a[index];
    }

    private static int push(int i) {
        if (a.length <= 0) {
            throw new RuntimeException("stack is empty");
        }
        a[++index] = i;

        System.out.println("push value" + a[index]);
        return index;
    }

}
