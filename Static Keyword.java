

public class StudentTest {
    public static void main(String[] args) {
        int id;
        String name;
        int age;

         Student student1 = new Student();

         ///This method are utilit class
//        System.out.println(utilit.state);
//        System.out.println(utilit.value);

        // find  max or min number by ultilit class
//        System.out.println("max number");
//        System.out.println(utilit.max(3,5));

//        System.out.println("min number");
//        System.out.println(utilit.min(4,6));


//       ///this method are Student class
//        System.out.println(Student.getName("gaurav"));
//        System.out.println(Student.schoolName);
           // count
//         System.out.println(Student.count);
//            Student.getCount();
         // addition
//        System.out.println(Student.sum(3,6));   // this call from Student class by using static
          // subtraction
//        System.out.println(Student.subAnInt(8,6));
//

//  // school class object
//        School instance = School.getInstance();
//          System.out.println(School.multiply(3,5));
//
//


        // addition two number for not static method call
  //      StudentTest adding=new StudentTest();
  //       adding.sum(5,5);                          // this  call from this class

        // addition two number static method
         int c=sum(1,2);
         System.out.println(c);           // this  call from this class


        // find square by using static method
             int d=square(2);                    // this is call from this class
           System.out.println(d);




    }
    public static int sum(int a, int b){

        System.out.println(a+b);
        return a+b;


    }
    public static int square(int a){

        return 2*2;
    }

}




//STUDENT CLASS


package com.Jwt.Example.Jwt.Example.controller;

public class Student {



    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
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


    public static int count =0;


    public static String schoolName="DSP";


    public Student(){              //constructor use
        count++;

    }
    static{                        //block use static
        System.out.println("Hello");
    }


public static void getCount(){
    System.out.println("total number student"+ count);

}

     public static String getName(String str){
         System.out.println("name of the"+str);
         return str;
     }
    private String name;

    private int id;

    public int age;


    public static int subAnInt(int a,int b){         //subtraction of two number

        return a-b;
    }
}




//UTILIT CLASS


import java.util.Locale;

public class utilit {

// this class use and c all static method
    public static final int value;  // using final keyword its constant

     static {
         value=200;
     }

     public static String state;

     static {
         state = "maharashtra";
     }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;


    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;

        }
        return b;
    }

   }



//SCHOOL CLASS

package com.Jwt.Example.Jwt.Example.controller;

public class School {

    private  static School  school = new School();

    private School(){


    }

    public static School getInstance(){
        return school;
    }

    public static int multiply (int a,int b){
        return  a * b;

    }

}



