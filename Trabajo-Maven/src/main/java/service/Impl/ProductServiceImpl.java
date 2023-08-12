package service.Impl;

import Repository.ProductRepository;
import Repository.impl.ProductRepositoryImpl;
import domain.enums.ProductType;
import domain.models.Product;
import mapping.dtos.ProductDto;
import service.ProductService;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ProductServiceImpl implements ProductService {

    static List<ProductDto> products;

    public ProductServiceImpl(){
        ProductRepository repoProduct = new ProductRepositoryImpl();
        products = repoProduct.listAllClients();
    }
    @Override
    public List<ProductDto> lista100() {
        return products.stream()
                .filter(pr -> pr.price() >= 3.00)
                .filter(pr -> pr.category().equals(ProductType.FOOD)).toList();
    }

    @Override
    public List<ProductDto> listBaby(){
        return products.stream()
                .filter(pr -> pr.category().equals(ProductType.DRINK)).toList();
    }

    @Override
    public List<Product> listCheap(){
        return products.stream()
                .filter(pr -> pr.category().equals(ProductType.FOOD)).min(Comparator.comparing
                        (Product::price)).stream().toList();
    }

    public void descount(List<Product> products) {
        List<Object> descount10 = products.stream()
                .filter(pr -> pr.getCategory().equals(ProductType.DRINK)).map(pr -> {
                    pr.setPrice(pr.getDiscount());
                    return pr;
                }).collect(toList());
        descount10.forEach(System.out::println);
    }


    @Override
    public List<Product> listAllClients() {
        return null;
    }

}

