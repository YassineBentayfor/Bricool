package ma.ac.emi.bricool.repositories;

import ma.ac.emi.bricool.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


<<<<<<< HEAD
    boolean existsByEmailIgnoreCase(String email);



=======
    List<Client> getByEmail(String email);
>>>>>>> a7f79a405de6835635705c37bd007ba4ab218260
}
