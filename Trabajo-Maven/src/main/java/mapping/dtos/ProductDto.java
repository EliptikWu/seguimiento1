package mapping.dtos;

import domain.enums.ProductType;
import domain.models.Product;

import java.util.List;

public record ProductDto(Long id,
                         String name,
                         ProductType category,

                         Double price) {
}
