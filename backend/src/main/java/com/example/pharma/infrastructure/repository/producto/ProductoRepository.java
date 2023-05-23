package com.example.pharma.infrastructure.repository.producto;

import com.example.pharma.domain.entities.producto.Bodega;
import java.util.List;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pharma.domain.entities.producto.Producto;

import feign.Param;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
  @Query(value = "SELECT * FROM maestro_producto WHERE id_bodega = :idBodega", nativeQuery = true)
  List<Producto> findAllByIdBodega(@Param("idBodega") Long idBodega);

  Optional<Producto> findByNombre(String name);

}
