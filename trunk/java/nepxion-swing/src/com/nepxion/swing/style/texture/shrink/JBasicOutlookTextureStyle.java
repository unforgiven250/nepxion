package com.nepxion.swing.style.texture.shrink;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import com.nepxion.swing.icon.IconFactory;

public class JBasicOutlookTextureStyle
	extends AbstractOutlookTextureStyle
{
	public JBasicOutlookTextureStyle(String basicStylePath, String extensionStylePath)
	{
		backgroundImageIcon = IconFactory.getSwingIcon(extensionStylePath + "background.png");
		selectionBackgroundImageIcon = IconFactory.getSwingIcon(basicStylePath + "background.png");
		
		backgroundLeftImageIcon = null;
		selectionBackgroundLeftImageIcon = IconFactory.getSwingIcon(basicStylePath + "background_left.png");
		
		backgroundRightImageIcon = null;
		selectionBackgroundRightImageIcon = IconFactory.getSwingIcon(basicStylePath + "background_right.png");
		
		height = backgroundImageIcon.getIconHeight();
		
		handlerImageIcon = IconFactory.getSwingIcon(extensionStylePath + "handler.png");
		SelectionHandlerImageIcon = IconFactory.getSwingIcon(extensionStylePath + "handler_selection.png");
	}
}