import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
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

import calc.ProgramFrame;

public class CoreOfProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String znachComboBox1 = (String) ProgramFrame.main("123");
	
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		Robot robot = null;
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		int i=0;
		while(i!=10 ) {
			i=i+1;
			robot.delay(1000);
			/*if (znach1.equals("F1")) {
				System.out.println("F1");
			} else if (znach1.equals("F2")) {
				System.out.println("F2");
			} else if (znach1.equals("F3")) {
				System.out.println("F3");
			} else if (znach1.equals("F4")) {
				System.out.println("F4");
			} else if (znach1.equals("F5")) {
				System.out.println("F5");
			} else if (znach1.equals("F6")) {
				System.out.println("F6");
			} else if (znach1.equals("F7")) {
				System.out.println("F7");
			} else if (znach1.equals("-")) {
				System.out.println("-");
			}*/
			System.out.println("123");
	
	
			/*
			 * String d1 = null; textArea.setText(textArea.getText()); d1 =
			 * textArea.getText();
			 */
			// znach1.equals("-") &&
			// Нажатие кнопки старт
			// конец описания элементов интерфейса
	
	}
	}}

