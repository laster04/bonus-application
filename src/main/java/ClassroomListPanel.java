import javax.swing.*;

public class ClassroomListPanel extends JFrame {
    public ClassroomListPanel() {

        setTitle("Classroom list panel");
        setSize(500, 500);
        setLayout(null);

        //headers for the table
        String[] columns = new String[] {
                "Id", "Name", "Hourly Rate", "Part Time"
        };

        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
                {1, "John", 40.0, false },
                {2, "Rambo", 70.0, false },
                {3, "Zorro", 60.0, true },
        };
        //create table with data
        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        this.add(scrollPane);
        setVisible(true);
    }
}
