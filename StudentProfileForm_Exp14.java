import java.awt.*;
import java.awt.event.*;

public class StudentProfileForm extends Frame {
    private Label nameLabel, rollNumberLabel, courseLabel;
    private TextField nameField, rollNumberField, courseField;
    private Button submitButton;

    public StudentProfileForm() {
        setTitle("Student Profile Form");
        setSize(400, 200);
        setLayout(new FlowLayout());

        nameLabel = new Label("Name:");
        rollNumberLabel = new Label("Roll Number:");
        courseLabel = new Label("Course:");

        nameField = new TextField(30);
        rollNumberField = new TextField(30);
        courseField = new TextField(30);

        submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String rollNumber = rollNumberField.getText();
                String course = courseField.getText();

                // You can perform actions with the collected data here
                System.out.println("Name: " + name);
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Course: " + course);
            }
        });

        add(nameLabel);
        add(nameField);
        add(rollNumberLabel);
        add(rollNumberField);
        add(courseLabel);
        add(courseField);
        add(submitButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentProfileForm();
    }
}
