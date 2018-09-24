package pa.project.backend.client.api.dto;

public class ConsultClientRequest {

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "ConsultClientRequest [key=" + key + "]";
	}
}
