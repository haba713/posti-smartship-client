package haba713.postismartship.resources;

import haba713.postismartship.model.AlertInfoList;
import haba713.postismartship.model.Error;
import haba713.postismartship.support.ResponseDelegate;
import java.lang.Object;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/alerts")
public interface Alerts {
  @GET
  @Produces("application/json")
  @Consumes
  GetAlertsResponse getAlerts(@QueryParam("fetchId") String fetchId, @HeaderParam("Authorization") String authorization);

  class GetAlertsResponse extends ResponseDelegate {
    private GetAlertsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetAlertsResponse(Response response) {
      super(response);
    }

    public static GetAlertsResponse respond200WithApplicationJson(AlertInfoList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAlertsResponse(responseBuilder.build(), entity);
    }

    public static GetAlertsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAlertsResponse(responseBuilder.build(), entity);
    }

    public static GetAlertsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAlertsResponse(responseBuilder.build(), entity);
    }
  }
}
