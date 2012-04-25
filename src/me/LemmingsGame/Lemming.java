package me.LemmingsGame;

import java.awt.Image;

public class Lemming {
	public static final int WALK=0, DYING=1,FALLING=2,CHUTE=3,CLIMB=4,BLOCK=6,BUILD=7,DETONATE=8;
	private int x,y;
	private int frame;
	private Image [] sprite;
	public Lemming(Gate spawn){
		
	}
	public int x(){
		return x;
	}
	public int y(){
		return y;
	}
	public void cycle(){
		
	}
}
