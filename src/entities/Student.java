package entities;

public class Student {

	private Integer userCode;

	public Student(Integer usersCode) {
		this.userCode = usersCode;
	}

	public Integer getUserCode() {
		return userCode;
	}

	public void enroll(Integer userCode) {
		this.userCode = userCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userCode == null) ? 0 : userCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
			return false;
		return true;
	}
	
}
