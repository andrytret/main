package Add;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class ProgramFrame {

	/**
	 * Launch the application.
	 */

	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// ProgramFrame window = new ProgramFrame();
	// window.frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	//
	// }

	// Конец метода мэин
	public static Object main;
	public JFrame frame;
	private JButton btnStart;
	private final JTextField textField = new JTextField();

	// TODO я делаю, чтобы твои лэйблы стали полями класса. тогда они будут
	// доступны извне.
	public JLabel returnLabelSP;
	public JLabel returnLabelS;
	public JLabel returnLabelAt;
	public JLabel returnLabelNt;
	public JLabel returnLabelSKL;
	public JTextArea textArea;

	public final String[] items = { "-", "F1", "F2", "F3", "F4", "F5", "F6", "F7" };

	public ProgramFrame() {
		initialize();
	}

	public JButton getBtnStart() {
		return btnStart;
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @return
	 */
	public void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setTitle("MFB");
		frame.setBounds(100, 100, 366, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

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

		JList<?> list = new JList<Object>();
		list.setBounds(80, 88, 53, -15);
		frame.getContentPane().add(list);
		list.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		list.setToolTipText("");
		list.setBackground(Color.WHITE);
		final JComboBox<?> comboBox_1 = new JComboBox<Object>(items);
		comboBox_1.setBounds(76, 75, 65, 20);
		frame.getContentPane().add(comboBox_1);

		final JComboBox<?> comboBox_2 = new JComboBox<Object>(items);
		comboBox_2.setBounds(76, 100, 65, 20);
		frame.getContentPane().add(comboBox_2);

		final JComboBox<?> comboBox_3 = new JComboBox<Object>(items);
		comboBox_3.setBounds(76, 125, 65, 20);
		frame.getContentPane().add(comboBox_3);

		final JComboBox<?> comboBox_4 = new JComboBox<Object>(items);
		comboBox_4.setBounds(76, 150, 65, 20);
		frame.getContentPane().add(comboBox_4);

		final JComboBox<?> comboBox_5 = new JComboBox<Object>(items);
		comboBox_5.setBounds(76, 175, 65, 20);
		frame.getContentPane().add(comboBox_5);

		final JLabel label = new JLabel("");
		label.setBounds(10, 45, 338, 14);
		frame.getContentPane().add(label);

		textArea = new JTextArea();
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(259, 103, 89, 20);
		frame.getContentPane().add(textArea);

		JLabel Podpis1 = new JLabel("Sp");
		Podpis1.setBounds(10, 220, 48, 14);
		frame.getContentPane().add(Podpis1);

		JLabel Podpis2 = new JLabel("S");
		Podpis2.setBounds(10, 245, 48, 14);
		frame.getContentPane().add(Podpis2);

		JLabel Podpis3 = new JLabel("At");
		Podpis3.setBounds(10, 270, 48, 14);
		frame.getContentPane().add(Podpis3);

		JLabel Podpis4 = new JLabel("NT");
		Podpis4.setBounds(10, 295, 48, 14);
		frame.getContentPane().add(Podpis4);

		JLabel Podpis5 = new JLabel("Skl");
		Podpis5.setBounds(10, 320, 48, 14);
		frame.getContentPane().add(Podpis5);

		returnLabelSP = new JLabel("");
		returnLabelSP.setBounds(76, 220, 46, 14);
		frame.getContentPane().add(returnLabelSP);

		returnLabelS = new JLabel("");
		returnLabelS.setBounds(76, 245, 46, 14);
		frame.getContentPane().add(returnLabelS);

		returnLabelAt = new JLabel("");
		returnLabelAt.setBounds(76, 270, 46, 14);
		frame.getContentPane().add(returnLabelAt);

		returnLabelNt = new JLabel("");
		returnLabelNt.setBounds(76, 295, 46, 14);
		frame.getContentPane().add(returnLabelNt);

		returnLabelSKL = new JLabel("");
		returnLabelSKL.setBounds(76, 320, 46, 14);
		frame.getContentPane().add(returnLabelSKL);

		textArea.setText("Готов к Работе");

		// нажатие кнопки стоп
		btnStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Остановил");
			}
		});

		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String item1 = (String) comboBox_1.getSelectedItem();
				String item2 = (String) comboBox_2.getSelectedItem();
				String item3 = (String) comboBox_3.getSelectedItem();
				String item4 = (String) comboBox_4.getSelectedItem();
				String item5 = (String) comboBox_5.getSelectedItem();

				returnLabelSP.setText(item1);
				returnLabelS.setText(item2);
				returnLabelAt.setText(item3);
				returnLabelNt.setText(item4);
				returnLabelSKL.setText(item5);

				textArea.setText("Работаю");

			}
		});

	}
}
