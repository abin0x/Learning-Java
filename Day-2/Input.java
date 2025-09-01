import java.util.Scanner;
public class Input 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String text;

        System.out.println("Please Enter Your name: ");
        text = input.nextLine();

        System.out.println("Enter an integer number: ");
        number = input.nextInt();

        input.nextLine(); 

        System.out.println("Hello, I am " + text);
        System.out.println("You entered: " + number);

        input.close();
        
    }             
}
