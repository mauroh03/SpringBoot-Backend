package pa.project.backend.client.api.dto;

public class ConsultClientRequest {

	private String name;
	private String lastName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "ConsultClientRequest [name=" + name + ", lastName=" + lastName + "]";
	}
}
