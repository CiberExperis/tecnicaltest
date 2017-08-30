package com.firabarcelona.filters;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by adria on 10/03/16.
 */
@Component
public class HeadersFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        Map requestParameters = request.getParameterMap();
//        System.out.println("Request parameters:");
//        for(Object key : requestParameters.keySet()) {
//            System.out.println(key + " = " + requestParameters.get(key));
//        }
//        System.out.println("-------------------------------");
//        if(request instanceof HttpServletRequest) {
//            Enumeration<String> headerNames = ((HttpServletRequest)request).getHeaderNames();
//            System.out.println("Headers:");
//            while (headerNames.hasMoreElements()) {
//                String name = headerNames.nextElement();
//                System.out.println(name + " = " +((HttpServletRequest)request).getHeader(name));
//            }
//            System.out.println("-------------------------------");
//            System.out.println("METHOD: " + ((HttpServletRequest)request).getMethod());
//        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
