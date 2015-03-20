/***************************************************************************************************************/
/** Copyright 2015 BiggerOnTheInside (development), all rights reserved.                                       */
/** Released under the Binder License (https://github.com/BiggerOnTheInside/Licenses/blob/master/Binder.txt)   */
/***************************************************************************************************************/

package me.wxwsk8er.Knapsack;

import org.newdawn.slick.Color;

public enum ChatColor {
	BLACK(Color.black),
	BLUE(Color.blue),
	CYAN(Color.cyan),
	DARK_GRAY(Color.darkGray),
	GRAY(Color.gray),
	GREEN(Color.green),
	LIGHT_GRAY(Color.lightGray),
	MAGENTA(Color.magenta),
	ORANGE(Color.orange),
	PINK(Color.pink),
	RED(Color.red),
	CLEAR(Color.transparent),
	WHITE(Color.white),
	YELLOW(Color.yellow);
	
	private Color c;
	
	ChatColor(Color c){
		this.c = c;
	}

	public Color getColor(){
		return c;
	}
}
