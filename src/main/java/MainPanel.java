import javax.swing.*;

public class MainPanel extends JFrame {

    public MainPanel() {
        setTitle("Guerrilla bonus app");
        setBounds(300, 90, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setJMenuBar(new BonusMenuBar());
        setLayout(null);
        setVisible(true);
    }
}
