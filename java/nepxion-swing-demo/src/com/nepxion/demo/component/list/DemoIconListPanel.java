package com.nepxion.demo.component.list;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.nepxion.demo.common.DemoDataFactory;
import com.nepxion.swing.border.ComplexEtchedBorder;
import com.nepxion.swing.border.ComplexSide;
import com.nepxion.swing.border.ComplexTitleBorder;
import com.nepxion.swing.icon.IconFactory;
import com.nepxion.swing.renderer.list.ListIconCellRenderer;
import com.nepxion.util.data.CollectionUtil;

public class DemoIconListPanel
	extends JPanel
{
	public DemoIconListPanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		add(new SingleIconListPanel());
		add(new MultiIconListPanel());
	}
	
	public class SingleIconListPanel
		extends JPanel
	{
		public SingleIconListPanel()
		{
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			setBorder(new ComplexTitleBorder(new ComplexEtchedBorder(ComplexEtchedBorder.LOWERED, ComplexSide.NORTH), "Single Icon List"));
			
			String[] componentNameDatas = DemoDataFactory.getComponentNameDatas();
			
			JList singleIconList = new JList(componentNameDatas);
			singleIconList.setCellRenderer(new ListIconCellRenderer(BorderFactory.createEmptyBorder(0, 5, 0, 0), IconFactory.getSwingIcon("component/list_16.png")));
			
			JScrollPane singleIconListScrollPane = new JScrollPane();
			singleIconListScrollPane.getViewport().add(singleIconList);
			
			add(singleIconListScrollPane);
		}
	}
	
	public class MultiIconListPanel
		extends JPanel
	{
		public MultiIconListPanel()
		{
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			setBorder(new ComplexTitleBorder(new ComplexEtchedBorder(ComplexEtchedBorder.LOWERED, ComplexSide.NORTH), "Multi Icon List"));
			
			List componentInstallDatas = DemoDataFactory.getComponentInstallDatas();
			
			JList multiIconList = new JList(CollectionUtil.parseVector(componentInstallDatas));
			multiIconList.setCellRenderer(new ListIconCellRenderer(BorderFactory.createEmptyBorder(0, 5, 0, 0)));
			
			JScrollPane multiIconListScrollPane = new JScrollPane();
			multiIconListScrollPane.getViewport().add(multiIconList);
			
			add(multiIconListScrollPane);
		}
	}
}