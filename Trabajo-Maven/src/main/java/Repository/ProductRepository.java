package Repository;

import mapping.dtos.ProductDto;

import java.util.List;

public interface ProductRepository{

    List<ProductDto> listAllClients();
}
