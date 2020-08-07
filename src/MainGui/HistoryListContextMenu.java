package MainGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class HistoryListContextMenu extends ContextMenu {
    JMenuItem upload = new JMenuItem("Upload");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem open = new JMenuItem("Open");
    public HistoryListContextMenu() {
        this.add(upload);
        this.add(copy);
        this.add(open);

    }

    public void addActionListeners(){
        upload.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("upload");
            }
        });

        copy.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("upload");
            }
        });

        open.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("upload");
            }
        });
    }


}
