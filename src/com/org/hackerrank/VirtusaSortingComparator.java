package com.org.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player {
	private String name;
	private int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

}

class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		int score1 = p1.getScore();
		int score2 = p2.getScore();
	
		return score1 < score2 ? 1 : score1>score2 ?-1: p1.getName().compareTo(p2.getName());
	}

}

public class VirtusaSortingComparator {

	public static void main(String[] args) {
		Player p1 = new Player("amy", 100);
		Player p2 = new Player("david", 100);
		Player p3 = new Player("heraldo", 50);
		Player p4 = new Player("aakansha", 75);
		Player p5 = new Player("aleksa", 150);

		List<Player> list = new ArrayList<Player>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		Collections.sort(list, new PlayerComparator());
		list.forEach(System.out::println);
	}

}
