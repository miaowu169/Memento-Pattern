package com.practice.memento;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class HeroGame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel CenterJP, EastJP;
	JRadioButton hero1, hero2, hero3, hero4;
	JButton button1, button2;
	String FileName;
	JLabel g;
	PlayerOriginator po;
	HeroStack hs;

	public HeroGame() {
		super("王者荣耀与备忘录莫模式");
		po = new PlayerOriginator();
		hs = new HeroStack();
		this.setBounds(0,0,900,380);
		this.setResizable(false);
		FileName = "src/com/practice/photo/hero.jpg";
		g = new JLabel(new ImageIcon(FileName),JLabel.CENTER);
		CenterJP = new JPanel();
		CenterJP.setLayout(new GridLayout(1,4));
		CenterJP.setBorder(BorderFactory.createTitledBorder("英雄如下:"));
		CenterJP.add(g);
		this.add("Center",CenterJP);
		EastJP = new JPanel();
		EastJP.setLayout(new GridLayout(1,1));
		EastJP.setBorder(BorderFactory.createTitledBorder("您选择的英雄是:"));
		this.add("East",EastJP);
		JPanel SouthJP = new JPanel();
		JLabel info = new JLabel("您要选择四位英雄中的哪一位？");
		hero1 = new JRadioButton("伽罗",true);
		hero2 = new JRadioButton("小乔");
		hero3 = new JRadioButton("大乔");
		hero4 = new JRadioButton("娜可露露");
		button1 = new JButton("确定");
		button2 = new JButton("返回");
		ButtonGroup group = new ButtonGroup();
		group.add(hero1);
		group.add(hero2);
		group.add(hero3);
		group.add(hero4);
		SouthJP.add(info);
		SouthJP.add(hero1);
		SouthJP.add(hero2);
		SouthJP.add(hero3);
		SouthJP.add(hero4);
		SouthJP.add(button1);
		SouthJP.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		this.add("South",SouthJP);
		showPicture("空白");
		po.setHero("空白");
		hs.push(po.createMemento());
	}
	
	//显示图片
	void showPicture(String name) {
		EastJP.removeAll();
		EastJP.repaint();
		po.setHero(name);
		FileName = "src/com/practice/photo/" + name + ".png";
		g = new JLabel(new ImageIcon(FileName),JLabel.CENTER);
		EastJP.add(g);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		boolean ok = false;
		if(e.getSource() == button1) {
			ok = hs.push(po.createMemento());//保存状态
			if(ok && hero1.isSelected()) {
				showPicture("伽罗");
			}else if(ok && hero2.isSelected()) {
				showPicture("小乔");
			}else if(ok && hero3.isSelected()) {
				showPicture("大乔");
			}else if(ok && hero4.isSelected()) {
				showPicture("娜可露露");
			}
		}else if(e.getSource() == button2) {
			po.restoreMemento(hs.pop());//恢复状态
			showPicture(po.getHero());
		}
	}
}
