package pe.gob.minsa.sospechoso.dao.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.gob.minsa.sospechoso.dao.SospechosoDao;
import pe.gob.minsa.sospechoso.model.Sospechoso;

@Repository
public class SospechosoDaoImpl extends JdbcDaoSupport implements SospechosoDao {

	private final SimpleJdbcCall registraSospechoso;
	
	@Autowired
	public SospechosoDaoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
		this.registraSospechoso = new SimpleJdbcCall(dataSource)
				.withProcedureName("USP_REGISTRA_CASOvMovil")
				.withoutProcedureColumnMetaDataAccess()
				.declareParameters(					
						new SqlParameter("@tipodoc",Types.VARCHAR),
						new SqlParameter("@numerodoc",Types.VARCHAR),
						new SqlParameter("@nombres",Types.VARCHAR),
						new SqlParameter("@app",Types.VARCHAR),
						new SqlParameter("@apm",Types.VARCHAR),
						new SqlParameter("@direccion",Types.VARCHAR),
						new SqlParameter("@codubigeo",Types.VARCHAR),
						new SqlParameter("@correo",Types.VARCHAR),
						new SqlParameter("@telefono",Types.VARCHAR),
						new SqlParameter("@sexo",Types.VARCHAR),
						new SqlParameter("@edad",Types.VARCHAR),
						new SqlParameter("@paisnatal",Types.VARCHAR),
						new SqlParameter("@contactoFamiliar",Types.VARCHAR),
						new SqlParameter("@contactoCelular",Types.VARCHAR),
						new SqlParameter("@contacto_virus",Types.VARCHAR),
						new SqlParameter("@visitoPaisCorona",Types.VARCHAR),
						new SqlParameter("@codpais",Types.VARCHAR),
						new SqlParameter("@codpais2",Types.VARCHAR),
						new SqlParameter("@codpais3",Types.VARCHAR),
						new SqlParameter("@fechapais1",Types.VARCHAR),
						new SqlParameter("@fechapais2",Types.VARCHAR),
						new SqlParameter("@fechapais3",Types.VARCHAR),
						new SqlParameter("@sint_fiebre",Types.VARCHAR),
						new SqlParameter("@sint_tos",Types.VARCHAR),
						new SqlParameter("@sint_congestion_nasal",Types.VARCHAR),
						new SqlParameter("@sint_garganta",Types.VARCHAR),
						new SqlParameter("@sint_respiracion",Types.VARCHAR),
						new SqlParameter("@codusu",Types.VARCHAR),
						new SqlParameter("@fecha_inicio_sintomas",Types.VARCHAR),
						new SqlParameter("@riesgoAdulto",Types.VARCHAR),
						new SqlParameter("@riesgoNiño",Types.VARCHAR),
						new SqlParameter("@riesgoGestante",Types.VARCHAR),
						new SqlParameter("@riesgoFamiliar",Types.VARCHAR),
						new SqlParameter("@fechaingresoperu",Types.VARCHAR),
						new SqlParameter("@horaingresoperu",Types.VARCHAR),
						new SqlParameter("@latitud",Types.VARCHAR),
						new SqlParameter("@longitud",Types.VARCHAR),
						new SqlOutParameter("@sMen",Types.VARCHAR)					
						);
		
	}
		
	@Override
	public String registraSospechoso(Sospechoso sospechoso) {
		String respuesta = null;
		
		Map<String, Object> inParam = new HashMap<String, Object>(39);
		inParam.put("@tipodoc",sospechoso.getTipDocumento());
		inParam.put("@numerodoc",sospechoso.getNumDocumento());
		inParam.put("@nombres",sospechoso.getNombres());
		inParam.put("@app",sospechoso.getApePrimer());
		inParam.put("@apm",sospechoso.getApeSegundo());
		inParam.put("@direccion",sospechoso.getDireccion());
		inParam.put("@codubigeo",sospechoso.getCodUbigeo());
		inParam.put("@correo",sospechoso.getCorreo());
		inParam.put("@telefono",sospechoso.getNumTelefono());
		inParam.put("@sexo",sospechoso.getSexo());
		inParam.put("@edad",sospechoso.getEdad());
		inParam.put("@paisnatal",sospechoso.getCodPaisNatal());
		inParam.put("@contactoFamiliar",sospechoso.getContactoFamiliar());
		inParam.put("@contactoCelular",sospechoso.getContactoCelular());
		inParam.put("@contacto_virus",sospechoso.getContactoVirus());
		inParam.put("@visitoPaisCorona",sospechoso.getVisitoPaisCorona());
		inParam.put("@codpais",sospechoso.getCodPais1());
		inParam.put("@codpais2",sospechoso.getCodPais2());
		inParam.put("@codpais3",sospechoso.getCodPais3());
		inParam.put("@fechapais1",sospechoso.getFecPais1());
		inParam.put("@fechapais2",sospechoso.getFecPais2());
		inParam.put("@fechapais3",sospechoso.getFecPais3());
		inParam.put("@sint_fiebre",sospechoso.getSintomaFiebre());
		inParam.put("@sint_tos",sospechoso.getSintomaTos());
		inParam.put("@sint_congestion_nasal",sospechoso.getSintomaCongestionNasal());
		inParam.put("@sint_garganta",sospechoso.getSintomaGarganta());
		inParam.put("@sint_respiracion",sospechoso.getSintomaRespiracion());
		inParam.put("@codusu",sospechoso.getCodUsuario());
		inParam.put("@fecha_inicio_sintomas",sospechoso.getFecInicioSintomas());
		inParam.put("@riesgoAdulto",sospechoso.getRiesgoAdulto());
		inParam.put("@riesgoNiño",sospechoso.getRiesgoNiño());
		inParam.put("@riesgoGestante",sospechoso.getRiesgoGestante());
		inParam.put("@riesgoFamiliar",sospechoso.getRiesgoFamiliar());
		inParam.put("@fechaingresoperu",sospechoso.getFecIngresoPeru());
		inParam.put("@horaingresoperu",sospechoso.getHorIngresoPeru());
		inParam.put("@latitud",sospechoso.getLatitud());
		inParam.put("@longitud",sospechoso.getLongitud());	
		
		try {
			Map<String, Object> outParam = registraSospechoso.execute(inParam);
			String sMen = (String) outParam.get("@sMen");
			logger.error("::Mensaje del SP :: ==> "+sMen);
			if(sMen.equals("ok") || sMen.equals("OK")) {
				respuesta = "0000";
			}else if(sMen.equals("001")) {
				respuesta = "001";
			}else {
				respuesta = "9999";
			}			
		} catch (Exception e) {
			logger.error(e.getMessage());
			respuesta = "9000";
		}		
		return respuesta;
	}

}
