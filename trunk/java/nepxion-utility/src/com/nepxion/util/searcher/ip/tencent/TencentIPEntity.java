package com.nepxion.util.searcher.ip.tencent;

/**
 * <p>Title: Nepxion Utility</p>
 * <p>Description: Nepxion Utility Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.io.Serializable;

public class TencentIPEntity
	implements Serializable
{
	private static final long serialVersionUID = -4814051030961608318L;
	
	private String ip;
	private String country;
	private String province;
	private String city;
	
	public TencentIPEntity()
	{
		
	}
	
	public String getIP()
	{
		return ip;
	}
	
	public void setIP(String ip)
	{
		this.ip = ip;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public String getProvince()
	{
		return province;
	}
	
	public void setProvince(String province)
	{
		this.province = province;
	}	
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}	
	
	public String getLocation()
	{
		return getCountry() + getProvince() + getCity();
	}
}