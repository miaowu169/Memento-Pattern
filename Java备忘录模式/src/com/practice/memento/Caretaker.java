package com.practice.memento;
/*
 * �����������࣬���𱣴汸��¼���洢����¼����
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
