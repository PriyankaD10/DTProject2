package com.niit.niittechtreebackend.config;

import java.util.Properties;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.niittechtreebackend.dao.BlogDAO;
import com.niit.niittechtreebackend.dao.BlogDAOImpl;
import com.niit.niittechtreebackend.model.Blog;

@Configuration
@ComponentScan("com.niit.niittechtree")
@EnableTransactionManagement
public class ApplicationContextConfig {

	@Bean(name="dataSource")
	public DataSource getDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:mem:tmp.db;INIT=CREATE SCHEMA IF NOT EXISTS NIITDB");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}

	public Properties hibernateProperties() {

		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto", "create");
		properties.put("hibernate.connection.provider_class", "org.hibernate.c3p0.internal.C3P0ConnectionProvider");
		return properties;
	}

	@Bean(name="sessionFactory")
	@Autowired
	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.setProperties(hibernateProperties());
		builder.addAnnotatedClasses(Blog.class);
		return builder.buildSessionFactory();
	}

	@Bean(name="hibernateTransactionManager")
	@Autowired
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {

		HibernateTransactionManager transactionManager =new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
	
		
		return transactionManager;
	}

	@Bean(name="blogDAO")
	@Autowired
	public BlogDAO getBlogDAOImpl(SessionFactory sessionFactory){
		
		return new BlogDAOImpl(sessionFactory);
	}
	


}
