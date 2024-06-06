package com.example.demo.Security;

import com.example.demo.Enum.SecurityType;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

public abstract class SecurityService {
  public abstract SecurityType getType();

  protected SecurityService next;

  public void setNext(SecurityService next) {
    this.next = next;
  }

  public abstract Response authorize(Request request);
}