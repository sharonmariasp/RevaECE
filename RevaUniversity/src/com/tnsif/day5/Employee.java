package com.tnsif.day5;

public class Employee {

 
		// TODO Auto-generated method stub
		private String Name;
		private String dept;
		private String salary;
		private int id;
		private int age;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getDept() {
			return dept;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Employee [Name=" + Name + ", dept=" + dept + ", salary=" + salary + ", id=" + id + ", age=" + age
					+ ", getName()=" + getName() + ", getDept()=" + getDept() + ", getSalary()=" + getSalary()
					+ ", getId()=" + getId() + ", getAge()=" + getAge() + "]";
		}
		
		

	}


