package haba713.postismartship.resources;

import haba713.postismartship.model.Error;
import haba713.postismartship.model.PdfList;
import haba713.postismartship.model.ShipmentFetchInfoList;
import haba713.postismartship.model.ShipmentInfoList;
import haba713.postismartship.model.ShipmentPrint;
import haba713.postismartship.model.StatusList;
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

@Path("/shipments")
public interface Shipments {
  @GET
  @Produces("application/json")
  @Consumes
  GetShipmentsResponse getShipments(@QueryParam("fetchId") String fetchId, @HeaderParam("Authorization") String authorization);

  @POST
  @Consumes("application/json")
  PostShipmentsResponse postShipments(@HeaderParam("Authorization") String authorization, ShipmentPrint entity);

  @DELETE
  @Path("/{shipmentId}")
  @Produces("application/json")
  @Consumes
  DeleteShipmentsByShipmentIdResponse deleteShipmentsByShipmentId(@PathParam("shipmentId") String shipmentId, @HeaderParam("Authorization") String authorization);

  @GET
  @Path("/{shipmentId}/pdfs")
  @Produces("application/json")
  @Consumes
  GetShipmentsPdfsResponse getShipmentsPdfsByShipmentId(@PathParam("shipmentId") String shipmentId, @QueryParam("inlinePdf") boolean inlinePdf, @HeaderParam("Authorization") String authorization);

  @GET
  @Path("/{shipmentId}/pdfs/{pdfId}")
  @Produces({
      "application/pdf",
      "application/json"
  })
  @Consumes
  GetShipmentsPdfsByPdfIdResponse getShipmentsPdfsByShipmentIdAndPdfId(@PathParam("shipmentId") String shipmentId, @PathParam("pdfId") String pdfId, @HeaderParam("Authorization") String authorization);

  class GetShipmentsResponse extends ResponseDelegate {
    private GetShipmentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetShipmentsResponse(Response response) {
      super(response);
    }

    public static GetShipmentsResponse respond200WithApplicationJson(ShipmentFetchInfoList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetShipmentsResponse(responseBuilder.build(), entity);
    }

    public static GetShipmentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetShipmentsResponse(responseBuilder.build(), entity);
    }

    public static GetShipmentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetShipmentsResponse(responseBuilder.build(), entity);
    }
  }

  class PostShipmentsResponse extends ResponseDelegate {
    private PostShipmentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostShipmentsResponse(Response response) {
      super(response);
    }

    public static PostShipmentsResponse respond201WithApplicationJson(ShipmentInfoList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostShipmentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostShipmentsResponse respond422WithApplicationJson(StatusList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(422).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostShipmentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostShipmentsResponse(responseBuilder.build(), entity);
    }
  }

  class DeleteShipmentsByShipmentIdResponse extends ResponseDelegate {
    private DeleteShipmentsByShipmentIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private DeleteShipmentsByShipmentIdResponse(Response response) {
      super(response);
    }

    public static DeleteShipmentsByShipmentIdResponse respond204WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(204).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new DeleteShipmentsByShipmentIdResponse(responseBuilder.build(), null);
    }

    public static DeleteShipmentsByShipmentIdResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new DeleteShipmentsByShipmentIdResponse(responseBuilder.build(), entity);
    }

    public static DeleteShipmentsByShipmentIdResponse respond404WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new DeleteShipmentsByShipmentIdResponse(responseBuilder.build(), null);
    }

    public static DeleteShipmentsByShipmentIdResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new DeleteShipmentsByShipmentIdResponse(responseBuilder.build(), entity);
    }
  }

  class GetShipmentsPdfsResponse extends ResponseDelegate {
    private GetShipmentsPdfsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetShipmentsPdfsResponse(Response response) {
      super(response);
    }

    public static GetShipmentsPdfsResponse respond200WithApplicationJson(PdfList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetShipmentsPdfsResponse(responseBuilder.build(), entity);
    }

    public static GetShipmentsPdfsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetShipmentsPdfsResponse(responseBuilder.build(), entity);
    }

    public static GetShipmentsPdfsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetShipmentsPdfsResponse(responseBuilder.build(), entity);
    }
  }

  class GetShipmentsPdfsByPdfIdResponse extends ResponseDelegate {
    private GetShipmentsPdfsByPdfIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetShipmentsPdfsByPdfIdResponse(Response response) {
      super(response);
    }

    public static GetShipmentsPdfsByPdfIdResponse respond200WithApplicationPdf() {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/pdf");
      responseBuilder.entity(null);
      return new GetShipmentsPdfsByPdfIdResponse(responseBuilder.build(), null);
    }

    public static GetShipmentsPdfsByPdfIdResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetShipmentsPdfsByPdfIdResponse(responseBuilder.build(), entity);
    }

    public static GetShipmentsPdfsByPdfIdResponse respond404WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new GetShipmentsPdfsByPdfIdResponse(responseBuilder.build(), null);
    }

    public static GetShipmentsPdfsByPdfIdResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetShipmentsPdfsByPdfIdResponse(responseBuilder.build(), entity);
    }
  }
}
