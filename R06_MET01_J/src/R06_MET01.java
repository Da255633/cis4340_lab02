//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class R06_MET01 {
    public static void main(String[] args) {
        public static int getAbsAdd(int x, int y) {
            assert x != Integer.MIN_VALUE;
            assert y != Integer.MIN_VALUE;
            int absX = Math.abs(x);
            int absY = Math.abs(y);
            assert (absX <= Integer.MAX_VALUE - absY);
            return absX + absY;
        }
    }
}