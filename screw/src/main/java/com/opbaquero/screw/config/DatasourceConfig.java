package com.opbaquero.screw.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Bean
    @Primary
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/springdb?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true")
                .username("opbaquero")
                .password("5809GJF_honda")
                .build();
    }

    @Bean
    @Primary
    public NamedParameterJdbcTemplate mySqlParameterJdbcTemplate(final DataSource dataSource){
        return new NamedParameterJdbcTemplate(dataSource);
    }

}
