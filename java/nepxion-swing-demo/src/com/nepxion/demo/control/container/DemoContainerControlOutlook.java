package com.nepxion.demo.control.container;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.awt.Dimension;

import com.nepxion.demo.common.DemoToggleActionButton;
import com.nepxion.demo.common.DemoToggleOutlook;
import com.nepxion.swing.button.ButtonManager;

public class DemoContainerControlOutlook
	extends DemoToggleOutlook
{
	public DemoContainerControlOutlook()
	{
		DemoToggleActionButton panelButton = new DemoToggleActionButton(new DemoPanelTogglePanel());
        addButton(panelButton);
        
		DemoToggleActionButton scrollPaneButton = new DemoToggleActionButton(new DemoScrollPaneTogglePanel());
        addButton(scrollPaneButton);
        
		DemoToggleActionButton tabbedPaneButton = new DemoToggleActionButton(new DemoTabbedPaneTogglePanel());
        addButton(tabbedPaneButton);
        
        ButtonManager.updateUI(this, new Dimension(50, 70), VERTICAL);
	}
}
