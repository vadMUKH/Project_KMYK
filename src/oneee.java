import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.applet.*;
import javax.imageio.ImageIO;
import javax.swing.*;



import java.awt.event.*;

import javax.swing.*;

public class oneee extends JFrame {
private JTextField input = new JTextField("0.8");
private JButton button = new JButton("Расчёт");
private JButton button1 = new JButton("Кнопка");
private JLabel fbo = new JLabel("«ФГБОУ ВО»");
private JLabel label = new JLabel("ПИ-220");
private JLabel label2 = new JLabel("Косарев Антон Вадимович ");
private JButton button2 = new JButton("Информация");
private JLabel label11 = new JLabel("Кнопка информации добавлена");

private JLabel label4 = new JLabel("Мухамедьяров Вадим Асхатович ");
private JLabel label6 = new JLabel("Калганова Ксения Алексеевна ");
private JLabel label8 = new JLabel("Якупов Ядгар Галимович yadgar2046@gmail.com");
private JLabel label9 = new JLabel("Уфимский государственный авиационный технический университет»");
private JLabel label10= new JLabel();
private JButton Switch = new JButton("перевод в см в кубе");
JLabel utl = new JLabel();

double a=1;




public oneee() {
super("Window");
this.setBounds(300,600,420,300);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
button.addActionListener(new ButtonEventListener());
Switch.addActionListener(new ButtonEventListener1());
button2.addActionListener(new ButtonEventListener2());
setContentPane(new BgPanel());
Container container = this.getContentPane();
container.setLayout(new GridLayout(15,2,2,2));
container.add(fbo);
container.add(label);
container.add(label2);
container.add(label4);
container.add(label6);
container.add(label8);
container.add(input);
container.add(button);
container.add(label10);
container.add(Switch);
container.add(label9);
container.add(button2);
container.add(label11);

utl.setText("<html>  <a href=\"\">http://asu.ugatu.ac.ru/</a></html>");
container.add(utl);
container.add(button1);

}
class ButtonEventListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
	double b = Double.parseDouble(input.getText());
 a = 0.9*b*8;
label10.setText("Объем параллелепипеда равен: "+a+" куб. м.");
}
}
class ButtonEventListener1 implements ActionListener {
public void actionPerformed(ActionEvent e) {
	double v;
 v = a*100000;
label10.setText("Объем параллелепипеда равен: "+v+" куб. см.");
}
}
class ButtonEventListener2 implements ActionListener {
public void actionPerformed(ActionEvent e) {
	twooo k=new twooo();
	k.setVisible(true);
}
}
public static void main(String[] args) {
oneee app = new oneee();
app.setVisible(true);
}
class BgPanel extends JPanel{
public void paintComponent(Graphics g){
Image im = null;
try {
im = ImageIO.read(new File("src/1.png"));
} catch (IOException e) {}
g.drawImage(im, 200,0, null);
}
}
}
