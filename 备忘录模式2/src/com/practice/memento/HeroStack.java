package com.practice.memento;

public class HeroStack {
	private Hero hero[];
	private int top;
	
	public HeroStack() {
		hero = new Hero[10];
		top = -1;
	}
	
	public boolean push(Hero p) {
		if(top >= 10) {
			System.out.println("放过小老弟，记不住了");
			return false;
		}else {
			hero[++top] = p;
			return true;
		}
	}
	
	public Hero pop() {
		if(top <= 0) {
			System.out.println("英雄栈空了！");
			return hero[0];
		}else
			return hero[top--];
	}
}
