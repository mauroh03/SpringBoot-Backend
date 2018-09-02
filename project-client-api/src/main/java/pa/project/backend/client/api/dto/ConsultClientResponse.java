package pa.project.backend.client.api.dto;

public class ConsultClientResponse {
	
	private String client;

	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "ConsultClientResponse [client=" + client + "]";
	}
}
