package com.nepxion.util.database.pool.proxool;

/**
 * <p>Title: Nepxion Utility</p>
 * <p>Description: Nepxion Utility Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.net.URL;
import java.util.Properties;

import org.logicalcobwebs.proxool.ProxoolException;
import org.logicalcobwebs.proxool.configuration.PropertyConfigurator;

import com.nepxion.util.log.Logger;

public class ProxoolContext
	implements ProxoolConstants
{
	public static void register()
		throws ProxoolException
	{
		register(CONFIG_FILE_PATH);
	}
	
	public static void register(String filePath)
		throws ProxoolException
	{
		Logger.info(ProxoolContext.class, "---- Proxool Context Initialization Start ---");
		
		try
		{
			PropertyConfigurator.configure(filePath);
		}
		catch (ProxoolException e)
		{
			Logger.fatal(ProxoolContext.class, e);
			throw e;
		}
		
		Logger.info(ProxoolContext.class, "----- Proxool Context Initialization End ----");
	}
	
	public static void register(Properties properties)
		throws ProxoolException
	{
		Logger.info(ProxoolContext.class, "---- Proxool Context Initialization Start ---");
		
		try
		{
			PropertyConfigurator.configure(properties);
		}
		catch (ProxoolException e)
		{
			Logger.fatal(ProxoolContext.class, e);
			throw e;
		}
		
		Logger.info(ProxoolContext.class, "---- Proxool Context Initialization Start ---");
	}
	
	public static void register(URL codeBase)
		throws Exception
	{
		Properties properties = new Properties();
		try
		{
			URL url = new URL(codeBase + CONFIG_FILE_PATH);
			properties.load(url.openStream());
			
			register(properties);
		}
		catch (Exception e)
		{
			Logger.fatal(ProxoolContext.class, e);
			throw e;
		}
	}
}