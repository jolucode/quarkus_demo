package org.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.quarkus.model.Log;
import org.quarkus.service.LogServiceMongo;

import java.util.List;

@Path("/log")
public class LogController {

    @Inject
    LogServiceMongo logServiceMongo;


    @GET
    @Path("/data")
    public List<Log> getLogs(@QueryParam("N") int N) {
        return logServiceMongo.getLogs(N);
    }



}