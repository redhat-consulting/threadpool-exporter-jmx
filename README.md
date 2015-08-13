Replace the jbossweb.sar/META-INF/jboss-beans.xml with the attached, and place the JAR file in jbossweb.sar.  

Go into your JMX Consult (http://localhost:8080/jmx-console/).  You will see com.rhc in the left menu, and a JMX service called: "service=JmxThreadPoolMonitor"

That will expose the following operations:

           public int getActiveCount();
           public int getCorePoolSize();
           public int getMaximumPoolSize();
           public int getPoolSize();
           public long getTaskCount();
           public int getLargestPoolSize();

