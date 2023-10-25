package Algorithm;
import java.util.*;
public class Login {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String validName = "Anjali";
        String validPswd= "Anjali";
        int attempts=3;
        int loginAttempt=0;
        while(loginAttempt<attempts){
            String name = sc.next();
            String pswd = sc.next();
            if(name.equals(validName) && pswd.equals(validPswd)){
                System.out.println("Welcome "+ validName);
                break;
            }
            else{
                loginAttempt++;
                System.out.println("Invalid login credentials");
            }
            if(loginAttempt>=attempts){
                System.out.println("Contact Admin");
                break;
            }
        }
    }
}
