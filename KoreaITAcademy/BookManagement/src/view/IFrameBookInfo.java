package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

@SuppressWarnings("serial")
public class IFrameBookInfo extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IFrameBookInfo frame = new IFrameBookInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IFrameBookInfo() {
		super("도서정보관리",true, true, true, true);
		getContentPane().setLayout(null);
		//setBounds(0, 0, 640, 480);
		//getContentPane().setLayout(null);
		//setVisible(true);
	}
}
