package com.durga.shoppingbakent.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ejb.access.LocalStatelessSessionProxyFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"com.durga.shoopingbackent.dao"})
@EnableTransactionManagement
public class HibernateConfig 
{
	private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshopping";
	private final static String DATABASE_DRIVER="org.h2.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME="sa";
	private final static String DATABASE_PASSWORD="";
   
	public LocalSessionFactoryBean getSessionFactory()
	{
	   LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
	   Properties p=new Properties();
	   p.put(Environment.URL,DATABASE_URL);
	   p.put(Environment.DRIVER, DATABASE_DRIVER);
	   p.put(Environment.DIALECT, DATABASE_DIALECT);
	   p.put(Environment.USER,DATABASE_USERNAME);
	   p.put(Environment.PASS, DATABASE_PASSWORD);
	   p.put(Environment.SHOW_SQL, true);
	   p.put(Environment.FORMAT_SQL, true);
	   sf.setHibernateProperties(p);
	   sf.setPackagesToScan("com.durga.shoppingbackent.dto");
	   
	   return sf;
	}
	
	@Bean
	public HibernateTransactionManager getTransectionManager(SessionFactory sf)
	{
		HibernateTransactionManager transection=new HibernateTransactionManager(sf);
	    return transection;
	}
	
	
}
