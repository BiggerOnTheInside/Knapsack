/***************************************************************************************************************/
/** Copyright 2015 BiggerOnTheInside (development), all rights reserved.                                       */
/** Released under the Binder License (https://github.com/BiggerOnTheInside/Licenses/blob/master/Binder.txt)   */
/***************************************************************************************************************/

package me.wxwsk8er.Knapsack.util.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;


public class LoggingFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		return "[" + record.getLevel() + "] " + record.getMessage() + "\n";
	}
}
