
public class Student {
	private int sId;
	private String Name;
	private String cName;
	private String Password;

	public void setsId(int sId) {
		this.sId = sId;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getsId() {
		return sId;
	}

	public String getName() {
		return Name;
	}

	public String getcName() {
		/*if(key.equals(this.cName)) {
			return key;
		}*/
		return cName;
	}

	public String getPassword() {
		return Password;
	}

}