package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Subjects: ");
        int n=sc.nextInt();
        double [] arr1=new double[n];
        double sum=0;
        for(int i=0;i<arr1.length;i++){
            System.out.printf("Enter marks of %d subject: ",i+1);
            arr1[i]=sc.nextDouble();
            sum=sum+arr1[i];
        }
        double avg=sum/n;
        double max=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max)
                max=arr1[i];
            else
                max=max;
        }
        double max_marks=max;
        System.out.printf("Highest Marks: %f",max_marks);
        System.out.println();
        System.out.printf("Average Mark: %f",avg);
    }
}
