import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SwingMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton btnX;
	
	//instance variables for calc function
	private CalcQueue queue = new CalcQueue();
	private String inputNum = "";
	int input = 0;
	double queueDouble= 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setTitle("Calculator");
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
	public SwingMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBounds(137, 6, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = "";
				textField_1.setText("0");
				queue.clear();
			}
		});
		btnClear.setBounds(276, 6, 117, 29);
		contentPane.add(btnClear);
		
		button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "1";
				textField_1.setText(inputNum);
			}
		});
		button.setBounds(6, 48, 117, 29);
		contentPane.add(button);
		
		button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "2";
				textField_1.setText(inputNum);
			}
		});
		button_1.setBounds(119, 48, 117, 29);
		contentPane.add(button_1);
		
		button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "3";
				textField_1.setText(inputNum);
			}
		});
		button_2.setBounds(230, 48, 117, 29);
		contentPane.add(button_2);
		
		button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "4";
				textField_1.setText(inputNum);
			}
		});
		button_3.setBounds(6, 77, 117, 29);
		contentPane.add(button_3);
		
		button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "5";
				textField_1.setText(inputNum);
			}
		});
		button_4.setBounds(119, 77, 117, 29);
		contentPane.add(button_4);
		
		button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "6";
				textField_1.setText(inputNum);
			}
		});
		button_5.setBounds(230, 77, 117, 29);
		contentPane.add(button_5);
		
		button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "7";
				textField_1.setText(inputNum);
			}
		});
		button_6.setBounds(6, 107, 117, 29);
		contentPane.add(button_6);
		
		button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "8";
				textField_1.setText(inputNum);
			}
		});
		button_7.setBounds(119, 107, 117, 29);
		contentPane.add(button_7);
		
		button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "9";
				textField_1.setText(inputNum);
			}
		});
		button_8.setBounds(230, 107, 117, 29);
		contentPane.add(button_8);
		
		button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputNum = inputNum + "0";
				textField_1.setText(inputNum);
			}
		});
		button_9.setBounds(6, 136, 117, 29);
		contentPane.add(button_9);
		
		button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(inputNum.equals(""))){
					input = Integer.parseInt(inputNum);
					queueDouble = input * 1.0;
					queue.addNum(queueDouble);
					inputNum = "";
				}
				if(queue.getOpQueueable()){
					queue.addOp('+');
					textField_1.setText("+");
					queue.setOpQueueable(false);
				}	
			}
		});
		button_10.setBounds(178, 185, 117, 29);
		contentPane.add(button_10);
		
		button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(inputNum.equals(""))){
					input = Integer.parseInt(inputNum);
					queueDouble = input * 1.0;
					queue.addNum(queueDouble);
					inputNum = "";
				}
				if(queue.getOpQueueable()){
					queue.addOp('-');
					textField_1.setText("-");
					queue.setOpQueueable(false);
				}
			}
		});
		button_11.setBounds(292, 185, 117, 29);
		contentPane.add(button_11);
		
		button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(inputNum.equals(""))){
					input = Integer.parseInt(inputNum);
					queueDouble = input * 1.0;
					queue.addNum(queueDouble);
					inputNum = "";
				}
				if(queue.getOpQueueable()){
					queue.addOp('/');
					textField_1.setText("/");
					queue.setOpQueueable(false);
				}
			}
		});
		button_12.setBounds(178, 215, 117, 29);
		contentPane.add(button_12);
		
		btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(inputNum.equals(""))){
					input = Integer.parseInt(inputNum);
					queueDouble = input * 1.0;
					queue.addNum(queueDouble);
					inputNum = "";
				}
				if(queue.getOpQueueable()){
					queue.addOp('x');
					textField_1.setText("x");
					queue.setOpQueueable(false);
				}
			}
		});
		btnX.setBounds(292, 215, 117, 29);
		contentPane.add(btnX);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (!(inputNum.equals(""))){
						input = Integer.parseInt(inputNum);
						queueDouble = input * 1.0;
						queue.addNum(queueDouble);
						inputNum = "";
					}
				if (queue.getOpQueueable()){
					queueDouble = queue.calculate();
					inputNum = queueDouble + "";
					textField_1.setText(inputNum);
					inputNum = "";
					queue.setOpQueueable(true);
				}
			}
		});
		button_13.setBounds(119, 136, 117, 29);
		contentPane.add(button_13);
		
	}
}
