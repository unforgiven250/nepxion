package com.nepxion.demo.component.tree;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

import com.nepxion.demo.common.DemoDataFactory;
import com.nepxion.swing.border.ComplexEtchedBorder;
import com.nepxion.swing.border.ComplexSide;
import com.nepxion.swing.border.ComplexTitleBorder;
import com.nepxion.swing.element.ElementNode;
import com.nepxion.swing.renderer.tree.TreeElementCellRenderer;
import com.nepxion.swing.scrollpane.JBasicScrollPane;
import com.nepxion.swing.tree.JCheckBoxTree;

public class DemoCheckBoxTreePanel
	extends JPanel
{
	public DemoCheckBoxTreePanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		add(new CheckBoxTreePanel());
	}
	
	public class CheckBoxTreePanel
		extends JPanel
	{
		public CheckBoxTreePanel()
		{
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			setBorder(new ComplexTitleBorder(new ComplexEtchedBorder(ComplexEtchedBorder.LOWERED, ComplexSide.NORTH), "CheckBox Tree"));
			
			DefaultMutableTreeNode root = new DefaultMutableTreeNode(DemoDataFactory.getRootElementNode());
			for (Iterator iterator = DemoDataFactory.getComponentElementNodes().iterator(); iterator.hasNext();)
			{
				ElementNode elementNode = (ElementNode) iterator.next();
				DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(elementNode);
				root.add(treeNode);
				if (elementNode.getChildren() != null)
				{
					for (Iterator childIterator = elementNode.getChildren().iterator(); childIterator.hasNext();)
					{
						ElementNode childElementNode = (ElementNode) childIterator.next();
						DefaultMutableTreeNode childTreeNode = new DefaultMutableTreeNode(childElementNode);
						treeNode.add(childTreeNode);
					}
				}
			}
			
			JCheckBoxTree checkBoxTree = new JCheckBoxTree(root);
			checkBoxTree.setCellRenderer(new TreeElementCellRenderer(20));
			checkBoxTree.expandAll();
			
			JBasicScrollPane checkBoxTreeScrollPane = new JBasicScrollPane();
			checkBoxTreeScrollPane.getViewport().add(checkBoxTree);
			add(checkBoxTreeScrollPane);			
		}
	}
}