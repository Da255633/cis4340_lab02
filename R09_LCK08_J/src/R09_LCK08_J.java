//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class R09_LCK08_J {
    public static void main(String[] args) {

        public final class Client {
            private final Lock lock = new ReentrantLock();

            public void doSomething(File file) {
                InputStream in = null;
                try {
                    in = new FileInputStream(file);
                    lock.lock();

                    // Perform operations on the open file

                    lock.unlock();
                } catch (FileNotFoundException x) {
                    // Handle exception
                } finally {
                    if (in != null) {
                        try {
                            in.close();
                        } catch (IOException x) {
                            // Handle exception
                        }
                    }
                }
            }
        }

    }
}