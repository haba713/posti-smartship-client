package haba713.postismartship.resources;

import haba713.postismartship.model.Error;
import haba713.postismartship.model.PdfConfig;
import haba713.postismartship.model.PdfList;
import haba713.postismartship.model.ShipmentConsolidatePrint;
import haba713.postismartship.model.ShipmentInfo;
import haba713.postismartship.model.ShipmentInfoList;
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

@Path("/consolidated-shipments")
public interface ConsolidatedShipments {
  @GET
  @Produces("application/json")
  @Consumes
  GetConsolidatedShipmentsResponse getConsolidatedShipments(@QueryParam("searchField") String searchField, @QueryParam("searchOp") String searchOp, @QueryParam("searchValue") String searchValue, @QueryParam("dateType") String dateType, @QueryParam("dateFrom") String dateFrom, @QueryParam("dateTo") String dateTo, @QueryParam("status") String status, @HeaderParam("Authorization") String authorization);

  @POST
  @Consumes("application/json")
  PostConsolidatedShipmentsResponse postConsolidatedShipments(@HeaderParam("Authorization") String authorization, ShipmentConsolidatePrint entity);

  @DELETE
  @Path("/{consolidatedId}")
  @Produces("application/json")
  @Consumes
  DeleteConsolidatedShipmentsByConsolidatedIdResponse deleteConsolidatedShipmentsByConsolidatedId(@PathParam("consolidatedId") String consolidatedId, @HeaderParam("Authorization") String authorization);

  @GET
  @Path("/{consolidatedId}/pdfs")
  @Produces("application/json")
  @Consumes
  GetConsolidatedShipmentsPdfsResponse getConsolidatedShipmentsPdfsByConsolidatedId(@PathParam("consolidatedId") String consolidatedId, @QueryParam("inlinePdf") boolean inlinePdf, @HeaderParam("Authorization") String authorization);

  @GET
  @Path("/{consolidatedId}/pdfs/{pdfId}")
  @Produces({
      "application/pdf",
      "application/json"
  })
  @Consumes
  GetConsolidatedShipmentsPdfsByPdfIdResponse getConsolidatedShipmentsPdfsByConsolidatedIdAndPdfId(@PathParam("consolidatedId") String consolidatedId, @PathParam("pdfId") String pdfId, @HeaderParam("Authorization") String authorization);

  @POST
  @Path("/{consolidatedId}/shipments")
  @Consumes("application/json")
  PostConsolidatedShipmentsShipmentsResponse postConsolidatedShipmentsShipmentsByConsolidatedId(@PathParam("consolidatedId") String consolidatedId, @HeaderParam("Authorization") String authorization, PdfConfig entity);

  class PostConsolidatedShipmentsResponse extends ResponseDelegate {
    private PostConsolidatedShipmentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostConsolidatedShipmentsResponse(Response response) {
      super(response);
    }

    public static PostConsolidatedShipmentsResponse respond201WithApplicationJson(ShipmentInfoList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostConsolidatedShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostConsolidatedShipmentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostConsolidatedShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostConsolidatedShipmentsResponse respond422WithApplicationJson(StatusList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(422).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostConsolidatedShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostConsolidatedShipmentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostConsolidatedShipmentsResponse(responseBuilder.build(), entity);
    }
  }

  class GetConsolidatedShipmentsResponse extends ResponseDelegate {
    private GetConsolidatedShipmentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetConsolidatedShipmentsResponse(Response response) {
      super(response);
    }

    public static GetConsolidatedShipmentsResponse respond200WithApplicationJson(ShipmentInfoList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetConsolidatedShipmentsResponse(responseBuilder.build(), entity);
    }

    public static GetConsolidatedShipmentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetConsolidatedShipmentsResponse(responseBuilder.build(), entity);
    }

    public static GetConsolidatedShipmentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetConsolidatedShipmentsResponse(responseBuilder.build(), entity);
    }
  }

  class DeleteConsolidatedShipmentsByConsolidatedIdResponse extends ResponseDelegate {
    private DeleteConsolidatedShipmentsByConsolidatedIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private DeleteConsolidatedShipmentsByConsolidatedIdResponse(Response response) {
      super(response);
    }

    public static DeleteConsolidatedShipmentsByConsolidatedIdResponse respond204WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(204).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new DeleteConsolidatedShipmentsByConsolidatedIdResponse(responseBuilder.build(), null);
    }

    public static DeleteConsolidatedShipmentsByConsolidatedIdResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new DeleteConsolidatedShipmentsByConsolidatedIdResponse(responseBuilder.build(), entity);
    }

    public static DeleteConsolidatedShipmentsByConsolidatedIdResponse respond404WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new DeleteConsolidatedShipmentsByConsolidatedIdResponse(responseBuilder.build(), null);
    }

    public static DeleteConsolidatedShipmentsByConsolidatedIdResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new DeleteConsolidatedShipmentsByConsolidatedIdResponse(responseBuilder.build(), entity);
    }
  }

  class GetConsolidatedShipmentsPdfsResponse extends ResponseDelegate {
    private GetConsolidatedShipmentsPdfsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetConsolidatedShipmentsPdfsResponse(Response response) {
      super(response);
    }

    public static GetConsolidatedShipmentsPdfsResponse respond200WithApplicationJson(PdfList entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetConsolidatedShipmentsPdfsResponse(responseBuilder.build(), entity);
    }

    public static GetConsolidatedShipmentsPdfsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetConsolidatedShipmentsPdfsResponse(responseBuilder.build(), entity);
    }

    public static GetConsolidatedShipmentsPdfsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetConsolidatedShipmentsPdfsResponse(responseBuilder.build(), entity);
    }
  }

  class GetConsolidatedShipmentsPdfsByPdfIdResponse extends ResponseDelegate {
    private GetConsolidatedShipmentsPdfsByPdfIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetConsolidatedShipmentsPdfsByPdfIdResponse(Response response) {
      super(response);
    }

    public static GetConsolidatedShipmentsPdfsByPdfIdResponse respond200WithApplicationPdf() {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/pdf");
      responseBuilder.entity(null);
      return new GetConsolidatedShipmentsPdfsByPdfIdResponse(responseBuilder.build(), null);
    }

    public static GetConsolidatedShipmentsPdfsByPdfIdResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetConsolidatedShipmentsPdfsByPdfIdResponse(responseBuilder.build(), entity);
    }

    public static GetConsolidatedShipmentsPdfsByPdfIdResponse respond404WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new GetConsolidatedShipmentsPdfsByPdfIdResponse(responseBuilder.build(), null);
    }

    public static GetConsolidatedShipmentsPdfsByPdfIdResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetConsolidatedShipmentsPdfsByPdfIdResponse(responseBuilder.build(), entity);
    }
  }

  class PostConsolidatedShipmentsShipmentsResponse extends ResponseDelegate {
    private PostConsolidatedShipmentsShipmentsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostConsolidatedShipmentsShipmentsResponse(Response response) {
      super(response);
    }

    public static PostConsolidatedShipmentsShipmentsResponse respond201WithApplicationJson(ShipmentInfo entity) {
      Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostConsolidatedShipmentsShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostConsolidatedShipmentsShipmentsResponse respond400WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostConsolidatedShipmentsShipmentsResponse(responseBuilder.build(), entity);
    }

    public static PostConsolidatedShipmentsShipmentsResponse respond422WithApplicationJson() {
      Response.ResponseBuilder responseBuilder = Response.status(422).header("Content-Type", "application/json");
      responseBuilder.entity(null);
      return new PostConsolidatedShipmentsShipmentsResponse(responseBuilder.build(), null);
    }

    public static PostConsolidatedShipmentsShipmentsResponse respond500WithApplicationJson(Error entity) {
      Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostConsolidatedShipmentsShipmentsResponse(responseBuilder.build(), entity);
    }
  }
}
