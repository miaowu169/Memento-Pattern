package com.practice.memento;
/*
 * 创建原发器类，存储当前的内部状态
 */
public class Originator {
	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	//创建备忘录，存储当前状态
	public Memento createMemento() {
		return new Memento(state);
	}
	//将存储的状态从备忘录中取出
	public void restoreMemento(Memento m) {
		this.setState(m.getState());
	}
}
