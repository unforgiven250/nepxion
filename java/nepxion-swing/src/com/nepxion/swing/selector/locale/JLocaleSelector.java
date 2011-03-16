package com.nepxion.swing.selector.locale;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import javax.swing.JComponent;

import com.nepxion.swing.combobox.ComboBoxManager;
import com.toedter.components.JLocaleChooser;

public class JLocaleSelector
	extends JLocaleChooser
{
	public JLocaleSelector()
	{
		super();
		
		initComponents();
	}
	
	public JLocaleSelector(JComponent component) 
	{
		super(component);
		
		initComponents();
	}
	
	private void initComponents()
	{
		ComboBoxManager.setPreferenceStyle(this);
	}
}