
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
private JLabel fbo = new JLabel("Для нового класса");
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


