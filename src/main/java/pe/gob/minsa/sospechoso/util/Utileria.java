package pe.gob.minsa.sospechoso.util;

import pe.gob.minsa.sospechoso.model.Sospechoso;

public class Utileria {
		
	public String validaEntradas(Sospechoso sospechoso) {
	String respuesta = "000";
	if(sospechoso.getTipDocumento() == null || "".equals(sospechoso.getTipDocumento().trim())) {
		return respuesta = "100";		
	}
	if(sospechoso.getNumDocumento() == null || "".equals(sospechoso.getNumDocumento().trim())) {
		return respuesta = "101";
	}
	if(sospechoso.getNombres() == null || "".equals(sospechoso.getNombres().trim())) {
		return respuesta = "102";
	}	
	if(sospechoso.getApePrimer() == null || "".equals(sospechoso.getApePrimer().trim())) {
		return respuesta = "103";
	}
	if(sospechoso.getApeSegundo() == null || "".equals(sospechoso.getApeSegundo().trim())) {
		return respuesta = "104";
	}
	if(sospechoso.getDireccion() == null || "".equals(sospechoso.getDireccion().trim())) {
		return respuesta = "105";
	}
	if(sospechoso.getCodUbigeo() == null || "".equals(sospechoso.getCodUbigeo().trim())) {
		return respuesta = "106";
	}
	if(sospechoso.getNumTelefono() == null || "".equals(sospechoso.getNumTelefono().trim())) {
		return respuesta = "107";
	}
	if(sospechoso.getSexo()== null || "".equals(sospechoso.getSexo().trim())) {
		return respuesta = "108";
	}
	if(sospechoso.getEdad() == null || "".equals(sospechoso.getEdad().trim())) {
		return respuesta = "109";
	}
	if(sospechoso.getCodPaisNatal() == null || "".equals(sospechoso.getCodPaisNatal().trim())) {
		return respuesta = "110";
	}
	if(sospechoso.getContactoVirus() == null || "".equals(sospechoso.getContactoVirus().trim())) {
		return respuesta = "111";
	}
	if(sospechoso.getVisitoPaisCorona() == null || "".equals(sospechoso.getVisitoPaisCorona().trim())) {
		return respuesta = "112";
	}	
	if(sospechoso.getVisitoPaisCorona().equals("1")) {
		if(sospechoso.getCodPais1() == null || "".equals(sospechoso.getCodPais1().trim())) {
			return respuesta = "113";
		}
		if(sospechoso.getFecPais1()==null || "".equals(sospechoso.getFecPais1())) {
			return respuesta = "114";
		}
		if(sospechoso.getFecIngresoPeru() == null || "".equals(sospechoso.getFecIngresoPeru().trim())) {
			return respuesta = "116";
		}
		if(sospechoso.getHorIngresoPeru() == null || "".equals(sospechoso.getHorIngresoPeru().trim())) {
			return respuesta = "117";
		}
	}
	if(sospechoso.getSintomaFiebre().equals("1") || 
			sospechoso.getSintomaTos().equals("1") || 
			sospechoso.getSintomaCongestionNasal().equals("1")||
			sospechoso.getSintomaGarganta().equals("1")||
			sospechoso.getSintomaRespiracion().equals("1")) {
		if(sospechoso.getFecInicioSintomas() == null || "".equals(sospechoso.getFecInicioSintomas())) {
			return respuesta = "115";
		}
	}	
	return respuesta;
	}
}
