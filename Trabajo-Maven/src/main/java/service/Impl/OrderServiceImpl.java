package service.Impl;

import domain.models.Order;
import mapping.dtos.OrderDto;
import service.OrderService;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class OrderServiceImpl implements OrderService {

    static List<OrderDto> orders;

    @Override
    public List<Order> listRecent(){
        return orders.stream().sorted(Comparator.comparing(Order::orderDate)).toList();
    }

    @Override
    public double listTotal(){
        return orders.stream().filter(pr -> pr.orderDate().isEqual
                (LocalDate.of(2021, 2, 13))).mapToDouble(Order::aleluya).sum();
    }

    @Override
    public OptionalDouble listPay(){
        return orders.stream().filter(pr -> pr.orderDate().isEqual
                (LocalDate.of(2021, 2, 13))).mapToDouble(Order::aleluya).average();
    }

    @Override
    public List<OrderDto> listAllClients() {
        return null;
    }
}
