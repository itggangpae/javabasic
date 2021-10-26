package oop_2_interface;

public class StarcraftAbleMain {
	public static void main(String[] args) {
		TerranImpl marine = new TerranImpl();
		marine.attack();
		ProtossImpl dragoon = new ProtossImpl();
		dragoon.attack();
		ZergImpl hydralisk = new ZergImpl();
		hydralisk.attack();
	}
}
