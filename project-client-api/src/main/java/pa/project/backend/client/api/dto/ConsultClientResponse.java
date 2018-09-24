package pa.project.backend.client.api.dto;

import java.util.ArrayList;
import java.util.List;

public class ConsultClientResponse {

	private List<Client> clientList = new ArrayList<>();
	private Boolean response;

	public List<Client> getClientList() {
		return clientList;
	}

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}

	public Boolean getResponse() {
		return response;
	}

	public void setResponse(Boolean response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ConsultClientResponse [clientList=" + clientList + ", response=" + response + "]";
	}
}
