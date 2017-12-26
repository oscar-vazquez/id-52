package ar.com.edesur.synergia.id52;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class ResponseGenerator implements Processor {

    private static final Logger logger = LoggerFactory.getLogger(ActuacionGenericaService.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        ActuacionGenericaRequest request = exchange.getIn(ActuacionGenericaRequest.class);
        logger.info("request {}", request.getNumeroCasoSFDC());
        ActuacionGenericaResponse response = new ActuacionGenericaResponse();
        response.setCodigoResultado(UUID.randomUUID().toString());
        exchange.getOut().setBody(response);
    }

}
