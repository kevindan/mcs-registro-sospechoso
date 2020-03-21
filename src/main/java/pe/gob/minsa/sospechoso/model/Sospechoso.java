package pe.gob.minsa.sospechoso.model;

import java.io.Serializable;

public class Sospechoso implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tipDocumento;
	private String numDocumento;
	private String nombres;
	private String apePrimer;
	private String apeSegundo;
	private String direccion;
	private String codUbigeo;
	private String correo;
	private String numTelefono;
	private String sexo;
	private String edad;
	private String codPaisNatal;
	private String contactoFamiliar;
	private String contactoCelular;
	private String contactoVirus;
	private String visitoPaisCorona;
	private String codPais1;
	private String codPais2;
	private String codPais3;
	private String fecPais1;
	private String fecPais2;
	private String fecPais3;
	private String sintomaFiebre;
	private String sintomaTos;
	private String sintomaCongestionNasal;
	private String sintomaGarganta;
	private String sintomaRespiracion;
	private String codUsuario;
	private String fecInicioSintomas;
	private String riesgo;
	private String sospechoso;
	private String riesgoAdulto;
	private String riesgoNiño;
	private String riesgoGestante;
	private String riesgoFamiliar;
	private String fecIngresoPeru;
	private String horIngresoPeru;
	private String latitud;
	private String longitud;

	public Sospechoso() {
		
	}

	public Sospechoso(String tipDocumento, String numDocumento, String nombres, String apePrimer, String apeSegundo,
			String direccion, String codUbigeo, String correo, String numTelefono, String sexo, String edad,
			String codPaisNatal, String contactoFamiliar, String contactoCelular, String contactoVirus,
			String visitoPaisCorona, String codPais1, String codPais2, String codPais3, String fecPais1,
			String fecPais2, String fecPais3, String sintomaFiebre, String sintomaTos, String sintomaCongestionNasal,
			String sintomaGarganta, String sintomaRespiracion, String codUsuario, String fecInicioSintomas,
			String riesgo, String sospechoso, String riesgoAdulto, String riesgoNiño, String riesgoGestante,
			String riesgoFamiliar, String fecIngresoPeru, String horIngresoPeru, String latitud, String longitud) {
		
		this.tipDocumento = tipDocumento;
		this.numDocumento = numDocumento;
		this.nombres = nombres;
		this.apePrimer = apePrimer;
		this.apeSegundo = apeSegundo;
		this.direccion = direccion;
		this.codUbigeo = codUbigeo;
		this.correo = correo;
		this.numTelefono = numTelefono;
		this.sexo = sexo;
		this.edad = edad;
		this.codPaisNatal = codPaisNatal;
		this.contactoFamiliar = contactoFamiliar;
		this.contactoCelular = contactoCelular;
		this.contactoVirus = contactoVirus;
		this.visitoPaisCorona = visitoPaisCorona;
		this.codPais1 = codPais1;
		this.codPais2 = codPais2;
		this.codPais3 = codPais3;
		this.fecPais1 = fecPais1;
		this.fecPais2 = fecPais2;
		this.fecPais3 = fecPais3;
		this.sintomaFiebre = sintomaFiebre;
		this.sintomaTos = sintomaTos;
		this.sintomaCongestionNasal = sintomaCongestionNasal;
		this.sintomaGarganta = sintomaGarganta;
		this.sintomaRespiracion = sintomaRespiracion;
		this.codUsuario = codUsuario;
		this.fecInicioSintomas = fecInicioSintomas;
		this.riesgo = riesgo;
		this.sospechoso = sospechoso;
		this.riesgoAdulto = riesgoAdulto;
		this.riesgoNiño = riesgoNiño;
		this.riesgoGestante = riesgoGestante;
		this.riesgoFamiliar = riesgoFamiliar;
		this.fecIngresoPeru = fecIngresoPeru;
		this.horIngresoPeru = horIngresoPeru;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String getTipDocumento() {
		return tipDocumento;
	}

	public void setTipDocumento(String tipDocumento) {
		this.tipDocumento = tipDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApePrimer() {
		return apePrimer;
	}

	public void setApePrimer(String apePrimer) {
		this.apePrimer = apePrimer;
	}

	public String getApeSegundo() {
		return apeSegundo;
	}

	public void setApeSegundo(String apeSegundo) {
		this.apeSegundo = apeSegundo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodUbigeo() {
		return codUbigeo;
	}

	public void setCodUbigeo(String codUbigeo) {
		this.codUbigeo = codUbigeo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCodPaisNatal() {
		return codPaisNatal;
	}

	public void setCodPaisNatal(String codPaisNatal) {
		this.codPaisNatal = codPaisNatal;
	}

	public String getContactoFamiliar() {
		return contactoFamiliar;
	}

	public void setContactoFamiliar(String contactoFamiliar) {
		this.contactoFamiliar = contactoFamiliar;
	}

	public String getContactoCelular() {
		return contactoCelular;
	}

	public void setContactoCelular(String contactoCelular) {
		this.contactoCelular = contactoCelular;
	}

	public String getContactoVirus() {
		return contactoVirus;
	}

	public void setContactoVirus(String contactoVirus) {
		this.contactoVirus = contactoVirus;
	}

	public String getVisitoPaisCorona() {
		return visitoPaisCorona;
	}

	public void setVisitoPaisCorona(String visitoPaisCorona) {
		this.visitoPaisCorona = visitoPaisCorona;
	}

	public String getCodPais1() {
		return codPais1;
	}

	public void setCodPais1(String codPais1) {
		this.codPais1 = codPais1;
	}

	public String getCodPais2() {
		return codPais2;
	}

	public void setCodPais2(String codPais2) {
		this.codPais2 = codPais2;
	}

	public String getCodPais3() {
		return codPais3;
	}

	public void setCodPais3(String codPais3) {
		this.codPais3 = codPais3;
	}

	public String getFecPais1() {
		return fecPais1;
	}

	public void setFecPais1(String fecPais1) {
		this.fecPais1 = fecPais1;
	}

	public String getFecPais2() {
		return fecPais2;
	}

	public void setFecPais2(String fecPais2) {
		this.fecPais2 = fecPais2;
	}

	public String getFecPais3() {
		return fecPais3;
	}

	public void setFecPais3(String fecPais3) {
		this.fecPais3 = fecPais3;
	}

	public String getSintomaFiebre() {
		return sintomaFiebre;
	}

	public void setSintomaFiebre(String sintomaFiebre) {
		this.sintomaFiebre = sintomaFiebre;
	}

	public String getSintomaTos() {
		return sintomaTos;
	}

	public void setSintomaTos(String sintomaTos) {
		this.sintomaTos = sintomaTos;
	}

	public String getSintomaCongestionNasal() {
		return sintomaCongestionNasal;
	}

	public void setSintomaCongestionNasal(String sintomaCongestionNasal) {
		this.sintomaCongestionNasal = sintomaCongestionNasal;
	}

	public String getSintomaGarganta() {
		return sintomaGarganta;
	}

	public void setSintomaGarganta(String sintomaGarganta) {
		this.sintomaGarganta = sintomaGarganta;
	}

	public String getSintomaRespiracion() {
		return sintomaRespiracion;
	}

	public void setSintomaRespiracion(String sintomaRespiracion) {
		this.sintomaRespiracion = sintomaRespiracion;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getFecInicioSintomas() {
		return fecInicioSintomas;
	}

	public void setFecInicioSintomas(String fecInicioSintomas) {
		this.fecInicioSintomas = fecInicioSintomas;
	}

	public String getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}

	public String getSospechoso() {
		return sospechoso;
	}

	public void setSospechoso(String sospechoso) {
		this.sospechoso = sospechoso;
	}

	public String getRiesgoAdulto() {
		return riesgoAdulto;
	}

	public void setRiesgoAdulto(String riesgoAdulto) {
		this.riesgoAdulto = riesgoAdulto;
	}

	public String getRiesgoNiño() {
		return riesgoNiño;
	}

	public void setRiesgoNiño(String riesgoNiño) {
		this.riesgoNiño = riesgoNiño;
	}

	public String getRiesgoGestante() {
		return riesgoGestante;
	}

	public void setRiesgoGestante(String riesgoGestante) {
		this.riesgoGestante = riesgoGestante;
	}

	public String getRiesgoFamiliar() {
		return riesgoFamiliar;
	}

	public void setRiesgoFamiliar(String riesgoFamiliar) {
		this.riesgoFamiliar = riesgoFamiliar;
	}

	public String getFecIngresoPeru() {
		return fecIngresoPeru;
	}

	public void setFecIngresoPeru(String fecIngresoPeru) {
		this.fecIngresoPeru = fecIngresoPeru;
	}

	public String getHorIngresoPeru() {
		return horIngresoPeru;
	}

	public void setHorIngresoPeru(String horIngresoPeru) {
		this.horIngresoPeru = horIngresoPeru;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Sospechoso [tipDocumento=" + tipDocumento + ", numDocumento=" + numDocumento + ", nombres=" + nombres
				+ ", apePrimer=" + apePrimer + ", apeSegundo=" + apeSegundo + ", direccion=" + direccion
				+ ", codUbigeo=" + codUbigeo + ", correo=" + correo + ", numTelefono=" + numTelefono + ", sexo=" + sexo
				+ ", edad=" + edad + ", codPaisNatal=" + codPaisNatal + ", contactoFamiliar=" + contactoFamiliar
				+ ", contactoCelular=" + contactoCelular + ", contactoVirus=" + contactoVirus + ", visitoPaisCorona="
				+ visitoPaisCorona + ", codPais1=" + codPais1 + ", codPais2=" + codPais2 + ", codPais3=" + codPais3
				+ ", fecPais1=" + fecPais1 + ", fecPais2=" + fecPais2 + ", fecPais3=" + fecPais3 + ", sintomaFiebre="
				+ sintomaFiebre + ", sintomaTos=" + sintomaTos + ", sintomaCongestionNasal=" + sintomaCongestionNasal
				+ ", sintomaGarganta=" + sintomaGarganta + ", sintomaRespiracion=" + sintomaRespiracion
				+ ", codUsuario=" + codUsuario + ", fecInicioSintomas=" + fecInicioSintomas + ", riesgo=" + riesgo
				+ ", sospechoso=" + sospechoso + ", riesgoAdulto=" + riesgoAdulto + ", riesgoNiño=" + riesgoNiño
				+ ", riesgoGestante=" + riesgoGestante + ", riesgoFamiliar=" + riesgoFamiliar + ", fecIngresoPeru="
				+ fecIngresoPeru + ", horIngresoPeru=" + horIngresoPeru + ", latitud=" + latitud + ", longitud="
				+ longitud + "]";
	}
		
}
