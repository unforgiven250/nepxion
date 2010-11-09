package com.nepxion.swing.searcher.gis.google.geo;

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

import com.nepxion.swing.locale.SwingLocale;
import com.nepxion.swing.table.BasicTableModel;
import com.nepxion.util.searcher.gis.google.geo.GeoEntity;

public class GeoTableModel
	extends BasicTableModel
{
	public static final String[] COLUMN_NAMES = {SwingLocale.getString("address"), SwingLocale.getString("center_latitude"), SwingLocale.getString("center_longitude"), SwingLocale.getString("north_latitude"), SwingLocale.getString("south_latitude"), SwingLocale.getString("west_longitude"), SwingLocale.getString("east_longitude")};
	
	public GeoTableModel(List rowDatas)
	{
		super(rowDatas, COLUMN_NAMES);
	}
	
	public boolean isCellEditable(int row, int column)
	{
		return true;
	}
	
	public Object getValueAt(int row, int column)
	{
		GeoEntity entity = (GeoEntity) rowDatas.get(row);
		
		switch (column)
		{
			case 0:
				return entity.getAddress();
			case 1:
				return entity.getCenterLatitude() + "";
			case 2:
				return entity.getCenterLongitude() + "";
			case 3:
				return entity.getNorthLatitude() + "";
			case 4:
				return entity.getSouthLatitude() + "";
			case 5:
				return entity.getWestLongitude() + "";
			case 6:
				return entity.getEastLongitude() + "";
		}
		return null;
	}
	
	public void setValueAt(Object value, int row, int column)
	{
		GeoEntity entity = (GeoEntity) rowDatas.get(row);
		
		switch (column)
		{
			case 0:
				entity.setAddress(value.toString());
				break;
			case 1:
				entity.setCenterLatitude(Double.parseDouble(value.toString()));
				break;
			case 2:
				entity.setCenterLongitude(Double.parseDouble(value.toString()));
				break;
			case 3:
				entity.setNorthLatitude(Double.parseDouble(value.toString()));
				break;
			case 4:
				entity.setSouthLatitude(Double.parseDouble(value.toString()));
				break;
			case 5:
				entity.setWestLongitude(Double.parseDouble(value.toString()));
				break;
			case 6:
				entity.setEastLongitude(Double.parseDouble(value.toString()));
				break;
		}
		fireTableDataChanged();
	}
}