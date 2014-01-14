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

//import calc.ProgramFrame;

public class CoreOfProgram {

	/**
	 * @param args
	 */
	public static void main1(String[] args) {
		// TODO tut esche ne delal 
		// c camogo nach nada zadat znach iz ProgramFrame i otkrit sam fram
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		Robot robot = null;
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		int i = 0;
		while (i != 10) {
			i = i + 1;
			robot.delay(1000);

			System.out.println("123");

		}
	}
}
