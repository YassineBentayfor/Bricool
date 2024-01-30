package ma.ac.emi.bricool.repositories;

import ma.ac.emi.bricool.entities.Client;
import ma.ac.emi.bricool.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {


<<<<<<< HEAD
    boolean existsByEmailIgnoreCase(String email);
=======
    List<Seller> getByEmail(String email);
>>>>>>> a7f79a405de6835635705c37bd007ba4ab218260
}
