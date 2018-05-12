package com.durga.javaconfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.durga.controller","com.durga.shoppingbakent.dtoimpl"})
public class SpringDispatcherServlet extends WebMvcConfigurerAdapter
{
	@Bean
    public ViewResolver viewResolver()
    {
    	InternalResourceViewResolver view=new InternalResourceViewResolver();
    	view.setPrefix("/WEB-INF/views/");
    	view.setSuffix(".jsp");
    	return view;
    }
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/resources/**/").addResourceLocations("/assets/");
	}
}
