## JPACRUDProject
This project manages a self-created database of gym members. The user may view, add, update, delete from the database as they see necessary.

##Overview
The database that this project incorporates is filled with 15 different gym members. The database is able to store information about each gym member, including first name, last name, classes attended, favorite equipment, age, gender, and weight.

When the server is started up, the user will be presented with a home screen.  The user will be presented with the basic CRUD operations.

If the user chooses to search by ID they will be shown that specific gym member with the options to see details, update or delete that member. If the user searches by keyword, they will be shown with all the members that show that keyword in either their first or last name.

If the user chooses to add a member, that member will be added to the database and the user can choose to update or delete this member at a later time.

If the user chooses to update a member, the user will be presented with all of their details and the option to change any of those details. These changes will also change those details in the database.

If the user chooses to delete a member, that member will be permanently deleted from the database.

## Technologies used
* Spring MVC
* MySQL
* JPA
* JPQL
* CRUD operations
* Imports
* The use of Abstraction, Polymorphism, Inheritance, and Encapsulation
* For loops
* The use of "getters and setters"
* Constructors
* Interfaces
* Super classes and sub classes
* ModelAndView
* JUnit

## Lessons Learned
This project really taught me the importance of JUnit testing. Testing before creating your code allows you to fix mistakes before they become too much of an issue. In addition, I learned how important it was to test your SQL statements in a program such as MySQL or the terminal before including it into your code. Errors coming from the SQL statement are extremely difficult to track down and can be avoided quite easily.
