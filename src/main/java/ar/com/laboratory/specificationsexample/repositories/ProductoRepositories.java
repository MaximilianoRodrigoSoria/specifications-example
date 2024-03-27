package ar.com.laboratory.specificationsexample.repositories;

import ar.com.laboratory.specificationsexample.models.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductoRepositories extends JpaRepository<Producto, Long>, JpaSpecificationExecutor<Producto> {
}
