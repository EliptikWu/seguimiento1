package Repository;

import mapping.dtos.OrderDto;

import java.util.List;

public interface OrderRepository {
    List<OrderDto> listAllClients();
}
