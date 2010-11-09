package com.nepxion.swing.style.button.flat;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.awt.Color;

import com.nepxion.swing.style.button.IButtonStyle;

public interface IFlatButtonStyle
	extends IButtonStyle
{
	public Color getBrightColor();
	
	public Color getDarkColor();
}