package pa.project.backend.client.services.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pa.project.backend.client.api.dto.Client;
import pa.project.backend.client.api.dto.ConsultClientRequest;
import pa.project.backend.client.api.dto.ListClientResponse;
import pa.project.backend.client.services.interfaces.IClientStuff;

@RefreshScope
@RestController
@RequestMapping("${project.base.endpoint}")
public class ConsultClientController {
	
	@Autowired
	IClientStuff clientStuff;

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultClientController.class);

	@RequestMapping(value = "/consultClient/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Client> consultClientMethodPost(@RequestBody ConsultClientRequest consultClientRequest) {
		Client consultClientResponse = new Client();
		consultClientResponse = clientStuff.consultClient(consultClientRequest);
		return new ResponseEntity<Client>(consultClientResponse, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getListClient/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ListClientResponse> getClientListMethodPost() {
		return new ResponseEntity<ListClientResponse>(clientStuff.consultClientList(), HttpStatus.OK);
	}
}
