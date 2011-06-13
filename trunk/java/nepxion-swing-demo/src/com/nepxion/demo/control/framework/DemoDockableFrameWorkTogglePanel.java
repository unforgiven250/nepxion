package com.nepxion.demo.control.framework;

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
import com.nepxion.demo.component.dockable.DemoDockableFrameWorkPanel;
import com.nepxion.swing.icon.IconFactory;
import com.nepxion.swing.tabbedpane.JEclipseTabbedPane;

public class DemoDockableFrameWorkTogglePanel
	extends DemoTogglePanel
{
	public DemoDockableFrameWorkTogglePanel()
	{
	}
	
	public void initialize()
	{
		JEclipseTabbedPane toggleTabbedPane = getToggleTabbedPane();
		toggleTabbedPane.addTab("Dockable FrameWork", IconFactory.getSwingIcon("component/framework_16.png"), new DemoToggleTemplate(new DemoDockableFrameWorkPanel()), "Dockable FrameWork");						
	}
	
	public String getToggleText()
	{
		return "Dockable";
	}
	
	public Icon getToggleIcon()
	{
		return IconFactory.getSwingIcon("component/framework_32.png");
	}
	
	public Icon getToggleBannerIcon()
	{
		return IconFactory.getSwingIcon("component/framework_32.png");
	}
	
	public String getToggleDescription()
	{
		return "Dockable FrameWork";
	}
}