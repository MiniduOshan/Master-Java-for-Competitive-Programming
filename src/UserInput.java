import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=x.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("Enter your age: ");
        int age=x.nextInt();
        System.out.println("Age: " + age);

        System.out.println("Your name is " + name + " and you are " + age + " years old."); 


    }
    
    
}
