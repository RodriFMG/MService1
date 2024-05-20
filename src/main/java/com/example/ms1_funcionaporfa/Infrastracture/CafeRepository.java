package com.example.ms1_funcionaporfa.Infrastracture;
import com.example.ms1_funcionaporfa.Domain.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeRepository extends JpaRepository<Cafe,Long> {

}