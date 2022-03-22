import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BonusMenuBar extends JMenuBar {

    private JMenu fileMenu = new JMenu("File");

    private JMenuItem fileMenuItem1, fileMenuItem2;

    public BonusMenuBar() {
        fileMenuItem1 = new JMenuItem("Nová třída");
        fileMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new TridaFormPanel();
            }
        });
        fileMenuItem2 = new JMenuItem("Exit");
        fileMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        fileMenu.add(fileMenuItem1);
        fileMenu.addSeparator();
        fileMenu.add(fileMenuItem2);
        this.add(fileMenu);
    }
}
