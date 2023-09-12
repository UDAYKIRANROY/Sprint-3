package com.example.SparepartsDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.SparepartsDatabase.Entity.Spareproduct;

@Repository
public interface SpareproductRepo extends JpaRepository<Spareproduct, Integer> {

	@Query(value =  "select * from Spareproduct where prodname =?" , nativeQuery = true)
	Spareproduct findByName(String prodname);
}
