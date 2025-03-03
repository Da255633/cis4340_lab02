import java.io.DataInputStream;
import java.io.IOError;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class R03_NUM03_J {
    public static void main(String[] args) {

        //Rule 03 Numeric Types and Operations(NUM)

        //NUM03-J user integer types that can fully represent the possible range of unsigned data
        //Given the non-compliant code below:

        public static long getInteger(DataInputStream is) throws IOException {
            return is.readInt() & oxFFFFFFFFL;//Mask with 32 one bits
        }
    }
}