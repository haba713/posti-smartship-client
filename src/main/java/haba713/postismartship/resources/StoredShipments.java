package haba713.postismartship.resources;

import haba713.postismartship.model.Error;
import haba713.postismartship.model.PdfConfig;
import haba713.postismartship.model.Shipment;
import haba713.postismartship.model.ShipmentInfo;
import haba713.postismartship.model.StoredShipmentInfo;
import haba713.postismartship.model.StoredShipmentInfoList;
import haba713.postismartship.support.ResponseDelegate;
import java.lang.Object;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/stored-shipments")
public interface StoredShipments {
  @GET
  @Produces("application/json")
  @Consumes
  GetStoredShipmentsResponse getStoredShipments(@QueryParam("searchField") String searchField, @QueryParam("searchOp") String searchOp, @QueryParam("searchValue") String searchValue, @QueryParam("dateType") String dateType, @QueryParam("dateFrom") String dateFrom, @QueryParam("dateTo") String dateTo, @QueryParam("status") String status, @HeaderParam("Authorization") String authorization);

  @POST
  @Consumes("application/json")
  PostStoredShipmentsResponse postStoredShipments(@HeaderParam("Authorization") String authorization, Shipment entity);

  @DELETE
  @Path("/{storedId}")
  @Produces("application/json")
  @Consumes
  DeleteStoredShipmentsByStoredIdResponse deleteStoredShipmentsByStoredId(@PathParam("storedId") String storedId, @HeaderParam("Authorization") String authorization);

  @POST
  @Path("/{storedId}/shipments")
  @Consumes("application/json")
  PostStoredShipmentsShipmentsResponse postStoredShipmentsShipmentsByStoredId(@PathParam("storedId") String storedId, @HeaderParam("Authorization") String authorization, PdfConfig entity);

  class GetStoredShipmentsResponse extends ResponseDelegate {
    private GetStoredShipmentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetStoredShipmentsResponse(Response response) {
      super(response);
    }

    public static GetStoredShipmentsResponse respond200WithApplicationJson(StoredShipmentInfoList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetStoredShipmentsResponse(responseBuilder.build(), entity);
    }

    public static GetStoredShipmentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetStoredShipmentsResponse(responseBuilder.build(), entity);
    }

    public static GetStoredShipmentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetStoredShipmentsResponse(responseBuilder.build(), entity);
    }
  }

  class PostStoredShipmentsResponse extends ResponseDelegate {
    private PostStoredShipmentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostStoredShipmentsResponse(Response response) {
      super(response);
    }

    public static PostStoredShipmentsResponse respond201WithApplicationJson(StoredShipmentInfo entity) {
      Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostStoredShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostStoredShipmentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostStoredShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostStoredShipmentsResponse respond422WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(422).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new PostStoredShipmentsResponse(responseBuilder.build(), null);
    }

    public static PostStoredShipmentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostStoredShipmentsResponse(responseBuilder.build(), entity);
    }
  }

  class DeleteStoredShipmentsByStoredIdResponse extends ResponseDelegate {
    private DeleteStoredShipmentsByStoredIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private DeleteStoredShipmentsByStoredIdResponse(Response response) {
      super(response);
    }

    public static DeleteStoredShipmentsByStoredIdResponse respond204WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(204).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new DeleteStoredShipmentsByStoredIdResponse(responseBuilder.build(), null);
    }

    public static DeleteStoredShipmentsByStoredIdResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new DeleteStoredShipmentsByStoredIdResponse(responseBuilder.build(), entity);
    }

    public static DeleteStoredShipmentsByStoredIdResponse respond404WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new DeleteStoredShipmentsByStoredIdResponse(responseBuilder.build(), null);
    }

    public static DeleteStoredShipmentsByStoredIdResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new DeleteStoredShipmentsByStoredIdResponse(responseBuilder.build(), entity);
    }
  }

  class PostStoredShipmentsShipmentsResponse extends ResponseDelegate {
    private PostStoredShipmentsShipmentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostStoredShipmentsShipmentsResponse(Response response) {
      super(response);
    }

    public static PostStoredShipmentsShipmentsResponse respond201WithApplicationJson(ShipmentInfo entity) {
      Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostStoredShipmentsShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostStoredShipmentsShipmentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostStoredShipmentsShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostStoredShipmentsShipmentsResponse respond422WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(422).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new PostStoredShipmentsShipmentsResponse(responseBuilder.build(), null);
    }

    public static PostStoredShipmentsShipmentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostStoredShipmentsShipmentsResponse(responseBuilder.build(), entity);
    }
  }
}
