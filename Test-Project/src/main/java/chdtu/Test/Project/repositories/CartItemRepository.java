package chdtu.Test.Project.repositories;

import chdtu.Test.Project.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,String> {
}
