package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelMain extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelMain() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("도서 대여 관리");
		add(label, BorderLayout.NORTH);

	}

}
