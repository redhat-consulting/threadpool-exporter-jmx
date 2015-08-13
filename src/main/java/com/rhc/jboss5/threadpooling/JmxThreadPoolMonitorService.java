package com.rhc.jboss5.threadpooling;

import java.util.concurrent.ThreadPoolExecutor;

import org.jboss.system.ServiceMBeanSupport;

public class JmxThreadPoolMonitorService extends ServiceMBeanSupport implements JmxThreadPoolMonitorServiceMBean {

	public JmxThreadPoolMonitorService() {
		
	}
	
	private ThreadPoolExecutor executor;
	
	public ThreadPoolExecutor getExecutor() {
		return executor;
	}
	
	public void setExecutor(ThreadPoolExecutor executor) {
		this.executor = executor;
	}
	
	@Override
	public String getThreadPoolValues() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n");
		builder.append("ActiveCount:["+executor.getActiveCount()+"], \n");
		builder.append("CorePoolSize:["+executor.getCorePoolSize()+"], \n");
		builder.append("MaximumPoolSize:["+executor.getMaximumPoolSize()+"], \n");
		builder.append("PoolSize:["+executor.getPoolSize()+"], \n");
		builder.append("TaskCount:["+executor.getTaskCount()+"], \n");
		builder.append("LargestPoolSize:["+executor.getLargestPoolSize()+"], \n");
		builder.append("\n");
		
		return builder.toString();
	}
	
	
	
	public void printThreadPoolValues() {
		System.out.println(getThreadPoolValues());
	}

	@Override
	public void start() throws Exception {
		System.out.println("Starting "+this.getClass());
	}

	@Override
	public int getActiveCount() {
		return executor.getActiveCount();
	}

	@Override
	public int getCorePoolSize() {
		return executor.getCorePoolSize();
	}

	@Override
	public int getMaximumPoolSize() {
		return executor.getMaximumPoolSize();
	}

	@Override
	public int getPoolSize() {
		return executor.getPoolSize();
	}

	@Override
	public long getTaskCount() {
		return executor.getTaskCount();
	}

	@Override
	public int getLargestPoolSize() {
		return executor.getLargestPoolSize();
	}
}
