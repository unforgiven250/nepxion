package com.nepxion.demo.control.selector;

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
import com.nepxion.demo.common.DemoToggleTemplate;
import com.nepxion.demo.component.selector.DemoCalendarSelectorPanel;
import com.nepxion.swing.icon.IconFactory;
import com.nepxion.swing.tabbedpane.JEclipseTabbedPane;

public class DemoCalendarSelectorTogglePanel
	extends DemoTogglePanel
{
	public DemoCalendarSelectorTogglePanel()
	{
	}
	
	public void initialize()
	{
		JEclipseTabbedPane toggleTabbedPane = getToggleTabbedPane();
		toggleTabbedPane.addTab("Calendar", IconFactory.getSwingIcon("component/calendar_16.png"), new DemoToggleTemplate(new DemoCalendarSelectorPanel()), "Calendar");		
	}
	
	public String getToggleName()
	{
		return "Calendar";
	}
	
	public Icon getToggleIcon()
	{
		return IconFactory.getSwingIcon("component/calendar_32.png");
	}
	
	public Icon getToggleBannerIcon()
	{
		return IconFactory.getSwingIcon("component/calendar_32.png");
	}
	
	public String getToggleDescription()
	{
		return "Multi-style Calendar Selector";
	}
}