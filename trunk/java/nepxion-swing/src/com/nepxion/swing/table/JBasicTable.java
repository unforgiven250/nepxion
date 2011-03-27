package com.nepxion.swing.table;

/**
 * <p>Title: Nepxion Swing</p>
 * <p>Description: Nepxion Swing Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import com.nepxion.swing.table.layoutable.TableCellRendererConstants;
import com.nepxion.swing.table.layoutable.TableCellRendererLayout;

public class JBasicTable
	extends JTable implements ITable, TableCellRendererConstants, MouseListener
{
	private int[] gaps = LOW_DEFAULT_TABLE_GAPS;
	
	private int selectedRow = -1;
	
	public JBasicTable()
	{
		super();
		
		initComponents();
	}
	
	public JBasicTable(TableModel dm)
	{
		super(dm);
		
		initComponents();
	}
	
	public JBasicTable(TableModel dm, TableColumnModel cm)
	{
		super(dm, cm);
		
		initComponents();
	}
	
	public JBasicTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm)
	{
		super(dm, cm, sm);
		
		initComponents();
	}
	
	public JBasicTable(int numRows, int numColumns)
	{
		super(numRows, numColumns);
		
		initComponents();
	}
	
	public JBasicTable(Vector rowData, Vector columnNames)
	{
		super(rowData, columnNames);
		
		initComponents();
	}
	
	public JBasicTable(Object[][] rowData, Object[] columnNames)
	{
		super(rowData, columnNames);
		
		initComponents();
	}
	
	private void initComponents()
	{
		TableManager.setPreferenceStyle(this);
		
		addMouseListener(this);
		getSelectionModel().addListSelectionListener(this);
	}
	
	public void setModel(final TableModel tableModel)
	{
		super.setModel(tableModel);
		
		tableModel.addTableModelListener(new TableModelListener()
		{
			public void tableChanged(TableModelEvent e)
			{
				if (getAutoResizeMode() == AUTO_RESIZE_OFF)
				{
					SwingUtilities.invokeLater(new Runnable()
					{
						public void run()
						{
							adaptLayout(COLUMN_LAYOUT_MODE);
						}
					}
					);					
				}
			}
		}
		);
	}
	
	public void setAutoResizeMode(int mode)
	{
		super.setAutoResizeMode(mode);
		
		if (mode == AUTO_RESIZE_OFF)
		{
			adaptLayout(COLUMN_LAYOUT_MODE); // ROW_COLUMN_LAYOUT_MODE
		}
	}
	
	public int getSelectionMode()
	{
		return TableManager.getSelectionMode(this);
	}
	
	public void setSelectionMode(int mode)
	{
		TableManager.setSelectionMode(this, mode);
	}
	
	public TableColumn getColumn(int column)
	{
		return getColumnModel().getColumn(column);
	}
	
	public int getRowIndexToModel(int rowIndex)
	{
		return rowIndex;
	}
	
	public int[] getRowIndexesToModel(int[] rowIndexes)
	{
		return rowIndexes;
	}
	
	public int[] getGaps()
	{
		return gaps;
	}
	
	public void setGaps(int[] gaps)
	{
		this.gaps = gaps;
	}
	
	public void adaptLayout(String layoutMode)
	{
		TableCellRendererLayout layout = new TableCellRendererLayout(this);
		layout.doLayout(gaps, layoutMode);
	}
	
	public void valueChanged(ListSelectionEvent e)
	{
		super.valueChanged(e);
		
		boolean isAdjusting = e.getValueIsAdjusting();
		if (isAdjusting)
		{
			if (getSelectedRow() == selectedRow)
			{
				return;
			}
			
			selectedRow = getSelectedRow();
			
			executeSelection(selectedRow);
		}
	}
	
	public void executeSelection(int selectedRow)
	{
		
	}
	
	public void mouseClicked(MouseEvent e)
	{
		int selectedRow = getSelectedRow();
		executeClicked(selectedRow, e);
	}
	
	public void executeClicked(int selectedRow, MouseEvent e)
	{
		if (e.getClickCount() > 1)
		{
			executeDoubleClicked(selectedRow);
		}
		else
		{
			executeClicked(selectedRow);
		}
	}
	
	public void executeClicked(int selectedRow)
	{
		
	}
	
	public void executeDoubleClicked(int selectedRow)
	{
		
	}
	
	public void mouseEntered(MouseEvent e)
	{
		
	}
	
	public void mouseExited(MouseEvent e)
	{
		
	}
	
	public void mousePressed(MouseEvent e)
	{
		
	}
	
	public void mouseReleased(MouseEvent e)
	{
		if (!e.isPopupTrigger())
		{
			return;
		}
		
		int x = e.getX();
		int y = e.getY();
		
		int selectedRow = getSelectedRow();
		if (selectedRow > -1)
		{
			executePopupMenu(selectedRow, x, y);
		}
		else
		{
			executePopupMenu(x, y);
		}
	}
	
	public void executePopupMenu(int selectedRow, int x, int y)
	{
		
	}
	
	public void executePopupMenu(int x, int y)
	{
		
	}
}