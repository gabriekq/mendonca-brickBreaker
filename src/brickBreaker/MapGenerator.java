package brickBreaker;

import java.awt.BasicStroke;
import java.awt.Color;

import java.awt.Graphics2D;

public class MapGenerator {

	public int map[][];
	public int brinkWidth;
	public int brinckHeight;
	
	public MapGenerator(int row, int col) {
		map = new int[row][col];
		for(int i=0;i<map.length;i++) {
			for(int j=0;j< map[0].length;j++) {
				map[i][j] = 1;
			}
		}
		brinkWidth = 540/col;
		brinckHeight = 150/row;	
	}
	
	public void draw(Graphics2D g) {
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j< map[0].length;j++) {
			   if(map[i][j] > 0 ) {
				   g.setColor(Color.white);
				   g.fillRect(j*brinkWidth+80, i*brinckHeight+50, brinkWidth, brinckHeight);
			       
				   g.setStroke(new BasicStroke(3));
				   g.setColor(Color.black);
				   g.drawRect(j*brinkWidth+80, i*brinckHeight+50, brinkWidth, brinckHeight);
				      
				   
			   }
			}
		}
	}
	
	public void setBrickValue(int value, int row,int col) {
		map[row][col] = value;
	}
	
	
}
