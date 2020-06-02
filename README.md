## University-Library

### Description

A detailed implementation of a University Library using Java and MySQL. The implementation includes designing the Enhanced Entity-Relationship(EER) diagram and mapping it into a relational database schema. The relational database is then implemented in MySQL and finally transactions are performed using a Graphical Using Interface developed using Java Swing.

### Implementation Steps

The step-wise implementation is as follows:
1.  Designing the EER Diagram
2.  Mapping the ER Diagram into a Relational Database Schema
3.  Creating the database in MySQL
4.  Building a Graphical User Interface(GUI) in Java using Swing
5.  Connecting the database in MySQL to the GUI
6.  Developing transactions in Java, for example: Adding a new member, Adding a new book, etc
7.  Creating Triggers for updates, for example: Approaching memberships validity end date, etc

### Files

* `UniversityLibrary_EER.png` - EER diagram designed for the University Library
* `Schema.png` - Relational Database Schema mapped from the EER diagram
* `create_statements.sql` - List of create statements and foreign key constraints for creating the database in MySQL
* Folder `Item 1` - csv files to insert database into the database using the `insert_values.py` python file
* `Item 2.sql` - Queries to print all the data present in the database
* `Item 3.sql` - Query to prepare a report for weekly Borrowing activity by Subject area, by Author, number of copies and number of days loaned out
* Folder `Item 4,6` - GUI and snippet of the transactions to Add a new member, Add a new book, Borrow a book for the library, Return a book, Renew membership
* `Item 5.sql` - Trigger to notify members of an outstanding overdue book and membership renewals
