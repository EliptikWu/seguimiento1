package service;

import domain.enums.ProductType;
import domain.models.Product;
import jdk.jfr.Category;
import mapping.dtos.ProductDto;

import java.util.Comparator;
import java.util.List;

public interface ProductService {

    List<ProductDto> lista100();

    List<ProductDto> listBaby();

    List<Product> listCheap();


    List<Product> listAllClients();
}
