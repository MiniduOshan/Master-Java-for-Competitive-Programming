import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        String name=x.nextLine();
        System.out.println("Hello, " + name);

        Scanner y= new Scanner(System.in);
        int age=y.nextInt();
        System.out.println("age, "+age);

    }
    
    
}
