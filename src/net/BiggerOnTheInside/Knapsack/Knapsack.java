/***************************************************************************************************************/
/** Copyright 2015 BiggerOnTheInside (development), all rights reserved.                                       */
/** Released under the Binder License (https://github.com/BiggerOnTheInside/Licenses/blob/master/Binder.txt)   */
/***************************************************************************************************************/

package net.BiggerOnTheInside.Knapsack;

import java.io.File;

import net.BiggerOnTheInside.Knapsack.configuration.JSONConfiguration;

public class Knapsack {
	private File homeFolder;
	private static Knapsack instance;
	
	public Knapsack(){
		System.setProperty("knapsack.home", System.getProperty("user.home") + "/Binder/Knapsack/");
		
		homeFolder = new File(System.getProperty("knapsack.home"));
		
		if(!homeFolder.exists()){
			homeFolder.mkdirs();
		}
	}
	
	public static void main(String... a){
		JSONConfiguration b = new JSONConfiguration("https://raw.githubusercontent.com/BiggerOnTheInside/Binder/master/test.json", true);
		
		System.out.println(b.getArray("test").getString("a"));
		b.resetArray();
		System.out.println(b.getArray("test").getConfigurationSection("bob").getConfig().getString("b"));
		b.resetArray();
		System.out.println(b.getArray("test").getBoolean("c"));
	}
	
	public static Knapsack getInstance(){
		if(instance != null){
			return instance;
		}
		
		instance = new Knapsack();
		
		return instance;
	}
	
	public String getFolderPath(){
		return homeFolder.getAbsolutePath();
	}
}
