import java.util.Scanner;

public class MyContainer {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        sayHello("Nurzat");
        sayHello(null);
        sayHello("Alice");
        sayHello(null);

    }
    // Complete this function to return either
    // "Hello, [name]!" or "Hello there!"
    // based on the input

    public static String sayHello(String name) {
        // You can print to STDOUT for debugging if you need to:
        String hello = "Hello ";
        if(name==null){
            System.out.println(hello +"there!");
        }
        else{
            name = hello + name + "!";
            System.out.println(name);
        }

        // but you need to return the correct value in order to pass the challenge
        return name; // TODO: return the correct value




    }






}
