import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BonusMenuBar extends JMenuBar {

    private JMenu fileMenu = new JMenu("File");

    private JMenuItem fileMenuItemClassroomForm, fileMenuItemClassroomList, fileMenuItemExit;

    public BonusMenuBar() {
        fileMenuItemClassroomForm = new JMenuItem("Nová třída");
        fileMenuItemClassroomForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new TridaFormPanel();
            }
        });
        fileMenuItemClassroomList = new JMenuItem("Classroom list");
        fileMenuItemClassroomList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ClassroomListPanel();
            }
        });
        fileMenuItemExit = new JMenuItem("Exit");
        fileMenuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        fileMenu.add(fileMenuItemClassroomForm);
        fileMenu.add(fileMenuItemClassroomList);
        fileMenu.addSeparator();
        fileMenu.add(fileMenuItemExit);
        this.add(fileMenu);
    }
}
