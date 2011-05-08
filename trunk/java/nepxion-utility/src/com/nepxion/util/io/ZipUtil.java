package com.nepxion.util.io;

/**
 * <p>Title: Nepxion Utility</p>
 * <p>Description: Nepxion Utility Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import com.nepxion.util.encoder.EncoderContext;

public class ZipUtil
{	
	/**
	 * Gets the zip file list by a file path.
	 * The charset is registered in EncoderContext.
	 * @param filePath the file path
	 * @param classLoader the boolean value whether the inputStream is generated by the classLoader or not
	 * @return the instance of List
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 * @see #EncoderContext.getIOCharset
	 */	
	public static List getZipFileList(String filePath, boolean classLoader)
		throws IOException, FileNotFoundException, UnsupportedEncodingException
	{
		return getZipFileList(filePath, EncoderContext.getIOCharset(), classLoader);
	}
	
	/**
	 * Gets the zip file list by a file path and charset.
	 * @param filePath the file path
	 * @param charset the charset value
	 * @param classLoader the boolean value whether the inputStream is generated by the classLoader or not
	 * @return the instance of List
	 * @throws OException
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public static List getZipFileList(String filePath, String charset, boolean classLoader)
		throws IOException, FileNotFoundException, UnsupportedEncodingException
	{
		BufferedReader bufferedReader = getZipReader(filePath, charset, classLoader);
		if (bufferedReader == null)
		{
			return null;
		}
		
		List list = new ArrayList();
		while (true)
		{
			String line = bufferedReader.readLine();
			if (line == null || line.length() == 0)
			{
				break;
			}
			list.add(line);
		}
		
		return list;
	}
	
	/**
	 * Gets the zip reader by a file path.
	 * The charset is registered in EncoderContext.
	 * @param filePath the file path
	 * @param classLoader the boolean value whether the inputStream is generated by the classLoader or not
	 * @return the instance of BufferedReader
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 * @see #EncoderContext.getIOCharset
	 */	
	public static BufferedReader getZipReader(String filePath, boolean classLoader)
		throws IOException, FileNotFoundException, UnsupportedEncodingException
	{
		return getZipReader(filePath, EncoderContext.getIOCharset(), classLoader);
	}
	
	/**
	 * Gets the zip reader by a file path.
	 * @param filePath the file path
	 * @param charset the charset value
	 * @param classLoader the boolean value whether the inputStream is generated by the classLoader or not
	 * @return the instance of BufferedReader
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */	
	public static BufferedReader getZipReader(String filePath, String charset, boolean classLoader)
		throws IOException, FileNotFoundException, UnsupportedEncodingException
	{
		InputStream inputStream = FileUtil.getInputStream(filePath, classLoader);			
		InputStream zipInputStream = new GZIPInputStream(inputStream);
			
		return new BufferedReader(new InputStreamReader(zipInputStream, charset));
	}
}