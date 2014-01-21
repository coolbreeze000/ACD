package at.apa_it.ACD;

import at.apa_it.ACD.service.RestService;
import at.apa_it.ACD.service.RestServiceImpl;
import at.apa_it.ACD.service.ServiceFactory;

public class ServiceFactoryImpl implements ServiceFactory{

	public RestService restService() {
		return new RestServiceImpl();
	}

}
