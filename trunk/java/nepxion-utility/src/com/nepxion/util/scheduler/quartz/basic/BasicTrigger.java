package com.nepxion.util.scheduler.quartz.basic;

/**
 * <p>Title: Nepxion Utility</p>
 * <p>Description: Nepxion Utility Repository</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email hj_ren@msn.com
 * @version 1.0
 */

import java.util.Date;

import org.quartz.SimpleTrigger;

import com.nepxion.util.time.TimeUtil;

public class BasicTrigger
	extends SimpleTrigger
{
	public BasicTrigger()
	{
		super();
	}
	
	public BasicTrigger(String name)
	{
		super(name);
	}
	
	public BasicTrigger(String name, String group)
	{
		super(name, group);
	}
	
	public BasicTrigger(String name, long repeatInterval)
	{
		super(name, REPEAT_INDEFINITELY, repeatInterval);
	}
	
	public BasicTrigger(String name, int repeatCount, long repeatInterval)
	{
		super(name, repeatCount, repeatInterval);
	}
	
	public BasicTrigger(String name, int[] repeatInterval)
	{
		super(name, REPEAT_INDEFINITELY, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, int repeatCount, int[] repeatInterval)
	{
		super(name, repeatCount, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, String group, long repeatInterval)
	{
		super(name, group, REPEAT_INDEFINITELY, repeatInterval);
	}
	
	public BasicTrigger(String name, String group, int repeatCount, long repeatInterval)
	{
		super(name, group, repeatCount, repeatInterval);
	}
	
	public BasicTrigger(String name, String group, int[] repeatInterval)
	{
		super(name, group, REPEAT_INDEFINITELY, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, String group, int repeatCount, int[] repeatInterval)
	{
		super(name, group, repeatCount, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, Date startTime)
	{
		super(name, startTime);
	}
	
	public BasicTrigger(String name, String group, Date startTime)
	{
		super(name, group, startTime);
	}
	
	public BasicTrigger(String name, Date startTime, Date endTime, long repeatInterval)
	{
		super(name, startTime, endTime, REPEAT_INDEFINITELY, repeatInterval);
	}
	
	public BasicTrigger(String name, Date startTime, Date endTime, int repeatCount, long repeatInterval)
	{
		super(name, startTime, endTime, repeatCount, repeatInterval);
	}
	
	public BasicTrigger(String name, Date startTime, Date endTime, int[] repeatInterval)
	{
		super(name, startTime, endTime, REPEAT_INDEFINITELY, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, Date startTime, Date endTime, int repeatCount, int[] repeatInterval)
	{
		super(name, startTime, endTime, repeatCount, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, String group, Date startTime, Date endTime, long repeatInterval)
	{
		super(name, group, startTime, endTime, REPEAT_INDEFINITELY, repeatInterval);
	}
	
	public BasicTrigger(String name, String group, Date startTime, Date endTime, int repeatCount, long repeatInterval)
	{
		super(name, group, startTime, endTime, repeatCount, repeatInterval);
	}
	
	public BasicTrigger(String name, String group, Date startTime, Date endTime, int[] repeatInterval)
	{
		super(name, group, startTime, endTime, REPEAT_INDEFINITELY, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, String group, Date startTime, Date endTime, int repeatCount, int[] repeatInterval)
	{
		super(name, group, startTime, endTime, repeatCount, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, String group, String jobName, String jobGroup, Date startTime, Date endTime, long repeatInterval)
	{
		super(name, group, jobName, jobGroup, startTime, endTime, REPEAT_INDEFINITELY, repeatInterval);
	}
	
	public BasicTrigger(String name, String group, String jobName, String jobGroup, Date startTime, Date endTime, int repeatCount, long repeatInterval)
	{
		super(name, group, jobName, jobGroup, startTime, endTime, repeatCount, repeatInterval);
	}
	
	public BasicTrigger(String name, String group, String jobName, String jobGroup, Date startTime, Date endTime, int[] repeatInterval)
	{
		super(name, group, jobName, jobGroup, startTime, endTime, REPEAT_INDEFINITELY, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public BasicTrigger(String name, String group, String jobName, String jobGroup, Date startTime, Date endTime, int repeatCount, int[] repeatInterval)
	{
		super(name, group, jobName, jobGroup, startTime, endTime, repeatCount, TimeUtil.getMillisecond(repeatInterval));
	}
	
	public void setRepeatInterval(int[] repeatInterval)
	{
		setRepeatInterval(TimeUtil.getMillisecond(repeatInterval));
	}
}