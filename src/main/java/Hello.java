import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vitalya on 6/12/2018.
 */
public class Hello extends JFrame {

    public Hello() {

        super("hello");

        Logger log = LoggerFactory.getLogger(this.getName());

        super.setBounds(500, 500, 1000, 1000);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel myLabel = new JLabel("Hello world");

        Font myFont = myLabel.getFont().deriveFont(100f);
        myLabel.setFont(myFont);

        super.add(myLabel);
        super.setVisible(true);

        log.debug("Debug");
        log.info("Info");
        log.error("Error");

    }

    public static void main(String[] args) {

        new Hello();

    }

}
