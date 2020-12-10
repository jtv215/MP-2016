package org.mp.sesion07;

public class ResidenciaDAOFactory {
	
	protected String nombreArchivo;

	public static DataAccessObject createResidenciaDAOFactory (String nombreArchivo, String tipo) {
		
		DataAccessObject dao = null;
		if (tipo.equals("ser")){
			dao = new ResidenciaSER(nombreArchivo);
		}
 
		if (tipo.equals("xml")){
			dao = new ResidenciaXML(nombreArchivo);
		}
		return dao;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
}
