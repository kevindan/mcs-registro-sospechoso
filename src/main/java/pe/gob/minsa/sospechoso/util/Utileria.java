package pe.gob.minsa.sospechoso.util;

import pe.gob.minsa.sospechoso.model.Sospechoso;

public class Utileria {
		
	public String validaEntradas(Sospechoso sospechoso) {
	String respuesta = "0000";
	if(sospechoso.getTipDocumento() == null || "".equals(sospechoso.getTipDocumento().trim())) {
		return respuesta = "0100";		
	}
	if(sospechoso.getNumDocumento() == null || "".equals(sospechoso.getNumDocumento().trim())) {
		return respuesta = "0101";
	}
	if(sospechoso.getNombres() == null || "".equals(sospechoso.getNombres().trim())) {
		return respuesta = "0102";
	}	
	if(sospechoso.getApePrimer() == null || "".equals(sospechoso.getApePrimer().trim())) {
		return respuesta = "0103";
	}
	if(sospechoso.getApeSegundo() == null || "".equals(sospechoso.getApeSegundo().trim())) {
		return respuesta = "0104";
	}
	if(sospechoso.getDireccion() == null || "".equals(sospechoso.getDireccion().trim())) {
		return respuesta = "0105";
	}
	if(sospechoso.getCodUbigeo() == null || "".equals(sospechoso.getCodUbigeo().trim())) {
		return respuesta = "0106";
	}
	if(sospechoso.getNumTelefono() == null || "".equals(sospechoso.getNumTelefono().trim())) {
		return respuesta = "0107";
	}
	if(sospechoso.getSexo()== null || "".equals(sospechoso.getSexo().trim())) {
		return respuesta = "0108";
	}
	if(sospechoso.getEdad() == null || "".equals(sospechoso.getEdad().trim())) {
		return respuesta = "0109";
	}
	if(sospechoso.getCodPaisNatal() == null || "".equals(sospechoso.getCodPaisNatal().trim())) {
		return respuesta = "0110";
	}
	if(sospechoso.getContactoVirus() == null || "".equals(sospechoso.getContactoVirus().trim())) {
		return respuesta = "0111";
	}
	if(sospechoso.getVisitoPaisCorona() == null || "".equals(sospechoso.getVisitoPaisCorona().trim())) {
		return respuesta = "0112";
	}	
	if(sospechoso.getVisitoPaisCorona().equals("1")) {
		if(sospechoso.getCodPais1() == null || "".equals(sospechoso.getCodPais1().trim())) {
			return respuesta = "0113";
		}
		if(sospechoso.getFecPais1()==null || "".equals(sospechoso.getFecPais1())) {
			return respuesta = "0114";
		}
		if(sospechoso.getFecIngresoPeru() == null || "".equals(sospechoso.getFecIngresoPeru().trim())) {
			return respuesta = "0116";
		}
		if(sospechoso.getHorIngresoPeru() == null || "".equals(sospechoso.getHorIngresoPeru().trim())) {
			return respuesta = "0117";
		}
	}
	if(sospechoso.getSintomaFiebre().equals("1") || 
			sospechoso.getSintomaTos().equals("1") || 
			sospechoso.getSintomaCongestionNasal().equals("1")||
			sospechoso.getSintomaGarganta().equals("1")||
			sospechoso.getSintomaRespiracion().equals("1")) {
		if(sospechoso.getFecInicioSintomas() == null || "".equals(sospechoso.getFecInicioSintomas())) {
			return respuesta = "0115";
		}
	}	
	return respuesta;
	}
}
