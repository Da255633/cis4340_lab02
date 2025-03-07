//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class R09_LCK08_J {
    public static void main(String[] args) {

        public final class Client {
            private final Lock lock = new ReentrantLock();

            public void doSomething(File file) {
                InputStream in = null;
                lock.lock();
                try {
                    in = new FileInputStream(file);
                    // Perform operations on the open file
                } catch (FileNotFoundException fnf) {
                    // Forward to handler
                } finally {
                    lock.unlock();

                    if (in != null) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            // Forward to handler
                        }
                    }
                }
            }
        }

    }
}