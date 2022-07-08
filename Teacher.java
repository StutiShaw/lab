package com;
class Teacher {
	   String designation = "Teacher";
	   String collegeName = "Regent";
	   void work(){
		System.out.println("Teacher is teaching");
	   }
	}

	 class ITTeacher extends Teacher {
	   String Subject = "Python";
	   public static void main(String args[]){
		ITTeacher obj = new ITTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.Subject);
		obj.work();
	   }
	}