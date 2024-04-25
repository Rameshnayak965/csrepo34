package ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class student {

	private JFrame frame;
	private JTextField t1;
	private JTextField t4;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
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
	public student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(64, 11, 264, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(52, 54, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROLL NO");
		lblNewLabel_2.setBounds(52, 96, 58, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setBounds(52, 152, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MARKS");
		lblNewLabel_4.setBounds(52, 190, 75, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(108, 45, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(143, 191, 86, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(108, 100, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JComboBox t3 = new JComboBox();
		t3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MECHNICAL", "COMPUTER SCIENCE", "CYBER SECURITY"}));
		t3.setBounds(126, 148, 68, 18);
		frame.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String roll=t2.getText();
				String branch=(String) t3.getSelectedItem();
				String marks=(String)t4.getText();
				int n=Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnetion(jdbc:mysql://localhost:3306/mydb","root","mrec");
							String q="insert into student values ('"+name+"','"+roll+"','"+branch+"'+n+'")";
							Statement stn=con.CreateStatement();
					stn.executeUpdate(q);
					JOption.showMessageDialog(btnbutton),"inserted succesfully");
					con.close();
							
				}
				catch(sqlException e1)
				{
					e1.printstackTrace();
				}
				}
			
			
		});
		btnNewButton.setBounds(140, 235, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\download.jpg"));
		lblNewLabel_5.setBounds(0, 11, 412, 247);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
