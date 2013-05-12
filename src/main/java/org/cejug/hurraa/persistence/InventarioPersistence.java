/*
 *   Hurraa http://github.com/heliofrota/hurraa/
 *
 *   This file is part of Hurraa.
 *
 *   Hurraa is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Hurraa is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Hurraa.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.cejug.hurraa.persistence;

import java.util.List;

import org.cejug.hurraa.entity.inventario.Fabricante;

/**
 * Interface de persistencia InventarioPersistence.
 *
 * @author helio frota
 *
 */
public interface InventarioPersistence {

	/**
	 * Busca fabricantes na base de dados com determinado limite e offset.
	 * @param inicio int
	 * @param limite int
	 * @return List < Fabricante >
	 */
	public List < Fabricante > getFabricantes(int inicio, int limite);

	public void saveFabricante(Fabricante fabricante);
}
