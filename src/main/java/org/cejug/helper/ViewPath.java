package org.cejug.helper;

/**
 * Classe utilitária não instanciável para guardar paths das views.
 *
 * @author helio frota
 *
 */
public final class ViewPath {

	/**
	 * Construtor privado.
	 */
	private ViewPath() {

	}

	public static final String INDEX = "/index.jsp";
	public static final String LOGIN = "/login.jsp";
	public static final String MAIN = "/main.jsp";
	public static final String ADMINISTRACAO = "/administracao/administracao.jsp";
	public static final String INVENTARIO = "/administracao/inventario/inventario.jsp";
	public static final String FABRICANTES = "/administracao/inventario/fabricantes.jsp";

}
