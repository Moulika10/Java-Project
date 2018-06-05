OverView of the Project:

This application is a hotel management system which can be accessed by the admin and the EndUser.
The admin can add, edit, and delete customer information, manage menu items, generate sales reports, existing reservations.
The customer can book a reservation based on availability, check existing reservations, and order food. The Customer can request room services.

Technologies in the Project:

Created a web application using Spring MVC and deploy to Tomcat -
Created multiple jsp pages which served the Users and Admin.
Front End validations are performed using Java Script and Jquery.
Created various Resource end points using Spring Rest.
Created DAO layer and its implementation using JPA Repositories ( CRUD Repository)
Used SQL as a database for transactional activities.
Created a simple JUnit test case using H2 database and mocked data for testing CustomerRepository.

How to Run the Project:

Download the Project from GitHub link: https://github.com/MoulikaPrasad/Java-Project.git

Import the Project in Spring Tool Suite or Eclipse
Try to run the SQL queries from the file that is present in src/main/resources > dbscripts > HMS-new.sql
After running the SQL Queries try to run  HMSApplication.java file by going to src/main/java> com.moulika.HMS>HMSApplication 
After running the project as a java application try to open the application on http:localhost:8090 and login with credentials as username: moulika, password: moulika for Admin
Try to login with the End user with credentials as username: enduser, password: enduser for Admin
