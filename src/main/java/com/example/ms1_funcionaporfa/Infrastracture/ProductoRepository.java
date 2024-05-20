package com.example.ms1_funcionaporfa.Infrastracture;
import com.example.ms1_funcionaporfa.Domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
}