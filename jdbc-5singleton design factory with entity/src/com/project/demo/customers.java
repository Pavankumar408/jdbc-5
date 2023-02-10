package com.project.demo;

import java.sql.SQLException;

import com.project.customerentity.customers1;

public interface customers {
	void savedata(customers1 customers) ;
	//void readmultipledataQuery();
	void deletedata(customers1 customers);
//	void readsinglequery();
	void updategender(customers1 customers);
	void updatealldata(customers1 customers);

}
