import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);

        JMenuItem fileQuitMenuItem = new JMenuItem("Exit");
        fileQuitMenuItem.setMnemonic(KeyEvent.VK_X);
        fileQuitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.CTRL_DOWN_MASK));
        fileQuitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.add(fileQuitMenuItem);

        JMenuItem helpAboutMenuItem = new JMenuItem("About");
        helpAboutMenuItem.setMnemonic(KeyEvent.VK_A);
        helpAboutMenuItem.setAccelerator(KeyStroke.getKeyStroke("F1"));
        helpAboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello");
            }
        });

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        helpMenu.add(helpAboutMenuItem);

        JMenuBar mainMenu = new JMenuBar();
        mainMenu.add(fileMenu);
        mainMenu.add(helpMenu);

        frame.setJMenuBar(mainMenu);

        frame.setVisible(true);

    }
}