//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class R08_VNA02_j {
    public static void main(String[] args) {
        final class Flag {
            private volatile boolean flag = true;

            public void toggle() {  // Unsafe
                flag ^= true;
            }

            public boolean getFlag() { // Safe
                return flag;
            }
        }
    }
}