package com.nepxion.swing.tree.toggle;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import javax.swing.tree.TreeNode;

import com.nepxion.swing.toggle.JToggleContentPanel;
import com.nepxion.swing.tree.TreeNavigator;
import com.nepxion.swing.tree.lazyloader.JLazyLoaderTree;

public class JToggleLazyLoaderTree
	extends JLazyLoaderTree	implements IToggleTree
{
	private int invokeMode = 0;
	private TreeNavigator treeNavigator;
	
	private JToggleContentPanel toggleContentPanel;
	
	private IToggleAdapter toggleAdapter;
	
	public JToggleLazyLoaderTree()
	{
		super();
		
		initComponents();
	}
	
	private void initComponents()
	{
		treeNavigator = new TreeNavigator(this);
	}
	
	public int getInvokeMode()
	{
		return invokeMode;
	}
	
	public void setInvokeMode(int invokeMode)
	{
		this.invokeMode = invokeMode;
	}
	
	public TreeNavigator getTreeNavigator()
	{
		return treeNavigator;
	}
	
	public void setTreeNavigator(TreeNavigator treeNavigator)
	{
		this.treeNavigator = treeNavigator;
	}
	
	public JToggleContentPanel getToggleContentPanel()
	{
		return toggleContentPanel;
	}
	
	public void setToggleContentPanel(JToggleContentPanel toggleContentPanel)
	{
		this.toggleContentPanel = toggleContentPanel;
	}
	
	public IToggleAdapter getToggleAdapter()
	{
		return toggleAdapter;
	}
	
	public void setToggleAdapter(IToggleAdapter toggleAdapter)
	{
		this.toggleAdapter = toggleAdapter;
	}
	
	public void executeSelection(TreeNode treeNode)
	{
		if (toggleAdapter != null && invokeMode == INVOKE_MODE_SELECTED)
		{
			toggleAdapter.invoke(treeNode);
		}
	}
	
	public void executeClicked(TreeNode treeNode)
	{
		if (toggleAdapter != null && invokeMode == INVOKE_MODE_CLICKED)
		{
			toggleAdapter.invoke(treeNode);
		}
	}
	
	public void executeDoubleClicked(TreeNode treeNode)
	{
		if (toggleAdapter != null && invokeMode == INVOKE_MODE_DOUBLE_CLICKED)
		{
			toggleAdapter.invoke(treeNode);
		}
	}
}