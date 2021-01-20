package com.coll.OnlineCollaborate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"com.coll.OnlineCollaborate"})
@EnableTransactionManagement
public class HibernateConfig {
	
	public static final String DATABASE_URL="jdbc:mysql://localhost:3306/collaboration";
	public static final String DATABASE_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
	public static final String DATABASE_USERNAME="root";
	public static final String DATABASE_PASSWORD="nmj@1234567";
	
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory() {
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(getDataSource());
		builder.addProperties(getHibernateProperties());
		buider.scanPackages("com.coll.OnlineCollaborate");
		return builder.buildSessionFactory()
	}
}
