/***************************************************************************************************************/
/** Copyright 2015 BiggerOnTheInside (development), all rights reserved.                                       */
/** Released under the Binder License (https://github.com/BiggerOnTheInside/Licenses/blob/master/Binder.txt)   */
/***************************************************************************************************************/

package me.wxwsk8er.Knapsack;

import me.wxwsk8er.Knapsack.Configuration.JSONConfiguration;

public abstract class PropertyConstants {
	public JSONConfiguration propertiesFile;
	public String configPath;
	
	/**
	 * Must, Must, Must set the propertiesFile content!
	 */
	public abstract void init();
}
