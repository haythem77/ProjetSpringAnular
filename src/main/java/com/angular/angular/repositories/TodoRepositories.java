package com.angular.angular.repositories;

import com.angular.angular.model.Todo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepositories extends JpaRepository<Todo,Integer> {
}
