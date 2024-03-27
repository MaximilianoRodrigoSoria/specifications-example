package ar.com.laboratory.specificationsexample.configrations;

import ar.com.laboratory.specificationsexample.models.entities.QProducto;
import ar.com.laboratory.specificationsexample.repositories.ProductosCondition;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class QueryConditionConfig {
    public static final QProducto qProducto = QProducto.producto;
    private final @PersistenceContext EntityManager entityManager;

    @Bean
    public ProductosCondition productosCondition() {
        return new ProductosCondition(qProducto);
    }

    @Bean
    public JPAQueryFactory newJPAQueryFactory() {
        return new JPAQueryFactory(entityManager);
    }
}
