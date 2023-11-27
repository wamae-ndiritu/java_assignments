# Object Oriented Programming

### Concepts Covered

- Classes
- Attributes
- Methods
- Inheritance
- Encapsulation
- Inheritance
- Polymophism
- Method Overriding & Overloading

#### Polymophism with Method Overloading

`Task: `

> Using Java programming language, implement polymorphism principal in a software program
> designed to manage tutors details in a leaning institution. Implement the concept through:
> [Tutor Class](./Tutor.java)

#### Method Overriding.

In the above code, we are implement polymorphism, a concept used in Object Oriented programming. We have the same method that is defined in multiple ways and is only binded dynamically. The method that we focus with is the work() that has been defined in the Tutor class. This method is overridden by the method defined in the TutorManager class.

#### Method Overloading.

In this example we are overloading the method get_info of the Tutor class. This happens statically, (at compile time). This allows us to have multiple method with the same name but loaded with different parameters. In the first definition of the get_info(), it takes no parameter and just prints the tutor’s details. However, in the second method, we are overloading the previous method with the parameter includeSchool, which is a boolean type; either true or false. We are using the value of this parameter, which is basically the arguments that will be passed during the method call to determine whether we’ll display the school name alongside the other general details. Since most of the details were displayed using the first implementation of the method, then we are reusing that method inside the overloaded one just to avoid repeating the same code.
