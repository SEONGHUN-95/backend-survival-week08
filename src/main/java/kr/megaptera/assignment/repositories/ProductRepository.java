package kr.megaptera.assignment.repositories;

import kr.megaptera.assignment.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, ProductId> {

}
