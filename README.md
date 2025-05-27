# Java Classes OOP - Simple Classes

## Introduction

In this exercise, you will work on a `ClassroomManager` application that
manages a list of students and teachers in for a school.  The main application
and menu system is already implemented in the `ClassroomManager` class, but
the `Student` and `Teacher` classes need some work.

Let's put your knowledge of java classes to work getting this application
finished and operational!

> [!NOTE]
> You may notice that the build is broken when you open the project and there are errors showing. This is because the
> `Student` and `Teacher` classes are not yet fully implemented.  Once you have implemented the `Student` and
> `Teacher` classes, the errors will disappear.

## Implementing the Teacher Class

The teacher class needs fully implemented.  If you open the `Teacher` class in
the `src/main/java/org/example` directory, you will see that the class is
empty, but contains several comments that describe the fields and methods that
need to be implemented.

Using these comments as a guide, implement the `Teacher` class with the
following fields and methods:

### Fields

| Field Name | Type   | Description              |
|------------|--------|--------------------------|
| name       | String | The name of the teacher  |
| className  | String | The name of the class the teacher teaches |

### Methods

| Method Name | Parameters | Return Type | Description                                                                    |
|-------------|------------|-------------|--------------------------------------------------------------------------------|
| getName     | None       | String      | Returns the name of the teacher                                                |
| getClassName| None       | String      | Returns the name of the class the teacher teaches                              |
| setName     | String name| void        | Sets the name of the teacher                                                   |
| setClassName| String className | void   | Sets the name of the class the teacher teaches                                 |
| toString    | None       | String      | Returns a string representation of the teacher in the format `name (className)` |

> [!TIP]
> If you get stuck, refer to the `Student` class for an example of 
> how to implement very similar fields and methods.

## Adding Methods to the Student Class

Once you have implemented the `Teacher` class, you will need to add some
functionality to the `Student` class.  The `Student` class is already
mostly implemented, you just need to add the following two methods:

### Methods

| Method Name | Parameters | Return Type | Description                                                                    |
|-------------|------------|-------------|--------------------------------------------------------------------------------|
| addAbsence | None       | void        | Adds an absence to the student's record                                        |
| addBonusPoints | double points | void | Adds bonus points to the student's grade                                       |

You should also manually verify that your solution is correct by running the
`ClassroomManager` class and interacting with the console UI in the bottom 
terminal window.  You should be able to add students and teachers, and print
the list of students and teachers to the console.  In the student menu,
you will also see options to add an absence and bonus points to a student.

