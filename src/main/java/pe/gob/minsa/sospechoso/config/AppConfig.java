package pe.gob.minsa.sospechoso.config;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"pe.gob.minsa.sospechoso.*"})
@EnableTransactionManagement
//@PropertySource(value= {"file:/opt/data/mcs-minsa/properties/mcs-registro-sospechoso.properties"})
@PropertySource(value= {"classpath:mcs-registro-sospechoso.properties"})
public class AppConfig {
	
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
    	return new DriverManagerDataSource();
    }
    
}
