package pa.project.backend.client.services.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pa.project.backend.client.api.dto.ConsultClientRequest;
import pa.project.backend.client.api.dto.ConsultClientResponse;

@RefreshScope
@RestController
@RequestMapping("${bg.endpoint.base}")
public class ConsultClientController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultClientController.class);

	@RequestMapping(value = "/consultClient/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ConsultClientResponse> onConsultClientMethodPost(@RequestBody ConsultClientRequest consultClientRequest) {
		ConsultClientResponse consultClientResponse = new ConsultClientResponse();
		
		consultClientResponse.setClient(consultClientRequest.getName()+" "+consultClientRequest.getLastName());
		
		return new ResponseEntity<ConsultClientResponse>(consultClientResponse, HttpStatus.OK);
	}
}
