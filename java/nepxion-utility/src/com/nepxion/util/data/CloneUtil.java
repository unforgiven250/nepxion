package com.nepxion.util.data;

/**
 * <p>Title: Nepxion Utility</p>
 * <p>Description: Nepxion Utility Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import com.nepxion.util.io.IOUtil;

public class CloneUtil
{
	/**
	 * Get deep clone object
	 * @param object  the origin
	 * @return        the clone object
	 */
	public static Object deepClone(Object object)
	{
		return IOUtil.deepClone(object);
	}
	
	public static void main(String[] args)
	{
		String[] array = {"Value1", "Value2", "Value3"};
		System.out.println("array [" + array + "]'s value is [" + array[0] + ", " + array[1] + ", " + array[2] + "]");
		
		System.out.println("execute deep clone");
		
		String[] arrayClone = (String[]) CloneUtil.deepClone(array);

		array[0] = "Value4";
		array[1] = "Value5";
		array[2] = "Value6";
		
		System.out.println("array [" + array + "]'s new value [" + array[0] + ", " + array[1] + ", " + array[2] + "]");
		System.out.println("deep clone array [" + arrayClone + "]'s value [" + arrayClone[0] + ", " + arrayClone[1] + ", " + arrayClone[2] + "]");
	}
}