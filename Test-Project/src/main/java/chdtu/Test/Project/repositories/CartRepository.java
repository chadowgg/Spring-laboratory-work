package chdtu.Test.Project.repositories;

import chdtu.Test.Project.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart,String> {
    Optional<Cart> findByCustomerId(Long customerId);
}
