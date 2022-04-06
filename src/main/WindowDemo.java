package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class WindowDemo {

	private JFrame frame;
	private JTextField textField;
	private NameGenerator ng = new NameGenerator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowDemo window = new WindowDemo();
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
	public WindowDemo() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws FileNotFoundException {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("霸氣名稱");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(63, 74, 83, 36);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(156, 74, 125, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Run");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnClick();
			}
		});
		btnNewButton.setBounds(166, 139, 105, 29);
		frame.getContentPane().add(btnNewButton);
	}
	
	protected void btnClick() {
		this.textField.setText(ng.getName());
	}
}
