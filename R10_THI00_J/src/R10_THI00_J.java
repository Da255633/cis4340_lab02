//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class R10_THI00_J {
    public static void main(String[] args) {

        public final class Foo implements Runnable {
            @Override public void run() {
                // ...
            }

            public static void main(String[] args) {
                Foo foo = new Foo();
                new Thread(foo).run();
            }
        }
    }
}