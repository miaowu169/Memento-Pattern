package com.practice.memento;
/*
 * ��������¼�࣬�洢ԭ�������ڲ�״̬
 */
public class Memento {
	private String state;
	//����ԭ�������ڲ�״̬
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
