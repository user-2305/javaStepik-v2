import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class MainWindow extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JComboBox comboBox1;
    private JButton button;
    private JSpinner spinner1;
    private JCheckBox сheckBox1;
    private JCheckBox сheckBox2;
    private JCheckBox сheckBox3;
    private JCheckBox сheckBox4;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JSlider slider1;
    private JList list1;
    private JTextPane textPane1;

    public MainWindow() {
        this.getContentPane().add(panel);//добавляем панель на форму
        spinner1.setModel(new SpinnerNumberModel(18,18,100,1));//устанавливаем парамерты спинеру, т.к. в редакторе этого нет

        Color red = new Color(205, 92, 92);//красный

        button.addActionListener(e -> {//слушатель нажатия на кнопку
            boolean error = false;
            if (textField1.getText().length()==0){
                textField1.setBackground(red);
                error=true;
            }else
                textField1.setBackground(Color.white);

            if (passwordField1.getPassword().length < 8||passwordField2.getPassword().length < 8||!Arrays.equals(passwordField1.getPassword(), passwordField2.getPassword())) {//проверка равности паролей
                passwordField1.setBackground(red);
                passwordField2.setBackground(red);
                error=true;
            }
            else {
                passwordField1.setBackground(Color.white);
                passwordField2.setBackground(Color.white);
            }

            if (!error) {
                int[] selectedIndices = list1.getSelectedIndices();//вытаскиваем все выбранные элементы из листа
                String list="";
                for (int i = 0; i < selectedIndices.length; i++)
                    list+=" "+list1.getModel().getElementAt(selectedIndices[i]);

                new JOptionPane().showMessageDialog(panel,// создаем информационное окно
                        "ФИО - "+textField1.getText()+"\n" +
                                "Пароль - "+new String(passwordField1.getPassword())+"\n" +
                                "Пол - "+(radioButton1.isSelected()?"Мужской":"Женский")+"\n" +
                                "Возраст - "+spinner1.getValue()+"\n" +
                                "Образование - "+comboBox1.getSelectedItem()+"\n" +
                                "Сфера ваших интересов - "+(сheckBox1.isSelected()?сheckBox1.getText()+"  ":"")+(сheckBox2.isSelected()?сheckBox2.getText()+"  ":"")+(сheckBox3.isSelected()?сheckBox3.getText()+"  ":"")+(сheckBox4.isSelected()?сheckBox4.getText()+"  ":"")+"\n" +
                                "Ваш текущий уровень знаний в этой области, % - "+slider1.getValue()+"\n" +
                                "Почему Вы хотите участвовать в мероприятии? - "+textPane1.getText()+"\n" +
                                "Что для Вас важно в мероприятии? - "+list+"\n"
                        , "Ваши данные", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);//выходим из программы
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
