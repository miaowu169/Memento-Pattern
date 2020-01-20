package com.practice.memento;
/*
 * ����ԭ�����࣬�洢��ǰ���ڲ�״̬
 */
public class Originator {
	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	//��������¼���洢��ǰ״̬
	public Memento createMemento() {
		return new Memento(state);
	}
	//���洢��״̬�ӱ���¼��ȡ��
	public void restoreMemento(Memento m) {
		this.setState(m.getState());
	}
}
