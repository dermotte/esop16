package at.aau.itec.esop16.general;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by mlux on 02.11.2016.
 */
public class SimpleFrame extends JFrame {

    private final JTextArea textArea;
    private final JTextField inputField;
    private final JButton button;

    public SimpleFrame() throws HeadlessException {
        super("My Window");     // set title of the window.
        setSize(640, 480);      // set the size in width and height.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // what should we do if somebody clicks the exit sign.

        // now set up layout
        textArea = new JTextArea();
        textArea.setEditable(false);    // disable user input.
        inputField = new JTextField();
        button = new JButton("Click Me!");

        // add text area in the center and make it scroll:
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        // arrange and add the input field and the button.
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(button, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);

        // now add some functionality
        button.addMouseListener(new MouseAdapter() {
            @Override
            // if mouse is clicked on the button
            public void mouseClicked(MouseEvent e) {
                doSubmit();
            }
        });
        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                // Enter is pressed in the text field
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    doSubmit();
                }
            }
        });

        setVisible(true);       // show window when ready.
    }

    /**
     * Main method to run the frame.
     * @param args
     */
    public static void main(String[] args)  {
        // set the look and feel to something better than Motif.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // run the constructor:
        SimpleFrame s = new SimpleFrame();
    }

    /**
     * Method called when input occurs. Run by <enter> key and button click.
     */
    public void doSubmit() {
        // put text from filed into textArea:
        String text = inputField.getText();
        inputField.setText("");
        textArea.append(text + "\n");
    }
}
