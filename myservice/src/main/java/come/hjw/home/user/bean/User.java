package come.hjw.home.user.bean;

import java.io.Serializable;

import com.hjw.home.core.entity.BaseEntity;

public class User extends BaseEntity implements Serializable{
	private String name;
	private String sex;
	private int age;
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
