package tn.insat.configuration;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("tn.insat.dataaccess")
@PropertySource(value = "classpath:database.properties")
public class AppConfiguration {

	@Bean(destroyMethod = "close")
	public DataSource dataSource(Environment env) {
		
		
		HikariConfig dataSourceConfig = new HikariConfig();
		dataSourceConfig.setDriverClassName(env
				.getRequiredProperty("jdbc.driverClass"));
		dataSourceConfig.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		dataSourceConfig.setUsername(env.getRequiredProperty("jdbc.username"));
		dataSourceConfig.setPassword(env.getRequiredProperty("jdbc.password"));

		dataSourceConfig.setMinimumIdle(10);
		dataSourceConfig.setMaximumPoolSize(20);
		return new HikariDataSource(dataSourceConfig);
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			DataSource dataSource, Environment env) {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

		entityManagerFactoryBean.setDataSource(dataSource);

		entityManagerFactoryBean.setPackagesToScan("tn.insat.domain");

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setGenerateDdl(true);
		vendorAdapter.setShowSql(true);
		vendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		vendorAdapter.setDatabase(Database.MYSQL);

		entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);

		return entityManagerFactoryBean;
	}

	@Bean
	public JpaTransactionManager transactionManager(
			EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
}