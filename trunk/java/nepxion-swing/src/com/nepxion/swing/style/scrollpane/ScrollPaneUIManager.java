package com.nepxion.swing.style.scrollpane;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import javax.swing.UIManager;
import javax.swing.plaf.ScrollBarUI;

public class ScrollPaneUIManager
{
	public static ScrollBarUI getScrollBarUI()
	{
		String scrollBarUIClass = (String) UIManager.get("ScrollBarUI");
		ScrollBarUI outlookScrollBarUI = null;
		try
		{
			Object scrollBarUIInstance = Class.forName(scrollBarUIClass).newInstance();
			if (scrollBarUIInstance instanceof ScrollBarUI)
			{
				outlookScrollBarUI = (ScrollBarUI) scrollBarUIInstance;
			}
		}
		catch (ClassNotFoundException e)
		{
		}
		catch (IllegalAccessException e)
		{
		}
		catch (InstantiationException e)
		{
		}
		return outlookScrollBarUI;
	}
}