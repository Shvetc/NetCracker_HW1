# NetCracker_HW1

-----------------------------------------Part 1----------------------------------------------

                Implement Java classes according to the UML diagrams given below

1. [Circle class](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop/geomFigures/Circle.java)

![image](https://user-images.githubusercontent.com/101325108/179971548-5a73f03b-d9b7-499d-be87-4290564187d3.png)

2. [Rectangle class](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop/geomFigures/Rectangle.java)

![image](https://user-images.githubusercontent.com/101325108/179971650-ef11cd06-db37-4c4a-8601-a5d3279b94f0.png)


3. [Employee class](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop/employee/Employee.java) 

 ![image](https://user-images.githubusercontent.com/101325108/179971706-92a45f44-6376-4923-a60b-1c70885eff1f.png)


4. [Book class](https://github.com/Shvetc/NetCracker_HW1/tree/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop/library)

![image](https://user-images.githubusercontent.com/101325108/179971749-4257c856-e499-44b8-90bd-e8b44285b571.png)


5. [MyPoint class](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop/geomFigures/MyPoint.java)

![image](https://user-images.githubusercontent.com/101325108/179971791-3794ce0b-b62f-410f-8e3f-b78d741292be.png)


6. [MyTriangle class](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop/geomFigures/MyTriangle.java)

![image](https://user-images.githubusercontent.com/101325108/179971832-9412ee04-1ed8-41b8-afe5-6e78222addf2.png)


-----------------------------------------Part 2----------------------------------------------

                       1. Implement a class for working with complex numbers

[MyComplex class](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop2/compex/MyComplex.java)

![image](https://user-images.githubusercontent.com/101325108/179972606-8794c5ae-f2fd-4cb7-886b-d314a9f5d03a.png)


• *The default MyComplex constructor creates a number of the form 0.0 + 0.0

• isReal() and isImaginary() check whether the number contains real and imaginary parts.

• It is necessary to redefine the equals method so that it returns true if the real and imaginary parts of two complex numbers coincide.

• The magnitude() method returns the modulus of a complex number

• The argument() method returns the argument of a complex number, in radians

• The AddNew(MyComplex right) and subtractNew(MyComplex right) methods add/subtract from/from the current number (this object) and the calculation result is returned as a newly created MyComplex object (i.e. the fields in this do not change, but a new object is created)

• The conjugate() method returns a MyComplex object of a complex number, paired with the current one (i.e. with this)







                           2. Implement a class for working with polynomials

[MyPolynomial class](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop2/polynom/MyPolynomial.java)
 
 ![image](https://user-images.githubusercontent.com/101325108/179972804-5bade9a6-8989-441f-a78d-314ccba47674.png)


• A constructor with a variable number of arguments, creates a polynomial of degree n. In order to create a polynomial of degree n, the constructor must pass an array of size n+1 to the input, the coefficient c0 corresponds to the index 0

• * The getDegree() method returns the degree of the polynomial

• * The toString() method returns a string representation of the polynomial object in the form cn^n+cn-1x^(n-1)+...+c1 x+c0

• * The add() and multiply() methods add/multiply the current polynomial (this) with the specified one, and as a result return a new object of the MyPolynomial class







                            3.Implement a class that simulates the movement of the ball

[Ball class](https://github.com/Shvetc/NetCracker_HW1/tree/main/TasksOOP/src/com/netcracker/projects/tasks/taskoop2/movingBall)


 ![image](https://user-images.githubusercontent.com/101325108/179972892-e2b2b4cb-928e-4f9e-b18b-7cfd39ab2340.png)

• Variables x,y correspond to the coordinates of the center of the ball, radius – the radius of the ball

• xDelta (Δx) and YDelta (Δy) – correspond to the movement of the ball by a given step (they can take positive and negative values)

• The values x, y, radius, speed of movement, and direction of movement are passed to the constructor (accepts values from -1800 to +1800 ) See the figure below



![image](https://user-images.githubusercontent.com/101325108/179972937-b264622b-eeb9-42e9-8b53-e52fc09ddf13.png)



• * The speed and movement of the ball are related to the following relations:

Δx = d * cos(ϑ)

Δy = - d * sin(ϑ)


• The move() method moves the ball by a step x=x+Δx, y = y+Δy (or you can briefly write x += Δx)

• The reflectHorizontal() method changes the direction of movement of the ball horizontally to the opposite (the ball bounces off the horizontal wall), as follows: Δx=- Δx, Δy does not change

• The reflectVertical() method reverses the vertical direction of the ball (the ball bounces off the vertical wall), as follows: Δy=- Δy, Δx does not change

To test the written class, we will create an auxiliary Container class



![image](https://user-images.githubusercontent.com/101325108/179973032-984d30f0-22e2-4b8a-ab87-5eacc6f53dec.png)




• The Container class is a rectangular container or box where the ball is placed. The starting point with a point (0,0) is located in the upper left corner:


![image](https://user-images.githubusercontent.com/101325108/179973147-f4a5c2d5-5b49-4b3c-ae81-65d3b697c033.png)



• * Coordinates (x1,y1) and (x2,y2) correspond to the upper left and lower right corners of the container.

• The constructor takes as input arguments the coordinates (x,y) of the upper-left corner, width width and height height based on these calculations, the coordinates (x2,y2)

are calculated • * The collide with(Ball ball) method checks whether this ball is located within the boundaries of the container or not (taking into account radius) and returns true or false



In the class containing the main method, it is necessary to test the functionality of Ball and Container by calling the move(), collidesWidth(), etc. methods.




-----------------------------------------Part 3----------------------------------------------

                --> Horstmann_C_S_Core_Java_SE_9_for_the_Impatient_2nd_Edition_2018 <--



*********************************************************
[Chapter 1: FUNDAMENTAL PROGRAMMING STRUCTURES](https://github.com/ElizbethK/Hometask2/tree/main/project2/chapter1)

*********************************************************

[ex.2:](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/chapter1/Normalization.java)
Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try
it first with the % operator, then with floorMod.


[ex.6:](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/chapter1/Ex6.java)
Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
BigInteger. Compute the factorial of 1000.



[ex.8:](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/chapter1/Ex8.java)
Write a program that reads a string and prints all of its nonempty
substrings.



[ex.13:](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/chapter1/Lottery.java)
[Main](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/MainEx13.java)
Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the element.
Repeat six times. Print the result in sorted order.



[ex.14:](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/chapter1/MagicSquare.java)
[Main](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/MainEx14.java)
Write a program that reads a two-dimensional array of integers and determines whether it is a magic square (that is, whether the sum of all
rows, all columns, and the diagonals is the same). Accept lines of input
that you break up into individual integers, and stop when the user enters
a blank line. For example, with the input
16 3 2 13

5 10 11 8

9 6 7 12

4 15 14 1

(Blank line)

your program should respond affirmatively.




*********************************************************

[Chapter 2: OBJECT-ORIENTED PROGRAMMING](https://github.com/ElizbethK/Hometask2/tree/main/project2/chapter2)

*********************************************************

[ex.5:](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/chapter2/Point.java)
 Implement an immutable class Point that describes a point in the plane.
Provide a constructor to set it to a specific point, a no-arg constructor to
set it to the origin, and methods getX, getY, translate, and scale. The translate
method moves the point by a given amount in x- and y-direction. The
scale method scales both coordinates by a given factor. Implement these
methods so that they return new points with the results. For example,
Point p = new Point(3, 4).translate(1, 3).scale(0.5);
should set p to a point with coordinates (2, 3.5).


[ex.9:](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/chapter2/Car.java)
Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of
miles, to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not


[ex.13:](https://github.com/Shvetc/NetCracker_HW1/blob/main/TasksOOP/src/com/netcracker/projects/tasks/horstmann/chapter2/Ex13.java)
Download the JAR file for OpenCSV from http://opencsv.sourceforge.net. Write
a class with a main method that reads a CSV file of your choice and prints
some of the content. There is sample code on the OpenCSV website. You
haven’t yet learned to deal with exceptions. Just use the following header
for the main method:
public static void main(String[] args) throws Exception
The point of this exercise is not to do anything useful with CSV files, but
to practice using a library that is delivered as a JAR file.



*********************************************************
[Chapter 3: INTERFACES AND LAMBDA EXPRESSIONS](https://github.com/ElizbethK/Hometask2/tree/main/project2/chapter3)

*********************************************************

[ex.1:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter3/Measurable.java)
Provide an interface Measurable with a method double getMeasure() that measures an object in some way. Make Employee implement Measurable. Provide
a method double average(Measurable[] objects) that computes the average
measure. Use it to compute the average salary of an array of employees.

[ex.2:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter3/Measurable.java)
Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with
the largest salary. Why do you need a cast?

[ex.4:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter3/IntSequence.java)
Implement a static of method of the IntSequence class that yields a sequence
with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
sequence with six values. Extra credit if you return an instance of an
anonymous inner class.

[ex.5:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter3/IntSequence.java)
Add a static method with the name constant of the IntSequence class that
yields an infinite constant sequence. For example, IntSequence.constant(1)
yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
lambda expression
