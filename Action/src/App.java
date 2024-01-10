import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

class Chomper {
    public static void main(String[] args) throws Exception { 
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Button");
        Image frame = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\Action\\src\\1.png"));
        Image frame2 = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\Action\\src\\2.png"));
        frame = frame.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        frame2 = frame2.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(frame);
        ImageIcon imageIcon2 = new ImageIcon(frame2);
        JLabel jlabel = new JLabel(imageIcon);
        JLabel jLabel2 = new JLabel(imageIcon2);
        jPanel.add(jButton);
        jPanel.add(jlabel);
        //jPanel.add(jLabel2);
        jFrame.add(jPanel);
        
        ActionListener actionListener = new ActionListener() {
            int count1 = 0;
            int count2 = 200;
            int x = 5;
            int y = 3;
            @Override
            public void actionPerformed(ActionEvent e) {
                    jButton.setVisible(false);
                    jlabel.setLocation(count1, count2);
                    jLabel2.setLocation(count2, count1);
                    count1 += x;
                    count2 += y;
                    if(count1 > 885){
                        x = -5;
                        jlabel.setIcon(imageIcon2);
                    }
                    if(count1 < 0){
                        x = 5;
                        jlabel.setIcon(imageIcon);
                    }
                    if(count2 > 450){
                        y = - 3;
                        jLabel2.setIcon(imageIcon2);
                    }
                    if(count2 < 0){
                        y = 3;
                        jLabel2.setIcon(imageIcon);
                    }
                    
            }
        };
        // jButton.addActionListener(actionListener);
        Timer timer = new Timer(0, actionListener);
        timer.start();
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 480, dimension.height / 2 - 270 , 960, 540);
        return jFrame;
    }
    

    // public static void main(String[] args) throws Exception {
    //     final Image frame = ImageIO.read(new File("C:\\Projects\\Java [Stepik]\\JavaSwing\\Two\\Youtube\\src\\Action\\Action\\src\\png-clipart-butterfly-insect-butterfly-leaf-brush-footed-butterfly.png"));
    //     Runnable r = new Runnable() {

    //         @Override
    //         public void run() {
    //             JPanel gui = new JPanel(new BorderLayout());

    //             final JLabel animation = new JLabel(new ImageIcon(frame));
    //             gui.add(animation, BorderLayout.CENTER);

    //             ActionListener animate = new ActionListener() {

    //                 private int index = 0;

    //                 @Override
    //                 public void actionPerformed(ActionEvent e) {
    //                     if (index<3) {
    //                         index++;
    //                     } else {
    //                         index = 0;
    //                     }
    //                     animation.setIcon(new ImageIcon(frame));
    //                 }
    //             };
    //             final Timer timer = new Timer(200,animate);

    //             final JToggleButton b = new JToggleButton("Start/Stop");
    //             ActionListener startStop = new ActionListener() {

    //                 @Override
    //                 public void actionPerformed(ActionEvent e) {
    //                     if (b.isSelected()) {
    //                         timer.start();
    //                     } else {
    //                         timer.stop();
    //                     }
    //                 }
    //             };
    //             b.addActionListener(startStop);
    //             gui.add(b, BorderLayout.PAGE_END);

    //             JOptionPane.showMessageDialog(null, gui);
    //         }
    //     };
    //     // Swing GUIs should be created and updated on the EDT
    //     // http://docs.oracle.com/javase/tutorial/uiswing/concurrency/initial.html
    //     SwingUtilities.invokeLater(r);
    // }
}