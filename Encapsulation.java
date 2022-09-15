Presentation Encapsulation 

-Encapsulation(Data Hiding) this is one of the OOP(Object Oriented Programming) principles (family).
								  _OOP: A design pattern of the applications in an organized and modular way.
-------------------------------------------------------------------------------------------------------------

Encapsulation:
allows us to hide information from direct access.
We limit the access to the variables by making the variable private 
and created public getter and setter methods
getter: method that is used to get/return value of that variable
setter: method that change/reassign the values of a variable


Accessmodifier											Description

-private							When the private access modifier is  applied to a class member, 
									the member  can not be accessed by code outside the class.


-public 							When the public access modifier is applied to a class member, the 
									member can be  accessed by code inside the class or  outside.




===================================Getter&Setter Example ===================================================
								•Both are public instance methods, used to protect our data and make our 
								code more secure

	- Getter is used for reading 							- Setter is used for writing (modifying) 
    															the private data (instance variable) only
 		private data (instance variable) only
    													
	-An instance return method that returns the 			-An instance method with the return type of void
		private instance variable

	-Does not pass any parameter							-Passes a parameter, and parameter will be 
																assigned to the private instance variable
	
	-Return type must match with the data type of 			-Data type of the parameter must match with the 
																data type of the private instance variable
		the private instance variable

	
	public class ClassName {


    private dataType variable1;
    private dataType variable2;

    public dataType getVariable1(){  					
												
        return variable;
    }

    public void setVariable1(dataType variable1){       
        this.variable1 = variable1;
    }

    public dataType getVariable2(){
        return variable2;
    }

    public void setVariable2(dataType variable2){
        this.variable2 = variable2;
    }
}


========================================== Getter&Setter Example(Runner) =======================================================

public class ClassNameRunner {

    public static void main(String[] args) {

        ClassName variableObj = new ClassName; ----obj 


 		variableObj.setVariable1(100);
        variableObj.setVariable2(200);

        // direct access to the variable to assign is not possible because they have private access modifier
        // use setter methods to assign


        System.out.println(variableObj.getVariable1());     
        													
        System.out.println(variableObj.getVariable2());

        // use getter methods to read/use the value

    }

}




    
