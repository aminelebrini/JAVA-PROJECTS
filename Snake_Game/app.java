import javax.swing.*;

public class app extends JFrame {

    public app() {
        initUI();
    }

    private void initUI() {
        add(new SnakeGme());
        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ex = new app();
            ex.setVisible(true);
        });
    }
}
