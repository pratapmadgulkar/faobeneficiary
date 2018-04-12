package org.fao.bdtms.config;

import static org.hibernate.cfg.AvailableSettings.C3P0_ACQUIRE_INCREMENT;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_STATEMENTS;
import static org.hibernate.cfg.AvailableSettings.C3P0_MIN_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_TIMEOUT;
import static org.hibernate.cfg.AvailableSettings.DRIVER;
import static org.hibernate.cfg.AvailableSettings.HBM2DDL_AUTO;
import static org.hibernate.cfg.AvailableSettings.PASS;
import static org.hibernate.cfg.AvailableSettings.SHOW_SQL;
import static org.hibernate.cfg.AvailableSettings.URL;
import static org.hibernate.cfg.AvailableSettings.USER;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("org.fao.bdtms")})
public class AppConfig {

	 @Autowired
	 private Environment env;

	   @Bean
	   public LocalSessionFactoryBean getSessionFactory() {
	      LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
	      

	      Properties props = new Properties();
	      // Setting JDBC properties
	      props.put(DRIVER, env.getProperty("mysql.driver"));
	      props.put(URL, env.getProperty("mysql.url"));
	      props.put(USER, env.getProperty("mysql.user"));
	      props.put(PASS, env.getProperty("mysql.password"));

	      // Setting Hibernate properties
	      props.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
	      props.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));

	      // Setting C3P0 properties
	      props.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
	      props.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
	      props.put(C3P0_ACQUIRE_INCREMENT, 
	            env.getProperty("hibernate.c3p0.acquire_increment"));
	      props.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
	      props.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));

	      factoryBean.setHibernateProperties(props);
	      factoryBean.setPackagesToScan("org.fao.bdtms");

	      return factoryBean;
	   }	

	   @Bean
	   public HibernateTransactionManager getTransactionManager() {
	      HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	      transactionManager.setSessionFactory(getSessionFactory().getObject());
	      return transactionManager;
	   }
	   /**
		 * Api info.
		 *
		 * @return the api info
		 */
		private ApiInfo apiInfo() {
			return new ApiInfoBuilder()
					.version("2.0")
					.title("Fao API")
					.description(
							"This is the specifications api for FAO")
					.contact("FAO Projects").build();
		}
	
	   
	   @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.any())                          
	          .build();                                           
	    }
	
}
