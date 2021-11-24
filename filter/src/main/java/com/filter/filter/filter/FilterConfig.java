package com.filter.filter.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<ActuatorFilter> registrationBean() {
        FilterRegistrationBean<ActuatorFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new ActuatorFilter());
        filterRegistrationBean.addUrlPatterns("/actuator/*");
        return filterRegistrationBean;

    }

}
