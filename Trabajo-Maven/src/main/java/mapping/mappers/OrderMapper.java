package mapping.mappers;

import domain.models.Order;
import mapping.dtos.OrderDto;

import java.util.List;

public class OrderMapper {
    public static OrderDto mapFrom(Order source){
        return new OrderDto(source.getId()
                , source.getStatus(),
                source.getOrderDate(),
                source.getDeliveryData(),
                source.getProducts(),
                source.getClient());
    }

    public static Order mapFrom(OrderDto source){
        return new Order(source.id(),
                source.status(),
                source.orderDate(),
                source.deliveryData(),
                source.products(),
                source.client());
    }

    public static List<Order> mapFrom(List<OrderDto>source){
        return source.parallelStream()
                .map(OrderMapper::mapFrom)
                        .toList();
    }

    public static List<OrderDto> mapFromDto(List<Order>source){
        return source.parallelStream()
                .map(OrderMapper::mapFrom)
                .toList();
    }

}
