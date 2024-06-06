//package com.example.demo.Service.Sec;
//
//import com.example.demo.Enum.SecurityType;
//import com.example.demo.Security.SecurityService;
//import org.apache.catalina.connector.Request;
//import org.apache.catalina.connector.Response;
//import org.springframework.stereotype.Service;
//
//import static org.springframework.http.HttpHeaders.AUTHORIZATION;
//import static sun.net.www.protocol.http.AuthScheme.BASIC;
//
//@Service("basic")
//public class BasicAuthSecurityService extends SecurityService {
//
//  @Override
//  public Response authorize(Request request) {
//    if (request.getHeader(AUTHORIZATION).startsWith("Basic")) {
//      //return tryBasicAuth(request);
//    }
//    return next.authorize(request);
//  }
//
//  public SecurityType getType() {
//    return BASIC;
//  }
//}