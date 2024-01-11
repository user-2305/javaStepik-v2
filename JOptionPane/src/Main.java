import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();        // Создаем объект класса MainWindow
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
        mainWindow.setLocationByPlatform(true);//устанавливаем местоположение
        mainWindow.setTitle("Регистрация на мероприятие");//заголовок формы
        mainWindow.pack();//упаковываем все на форме
        mainWindow.setVisible(true);// Отображаем созданное окно
    }
}
