package ar.com.laboratory.specificationsexample.repositories;

import ar.com.laboratory.specificationsexample.models.entities.QProducto;
import com.querydsl.core.types.dsl.BooleanExpression;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductosCondition {

    private QProducto qProducto;

    public BooleanExpression findAll() {
        return qProducto.isActive.eq(true);
    }


}
