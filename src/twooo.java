
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.applet.*;
import javax.imageio.ImageIO;
import javax.swing.*;



import java.awt.event.*;

import javax.swing.*;

public class twooo extends JFrame {
private JLabel fbo = new JLabel("GitHub — крупнейший веб-сервис для хостинга IT-проектов и их совместной разработки.Веб-сервис основан на системе контроля версий Git и разработан на Ruby on Rails и Erlang компанией GitHub, Inc (ранее Logical Awesome). Сервис бесплатен для проектов с открытым исходным кодом и (с 2019 года) небольших частных проектов, предоставляя им все возможности (включая SSL), а для крупных корпоративных проектов предлагаются различные платные тарифные планы.");
public twooo() {
super("Window");
this.setBounds(300,600,420,300);
Container container = this.getContentPane();
container.setLayout(new GridLayout(2,2,2,2));
container.add(fbo);
}
public static void main(String[] args) {
twooo app = new twooo();
app.setVisible(true);
}
}


