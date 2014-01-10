import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

public class Keys {
	public void f1() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F1);
	}

	public void f2() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F2);
	}

	public void f3() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F3);
	}

	public void f4() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F4);
	}

	public void f5() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F5);
	}

	public void f6() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F6);
	}

	public void f7() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F7);
	}

	public Robot robot;

}
