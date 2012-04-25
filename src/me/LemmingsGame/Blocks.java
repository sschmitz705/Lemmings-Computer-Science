package me.LemmingsGame;

public class Blocks {
	public static final int AIR=0,STONE=1,DIRT=2,LAVA=3,SPIKE=4,LSLOPE1=5,RSLOPE1=5;
	public static boolean isDangerous(int block){
		if(block==LAVA||block==SPIKE)
			return true;
		return false;
	}
	public static int getBlockSlope(int block){
		if(block==LSLOPE1||block==RSLOPE1)
			return 1;
		return 0;
	}
}
