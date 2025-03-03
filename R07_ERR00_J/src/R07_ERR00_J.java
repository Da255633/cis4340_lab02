//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean validFlag = false;
        do {
            try {
                // ...
                // If requested file does not exist, throws FileNotFoundException
                // If requested file exists, sets validFlag to true
                validFlag = true;
            } catch (FileNotFoundException e) {
                // Ask the user for a different file name
            }
        } while (validFlag != true);
// Use the file
    }
}