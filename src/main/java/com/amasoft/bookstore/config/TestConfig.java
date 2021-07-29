package com.amasoft.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.amasoft.bookstore.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbSerservice;

    @Bean
    public void instanciaBaseDeDados() {
           this.dbSerservice.instanciaBaseDeDados();
    }
}