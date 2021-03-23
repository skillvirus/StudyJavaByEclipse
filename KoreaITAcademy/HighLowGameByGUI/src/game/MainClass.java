package game;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainClass {

	private JFrame frame;
	private JTextField txtInpuNum;
	private JTextField txtOutput;
	private int[] randomNum;
	private int tryCount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass window = new MainClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setRandomNum();
				tryCount++;
			}
		});
		btnNewButton.setBounds(29, 228, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtInpuNum = new JTextField();
		txtInpuNum.setBounds(29, 45, 116, 21);
		frame.getContentPane().add(txtInpuNum);
		txtInpuNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1~30 까지의 수중 아무 수를 입력하세요.");
		lblNewLabel.setBounds(24, 20, 352, 15);
		frame.getContentPane().add(lblNewLabel);
		
		txtOutput = new JTextField();
		txtOutput.setEditable(false);
		txtOutput.setBounds(29, 115, 373, 21);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("랜덤수 생성");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getRandomNum();
			}
		});
		btnNewButton_1.setBounds(29, 195, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
	
	private void getRandomNum() {
		
		RandomNum random = new RandomNum(30);
		RandomNumDuplicate rm = new RandomNumDuplicate(random);
		randomNum = rm.returnRandomNum(1);
	}
	
	private void setRandomNum() {
					
		if (randomNum[0] < Integer.parseInt(txtInpuNum.getText())) {
			txtOutput.setText("좀 더 작은 수를 입력하세요.");
		} else if (randomNum[0] > Integer.parseInt(txtInpuNum.getText())) {
			txtOutput.setText("좀 더 큰 수를 입력하세요.");
		} else if (randomNum[0] == Integer.parseInt(txtInpuNum.getText())) {
			txtOutput.setText("Random수는 : " + randomNum[0] + "입니다. 숫자를 맞췄습니다. 실행한 횟수는 : " + tryCount + "입니다.");
		}
	}
}
