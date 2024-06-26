package com.example.primeraEntrega.repository;

import com.example.primeraEntrega.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Producto, Long> {
    @Query("SELECT p FROM Producto p JOIN p.stockPlanetas sp WHERE sp.planeta.id = :planetId")
    List<Producto> findByPlanetId(@Param("planetId") Long planetId);
}
