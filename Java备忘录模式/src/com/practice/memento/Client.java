package com.practice.memento;

public class Client {
	public static void main(String[] args) {
		//����ԭ��������
		Originator or = new Originator();
		//���������˶���
		Caretaker cr = new Caretaker();
		//����ԭ������ǰ״̬
		or.setState("You are still alive!");
		System.out.println("��ʼ״̬:" + or.getState());
		//��ԭ������ǰ״̬���뱸��¼��
		cr.setMemento(or.createMemento());
		//����ԭ������״̬
		or.setState("You have been slained!");
		System.out.println("�µ�״̬:" + or.getState());
		//����ʼ״̬�ӱ���¼��ȡ��
		or.restoreMemento(cr.getMemento());
		System.out.println("�ָ�״̬:" + or.getState());
	}
}
