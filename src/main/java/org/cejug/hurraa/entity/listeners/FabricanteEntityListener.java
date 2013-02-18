package org.cejug.hurraa.entity.listeners;

import javax.persistence.PrePersist;

import org.cejug.hurraa.entity.inventario.Fabricante;
import org.cejug.hurraa.persistence.util.SuportePersistencia;

public class FabricanteEntityListener {

	@PrePersist
	void onPrePersist(Fabricante fabricante) {
		fabricante.setId(SuportePersistencia.INSTANCE.gerarIdValido());
	}

}
