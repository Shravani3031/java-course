import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
    System.out.println("basicCalaculators");
    Scanner inputObj = new Scanner(System.in);
    int a = inputObj.nextInt();
    int b = inputObj.nextInt();
    
    int addition = a+b;
    int subtraction = a-b;
    int multiplication = a*b;
    int division = a/b;
    System.out.println(addition);
    System.out.println(subtraction);
    System.out.println(multiplication);
    System.out.println(division);
    
    
    }
}