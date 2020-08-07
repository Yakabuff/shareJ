package MainGui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.Array;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;

import History.HistoryItem;
import History.HistoryQuery;

public class RecentScreenshotPanel extends JPanel {
	static int MAX_HISTORY_PREVIEW = 90;
	BoxLayout boxlayout;
	public static DefaultListModel listModel;
	public static JList list;
	public RecentScreenshotPanel() {
		super();
		boxlayout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(boxlayout);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		JLabel label = new JLabel("History");
		this.add(label);


		listModel = new DefaultListModel();

		this.getHistory();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);


		list.setCellRenderer(getRenderer());
		this.add(list);

		JScrollPane scrollPane = new JScrollPane(list);
		this.add(scrollPane);

		ListSelectionModel listSelectionModel = list.getSelectionModel();
		list.addKeyListener(new HistoryListListener());
		list.addMouseListener(new HistoryListListener());
	}	

	private ListCellRenderer<? super String> getRenderer() {
		return new DefaultListCellRenderer(){
			@Override
			public Component getListCellRendererComponent(JList<?> list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				JLabel listCellRendererComponent = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected,cellHasFocus);
				listCellRendererComponent.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,Color.BLACK));
				return listCellRendererComponent;
			}
		};
	}

	public static void getHistory() {

		HistoryItem hi = HistoryQuery.getAllHistory();
		if(hi.getCount()>0) {
			for(int i = hi.getCount()-1; i >=0; i--) {
				if(i <= MAX_HISTORY_PREVIEW) {
					listModel.addElement(hi.getPath().get(i));
				}
			}
		}
	}

	public static void updateHistory() {
		HistoryItem hi = HistoryQuery.getAllHistory();
		if(hi.getCount() == 0) {
			listModel.addElement(0);
		}else {


				if(hi.getCount() <= MAX_HISTORY_PREVIEW) {
					listModel.add(0,hi.getPath().get(hi.getCount()-1));
				}else {
					listModel.add(0,hi.getPath().get(hi.getCount()-1));
					listModel.removeElementAt(listModel.getSize()-1);
				}
			
		}
	}

}
