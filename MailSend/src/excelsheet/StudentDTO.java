package excelsheet;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentDTO {

	
    private int studentId;
	
	private String name;
	
	
	private String mobileNo;
	
	
	private String address;
	
	public StudentDTO(){
		
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	@XmlElement
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	@XmlAttribute
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", name=" + name + ", mobileNo=" + mobileNo + ", address="
				+ address + "]";
	}

	
	
	
}
