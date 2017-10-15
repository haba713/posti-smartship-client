package haba713.postismartship.resources;

import haba713.postismartship.model.AddressesAgentsGet200ApplicationJson;
import haba713.postismartship.model.AddressesStatusPost200ApplicationJson;
import haba713.postismartship.model.AddressesStatusPostApplicationJson;
import haba713.postismartship.model.AddressesZipcodesGet200ApplicationJson;
import haba713.postismartship.model.Error;
import haba713.postismartship.support.ResponseDelegate;
import java.lang.Object;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/addresses")
public interface Addresses {
  @GET
  @Path("/agents")
  @Produces("application/json")
  @Consumes
  GetAddressesAgentsResponse getAddressesAgents(@QueryParam("type") String type, @QueryParam("id") String id, @QueryParam("zip") String zip, @QueryParam("street") String street, @QueryParam("countryCode") String countryCode, @HeaderParam("Authorization") String authorization);

  @POST
  @Path("/status")
  @Consumes("application/json")
  PostAddressesStatusResponse postAddressesStatus(@QueryParam("language") String language, @HeaderParam("Authorization") String authorization, AddressesStatusPostApplicationJson entity);

  @GET
  @Path("/zipcodes")
  @Produces("application/json")
  @Consumes
  GetAddressesZipcodesResponse getAddressesZipcodes(@QueryParam("zip") String zip, @QueryParam("countryCode") String countryCode, @HeaderParam("Authorization") String authorization);

  class GetAddressesAgentsResponse extends ResponseDelegate {
    private GetAddressesAgentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetAddressesAgentsResponse(Response response) {
      super(response);
    }

    public static GetAddressesAgentsResponse respond200WithApplicationJson(AddressesAgentsGet200ApplicationJson entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAddressesAgentsResponse(responseBuilder.build(), entity);
    }

    public static GetAddressesAgentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAddressesAgentsResponse(responseBuilder.build(), entity);
    }

    public static GetAddressesAgentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAddressesAgentsResponse(responseBuilder.build(), entity);
    }
  }

  class PostAddressesStatusResponse extends ResponseDelegate {
    private PostAddressesStatusResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostAddressesStatusResponse(Response response) {
      super(response);
    }

    public static PostAddressesStatusResponse respond200WithApplicationJson(AddressesStatusPost200ApplicationJson entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostAddressesStatusResponse(responseBuilder.build(), entity);
    }

    public static PostAddressesStatusResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostAddressesStatusResponse(responseBuilder.build(), entity);
    }

    public static PostAddressesStatusResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostAddressesStatusResponse(responseBuilder.build(), entity);
    }
  }

  class GetAddressesZipcodesResponse extends ResponseDelegate {
    private GetAddressesZipcodesResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetAddressesZipcodesResponse(Response response) {
      super(response);
    }

    public static GetAddressesZipcodesResponse respond200WithApplicationJson(AddressesZipcodesGet200ApplicationJson entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAddressesZipcodesResponse(responseBuilder.build(), entity);
    }

    public static GetAddressesZipcodesResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAddressesZipcodesResponse(responseBuilder.build(), entity);
    }

    public static GetAddressesZipcodesResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetAddressesZipcodesResponse(responseBuilder.build(), entity);
    }
  }
}
