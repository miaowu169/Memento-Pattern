package com.practice.memento;

public class PlayerOriginator {
	private String heroName;
	
	public void setHero(String heroName) {
		this.heroName = heroName;
	}
	
	public String getHero() {
		return heroName;
	}
	
	public Hero createMemento() {
		return new Hero(heroName);
	}
	
	public void restoreMemento(Hero p) {
		setHero(p.getHero());
	}
}
