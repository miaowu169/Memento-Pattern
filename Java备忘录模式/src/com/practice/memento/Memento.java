package com.practice.memento;
/*
 * 创建备忘录类，存储原发器的内部状态
 */
public class Memento {
	private String state;
	//接收原发器的内部状态
	public Memento(String state) {
		this.state = state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
