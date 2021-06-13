**SpringBootServletInitializer**  
Initializes Servlet 'dispatcherServlet' in spring boot app

**webapp folder**  
This folder should be present in spring mvc app, if external tomcat server is used for deploying the packaged war file. The tomcat has configurations to look for the webapp folder inside app before starting up. This folder can be empty.

**spring-boot-starter-tomcat**  
Exclude or make this dependency scope as provided, since we are using external tomcat

**View Resolver**  
Specify location of UI pages for spring mvc and view resolver to resolve the view request. Check application properties file.

**Smart Tomcat**  
Intellij Idea CE does not support Application servers, so install smart tomcat plugin and follow the instructions mentioned in the link to configure external tomcat.  
[Smart Tomcat configuration in Intellij Idea CE](https://plugins.jetbrains.com/plugin/9492-smart-tomcat)
