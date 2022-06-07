package cesar.next.aula21.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cesar.next.aula21.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
