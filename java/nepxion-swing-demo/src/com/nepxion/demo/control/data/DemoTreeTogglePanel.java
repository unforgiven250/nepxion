package com.nepxion.demo.control.data;

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
import com.nepxion.demo.component.tree.DemoCheckBoxTreePanel;
import com.nepxion.demo.component.tree.DemoElementTreePanel;
import com.nepxion.swing.icon.IconFactory;
import com.nepxion.swing.tabbedpane.JEclipseTabbedPane;

public class DemoTreeTogglePanel
	extends DemoTogglePanel
{
	public DemoTreeTogglePanel()
	{
		JEclipseTabbedPane toggleTabbedPane = getToggleTabbedPane();
		toggleTabbedPane.addTab("Element Tree", IconFactory.getSwingIcon("component/tree_16.png"), new DemoToggleTemplate(new DemoElementTreePanel()));				
		toggleTabbedPane.addTab("CheckBox Tree", IconFactory.getSwingIcon("component/tree_16.png"), new DemoToggleTemplate(new DemoCheckBoxTreePanel()));
	}
	
	public String getToggleName()
	{
		return "Tree";
	}
	
	public Icon getToggleIcon()
	{
		return IconFactory.getSwingIcon("component/tree_32.png");
	}
	
	public Icon getToggleBannerIcon()
	{
		return IconFactory.getSwingIcon("component/tree_32.png");
	}
	
	public String getToggleDescription()
	{
		return "Multi-style Tree";
	}
}