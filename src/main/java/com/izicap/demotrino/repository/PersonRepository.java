package com.izicap.demotrino.repository;



import com.izicap.demotrino.entities.Person;
import com.izicap.demotrino.entities.ShopUserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(nativeQuery = true,value = "insert into deltaperson (name, age, email) values ('mlk',0,'ynsàhkm.new')")
    Person saveOnePersonTest();
}
