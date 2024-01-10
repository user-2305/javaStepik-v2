import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws Exception {
        MyWin m = new MyWin();
        JFrame window = m.getFrame();
        window.add(new Man());
    }
}
