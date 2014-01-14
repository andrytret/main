import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;

//import calc.ProgramFrame;

public class CoreOfProgram {

	/**
	 * @param args
	 */
	public static void main1(String[] args) {
		// TODO tut esche ne delal
		// c camogo nach nada zadat znach iz ProgramFrame i otkrit sam fram
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
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
