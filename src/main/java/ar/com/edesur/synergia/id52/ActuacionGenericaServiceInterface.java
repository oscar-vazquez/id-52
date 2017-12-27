package ar.com.edesur.synergia.id52;

import com.wordnik.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Api(value = "/", description = "Servicio de procesamiento de actuación genérica")
public interface ActuacionGenericaServiceInterface {
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "procesar solicitud", response = ActuacionGenericaResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "request invalido")
    })
    Response process(@ApiParam(value = "request", required = true) ActuacionGenericaRequest request);
}
