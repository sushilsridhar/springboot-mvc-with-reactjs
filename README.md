**SpringBootServletInitializer**  
Initializes Servlet 'dispatcherServlet' in spring boot app.

**webapp folder**  
This folder should be present in spring mvc app, if external tomcat server is used for deploying the packaged war file. The tomcat has configurations to look for the webapp folder inside app before starting up. This folder can be empty.

**web-inf folder**  
Any webpage inside this web-inf folder can be served only by request via controller of the application, it will be not directly served by tomcat server, restricting direct access to webpage from browser.

**spring-boot-starter-tomcat**  
Exclude or make this dependency scope as provided, since we are using external tomcat.

**View Resolver**  
Specify location of UI pages for spring mvc and view resolver to resolve the view request. Check application properties file.

**Override default view resolver**  
Override ViewResolver bean with InternalResourceViewResolver bean, setting the prefix and suffix for resolving views.

**Serve Static pages**  
Override addResourceHandlers method of WebMvcConfigurer.

**Add Interceptor**  
Override addInterceptors of WebMvcConfigurer. Set default locale, set param, based on which interception will happen.

**I18N - internationalization**  
Add different languages support using locale and property file.

**Post-Redirect-Get**  
after post, redirect to get request to reload the page.

**Thymeleaf**  
Setup TemplateResolver(resolves the location of template)  
TemplateEngine(loads the model to template)  
and ViewResolver(delegates work to template resolver, set priority in view resolver for thymeleaf, if config has multiple resolvers)

**Smart Tomcat**  
Intellij Idea CE does not support Application servers, so install smart tomcat plugin and follow the instructions mentioned in the link to configure external tomcat.  
[Smart Tomcat configuration in Intellij Idea CE](https://plugins.jetbrains.com/plugin/9492-smart-tomcat)
