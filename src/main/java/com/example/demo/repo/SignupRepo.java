package com.example.demo.repo;
import com.example.demo.model.SignupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepo extends JpaRepository<SignupModel, Long> {
}
