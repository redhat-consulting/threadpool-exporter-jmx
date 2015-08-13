package com.rhc.jboss5.threadpooling;

import org.jboss.system.ServiceMBean;

public interface JmxThreadPoolMonitorServiceMBean extends ServiceMBean {
	   String getThreadPoolValues();
	   public void printThreadPoolValues();
	   
	   public int getActiveCount();
	   public int getCorePoolSize();
	   public int getMaximumPoolSize();
	   public int getPoolSize();
	   public long getTaskCount();
	   public int getLargestPoolSize();
}
