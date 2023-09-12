package com.example.SparepartsDatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SparepartsDatabase.Entity.Spareproduct;
import com.example.SparepartsDatabase.Exception.ResourceNotFoundException;
import com.example.SparepartsDatabase.Repository.SpareproductRepo;
import com.example.SparepartsDatabase.Service.SpareproductService;
@Service
public class SpareproductServiceimpl implements SpareproductService {

	@Autowired
	SpareproductRepo spareproductrepo;

	@Override
	public Spareproduct addproduct(Spareproduct spareproduct) {
		// TODO Auto-generated method stub
		return spareproductrepo.save(spareproduct);
	}

	@Override
	public Spareproduct updateproduct(String prodname, Spareproduct spareproduct) {
		// TODO Auto-generated method stub
		Spareproduct s1 = spareproductrepo.findByName(prodname);

		if (s1 != null) {

			s1.setProddesc(spareproduct.getProddesc());
			;// old to new set
			s1.setProdlink(spareproduct.getProdlink());
			;
			return spareproductrepo.save(s1);
		} else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void deleteproduct(String prodname) {
		// TODO Auto-generated method stub

Spareproduct s2 = spareproductrepo.findByName(prodname);
		
		if(s2!=null) {
			spareproductrepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}	
	}

}
