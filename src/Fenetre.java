import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {

    public Fenetre(int carre) {
        this.setTitle("Mon application lumière");
        this.setSize(800,800);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new GridLayout(carre,carre));
        for(int i=1;i<=carre;i++){
            for(int j=1;j<=carre;j++) {
                this.getContentPane().add(new JButton(String.valueOf(i)));
                System.out.println(String.valueOf(i));
            }
        }
        this.setVisible(true);
    }

}
