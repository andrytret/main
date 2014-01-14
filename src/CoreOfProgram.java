import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;

import Add.CheckItem;
import Add.ProgramFrame;

//import calc.ProgramFrame;

public class CoreOfProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO tut esche ne delal 
		// c camogo nach nada zadat znach iz ProgramFrame i otkrit sam fram
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ProgramFrame window = new ProgramFrame();
						window.frame.setVisible(true);
						doOtherThings(window);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				private void doOtherThings(ProgramFrame window) {
					
					String item1 = (String) window.returnLabelSP.getText();
					String item2 = (String) window.returnLabelS.getText();
					String item3 = (String) window.returnLabelAt.getText();
					String item4 = (String) window.returnLabelNt.getText();
					String item5 = (String) window.returnLabelSKL.getText();
					// TOD Znach peremennih nije nada ispolzovat v dr klasse return probival
					// ne prokatilo
					
					String znachTextArea1 = window.textArea.getText();

				System.out.println(item1);
				System.out.println(item2);
				System.out.println(item3);
				System.out.println(item4);
				System.out.println(item5);
				System.out.println(znachTextArea1);
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
			});
	}
}
