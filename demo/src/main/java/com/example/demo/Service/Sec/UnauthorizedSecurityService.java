//package com.example.demo.Service.Sec;
//
//import com.example.demo.Enum.SecurityType;
//import com.example.demo.Security.SecurityService;
//import org.apache.catalina.connector.Request;
//import org.apache.catalina.connector.Response;
//import org.springframework.stereotype.Service;
//
//import static com.example.demo.Enum.SecurityType.UNAUTHORIZED;
//
//@Service("unauthorized")
//public class UnauthorizedSecurityService extends SecurityService {
//
//  @Override
//  public Response authorize(Request request) {
//    //return new Response(UNAUTHORIZED);
//    return null;
//  }
//
//  public SecurityType getType() {
//    return UNAUTHORIZED;
//  }
//}