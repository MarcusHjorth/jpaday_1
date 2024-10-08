package app.daos;

import java.util.Set;

public interface IDAO<T> {
    T getByID(Integer id);
    Set<T> getAll();
    void create(T t);

    void update(T t);
    void delete(T t);
}
