import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;


Scanner scanCalc = new Scanner(System.in);
System.out.print("Input the first number: ");
int num1 = scan.CalcInt();
System.out.print("Input the second number: ");
int num2 = scan.CalcInt();


switch (operation) 
{ 
case "+" : System.out.println(add(num1, num2);
break ;

case "-" : System.out.println(substract(num1, num2);
break ;

case "*" : System.out.println(multiply(num1, num2);
break ;

case "/" : System.out.println(divide(num1, num2);
break ;
}

public String add(num1, num2) {
int
int result = num1+num2;
System.out.println(num1 + "+" + num2 + "=" + result);
}
}




























import java.util.Scanner;
public class Add {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Input the first number: ");
int num1 = scan.nextInt();
System.out.print("Input the second number: ");
int num2 = scan.nextInt();
scan.close();
int result = num1+num2;
System.out.println(num1 + "+" + num2 + "=" + result);
}
}


import java.util.Scanner;
public class Subtract {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Input the first number: ");
int num1 = scan.nextInt();
System.out.print("Input the second number: ");
int num2 = scan.nextInt();
scan.close();
int result = num1-num2;
System.out.println(num1 + "-" + num2 + "=" + result);
}
}


import java.util.Scanner;
public class Multiply {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Input the first number: ");
int num1 = scan.nextInt();
System.out.print("Input the second number: ");
int num2 = scan.nextInt();
scan.close();
int result = num1*num2;
System.out.println(num1 + "*" + num2 + "=" + result);
}
}


import java.util.Scanner;
public class Divide {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
System.out.println("Input the first number: ");
int a = scan.nextInt();
System.out.println("Input the second number: ");
int b = scan.nextInt();
if(a%b == 0) {
System.out.println( a + "/" + b + "=" + (a/b) );
} else {
double e = a/(double)b;
System.out.println( a + "/" + b + "=" + (a/(double)b) );
}
}
}