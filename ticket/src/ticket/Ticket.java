package ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Ticket {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
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
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(111, 37, 192, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(111, 85, 46, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIES");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(111, 131, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NO. OF TICKETS:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(111, 169, 102, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movies=(String)cb1.getSelectedItem();
				String tickets=(String)cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movies.equals("RRR"))
				{
					bill=bill+nt*150;
				}
				if(movies.equals("KGF"))
				{ 
					bill=bill+nt*250;
				}
				if (movies.equals("SALAAR"))
        		{
		        	bill=bill+nt*350;
        		}
		        int res=0;
		       res=JOptionPane.showConfirmDialog(btnNewButton, "name:"+name+"\nmoviename:"+movies+"\no. of tickets:"+nt);
		       if(res==YES_OPTION)
		        {
		       	JOptionPane.showMessageDialog(btnNewButton,"BOOKING CONFIRMED");
		       }
		        else
		       {
		       	JOptionPane.showMessageDialog(btnNewButton,"BOOKING CANCELLED");
            		}
				
			}
		});
		btnNewButton.setBounds(178, 213, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(214, 87, 89, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SURYAVAMSH", "BAHUBALI", "PUSHPA 2", "SAHOO"}));
		cb1.setBounds(214, 128, 89, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\RED.jpg"));
		lblNewLabel_4.setBounds(10, 24, 612, 408);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6"}));
		comboBox.setForeground(Color.BLACK);
		comboBox.setBounds(214, 166, 89, 22);
		frame.getContentPane().add(comboBox);
	}
}
