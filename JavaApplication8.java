/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner MSCANNER = new Scanner (System.in);
       Scanner swich = new Scanner (System.in);
      
           
                
                    System.out.println("Welcome to Challenge One");
                    int n = readInt(MSCANNER, "How many numbers? ");
                    double num [] = new double[n];
                    for (int i = 0; i < n; i++) {
                        num[i] = readDouble(MSCANNER, "Enter number " + (i + 1) + ": ");
                    }
                    System.out.println("Enter a number to search for.");
                    Scanner SEARCH = new Scanner (System.in);
                    int numb = SEARCH.nextInt();
                    
                    if (numb == num [0]){
                        System.out.println("It is in index 0");        
                    }
                    if (numb == num [1]){
                        System.out.println("It is in index 1");        
                    }
                    if (numb == num [2]){
                        System.out.println("It is in index 2");        
                    }
                    if (numb == num [3]){
                        System.out.println("It is in index 3");        
                    }
                    if (numb == num [4]){
                        System.out.println("It is in index 4");        
                    }
                    if (numb == num [5]){
                        System.out.println("It is in index 5");        
                    }
                    if (numb == num [6]){
                        System.out.println("It is in index 6");        
                    }
                    if (numb == num [7]){
                        System.out.println("It is in index 7");        
                    }
                    if (numb == num [8]){
                        System.out.println("It is in index 8");        
                    }
                    if (numb == num [9]){
                        System.out.println("It is in index 9");        
                    }
                    if (numb == num [10]){
                        System.out.println("It is in index 10");        
                    }
                    if (numb == num [11]){
                        System.out.println("It is in index 11");        
                    }
                    if (numb == num [12]){
                        System.out.println("It is in index 12");        
                    }
                    if (numb == num [13]){
                        System.out.println("It is in index 13");        
                    }
                    if (numb == num [14]){
                        System.out.println("It is in index 14");        
                    } 
                    else {
                        System.out.println("Not in the array.");
                    }
           
    
       
                    System.out.println("Welcome to Challenge Two");
                    int n2 = readInt(MSCANNER, "How many numbers? ");
                    double num2 [] = new double[n2];
                    for (int i = 0; i < n2; i++) {
                        num[i] = readDouble(MSCANNER, "Enter number " + (i + 1) + ": ");
                    }
                    for (int i = 0; i < n2; i++) {
                        System.out.println(num[0 + i]);
                    
        }
                    int negative = 0;
                    if (num [0] < 0) {
                        System.out.println(negative += 1);
                    }
                    if (num [1] < 0) {
                        System.out.println(negative += 1);
                    }     
                    if (num [2] < 0) {
                        System.out.println(negative += 1);
                    }   
                    if (num [3] < 0) {
                        System.out.println(negative += 1);
                    }   
                    if (num [4] < 0) {
                        System.out.println(negative += 1);
                    }   
                    if (num [5] < 0) {
                        System.out.println(negative += 1);
                    }   
                    if (num [6] < 0) {
                        System.out.println(negative += 1);
                    }   
                    if (num [7] < 0) {
                        System.out.println(negative += 1);
                    }   
                    if (num [8] < 0) {
                        System.out.println(negative += 1);
}   
                    if (num [9] < 0) {
                        System.out.println(negative += 1);
                    }                   
                        System.out.println("There are " + negative + " negative numbers");
    
                    int positive = 0;
                    if (num [0] > 0) {
                        System.out.println(positive += 1);
                    }
                    if (num [1] > 0) {
                        System.out.println(positive += 1);
                    }     
                    if (num [2] > 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [3] > 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [4] > 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [5] > 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [6] > 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [7] > 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [8] > 0) {
                        System.out.println(positive += 1);
}   
                    if (num [9] > 0) {
                        System.out.println(positive += 1);
                    }                   
                        System.out.println("There are " + positive + " positive numbers");
                        
                   
                   int zero = 0;
                    if (num [0] == 0) {
                        System.out.println(positive += 1);
                    }
                    if (num [1] == 0) {
                        System.out.println(positive += 1);
                    }     
                    if (num [2] == 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [3] == 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [4] == 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [5] == 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [6] == 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [7] == 0) {
                        System.out.println(positive += 1);
                    }   
                    if (num [8] == 0) {
                        System.out.println(positive += 1);
}   
                    if (num [9] == 0) {
                        System.out.println(positive += 1);
                    }                   
                        System.out.println("There are " + positive + " zeros");
    
    
    
    }
     static int readInt(Scanner MSCANNER, String prompt) {
        System.out.print(prompt);
        return MSCANNER.nextInt();
    }

    // Same idea, but for decimal numbers.
    static double readDouble(Scanner MSCANNER, String prompt) {
        System.out.print(prompt);
        return MSCANNER.nextDouble();
    }
}
