package com.postal.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class PostGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostGUI frame = new PostGUI();
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
	public PostGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PostGUI.class.getResource("/com/postal/icons/CMS-1024x319.jpg")));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel dashboard = new JPanel();
		tabbedPane.addTab("DeskPanel", new ImageIcon(PostGUI.class.getResource("/com/postal/icons/dashb.png")), dashboard, null);
		
		JPanel addata = new JPanel();
		tabbedPane.addTab("Add Data", new ImageIcon(PostGUI.class.getResource("/com/postal/icons/adddata.png")), addata, null);
		addata.setLayout(new BorderLayout(0, 0));
		
		
		JPanel northpanel = new JPanel();
		addata.add(northpanel, BorderLayout.NORTH);
		GridBagLayout gbl_northpanel = new GridBagLayout();
		gbl_northpanel.columnWidths = new int[]{269, 146, 32, 83, 32, 0, 0, 0};
		gbl_northpanel.rowHeights = new int[]{0, 24, 0};
		gbl_northpanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_northpanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		northpanel.setLayout(gbl_northpanel);
		
		JLabel lblNewLabel_6 = new JLabel("Post Type Received :");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 1;
		northpanel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JComboBox postCombo = new JComboBox();
		postCombo.setName("");
		GridBagConstraints gbc_postCombo = new GridBagConstraints();
		gbc_postCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_postCombo.anchor = GridBagConstraints.NORTH;
		gbc_postCombo.insets = new Insets(0, 0, 0, 5);
		gbc_postCombo.gridx = 1;
		gbc_postCombo.gridy = 1;
		northpanel.add(postCombo, gbc_postCombo);
		
		JLabel lblNewLabel_5 = new JLabel("Division to :");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 1;
		northpanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JComboBox Divicombo = new JComboBox();
		GridBagConstraints gbc_Divicombo = new GridBagConstraints();
		gbc_Divicombo.insets = new Insets(0, 0, 0, 5);
		gbc_Divicombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_Divicombo.gridx = 5;
		gbc_Divicombo.gridy = 1;
		northpanel.add(Divicombo, gbc_Divicombo);
		
		JPanel southpanel = new JPanel();
		addata.add(southpanel, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Save");
		southpanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		southpanel.add(btnNewButton_2);
		
		Adddata centrepanel =new Adddata();
		addata.add(centrepanel, BorderLayout.CENTER);

		
		JPanel search = new JPanel();
		tabbedPane.addTab("search", new ImageIcon(PostGUI.class.getResource("/com/postal/icons/search.png")), search, null);
		
		JPanel about = new JPanel();
		tabbedPane.addTab("Developer", new ImageIcon(PostGUI.class.getResource("/com/postal/icons/about.png")), about, null);
	}

}
