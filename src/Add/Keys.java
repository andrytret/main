package Add;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;

public class Keys {

	public static void pressKey(Robot robot, int key) {
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice screen = env.getDefaultScreenDevice();
		if (robot == null) {
			try {
				robot = new Robot(screen);
			} catch (AWTException ex) {
				System.out.println(ex);
			}
		}
		robot.keyPress(key);
	}

}

// TODD ���������� ������� �������������� ������ JAVA
// 13 enter
// 27 escape
// 8 backspace
// 32 space
//
// 72 ������� �����
// 80 ������� ����
// 75 ������� �����
// 77 ������� ������
//
// 115 ctrl-������� �����
// 116 ctrl-������� ������
//
// 82 ins (�������)
// 83 del (�������)
//
// 73 pgup (�������� �����)
// 81 pgdn (�������� ����)
// 118 ctrl-pgdn (�������� ����)
// 132 ctrl - pgup (�������� �����)
//
// 71 home (������)
// 79 end (�����)
// 119 ctrl-home (������)
// 117 ctrl-end (�����)
//
// 15 shift tab
// 16-25 alt - q/w/e/r/t/y/u/i/o/p
// 30-38 alt - a/s/d/f/g/h/j/k/l
// 44-50 alt - z/x/c/v/b/n/m
//
// 59-68 ����� f1-f10 (������ ������������ ������� � ���������� ��������)
// 84-93 f11-f20 (shift-f1 - shift-f10)
// 94-103 f21-f30 (ctrl-f1 - ctrl-f10)
//
// 104-113 f31-f40 (alt-f1 - alt-f10)
//
// 133 f11
// 134 f12
// 135 shift-f11
// 136 shift-f13
// 137 ctrl-f11
// 138 ctrl-f12
// 139 alt-f11
// 140 alt-f12
//
// 114 ctrl-prtsc (����� � ������)

