package com.nepxion.demo.control.menu;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import javax.swing.Icon;

import com.nepxion.demo.common.DemoTogglePanel;
import com.nepxion.swing.icon.IconFactory;
import com.nepxion.swing.tabbedpane.JEclipseTabbedPane;

public class DemoMenuTogglePanel
	extends DemoTogglePanel
{
	public DemoMenuTogglePanel()
	{
	}
	
	public void initialize()
	{
		JEclipseTabbedPane toggleTabbedPane = getToggleTabbedPane();
	}
	
	public String getToggleName()
	{
		return "Menu";
	}
	
	public Icon getToggleIcon()
	{
		return IconFactory.getSwingIcon("component/menu_32.png");
	}
	
	public Icon getToggleBannerIcon()
	{
		return IconFactory.getSwingIcon("component/menu_32.png");
	}
	
	public String getToggleDescription()
	{
		return "Multi-style Menu";
	}
}