package pa.project.backend.client.api.dto;

import java.util.List;

public class ListClientResponse {

	private List<Client> listClient;

	public List<Client> getListClient() {
		return listClient;
	}

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}

	@Override
	public String toString() {
		return "ListClientResponse [listClient=" + listClient + "]";
	}
}
