import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Question1();
        //Question2();
        //Question3();
        //Question4();
        //Question5();
        //Question6();
        //Question7();
        //Question8();
        //Question9();
        //Question10();
    }

    public static void Question1() {
        String name = "J Smith";
        int age = 25;
        float salary = 21000;
        boolean isEmployed = true;
        String employed;
        if (isEmployed) {
            employed = "employed";
        }
        else {
            employed = "not employed";
        }
        System.out.println(name + " is " + age + " years old, is currently " + employed + " and has a salary of £" + salary + " per year.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = s.next();
        System.out.println("Enter your age:");
        age = s.nextInt();
        System.out.println("Are you employed? (Y/N):");
        String employedInput = s.next();
        switch (employedInput) {
            case "Y":
                employed = "employed";
                System.out.println("What's your salary?");
                salary = s.nextFloat();
                System.out.println(name + " is " + age + " years old, is currently " + employed + " and has a salary of £" + salary + " per year.");
                break;
            case "N":
                employed = "not employed";
                System.out.println(name + " is " + age + " years old, is currently " + employed + ".");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }

    public static void Question2() {
        int a = 10, b = 5, sum = 15, difference = 5, product = 50;
        double quotient = 2.0;
        System.out.println("The sum, difference, product and quotient of " + a + " and " + b + " are:" +
                "\nSum: " + sum + ",\nDifference: " + difference + ",\nProduct: " + product + ",\nQuotient: " + quotient + ".");
        System.out.println("Type an integer:");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("Type a second integer:");
        int num2 = s.nextInt();
        System.out.println("Specify whether I should find the sum, difference, product or quotient for " + num1 + " and " + num2 + " by typing +, -, * or /:");
        String typeInput = s.next();
        int result;
        String type;
        switch (typeInput) {
            case "+":
                result = num1 + num2;
                type = "sum";
                break;
            case "-":
                result = num1 - num2;
                type = "difference";
                break;
            case "*":
                result = num1 * num2;
                type = "product";
                break;
            case "/":
                result = num1 / num2;
                type = "quotient";
                break;
            default:
                System.out.println("Invalid arithmetic type.");
                return;
        }
        System.out.println("The " + type + " of " + num1 + " and " + num2 + " is " + result + ".");
    }

    public static void Question3() {
        System.out.println("Enter an integer.");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even.");
        }
        else {
            System.out.println("The number " + num + " is odd.");
        }

        System.out.println("Would you like to enter more numbers? (Y/N):");
        String input = s.next();

        switch (input) {
            case "Y":
                boolean exit = false;
                while (!exit) {
                    System.out.println("Enter an integer (or -1 to stop adding more numbers):");
                    num = s.nextInt();

                    if (num == -1) {
                        exit = true;
                    }
                    else if (num % 2 == 0) {
                        System.out.println("The number " + num + " is even.");
                    }
                    else {
                        System.out.println("The number " + num + " is odd.");
                    }
                }
                break;
            case "N":
                break;
            default:
                System.out.println("Invalid input.");
                return;
        }
    }

    public static void Question4() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};

        for (String s : fruits) {
            System.out.println(s);
        }

        String[] movies = new String[5];
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter 5 movies (or -1 to stop adding movies):");
            Scanner s = new Scanner(System.in);
            for (int i = 0; i < movies.length; i++) {
                String movie = s.next();
                if (movie.equals("-1")) {
                    break;
                }
                else {
                    movies[i] = movie;
                }
            }
            exit = true;
        }
        for (String s : movies) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public static void Question5() {
        System.out.println("Enter an integer:");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("Enter a second integer:");
        int num2 = s.nextInt();
        System.out.println("Sum: " + Add(num1, num2) + ",\nDifference: " + Subtract(num1, num2) +
                ",\nProduct: " + Multiply(num1, num2) + ",\nQuotient: " + Divide(num1, num2) + ".");
    }

    public static int Add(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int Divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void Question6() {
        System.out.println("Enter your name:");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String reversedName = "";
        char c;
        for (int i = 0; i < name.length(); i++)
        {
            c = name.charAt(i);
            reversedName = c + reversedName;
        }
        System.out.println("Hello, " + name + "!\nLength: " + name.length() + ",\nUppercase: " +
                name.toUpperCase() + ",\nLowercase: " + name.toLowerCase() + ",\nReverse: " +
                reversedName + ",\nContains '@': " + name.contains("@") + ".");
    }

    static class Person {
        String name;
        int age;
        void introduce() {
            System.out.println("Hello, my name is " + name + " and I am " +
                    age + " years old.");
        }
    }

    public static void Question7() {
        Person p = new Person();
        p.name = "Alice";
        p.age = 30;
        p.introduce();
        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 25;
        p2.introduce();
        System.out.println("Enter your name: ");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        Person p3 = new Person();
        p3.name = name;
        p3.age = age;
        p3.introduce();
    }

    public static void Question8() {
        int input = 0;
        int num1, num2, result;
        Scanner s = new Scanner(System.in);
        while (input != 5) {
            System.out.println("Enter a number (or enter 5 to exit the calculator):");
            if (s.hasNextInt()) {
                input = s.nextInt();
                if (input == 5){
                    return;
                }
                num1 = input;
                System.out.println("Enter a second number (or enter 5 to exit the calculator):");
                if (s.hasNextInt()) {
                    input = s.nextInt();
                    if (input == 5){
                        return;
                    }
                    num2 = input;
                    System.out.println("Enter +, -, * or /.");
                    String arithmetic = s.next();
                    switch (arithmetic) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num1 != 0 || num2 != 0) {
                                result = num1 / num2;
                            }
                            else {
                                System.out.println("Cannot divide by 0.");
                                return;
                            }
                            break;
                        default:
                            System.out.println("Invalid arithmetic operation.");
                            return;
                    }
                    System.out.println(num1 + " " + arithmetic + " " + num2 + " = " + result);
                }
                else {
                    System.out.println("Invalid number.");
                    return;
                }
            }
            else {
                System.out.println("Invalid number.");
                return;
            }
        }
    }

    public static void Question9() {
        double length;
        double width;
        double radius;
        double height;
        System.out.println("Enter a shape:");
        Scanner s = new Scanner(System.in);
        String shape = s.next().toLowerCase();
        switch (shape) {
            case "square":
                System.out.println("Enter a length:");
                length = s.nextDouble();
                System.out.println(CalculateSquare(length));
                break;
            case "rectangle":
                System.out.println("Enter a length:");
                length = s.nextDouble();
                System.out.println("Enter a width:");
                width = s.nextDouble();
                System.out.println(CalculateRectangle(length, width));
                break;
            case "triangle":
                System.out.println("Enter a base length:");
                length = s.nextDouble();
                System.out.println("Enter a height:");
                height = s.nextDouble();
                System.out.println(CalculateTriangle(length, height));
                break;
            case "circle":
                System.out.println("Enter a radius:");
                radius = s.nextDouble();
                System.out.println(CalculateCircle(radius));
                break;
            default:
                System.out.println("Invalid shape.");
                return;
        }
    }

    public static String CalculateSquare(double length) {
        double area = length * length;
        double perimeter = 4 * length;
        return "Area: " + area + ",\nPerimeter: " + perimeter + ".";
    }

    public static String CalculateRectangle(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        return "Area: " + area + ",\nPerimeter: " + perimeter + ".";
    }

    public static String CalculateTriangle(double length, double height) {
        double area = (height * length) / 2;
        return "Area: " + area + ".";
    }

    public static String CalculateCircle(double radius) {
        double area = radius * radius * Math.PI;
        double diameter = 2 * radius;
        return "Area: " + area + ",\nDiameter: " + diameter + ".";
    }

    public static void Question10() {
        System.out.println("Enter a binary number (max 8 bits):");
        Scanner s = new Scanner(System.in);
        String binary = s.next();
        if (binary.length() > 8) {
            System.out.println("The sequence of bits: " + binary + " is too long. (" + binary.length() + " bits, max 8 bits)");
            return;
        }
        for (char bit : binary.toCharArray()) {
            if (bit != '0' && bit != '1') {
                System.out.println("The bit " + bit + " in the bit sequence: " + binary + " is not a valid binary number. (0 || 1)");
                return;
            }
        }
        int decimalNumber = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimalNumber += Math.pow(2, binary.length() - 1 - i);
            }
        }
        System.out.println("The binary sequence: " + binary + " is " + decimalNumber + " in decimal.");
    }
}
