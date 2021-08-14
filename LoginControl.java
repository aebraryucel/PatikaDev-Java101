import java.util.Scanner;

public class LoginControl {

    public static void main(String Args[]) {

        Scanner input = new Scanner(System.in);

        String username="ebrar" ,password="123";
        String usernameCheck,passwordCheck,ans;


        System.out.println("enter username");
        usernameCheck=input.nextLine();

        System.out.println("enter password");
        passwordCheck=input.nextLine();

        if(usernameCheck.equals(username)){
            if(passwordCheck.equals(password)){
                System.out.println("Login successful!");
            }else{
                System.out.println("Password invalid.Do you want to reset password? (y/n)");
                ans=input.nextLine();

                if(ans.equals("y") || ans.equals("Y")){
                    System.out.println("Enter new password");
                    ans=input.nextLine();
                    if(ans.equals(password) || ans.equals(passwordCheck)){
                        System.out.println("Could not create password.");
                    }
                    else{
                        password=ans;
                        System.out.println("Password created!");

                    }

                }
                else if(ans.equals("n") || ans.equals("N")){
                    System.out.println("End of program.");
                }
                else{
                    System.out.println("Invalid entry!");
                }

            }
        }
        else{
            System.out.println("Invalid username!");
        }







    }
}
