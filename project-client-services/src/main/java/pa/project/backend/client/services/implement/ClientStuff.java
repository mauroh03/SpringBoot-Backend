package pa.project.backend.client.services.implement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import pa.project.backend.client.api.dto.Client;
import pa.project.backend.client.api.dto.ConsultClientRequest;
import pa.project.backend.client.api.dto.ListClientResponse;
import pa.project.backend.client.services.interfaces.IClientStuff;

@Service
public class ClientStuff implements IClientStuff {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClientStuff.class);

	@Value("${project.json.route}")
	private String jsonRoute;
	
	@Value("${project.json.file}")
	private String jsonFile;

	@Override
	public Client consultClient(ConsultClientRequest consultClientRequest) {
		Client response = new Client();
		HashMap<String,Client> map = new Gson().fromJson(jsonFile, new TypeToken<HashMap<String, Client>>(){}.getType());
		
		if(map.containsKey(consultClientRequest.getKey())) {
			Client element = map.get(consultClientRequest.getKey());
			response = element;
		}
		
		return response;
	}

	@Override
	public ListClientResponse consultClientList() {
		ListClientResponse listClientResponse = new ListClientResponse();
		List <Client> list = new ArrayList<>();
		HashMap<String,Client> map = new Gson().fromJson(jsonFile, new TypeToken<HashMap<String, Client>>(){}.getType());
		list.addAll(map.values());
		listClientResponse.setListClient(list);
		
		return listClientResponse;
	}

}
