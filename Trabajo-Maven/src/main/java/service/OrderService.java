package service;

import domain.models.Order;
import mapping.dtos.OrderDto;

import java.util.List;
import java.util.OptionalDouble;

public interface OrderService {
    List<Order> listRecent();

    double listTotal();

    OptionalDouble listPay();

    List<OrderDto> listAllClients();
}
