package com.sm.market.persistence.crud;

import com.sm.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

//    Se puede hacer de forma nativa el SQL
//    @Query(value = "SELECT * FROM productos WHERE id_categoria = ? ORDER BY nombre ASC", nativeQuery = true)

//    https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
