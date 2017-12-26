package ar.com.edesur.synergia.id52;

import com.wordnik.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Api(value = "/", description = "Servicio de procesamiento de actuación genérica")
public class ActuacionGenericaService {

    private static final Logger LOG = LoggerFactory.getLogger(ActuacionGenericaService.class);

    @GET
    @Path("/mock/request")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "mock request")
    public Response createMockRequest() {
        LOG.info("creando mock request ");
        ActuacionGenericaRequest mock =  new ActuacionGenericaRequest();
        return  Response.ok().entity(mock).build();
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "procesar solicitud")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "request invalido")
    })
    public Response process(@ApiParam(value = "request", required = true) ActuacionGenericaRequest request) {
        LOG.info("procesando orden: {}", request.getNumeroOrden());

        ActuacionGenericaResponse mock =  new ActuacionGenericaResponse();
        mock.setNumeroOrden(request.getNumeroOrden());

//        return  Response.ok().entity(mock).build();
        return null;
    }
}
