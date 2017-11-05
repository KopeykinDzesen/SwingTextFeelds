import javax.swing.*;

public class Main {

    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {

        JLabel jLabel = new JLabel();
        JTextField jTextField = new JTextField("defoult text",20);
        JPasswordField jPasswordField = new JPasswordField(20);
        JTextArea jTextArea = new JTextArea(4, 20);

        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        jLabel.setText("This is JLabel");
        jTextField.setHorizontalAlignment(JTextField.CENTER);
        jTextArea.setLineWrap(true);

        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jPasswordField);
        jPanel.add(jScrollPane);

        jFrame.add(jPanel);

        jPanel.revalidate();

    }

    static JFrame getJFrame(){
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setBounds(600,300,800,500);
        jFrame.setTitle("My App");
        return jFrame;
    }

}
