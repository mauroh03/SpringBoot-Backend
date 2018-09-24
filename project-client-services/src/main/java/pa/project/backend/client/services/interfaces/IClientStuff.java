package pa.project.backend.client.services.interfaces;

import pa.project.backend.client.api.dto.Client;
import pa.project.backend.client.api.dto.ConsultClientRequest;
import pa.project.backend.client.api.dto.ListClientResponse;

public interface IClientStuff {
	Client consultClient(ConsultClientRequest consultClientRequest);
	ListClientResponse consultClientList();
}
