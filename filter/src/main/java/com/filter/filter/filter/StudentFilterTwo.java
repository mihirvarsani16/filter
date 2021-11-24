package com.filter.filter.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class StudentFilterTwo implements Filter {

    private static Logger log = LoggerFactory.getLogger(StudentFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        log.info("Student filter two");
        log.info("Login Request : {}", req.getRequestURI());
        // log.info("Local Port - {}", request.getLocalPort());
        // log.info("Server Name - " + request.getServerName());
        // log.info("Porotocol - {}", request.getProtocol());
        // log.info("Method - {}", req.getMethod());
        // log.info("Server Path - {}", req.getServletPath());
        chain.doFilter(request, response);

        log.info("Login Response : {}", req.getRequestURI());

    }

}
