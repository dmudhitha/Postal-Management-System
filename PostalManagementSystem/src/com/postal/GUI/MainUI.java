package com.postal.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class MainUI {

	private JFrame frmEpostMsystem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frmEpostMsystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEpostMsystem = new JFrame();
		frmEpostMsystem.setTitle("e-Post MSystem ");
		frmEpostMsystem.setBounds(1, 1, 1000, 752);
		frmEpostMsystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainUI.class.getResource("/com/postal/icons/CMS-1024x319.jpg")));
		frmEpostMsystem.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		frmEpostMsystem.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel dashboard = new JPanel();
		tabbedPane.addTab("Dashboard", new ImageIcon(MainUI.class.getResource("/com/postal/icons/dashb.png")), dashboard, null);
		
		JPanel adddata = new JPanel();
		tabbedPane.addTab("Add Data", new ImageIcon(MainUI.class.getResource("/com/postal/icons/adddata.png")), adddata, null);
		
		JComboBox Divicombo = new JComboBox();
		Divicombo.setModel(new DefaultComboBoxModel(new String[] {"Choose", "Administrative Division", "Account Division", "Pension Division", "Social Service Division", "Development Division", "Planning Division", "Vidatha Centre", "Samurdhi Division", "Land Division", "Registrar Division", "Grama Niladari Division", "Multifunctional Division", "Lead Office", "Other"}));
		
		JLabel lblNewLabel_5 = new JLabel("Division to :");
		
		JLabel lblNewLabel_6 = new JLabel("Post Type Received :");
		
		JComboBox postCombo = new JComboBox();
		postCombo.setModel(new DefaultComboBoxModel(new String[] {"Choose", "By Registered Post", "By Non- Registered Post", "By E-mail", "By Visiting"}));
		postCombo.setName("");
		
		JLabel lblSerialNumber = new JLabel("Sub number :");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblSerialNumber_1 = new JLabel("Registered Number :");
		
		JLabel lblReferenceNumber = new JLabel("Reference number :");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Post Office :");
		
		JLabel lblNewLabel_2 = new JLabel("Received By :");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JTextArea txtrSign = new JTextArea();
		
		JLabel lblNewLabel_3 = new JLabel("Reason :");
		
		JButton btnNewButton_2 = new JButton("Clear");
		
		JButton btnNewButton_1 = new JButton("Save");
		
		JLabel lblNewLabel_4 = new JLabel("E-Mail Address (if email) :");
		
		JLabel lblNewLabel_7 = new JLabel("ID Number(if by Hand) :");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Contact Number :");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GroupLayout gl_adddata = new GroupLayout(adddata);
		gl_adddata.setHorizontalGroup(
			gl_adddata.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_adddata.createSequentialGroup()
					.addContainerGap(167, Short.MAX_VALUE)
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adddata.createSequentialGroup()
							.addGap(166)
							.addComponent(postCombo, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
					.addGap(63)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(Divicombo, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addGap(38))
				.addGroup(Alignment.TRAILING, gl_adddata.createSequentialGroup()
					.addContainerGap(466, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addGap(12)
					.addComponent(btnNewButton_2)
					.addGap(142))
				.addGroup(gl_adddata.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adddata.createSequentialGroup()
							.addComponent(lblSerialNumber, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_adddata.createSequentialGroup()
							.addComponent(lblSerialNumber_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_adddata.createSequentialGroup()
							.addComponent(lblReferenceNumber, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_adddata.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_adddata.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_adddata.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addGap(81)
							.addComponent(txtrSign, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_adddata.createSequentialGroup()
							.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_7))
							.addGap(45)
							.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_adddata.createSequentialGroup()
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_8)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		gl_adddata.setVerticalGroup(
			gl_adddata.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_adddata.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adddata.createParallelGroup(Alignment.BASELINE)
							.addComponent(postCombo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_5)
							.addComponent(Divicombo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_adddata.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_6)))
					.addGap(18)
					.addGap(34)
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSerialNumber, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_adddata.createSequentialGroup()
							.addGap(4)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(12)
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adddata.createSequentialGroup()
							.addGap(3)
							.addComponent(lblSerialNumber_1))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adddata.createSequentialGroup()
							.addGap(2)
							.addComponent(lblReferenceNumber))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adddata.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_1))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adddata.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_2))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addComponent(txtrSign, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addGap(58)
					.addGroup(gl_adddata.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adddata.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
							.addGroup(gl_adddata.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_adddata.createSequentialGroup()
									.addGap(45)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_adddata.createSequentialGroup()
									.addGap(45)
									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
							.addGap(35))
						.addGroup(gl_adddata.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_adddata.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_8)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		adddata.setLayout(gl_adddata);
		
		JPanel Filter = new JPanel();
		tabbedPane.addTab("  Filter", new ImageIcon(MainUI.class.getResource("/com/postal/icons/Report.png")), Filter, null);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Today (Default)");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("All");
		
		JLabel lblNewLabel_8_1 = new JLabel("Month :");
		
		JLabel lblNewLabel_10 = new JLabel("Post Type :");
		
		JComboBox comboBox_2 = new JComboBox();
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblNewLabel_9 = new JLabel("Division :");
		
		JLabel lblNewLabel_11 = new JLabel("Day :");
		
		JComboBox comboBox_3 = new JComboBox();
		
		JComboBox comboBox_4 = new JComboBox();
		GroupLayout gl_Filter = new GroupLayout(Filter);
		gl_Filter.setHorizontalGroup(
			gl_Filter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Filter.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_Filter.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_Filter.createSequentialGroup()
							.addGap(296)
							.addComponent(lblNewLabel_8_1)
							.addGap(13)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(lblNewLabel_11)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Filter.createSequentialGroup()
							.addGap(3)
							.addComponent(rdbtnNewRadioButton_2)
							.addGap(54)
							.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(48)
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(lblNewLabel_9)
							.addGap(3)
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		gl_Filter.setVerticalGroup(
			gl_Filter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Filter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Filter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Filter.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_8_1))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Filter.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_Filter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_11)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
					.addGap(10)
					.addGroup(gl_Filter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Filter.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtnNewRadioButton)
							.addComponent(rdbtnNewRadioButton_2))
						.addGroup(gl_Filter.createSequentialGroup()
							.addGap(31)
							.addComponent(lblNewLabel_10))
						.addGroup(gl_Filter.createSequentialGroup()
							.addGap(27)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Filter.createSequentialGroup()
							.addGap(31)
							.addComponent(lblNewLabel_9))
						.addGroup(gl_Filter.createSequentialGroup()
							.addGap(22)
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(497, Short.MAX_VALUE))
		);
		Filter.setLayout(gl_Filter);
		
		JPanel search = new JPanel();
		tabbedPane.addTab("Search", new ImageIcon(MainUI.class.getResource("/com/postal/icons/search.png")), search, null);
		
		JLabel lblNewLabel_7_1 = new JLabel("Choose Month :");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"All", "January", "February", "March", "April", "May", "June", "Jule", "August", "September", "November", "December"}));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		
		JButton btnNewButton_3 = new JButton("Delete");
		GroupLayout gl_search = new GroupLayout(search);
		gl_search.setHorizontalGroup(
			gl_search.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_search.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_search.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_search.createSequentialGroup()
							.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
							.addGap(58)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_search.createSequentialGroup()
							.addGap(390)
							.addComponent(btnNewButton)
							.addGap(29)
							.addComponent(btnNewButton_3)))
					.addContainerGap(186, Short.MAX_VALUE))
		);
		gl_search.setVerticalGroup(
			gl_search.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_search.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_search.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_search.createSequentialGroup()
							.addGap(3)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_search.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(12)
					.addGroup(gl_search.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_3))
					.addContainerGap(508, Short.MAX_VALUE))
		);
		search.setLayout(gl_search);
		
		JPanel settings = new JPanel();
		tabbedPane.addTab("Settings", new ImageIcon(MainUI.class.getResource("/com/postal/icons/3439450241582806953-128.png")), settings, null);
		
		JLabel lblNewLabel_12 = new JLabel("Change Theme");
		
		JComboBox comboBox_5 = new JComboBox();
		GroupLayout gl_settings = new GroupLayout(settings);
		gl_settings.setHorizontalGroup(
			gl_settings.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_settings.createSequentialGroup()
					.addGap(63)
					.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(358, Short.MAX_VALUE))
		);
		gl_settings.setVerticalGroup(
			gl_settings.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_settings.createSequentialGroup()
					.addGroup(gl_settings.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_settings.createSequentialGroup()
							.addGap(78)
							.addComponent(lblNewLabel_12))
						.addGroup(gl_settings.createSequentialGroup()
							.addGap(73)
							.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(491, Short.MAX_VALUE))
		);
		settings.setLayout(gl_settings);
		
		JPanel about = new JPanel();
		tabbedPane.addTab("About", new ImageIcon(MainUI.class.getResource("/com/postal/icons/about.png")), about, null);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(MainUI.class.getResource("/com/postal/icons/D.jpg")));
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(MainUI.class.getResource("/com/postal/icons/detail.gif")));
		GroupLayout gl_about = new GroupLayout(about);
		gl_about.setHorizontalGroup(
			gl_about.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_about.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(108, Short.MAX_VALUE))
		);
		gl_about.setVerticalGroup(
			gl_about.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_about.createSequentialGroup()
					.addGroup(gl_about.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_about.createSequentialGroup()
							.addGap(66)
							.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_about.createSequentialGroup()
							.addGap(95)
							.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(334, Short.MAX_VALUE))
		);
		about.setLayout(gl_about);
	}
}
