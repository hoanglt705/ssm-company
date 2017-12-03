package com.ssm.company.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("myresource")
public class CompanyEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCompany() {
        return Response.ok().entity("hello").build();
    }
}
