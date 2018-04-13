package com.sdbi.myctrl;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @category JavaԶ�̿��Ƶ���
 * @author ����
 *
 */
public class MyCtrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = JOptionPane.showConfirmDialog(null, "������ƶԷ�����?", ""
				+ "JavaԶ�̿���", JOptionPane.YES_NO_OPTION);
		if (choice == JOptionPane.NO_OPTION) {
			return;
		}
		// ����ip��ַ�Ͷ˿ں�
		JOptionPane.showInputDialog("������ip��ַ�Ͷ˿ں�", "127.0.0.1:10000");
		// ��ʼ������ Ĭ�ϲ��ɼ�
		JFrame jFrame = new JFrame("JavaԶ���������");
		// ���ô��ڵĴ�С
		jFrame.setSize(600, 600);
		// ���þ���
		jFrame.setLocationRelativeTo(null);
		// ������������ö�
		jFrame.setAlwaysOnTop(true);
		// ���ô��ڵĿɼ���
		jFrame.setVisible(true);
		// ���X��ʱ���˳����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��ȡ��Ļ Ȩ�� ���巽���ܹ�ֱ�Ӵ������Ĳ���ϵͳ
		Toolkit tk = Toolkit.getDefaultToolkit();
		// ��ȡ��Ļ��С
		Dimension dm = tk.getScreenSize();
		dm.getHeight();
		dm.getWidth();
		System.out.println("���" + dm.getWidth() + "�߶�" + dm.getHeight());
		JLabel imageJLabel = new JLabel();
		jFrame.add(imageJLabel);
		// ��ͼ ����һ�� ������ �쳣���� ���������¼�
		try {
			Robot robot = new Robot();
			// ָ������
			while (true) {
				Rectangle rec = new Rectangle(jFrame.getWidth(), 0,
						(int) dm.getWidth() - jFrame.getWidth(),
						(int) dm.getHeight());
				// ��ʼ��ͼ
				BufferedImage bf = robot.createScreenCapture(rec);
				// ͼƬ���
				// ImageIO.write(bf, "png", new
				// File("E://�½��ļ���//img//liyang.png"));
				imageJLabel.setIcon(new ImageIcon(bf));
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//Զ�̼�� ˼· ��ȡip��ַ�Ͷ˿ں�

}
