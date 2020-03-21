package pe.gob.minsa.sospechoso.bean;

import java.io.Serializable;

public class ResponseRegistraSospechoso implements Serializable{

	private static final long serialVersionUID = 1L;

	private String codMensaje;
	
	public ResponseRegistraSospechoso() {
		
	}

	public ResponseRegistraSospechoso(String codMensaje) {
	
		this.codMensaje = codMensaje;
	}

	public String getCodMensaje() {
		return codMensaje;
	}

	public void setCodMensaje(String codMensaje) {
		this.codMensaje = codMensaje;
	}

	@Override
	public String toString() {
		return "ResponseRegistraSospechoso [codMensaje=" + codMensaje + "]";
	}
	
}
