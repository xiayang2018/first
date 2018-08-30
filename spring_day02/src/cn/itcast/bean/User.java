package cn.itcast.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
	

	@Value("tom")
	private String name;
	private Integer age;
	@Resource(name="car2")
	private Car car;
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void init(){
		System.out.println("我是初始化方法!");
	}
	public void destory(){
		System.out.println("我是销毁方法!");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
}
