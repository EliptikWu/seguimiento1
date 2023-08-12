package mapping.dtos;

import domain.models.Client;
import domain.models.Product;

import java.time.LocalDate;
import java.util.List;

public record OrderDto(Long id,
                       String status,
                       LocalDate orderDate,
                       LocalDate deliveryData,
                       List<Product> products,

                       Client client) {
}
