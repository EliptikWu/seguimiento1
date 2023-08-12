package Repository.impl;

import Repository.ClientRepository;
import Repository.OrderRepository;
import Repository.ProductRepository;
import domain.models.Client;
import domain.models.Order;
import domain.models.Product;
import mapping.dtos.OrderDto;
import mapping.mappers.ClientMapper;
import mapping.mappers.OrderMapper;
import mapping.mappers.ProductMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    List<Product> products;
    List<Client> clients;
    List<Order> orders;
    public OrderRepositoryImpl() {
        ClientRepository repoClient = new ClientRepositoryImpl();
        ProductRepository repoProduct = new ProductRepositoryImpl();

        products = ProductMapper.mapFrom(repoProduct.listAllClients());
        clients = ClientMapper.mapFrom(repoClient.listAllClients());

        OrderRepository reOrder = new OrderRepositoryImpl();
        orders = OrderMapper.mapFrom(reOrder.listAllClients());

        List<Product> orderList1 = new ArrayList<>();

        orderList1.add(products.get(0));
        orderList1.add(products.get(1));
        orderList1.add(products.get(2));
        orderList1.add(products.get(3));
        orderList1.add(products.get(4));
        orderList1.add(products.get(5));
        orderList1.add(products.get(6));
        orderList1.add(products.get(7));
        orderList1.add(products.get(8));
        orderList1.add(products.get(9));

        List<Client> customer1 = new ArrayList<>();

        customer1.add(clients.get(0));
        customer1.add(clients.get(1));
        customer1.add(clients.get(2));

        List<Order> orders = Arrays.asList(new Order(9999, "Stock", LocalDate.of(2021, 2, 13)
                        , LocalDate.of(2021, 2, 18), orderList1 = Arrays.asList
                        (products.get(1),products.get(2),products.get(3)), (Client) customer1),
                new Order(9998, "Stock", LocalDate.of(2021, 3, 13)
                        , LocalDate.of(2021, 3, 18), orderList1 = Arrays.asList
                        (products.get(1),products.get(2),products.get(3)), (Client) customer1),
                new Order(9997, "Stock", LocalDate.of(2022, 4, 13)
                        , LocalDate.of(2022, 4, 18), orderList1 = Arrays.asList
                        (products.get(1),products.get(2),products.get(3)), (Client) customer1),
                new Order(9998, "Stock", LocalDate.of(2022, 5,18)
                        ,  LocalDate.of(2022, 5, 18), orderList1 = Arrays.asList
                        (products.get(1),products.get(2),products.get(3)), (Client) customer1));

    }

    @Override
    public List<OrderDto> listAllClients() {
        return OrderMapper.mapFromDto(orders);
    }
}
