

package com.baeldung.daomodule;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author emaph
 */
public interface Dao<T> {

    Optional<T> findById(int id);

    List<T> findAll();

}
