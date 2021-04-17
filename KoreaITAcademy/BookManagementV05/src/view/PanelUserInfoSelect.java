package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PanelUserInfoSelect extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelUserInfoSelect() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel labelTitle = new JLabel("[사용자 정보 조회]");
		labelTitle.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		add(labelTitle, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setBounds(12, 243, 105, 28);
		panel.add(btnNewButton);

		setBounds(0,0,600,400);
		
	}
}
