package com.example.storeratings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.storeratings.model.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
}

