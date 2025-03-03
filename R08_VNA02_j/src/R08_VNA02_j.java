//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class R08_VNA02_j {
    public static void main(String[] args) {
        final class Flag {
            private boolean flag = true;

            public synchronized void toggle() {
                flag ^= true; // Same as flag = !flag;
            }

            public synchronized boolean getFlag() {
                return flag;
            }
        }
    }
}