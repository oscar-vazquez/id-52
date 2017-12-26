package ar.com.edesur.synergia.id52;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@ApiModel(value="ActuacionGenericaRequest")
public class ActuacionGenericaRequest {

    @ApiModelProperty(value="Identificador de Empresa en Synergia")
    private Integer codigoEmpresa;

    @ApiModelProperty(value="Identificador de la solicitud generada en synergia.")
    private String numeroOrden;

    @ApiModelProperty(value="Estado al que se quiere actualizar la solicitud.")
    private String estado;

    @ApiModelProperty(value="Identificador del suministro en Synergia.")
    private String numeroSuministro;

    @ApiModelProperty(value="Identificador del caso de SFDC.")
    private Integer numeroCasoSFDC;

    @ApiModelProperty(value="Razón del caso.")
    private String motivo;

    @ApiModelProperty(value="Razón secundaria del caso.")
    private String submotivo;

    @ApiModelProperty(value="Tema Trabajo SEGEN.")
    private String trabajo;

    @ApiModelProperty(value="Tipo de Atencion.")
    private String tipoAtencion;

    @ApiModelProperty(value="Canal de Atencion.")
    private String canalDeAtencion;

    @ApiModelProperty(value="Comentarios que pueda añadir el ejecutivo.")
    private String comentarios;

    @ApiModelProperty(value="Nombre del usuario del ejecutivo que generó el caso.")
    private String solicitante;

    @ApiModelProperty(value="Comentarios que pueda añadir el ejecutivo.")
    private String descripcion;

    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroSuministro() {
        return numeroSuministro;
    }

    public void setNumeroSuministro(String numeroSuministro) {
        this.numeroSuministro = numeroSuministro;
    }

    public Integer getNumeroCasoSFDC() {
        return numeroCasoSFDC;
    }

    public void setNumeroCasoSFDC(Integer numeroCasoSFDC) {
        this.numeroCasoSFDC = numeroCasoSFDC;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getSubmotivo() {
        return submotivo;
    }

    public void setSubmotivo(String submotivo) {
        this.submotivo = submotivo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public String getCanalDeAtencion() {
        return canalDeAtencion;
    }

    public void setCanalDeAtencion(String canalDeAtencion) {
        this.canalDeAtencion = canalDeAtencion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
