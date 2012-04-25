package me.LemmingsGame;

public class World {
	private int [][] blocks;
	private int [][] gates;
	public World(int [][]blocks, int [][] gates){
		this.blocks=blocks;
		this.gates=gates;
	}
	public void clearBlock(int x, int y){
		blocks[x][y]=0;
	}
	public int checkPosition(Lemming victim){
		int x=victim.x(),y=victim.y();
		if(x%10==0){
			if(getBlock(x%10,(y+20)/10)==Blocks.AIR)
				return Lemming.FALLING;
			if(y%10==0&&Blocks.isDangerous(getBlock(x,(y+20)/10)))
				return Lemming.DYING;
		}else if(getBlock(x/10,(y+20)/10)==Blocks.AIR&&getBlock((x+10)/10,(y+20)/10)==Blocks.AIR)
			return Lemming.FALLING;
		return Lemming.WALK;
	}
	public int getBlock(int x,int y){
		return blocks[x][y];
	}
}
