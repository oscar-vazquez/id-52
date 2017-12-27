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

    private static final Logger logger = LoggerFactory.getLogger(ActuacionGenericaService.class);

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "procesar solicitud", response = ActuacionGenericaResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "request invalido")
    })
//    public Response process(@ApiParam(value = "request", required = true) ActuacionGenericaRequest request) {
    public Response process(ActuacionGenericaRequest request) {
        logger.info(request.toString());
        return null;
    }
}
