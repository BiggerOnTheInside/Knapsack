/***************************************************************************************************************/
/** Copyright 2015 BiggerOnTheInside (development), all rights reserved.                                       */
/** Released under the Binder License (https://github.com/BiggerOnTheInside/Licenses/blob/master/Binder.txt)   */
/***************************************************************************************************************/

package net.BiggerOnTheInside.Knapsack.configuration;

public class ConfigurationSection {
	private Configuration a;
	
	public ConfigurationSection(Configuration a){
		this.a = a;
	}
	
	public Configuration getConfig(){
		return a;
	}
}
