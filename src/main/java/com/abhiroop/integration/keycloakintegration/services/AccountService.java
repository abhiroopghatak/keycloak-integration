
package com.abhiroop.integration.keycloakintegration.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abhiroop.integration.keycloakintegration.pojo.AccountObject;

@Service
public class AccountService {

	public List<AccountObject> getaccounts() {
		List<AccountObject> accList = new ArrayList<AccountObject>();
		accList.add(new AccountObject(1234, "Siraj Udhav", 300000));
		accList.add(new AccountObject(8972, "Rashwin Sirmour", 430000));
		accList.add(new AccountObject(78562, "Olly Stone", 907089));
		accList.add(new AccountObject(7837642, "Ben Hoakes", 54209));
		return accList;
	}

}
