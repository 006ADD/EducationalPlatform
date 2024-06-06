//package com.example.demo.Service.Sec;
//
//import com.example.demo.Enum.SecurityType;
//import com.example.demo.Security.SecurityService;
//import org.apache.catalina.connector.Request;
//import org.apache.catalina.connector.Response;
//import org.springframework.stereotype.Service;
//
//import static com.example.demo.Enum.SecurityType.JWT;
//import static org.springframework.http.HttpHeaders.AUTHORIZATION;
//
//@Service("jwt")
//public class JwtAuthSecurityService extends SecurityService {
//
//  @Override
//  public Response authorize(Request request) {
//    if (request.getHeader(AUTHORIZATION).startsWith("Bearer")) {
//      //return tryJwtAuth(request);
//    }
//    return next.authorize(request);
//  }
//
//  public SecurityType getType() {
//    return JWT;
//  }
//}