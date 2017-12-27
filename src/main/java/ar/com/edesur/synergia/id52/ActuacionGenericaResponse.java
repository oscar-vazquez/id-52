package ar.com.edesur.synergia.id52;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@ApiModel(value="ActuacionGenericaResponse")
public class ActuacionGenericaResponse {

    @ApiModelProperty(value="Código único del Resultado.")
    private String codigoResultado;

    @ApiModelProperty(value="Mensaje del Resultado.")
    private String descripcionResultado;

    @ApiModelProperty(value="Identificador de la solicitud generada en synergia.")
    private String numeroOrden;

    private String tipoOrden;

    @ApiModelProperty(value="Identificador del caso de SFDC.")
    private String numeroCasosSFDC;

    public String getCodigoResultado() {
        return codigoResultado;
    }

    public void setCodigoResultado(String codigoResultado) {
        this.codigoResultado = codigoResultado;
    }

    public String getDescripcionResultado() {
        return descripcionResultado;
    }

    public void setDescripcionResultado(String descripcionResultado) {
        this.descripcionResultado = descripcionResultado;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }

    public String getNumeroCasosSFDC() {
        return numeroCasosSFDC;
    }

    public void setNumeroCasosSFDC(String numeroCasosSFDC) {
        this.numeroCasosSFDC = numeroCasosSFDC;
    }
}
