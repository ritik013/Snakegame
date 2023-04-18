import javax.swing.*;

public class Frame extends JFrame {
    Frame(){
        this.add(new Panel());
        this.setTitle("snakegame");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }

}