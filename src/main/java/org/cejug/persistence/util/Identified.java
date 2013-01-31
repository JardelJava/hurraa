package org.cejug.persistence.util;

/**
 * Interface para classes de entidade cujo id não é um atributo normal da entidade
 * e precisa ser gerado pela aplicação. Classes que possuem um atributo único
 * usado como id, não devem implementar esta interface.
 * @author Hildeberto Mendonca
 */
public interface Identified {
    public String getId();
    public void setId(String id);
}
