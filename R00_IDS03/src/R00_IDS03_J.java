//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ROO_IDS03_J {
    public static void main(String[] args) {
       //Rule 00. input validation and Data Sanitization (IDS)
        //IDS03-J Do not log unsanitized user input Given the non-compliant code below

        if(loginSuccessful){
            logger.severe("user login succeeded for: " + username);
        }
        else{
            logger.severe("user login failed for :" + username);
        }

    }
}