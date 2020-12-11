package com.rm.controller;

import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


@Component
public class BaseController extends HandlerInterceptorAdapter {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    String body = "";
    if ("POST".equals(request.getMethod()))
    {
        body = request.getReader().lines().collect(Collectors.joining());
        request.setAttribute("body", body);
    } else if ("GET".equals(request.getMethod())) {
      JSONObject requestJson = new JSONObject();
      body = requestJson.toString();
      request.setAttribute("body", body);
    }
    return super.preHandle(request, response, handler);
  }
  
}
