import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.event.KeyEvent;



public class Keys {
	public void keyf1() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F1);
	}

	public void keyf2() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F2);
	}

	public void keyf3() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F3);
	}

	public void keyf4() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F4);
	}

	public void keyf5() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F5);
	}

	public void keyf6() {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		try {
			robot = new Robot(screen);
		} catch (AWTException ex) {
		}
		robot.keyPress(KeyEvent.VK_F6);
	}

	public void keyf7() {
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
