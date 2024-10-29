import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
1- Write a Java program that accept three numbers from the user and print the largest number .
         */
        System.out.println("*************************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("please enter the second number : ");
        int num2 = input.nextInt();
        System.out.println("please enter the third number : ");
        int num3 = input.nextInt();
        largest(num1,num2,num3);

                /*
2- Write a Java program that accept a String and a number from the user,
then print the character in the given index .
         */

        System.out.println("*************************************************");
        System.out.println("please enter statement : ");
        input.nextLine();
        String statement = input.nextLine();
        System.out.println("please enter number : ");
        int number = input.nextInt();
        System.out.println("the character in the index "+number+" is "+statement.charAt(number));

                /*
3- Write a program to enter the numbers till the user wants and
at the end it should display the sum entered .
         */
        System.out.println("*************************************************");
        System.out.println("the sum is : "+sum());


                /*
4- Write a Java program to find positive and negative numbers of a given array:

  -  Original Array:
      [10, -21 , 30, 31, -25]
     -  Expected Output:
     10  is a positive number
     -21 is a negative number
      30 is a positive number
      31 is a positive number
     -25 is a negative number
         */
        System.out.println("*************************************************");
        int[] arr ={10,-21,30,31,-25};
        for (int n:arr){
            if (n > 0){
                System.out.println(n+" is a positive number ");
            } else if (n<0) {
                System.out.println(n+" is a negative number ");
            }else {
                System.out.println(n+" is a zero ");
            }
        }
/*
Write a Java program to find a shortest word of a given array:
- Original Array:
    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
    - Expected Output:
     JAVA
 */
        System.out.println("*************************************************");
        ArrayList<String> arr1 = new ArrayList();
        arr1.add("Tuwaiq");
        arr1.add("Bootcamp");
        arr1.add("Student");
        arr1.add("JAVA");
        System.out.println("The shortest word is a "+shortestWord(arr1));

    }
    public static String shortestWord(ArrayList<String> arr1){
        String shortestWord="";
        int num =10000;
        for (String s:arr1){
            if(s.length()< num){
                shortestWord = s;
                num = s.length();
            }
        }
        return shortestWord;
    }


    public static int sum(){
        Scanner input = new Scanner(System.in);
        int num=0;
        int sum=0;
        do{
            System.out.println("please enter the number, and 0 to quit : ");
            num = input.nextInt();
            sum +=num;
        }while(num != 0);
        return sum ;
    }
    public static void largest(int num1,int num2,int num3){
        if (num1>num2 && num1>num3){
            System.out.println("the first number is largest ");
        } else if (num2>num1 && num2>num3) {
            System.out.println("the second number is largest ");
        }else{
            System.out.println("the third number is largest ");
        }
    }
}