package org.cejug.persistence.util;

import java.util.UUID;

/**
 * Sigleton que reune métodos para auxiliar na persistência de objetos.
 * @author Hildeberto Mendonca
 */
public class SuportePersistencia {
    
    private static SuportePersistencia singleton;
    
    private SuportePersistencia() {}
    
    public static SuportePersistencia getInstance() {
        if(singleton == null) {
            singleton = new SuportePersistencia();
        }
        return singleton;
    }
    
    /**
     * @return Retorna uma cadeia de caracteres de tamanho 32 para ser usada como id dos
     * objetos e chave primária no banco de dados.
     */
    public String generateEntityId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "").toUpperCase();
    }
}