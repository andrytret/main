import java.awt.AWTException;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MainProg {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProg window = new MainProg();
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
	public MainProg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setTitle("MFB");
		frame.setBounds(100, 100, 366, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final String[] items = 
			{"-","F1","F2","F3","F4","F5","F6","F7"};
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBounds(259, 74, 89, 20);
		frame.getContentPane().add(btnStop);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(0, 11, 358, 23);
		frame.getContentPane().add(btnStart);
		
		JLabel lblSpoil = new JLabel("Sp");
		lblSpoil.setBounds(10, 78, 46, 14);
		frame.getContentPane().add(lblSpoil);
		
		JLabel lblSweep = new JLabel("S");
		lblSweep.setBounds(10, 103, 46, 14);
		frame.getContentPane().add(lblSweep);
		
		JLabel lblAttack = new JLabel("At");
		lblAttack.setBounds(10, 128, 46, 14);
		frame.getContentPane().add(lblAttack);
		
		JLabel lblNexttarget = new JLabel("NT");
		lblNexttarget.setBounds(10, 153, 61, 14);
		frame.getContentPane().add(lblNexttarget);
		
		JLabel lblSkill = new JLabel("Skl");
		lblSkill.setBounds(10, 178, 46, 14);
		frame.getContentPane().add(lblSkill);
		
		JList list = new JList();
		list.setBounds(80, 88, 53, -15);
		frame.getContentPane().add(list);
		list.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		list.setToolTipText("");
		list.setBackground(Color.WHITE);
		final JComboBox comboBox = new JComboBox(items);
		comboBox.setBounds(76, 75, 65, 20);
		frame.getContentPane().add(comboBox);
		
		final JComboBox comboBox_1 = new JComboBox(items);
		comboBox_1.setBounds(76, 100, 65, 20);
		frame.getContentPane().add(comboBox_1);
		
		final JComboBox comboBox_2 = new JComboBox(items);
		comboBox_2.setBounds(76, 125, 65, 20);
		frame.getContentPane().add(comboBox_2);
		
		final JComboBox comboBox_3 = new JComboBox(items);
		comboBox_3.setBounds(76, 150, 65, 20);
		frame.getContentPane().add(comboBox_3);
		
		final JComboBox comboBox_4 = new JComboBox(items);
		comboBox_4.setBounds(76, 175, 65, 20);
		frame.getContentPane().add(comboBox_4);
		
		final JLabel label = new JLabel("");
		label.setBounds(10, 45, 338, 14);
		frame.getContentPane().add(label);
		
		final JTextArea time1 = new JTextArea();
		time1.setBounds(150, 75, 85, 20);
		frame.getContentPane().add(time1);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(259, 103, 89, 20);
		frame.getContentPane().add(textArea);
		//конец описания элементов интерфейса
		int x=0;
		time1.setText("0");
		time1.setText(time1.getText());
		
		
		
		
		textArea.setText("p");
		
		
		btnStop.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			textArea.setText("Остановил");	
			}});	
		
			
      //Нажатие кнопки старт
		btnStart.addActionListener(new ActionListener()
		
		{@Override
			public void actionPerformed(ActionEvent e){
		label.setText(" ");
			
		String item1 = (String)comboBox.getSelectedItem();
		String item2 = (String)comboBox_1.getSelectedItem();
		String item3 = (String)comboBox_2.getSelectedItem();
		String item4 = (String)comboBox_3.getSelectedItem();	
		String item5 = (String)comboBox_4.getSelectedItem();
				
		String znach1 =(String) CheckItem.check1(item1, items);
		String znach2 =(String) CheckItem.check1(item2, items);
		String znach3 =(String) CheckItem.check1(item3, items);
		String znach4 =(String) CheckItem.check1(item4, items);
		String znach5 =(String) CheckItem.check1(item5, items);
		//textArea.setText(null);
		String d1,d2 = "";
		textArea.setText(textArea.getText());
		d1 = textArea.getText();
		d2=d1;
		
		System.out.println("  ="+d1+ "=");
		if ( d2 ==  "p"  ){
			label.setText(znach1 + "  "+ znach2+ "  "+ znach3+ "  "		+ znach4+ "  "+ znach5+" ");
} 
		else {
			label.setText("Завершено");
			}
		textArea.setText("p");
		//textArea.setText(" ");
		/*int interval1 = 0;
		//interval1 = Integer.valueOf(time1.getText());*/
		
		//	
														}
		
		
		}
				);
		 
	
		
		
	}
	

	private JButton btnStart;
	/**
	 * @wbp.nonvisual location=-26,301
	 */
	private final JTextField textField = new JTextField();
	public JButton getBtnStart() {
		return btnStart;
}	
}

