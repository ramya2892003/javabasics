import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();~
// int[] element = new int[size];
// //for taking ip from user
// for (int i = 0; i <size; i++) {
// System.out.println("enter array element");
// element[i] = sc.nextInt();
// }
// System.out.println("enter element to seacrh");
// int x= sc.nextInt();
//
//
// //for output
// for (int i = 0; i <element.length; i++) {
// if(element[i]==x)
// {
// System.out.println("element present as position"+i);
// }
// }
//

// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// String[] names = new String[size];
// //for taking ip from user
// for (int i = 0; i <size; i++) {
// System.out.println("enter array element");
// names[i] = sc.next();
// }
//
//
// //for output
// for (int i = 0; i <size; i++) {
// {
// System.out.println(names[i]);
// }
// }

// find max and min number in an array of int
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int[] element = new int[size];
// //for taking ip from user
// for (int i = 0; i <size; i++) {
// System.out.println("enter array element");
// element[i] = sc.nextInt();
// }
//
// //to find max and min numbers
// int max=Integer.MIN_VALUE;
// int min=Integer.MAX_VALUE;
//
// for(int i=0;i<element.length;i++){
// if(element[i]<min){
// min=element[i];
// }
// if(element[i]>max){
// max=element[i];
// }
// }
// System.out.println("largest no is "+max);
// System.out.println("smallest no is"+min);

// take an array of numbers as ip and check if it is in ascending order

// Scanner sc=new Scanner(System.in);
// int size=sc.nextInt();
//
// int[] numbers=new int[size];
//
// for(int i=0;i<size;i++){
// System.out.println("enter array elements");
// numbers[i]=sc.nextInt();
// }
//
// //to check if it is ascending order or not
// boolean isascending=true;
//
// for(int i=0;i<size-1;i++) {
// if (numbers[i] > numbers[i + 1]) {
// isascending = false;
// }
// }
//
// if(isascending){
// System.out.println("it is in ascending order");
// }
// else {
// System.out.println("not in order");
// }

// 2D ARRAYS
//
// Scanner sc=new Scanner(System.in);
// int rows=sc.nextInt();
// int col=sc.nextInt();
//
// int[][] array=new int[rows][col];
//
// for(int i=0;i<rows;i++){
// for(int j=0;j<col;j++){
// array[i][j]=sc.nextInt();
// }
// }
//
//// to search x
// System.out.println("enter x ");
// int x=sc.nextInt();
//
// for (int i=0;i<rows;i++){
// for (int j=0;j<col;j++)
// {
// if(array[i][j]==x){
// System.out.println("element present at ("+i+"," +j+")");
//
// }
// }
// }
//// output
// for(int i=0;i<rows;i++){
// for(int j=0;j<col;j++){
// System.out.print(array[i][j] +" ");
// }
// System.out.println();
// }
// }
// }

// class Pen {
// String color;
// String type;
//
//
// public void function() {
// System.out.println(this.color);
// }
// }
// public class Main {
// public static void main(String[] args) {
// Pen pen1=new Pen();
// pen1.color="red";
// pen1.function();
//
// }
// }

// class Solution {
//     static int dataTypeSize(String str) {
//         int bytes = 0;
//         switch (str) {
//             case "Character":
//                 bytes = 1;
//                 break;
//             case "Integer":
//                 bytes = 4;
//                 break;
//             case "Long":
//                 bytes = 8;
//                 break;
//             case "Float":
//                 bytes = 4;
//                 break;
//             case "Double":
//                 bytes = 8;

//         }
//         return bytes;
//     }
// }

// class Solution {
//     public static String compareNM(int n, int m) {
//         if (n < m) {
//             return "lesser";
//         } else if (n > m) {
//             return "greater";
//         } else {
//             return "equal";
//         }
//     }
// }

import java.lang.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        int a = n;
        if (a >= 65 && a <= 90) {
            System.out.print("1");
        } else if (a >= 97 && a <= 122) {
            System.out.print("0");
        } else {
            System.out.print("-1");
        }

    }}

    OR

char c=sc.next().charAt(0);if(c>='a'&&c<='z')
{
sop("0")
}

    else if(c>='A'&&c<='Z')
{
sop("1")
}else
{sop("-1")}
