package Repository.impl;

import Repository.ProductRepository;
import domain.enums.ProductType;
import domain.models.Product;
import mapping.dtos.ProductDto;
import mapping.mappers.ProductMapper;

import java.util.Arrays;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> products;

    public ProductRepositoryImpl() {
        ProductRepository reProduct = new ProductRepositoryImpl();
        products = ProductMapper.mapFrom(reProduct.listAllClients());

        List<Product> products = Arrays.asList(new Product(1010, "Pepsi", ProductType.DRINK, 2.50),
                new Product(1011, "Coca-Cola", ProductType.DRINK, 3.00),
                new Product(1012, "Rice", ProductType.FOOD, 5.00),
                new Product(1013, "Avocado", ProductType.FOOD, 3.00),
                new Product(1014, "Pork rind", ProductType.FOOD, 6.00),
                new Product(1015, "Shredded meat", ProductType.FOOD, 8.00),
                new Product(1016, "Fried egg", ProductType.FOOD, 2.00),
                new Product(1017, "Bean", ProductType.FOOD, 2.50),
                new Product(1018, "Skittles", ProductType.CANDY, 2.50),
                new Product(1019, "MilkyWay", ProductType.CANDY, 2.70)
        );
    }

    @Override
    public List<ProductDto> listAllClients() {
        return ProductMapper.mapFromDto(products);
    }
}
