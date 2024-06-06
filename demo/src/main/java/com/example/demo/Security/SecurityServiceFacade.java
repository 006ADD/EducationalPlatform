//package com.example.demo.Security;
//
//import com.example.demo.Enum.SecurityType;
//import lombok.RequiredArgsConstructor;
//import org.apache.catalina.connector.Request;
//import org.apache.catalina.connector.Response;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Map;
//
//import static com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier.JWT;
//import static java.util.function.UnaryOperator.identity;
//import static java.util.stream.Collectors.toMap;
//import static sun.net.www.protocol.http.AuthScheme.BASIC;
//import static sun.security.provider.certpath.OCSPResponse.ResponseStatus.UNAUTHORIZED;
//
//@Service
//@RequiredArgsConstructor
//public class SecurityServiceFacade {
//
//  private final SecurityService entry;
//
//  public SecurityServiceFacade(List<SecurityService> servicesList) {
//    Map<SecurityType, SecurityService> services =
//            servicesList.stream()
//                    .collect(toMap(SecurityService::getType, identity()));
//    SecurityService basic = services.get(BASIC);
//    SecurityService jwt = services.get(JWT);
//    SecurityService unauthorized = services.get(UNAUTHORIZED);
//    basic.setNext(jwt);
//    jwt.setNext(unauthorized);
//    this.entry = basic;
//  }
//
//  public Response authorize(Request request) {
//    return this.entry(request);
//  }
//}