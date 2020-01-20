package com.practice.memento;
/*
 * 创建负责人类，负责保存备忘录，存储备忘录对象
 */
public class Caretaker {
	private Memento memento;
	
	public void setMemento(Memento m) {
		memento = m;
	}
	
	public Memento getMemento() {
		return memento;
	}
}
