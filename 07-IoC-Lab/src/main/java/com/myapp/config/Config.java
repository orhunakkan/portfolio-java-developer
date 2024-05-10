package com.myapp.config;

import com.myapp.Currency;
import com.myapp.account.Current;
import com.myapp.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class Config {

    @Bean
    public Current current() {
        return new Current(currency(), bigDecimal(), uuid());
    }

    @Bean
    public Saving saving() {
        return new Saving(currency(), bigDecimal(), uuid());
    }

    @Bean
    public Currency currency() {
        return new Currency("USD", "Dollar");
    }

    @Bean
    public BigDecimal bigDecimal() {
        return new BigDecimal(200);
    }

    @Bean
    public UUID uuid() {
        return UUID.randomUUID();
    }

}
