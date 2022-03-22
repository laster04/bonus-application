import model.Classroom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TridaFormPanel extends JFrame {


    public TridaFormPanel() {
        setTitle("Trida form panel");
        setSize(500, 500);
        setLayout(null);
        JLabel nazevTridyLabel = new JLabel("Nazev tridy");
        nazevTridyLabel.setBounds(10, 10, 120, 25);
        this.add(nazevTridyLabel);
        JLabel datumVytvoreni = new JLabel("Datum vytvoreni");
        datumVytvoreni.setBounds(10,40,120, 25);
        this.add(datumVytvoreni);

        JTextField tridaName = new JTextField();
        tridaName.setBounds(140, 10, 130, 25);
        this.add(tridaName);

        JComboBox<Integer> days = new JComboBox<>();
        days.setBounds(140, 40, 40, 25);
        generateCombos(days, 31);
        this.add(days);
        JComboBox<Integer> months = new JComboBox<>();
        months.setBounds(190, 40, 40, 25);
        generateCombos(months, 12);
        this.add(months);
        JTextField year = new JTextField();
        year.setBounds(250, 40, 60, 25);
        this.add(year);
        JCheckBox aktivni = new JCheckBox("Aktivni");
        aktivni.setBounds(10,70, 150,25);
        this.add(aktivni);

        JButton button = new JButton("Odeslat");
        button.setBounds(10, 100, 150, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Classroom classroom = new Classroom();
                String day = days.getSelectedItem().toString();
                String month = months.getSelectedItem().toString();
                String y = year.getText();
                String dateString = String.format("%s/%s/%s", day, month, y);
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date tridaDate = sdf.parse(dateString);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                System.out.println(classroom);
            }
        });
        this.add(button);
        setVisible(true);
    }

    private void generateCombos(JComboBox box, int maxNum) {
        for (int i = 1; i <= maxNum; i++) {
            box.addItem(i);
        }
    }
}
