package com.practice.memento;

public class Client {
	public static void main(String[] args) {
		//创建原发器对象
		Originator or = new Originator();
		//创建负责人对象
		Caretaker cr = new Caretaker();
		//设置原发器当前状态
		or.setState("You are still alive!");
		System.out.println("初始状态:" + or.getState());
		//将原发器当前状态存入备忘录中
		cr.setMemento(or.createMemento());
		//设置原发器新状态
		or.setState("You have been slained!");
		System.out.println("新的状态:" + or.getState());
		//将初始状态从备忘录中取出
		or.restoreMemento(cr.getMemento());
		System.out.println("恢复状态:" + or.getState());
	}
}
