import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int age;
        Scanner intu = new Scanner(System.in);
        System.out.println("Please enter in what year you were born");
        age = intu.nextInt();
        System.out.println("I was born in " +age);
        System.out.println("Please enter how old are you");
        age = intu.nextInt();

    }
}
