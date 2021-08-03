package com.bikash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikash.entity.BooksEntity;

public interface BooksRepository extends JpaRepository<BooksEntity, Integer> {

}
