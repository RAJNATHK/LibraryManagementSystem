📚 Library Management System
A Java-based web application built using Jakarta Servlets, JDBC, Oracle Database, and Apache Tomcat to manage books and authors in a library.
This project follows the MVC architecture pattern (Servlet → Service → DAO → Database).

Features
Add new books
View book details by ISBN
Author management
Database integration using JDBC
Proper layered architecture (MVC)

🛠️ Technologies Used
Java
Jakarta Servlets
JDBC
Oracle Database
Apache Tomcat 10
Eclipse IDE
Git & GitHub

🗄️ Database Setup
All required SQL queries are available inside:
query.txt

Tables Used
Author_tbl
Author_code (Primary Key)
Author_name
Contact_no
Book_tbl
ISBN (Primary Key)
Book_title
Book_type (T/G)
Author_code (Foreign Key)
Book_cost

📷 Screenshots
Add book Page 
<img width="444" height="353" alt="addbook png" src="https://github.com/user-attachments/assets/285e7dd5-9956-40de-8fc1-d87fc3e288f8" />


View Book Page
<img width="391" height="446" alt="viewbook png" src="https://github.com/user-attachments/assets/6a964e76-8954-4f59-9129-0aef5393844c" />


▶️ How to Run the Project
Import project into Eclipse
Configure Apache Tomcat Server
Setup Oracle Database
Execute queries from query.txt
Run the project on server

Access application at:
http://localhost:8081/LibraryManagementSystem/Menu.html

📁 Project Structure
LibraryManagementSystem
│
├── src/main/java
│   ├── servlets
│   ├── service
│   ├── dao
│   └── util
│
├── src/main/webapp
│   ├── HTML pages
│   └── WEB-INF
│
├── query.txt
└── README.md
