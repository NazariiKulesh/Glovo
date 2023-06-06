package src.main.java.com.example.glovo.contoller;

import com.example.glovo.model.Order;
import com.example.glovo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Order getId(@PathVariable int id) {
        return orderService.get(id);
    }

    @PostMapping
    public Order save(@RequestBody Order order){
        return orderService.save(order);

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        orderService.delete(id);
    }

}
