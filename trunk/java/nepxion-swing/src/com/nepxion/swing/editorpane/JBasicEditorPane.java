package com.nepxion.swing.editorpane;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.io.IOException;
import java.net.URL;

import javax.swing.JEditorPane;

import com.nepxion.swing.textcomponent.PopupMenuAdapter;

public class JBasicEditorPane
	extends JEditorPane
{
	/**
	 * The instance of PopupMenuAdapter.
	 */
	private PopupMenuAdapter popupMenuAdapter;
	
	/**
	 * Constructs with the default.
	 */
	public JBasicEditorPane()
	{
		super();
		
		popupMenuAdapter = new PopupMenuAdapter(this);
	}
	
	/**
	 * Constructs with the specified initial initialPage.
	 * @param initialPage the instance of URL
	 * @throws IOException
	 */
	public JBasicEditorPane(URL initialPage)
		throws IOException
	{
		super(initialPage);
		
		popupMenuAdapter = new PopupMenuAdapter(this);
	}
	
	/**
	 * Constructs with the specified initial url.
	 * @param url the ur string
	 * @throws IOException
	 */
	public JBasicEditorPane(String url)
		throws IOException
	{
		super(url);
		
		popupMenuAdapter = new PopupMenuAdapter(this);
	}
	
	/**
	 * Constructs with the specified initial type and text.
	 * @param type the type string
	 * @param text the text string
	 */
	public JBasicEditorPane(String type, String text)
	{
		super(type, text);
		
		popupMenuAdapter = new PopupMenuAdapter(this);
	}
	
	/**
	 * Gets the popup menu adapter.
	 * @return the instance of PopupMenuAdapter
	 */
	public PopupMenuAdapter getPopupMenuAdapter()
	{
		return popupMenuAdapter;
	}
	
	/**
	 * Sets enabled.
	 * @param enabled the boolean value of enabled
	 */
	public void setEnabled(boolean enabled)
	{
		super.setEnabled(enabled);
		
		if (enabled)
		{
			addMouseListener(popupMenuAdapter);
		}
		else
		{
			removeMouseListener(popupMenuAdapter);
		}
	}
}