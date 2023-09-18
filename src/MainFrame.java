import javax.swing.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton AddStudent;
    private JButton ListStudents;
    private JButton Exit;
    public MainFrame() {
        setSize(500,500);
        setTitle("Student Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        AddStudent = new JButton("ADD STUDENT");
        AddStudent.setSize(200,50);
        AddStudent.setLocation(250,150);
        add(AddStudent);

        ListStudents = new JButton("LIST ALL STUDENTS");
        ListStudents.setSize(200,50);
        ListStudents.setLocation(250,200);
        add(ListStudents);

        Exit = new JButton("EXIT");
        Exit.setSize(200,50);
        Exit.setLocation(250,250);
        add(Exit);

        AddStudent.addActionListener(e->{

        });
        ListStudents.addActionListener(e->{

        });
        Exit.addActionListener(e->{
        });
    }
}