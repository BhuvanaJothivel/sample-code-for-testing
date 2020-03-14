package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Student {

	private String studentName;

	List<String> studentList1 = new ArrayList<String>();
	HashSet<String> hs = new HashSet<String>();
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	TreeSet<String> ts = new TreeSet<String>();

	public Student() {
		super();

	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> add(String studentName) {
		studentList1.add(studentName);
		return studentList1;
	}

	public List<String> remove(String studentName) {
		studentList1.remove(studentName);
		System.out.println(studentList1);
		return studentList1;
	}

	public Object ascending(List<String> studentList) {
		Collections.sort(studentList);		
		return studentList;
	}

	public Object descending(List<String> studentList) {
		Collections.sort(studentList);
		Collections.reverse(studentList);
		return studentList;
	}

	public Object clear(List<String> studentList) {
		studentList.clear();
		return studentList;
	}



}
