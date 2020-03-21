package pe.gob.minsa.sospechoso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import pe.gob.minsa.sospechoso.bean.ResponseRegistraSospechoso;
import pe.gob.minsa.sospechoso.model.Sospechoso;
import pe.gob.minsa.sospechoso.service.SospechosoService;

@RestController
@RequestMapping("/servicio/v0.0.1")
@Api(value = "servicioregistrosospechoso", description = "Interfáz para el registro y consulta de casos sospechosos de COVID-19")
public class SospechosoController {
	
	@Autowired
	private SospechosoService _sospechosoService;
	
	@PostMapping(value = "/registra-caso", produces = "application/json; charset=utf-8")
	public ResponseRegistraSospechoso registraCaso(@RequestBody Sospechoso sospechoso) {		
		ResponseRegistraSospechoso response = new ResponseRegistraSospechoso();
		response.setCodMensaje(_sospechosoService.registraSospechoso(sospechoso));		
		return response;
	}

}
