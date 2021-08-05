package com.pj.chess;
public enum ComputerLevel{
		greenHand(6,4),
		introduction(7,8),
		amateur(8,16),
		career(9,32),
		master(15,64),
		invincible(32,60*60);
		public int depth;
		public long time;
		private ComputerLevel(int depth,long time){
			this.depth=depth;
			this.time=time*1000;
		}
	}