/***************************************************************************************************************/
/** Copyright 2015 BiggerOnTheInside (development), all rights reserved.                                       */
/** Released under the Binder License (https://github.com/BiggerOnTheInside/Licenses/blob/master/Binder.txt)   */
/***************************************************************************************************************/

package net.BiggerOnTheInside.Knapsack.configuration;

import java.io.FileReader;

import net.BiggerOnTheInside.Knapsack.Knapsack;
import net.BiggerOnTheInside.Knapsack.util.RemoteUtil;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONConfiguration extends Configuration{
	private JSONParser fileParser;
	private JSONParser stringParser;
	private JSONObject jsonObject;
	private Object jsonData;
	private String filePath;
	private String stringData;
	private boolean remote;
	
	/**
	 * @param filePath Path relative to the net.BiggerOnTheInside.Knapsack package.
	 * @param remote   Boolean to check if this file needs downloaded and parsed or not.
	 */
	public JSONConfiguration(String filePath, boolean remote){
		this.filePath = filePath;
		this.remote = remote;
		
		init(false);
	}

	/**
	 * @param data Data to digest a JSONObject from.
	 */
	public JSONConfiguration(String data){
		this.stringData = data;
	}
	
	/**
	 * @param string Does this configuration use string parsing or file parsing?
	 */
	@Override
	protected void init(boolean string) {
		this.fileParser = new JSONParser();
		this.stringParser = new JSONParser();
		
		if(!string){
			if(!remote){
				try {
					this.jsonData = fileParser.parse(new FileReader(Knapsack.getInstance().getFolderPath()));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			else{
				try{
					this.stringData = RemoteUtil.readUrl(filePath);
					this.jsonData = stringParser.parse(stringData);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		else{
			try {
				this.jsonData = stringParser.parse(stringData);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.jsonObject = (JSONObject) jsonData;
	}

	/**
	 * @return String object at the 'path' location, from JSON file.
	 */
	public String getString(String path){
		return (String) jsonObject.get(path);
	}
	
	/**
	 * @return Double object at the 'path' location, from JSON file.
	 */
	public double getDouble(String path){
		return (Double) jsonObject.get(path);
	}
	
	public int getInt(String path){
		return (Integer) jsonObject.get(path);
	}
	
	public float getFloat(String path){
		return (Float) jsonObject.get(path);
	}
	
	public boolean getBoolean(String path){
		return (Boolean) jsonObject.get(path);
	}
	
	@Override
	public byte getByte(String path) {
		return (Byte) jsonObject.get(path);
	}
	
	public JSONConfiguration getArray(String path){
		this.jsonObject = (JSONObject) jsonObject.get(path);
		
		return this;
	}
	
	public void resetArray(){
		this.jsonObject = (JSONObject) jsonData;
	}
	
	public int getIntFromArray(String arrayPath, String path){
		return (Integer) ((JSONObject) jsonObject.get(arrayPath)).get(path);
	}
	
	public String getStringFromArray(String arrayPath, String path){
		return (String) ((JSONObject) jsonObject.get(arrayPath)).get(path);
	}
	
	public boolean getBooleanFromArray(String arrayPath, String path){
		return (Boolean) ((JSONObject) jsonObject.get(arrayPath)).get(path);
	}
	
	@Override
	public ConfigurationSection getConfigurationSection(String path) {
		return new ConfigurationSection(this.getArray(path));
	}
}
