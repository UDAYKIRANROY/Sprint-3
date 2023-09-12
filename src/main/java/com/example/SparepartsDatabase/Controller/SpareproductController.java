package com.example.SparepartsDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.SparepartsDatabase.Entity.Spareproduct;
import com.example.SparepartsDatabase.Service.SpareproductService;

@RestController
public class SpareproductController {

	@Autowired
	SpareproductService spareproductservice;
	
	@PostMapping("/post")
	public Spareproduct addProducts(@RequestBody Spareproduct spareproduct) {
		
		return spareproductservice.addproduct(spareproduct);
	}
	
	@PutMapping("/update")
	public Spareproduct update(@RequestHeader String prodname, @RequestBody Spareproduct spareproduct) {

		return spareproductservice.updateproduct(prodname, spareproduct);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String prodname) {
		spareproductservice.deleteproduct(prodname);
		return "data deleted";
	}
}
