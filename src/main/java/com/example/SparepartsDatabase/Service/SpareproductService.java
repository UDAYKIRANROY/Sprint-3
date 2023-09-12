package com.example.SparepartsDatabase.Service;

import com.example.SparepartsDatabase.Entity.Spareproduct;

public interface SpareproductService {

	Spareproduct addproduct(Spareproduct spareproduct);
	
	Spareproduct updateproduct(String prodname, Spareproduct spareproduct);
	
	void deleteproduct(String prodname);
}
