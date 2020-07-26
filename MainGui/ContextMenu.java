package MainGui;

import javax.swing.*;
import java.util.List;

public class ContextMenu extends JPopupMenu {
    public ContextMenu(List<String> list){
        super();

        for(String s: list){
            this.add(s);
        }

    }

}
