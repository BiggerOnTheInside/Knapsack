/***************************************************************************************************************/
/** Copyright 2015 BiggerOnTheInside (development), all rights reserved.                                       */
/** Released under the Binder License (https://github.com/BiggerOnTheInside/Licenses/blob/master/Binder.txt)   */
/***************************************************************************************************************/

package net.BiggerOnTheInside.Knapsack.configuration;


public abstract class Configuration {
	protected abstract void init(boolean string);
	
	public abstract String getString(String path);
	public abstract int getInt(String path);
	public abstract double getDouble(String path);
	public abstract float getFloat(String path);
	public abstract byte getByte(String path);
	public abstract boolean getBoolean(String path);
	public abstract JSONConfiguration getArray(String path);
	public abstract void resetArray();
	public abstract int getIntFromArray(String arrayPath, String path);
	public abstract String getStringFromArray(String arrayPath, String path);
	public abstract boolean getBooleanFromArray(String arrayPath, String path);
	public abstract ConfigurationSection getConfigurationSection(String path);
	//public abstract Configuration parseFile(String path, boolean remote);
	//public abstract Configuration parseString(String data);
}
