package com.example.SparepartsDatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SparepartsDatabase.Entity.Login;
import com.example.SparepartsDatabase.Exception.ResourceNotFoundException;
import com.example.SparepartsDatabase.Repository.LoginRepo;
import com.example.SparepartsDatabase.Service.LoginService;

@Service
public class LoginServiceimpl implements LoginService {

	@Autowired 
	LoginRepo loginrepo;
	@Override
	public Login login(String email, String passowrd) {
		// TODO Auto-generated method stub
		Login s = loginrepo.findByEmail(email);

		if (s != null) {
			if (s.getPassowrd().equals(passowrd)) {
				return s;
			} else {
				throw new ResourceNotFoundException();
			}
		} else {
			throw new ResourceNotFoundException();
		}
	}

}
