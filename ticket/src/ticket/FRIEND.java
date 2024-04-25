package ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FRIEND {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRIEND window = new FRIEND();
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
	public FRIEND() {
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
		
		JLabel lblNewLabel = new JLabel("FRIENDSHIP");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
		lblNewLabel.setBounds(130, 24, 185, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setLabelFor(frame);
		lblNewLabel_1.setBounds(38, 73, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FRIEND NAME");
		lblNewLabel_2.setBounds(26, 129, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MATCHING PERCETAGE");
		lblNewLabel_3.setBounds(10, 182, 110, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(130, 70, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(130, 113, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 179, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String name=tb1.getText();
			String fname=tb2.getText();
			
			JOptionPane.showMessageDialog(btnNewButton,"name :"+name+"\nfriend name"+fname+"\nmatching percentage:"+Math.random()*100);
			}
		});
		btnNewButton.setBounds(127, 213, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
