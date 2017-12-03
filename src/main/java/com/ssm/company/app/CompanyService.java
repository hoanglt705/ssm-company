package com.ssm.company.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.ssm.company.endpoint.CompanyEndpoint;

@ApplicationPath("companies")
public class CompanyService extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    final Set<Class<?>> endpointRegistry = new HashSet<Class<?>>();
    endpointRegistry.add(CompanyEndpoint.class);
    return endpointRegistry;
  }

}