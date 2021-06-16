package com.springbootmvcwithreactjs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourceResolverConfig implements WebMvcConfigurer {

    /* Resolves static pages, any request to /files will be handled by this handler */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**")
                .addResourceLocations("/WEB-INF/pdf/");
    }
}
