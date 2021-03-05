import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args){

        System.out.print("Enter A Password: ");

        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.next();

        System.out.println(PassChecker(userInput));
    }

    //at notation: regex checking len 8, contains only alpha numeric
    public static String PassChecker(String userInput){
        if(userInput.matches("(?=(.*?\\d){2})[a-zA-Z0-9]{8,}")){
            return "\t\t\n Valid Password";
        }else {
            return "\t\t\n  Invalid Password";
        }
    }
}
