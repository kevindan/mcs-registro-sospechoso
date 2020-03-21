package pe.gob.minsa.sospechoso.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.minsa.sospechoso.dao.SospechosoDao;
import pe.gob.minsa.sospechoso.model.Sospechoso;
import pe.gob.minsa.sospechoso.service.SospechosoService;
import pe.gob.minsa.sospechoso.util.Utileria;

@Service
public class SospechosoServiceImpl implements SospechosoService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SospechosoDao _sospechosoDao;
	
	@Override
	public String registraSospechoso(Sospechoso sospechoso) {
		Utileria util = new Utileria();		
		String respuesta = "0000";		
		try {
			String respValida = util.validaEntradas(sospechoso);
			if(!(respValida.equals("0000"))) {
				return respValida;
			}
			respuesta = _sospechosoDao.registraSospechoso(sospechoso);
		} catch (Exception e) {
			logger.error(e.getMessage());
			respuesta = "9000";
		}
		return respuesta;
	}

}
