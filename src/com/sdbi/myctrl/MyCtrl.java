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
 * @category Java远程控制电脑
 * @author 李阳
 *
 */
public class MyCtrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = JOptionPane.showConfirmDialog(null, "请求控制对方电脑?", ""
				+ "Java远程控制", JOptionPane.YES_NO_OPTION);
		if (choice == JOptionPane.NO_OPTION) {
			return;
		}
		// 输入ip地址和端口号
		JOptionPane.showInputDialog("请输入ip地址和端口号", "127.0.0.1:10000");
		// 初始化窗口 默认不可见
		JFrame jFrame = new JFrame("Java远程桌面控制");
		// 设置窗口的大小
		jFrame.setSize(600, 600);
		// 设置居中
		jFrame.setLocationRelativeTo(null);
		// 设置软件窗口置顶
		jFrame.setAlwaysOnTop(true);
		// 设置窗口的可见性
		jFrame.setVisible(true);
		// 点击X的时候退出软件
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 获取屏幕 权限 定义方法能够直接串北极的操作系统
		Toolkit tk = Toolkit.getDefaultToolkit();
		// 获取屏幕大小
		Dimension dm = tk.getScreenSize();
		dm.getHeight();
		dm.getWidth();
		System.out.println("宽度" + dm.getWidth() + "高度" + dm.getHeight());
		JLabel imageJLabel = new JLabel();
		jFrame.add(imageJLabel);
		// 截图 创建一个 机器人 异常机制 不正常的事件
		try {
			Robot robot = new Robot();
			// 指定坐标
			while (true) {
				Rectangle rec = new Rectangle(jFrame.getWidth(), 0,
						(int) dm.getWidth() - jFrame.getWidth(),
						(int) dm.getHeight());
				// 开始截图
				BufferedImage bf = robot.createScreenCapture(rec);
				// 图片输出
				// ImageIO.write(bf, "png", new
				// File("E://新建文件夹//img//liyang.png"));
				imageJLabel.setIcon(new ImageIcon(bf));
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//远程监控 思路 获取ip地址和端口号

}
