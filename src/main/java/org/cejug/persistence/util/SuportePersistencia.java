package org.cejug.persistence.util;

import java.util.UUID;

/**
 * Sigleton que reune métodos para auxiliar na persistência de objetos.
 * @author Hildeberto Mendonca
 */
public final class SuportePersistencia {
    
    public static final SuportePersistencia INSTANCE = new SuportePersistencia();
    
    private SuportePersistencia() {}
    
    /**
     * @return Retorna uma cadeia de caracteres de tamanho 32 para ser usada como id dos
     * objetos e chave primária no banco de dados.
     */
    public String gerarIdValido() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "").toUpperCase();
    }
    
    /**
     * Verifica se o Id de uma entidade identificada não é valido para persistir 
     * no banco de dados.
     * @param identified classe de entidade que implementa a interface org.cejug.persistence.Identified.
     * @return true se o id não é válido. false se um id é válido.
     */
    public boolean isIdNotValid(Identified identified) {
        // TODO: lançar uma excessão se o parâmetro for nulo.
        if(identified == null || identified.getId() == null || identified.getId().isEmpty()) {
            return true;
        }
        return false;
    }
}