Hotel Management System

A fully functional Hotel Management System developed as part of a 1-month internship at CCL, Ranchi. This project was built using Java Swing for the user interface and MySQL for database management, offering various functionalities for managing hotel operations efficiently.

Table of Contents
  •	Overview
  
  •	Features
  
  •	Class Structure
  
  •	Technologies Used
  
  •	Setup and Installation
  
  •	Usage
  
  •	Screenshots
  
  •	Contributing
  

Overview

This Hotel Management System simulates the operations of a hotel, providing functionalities for managing rooms, customers, employees, and more. The user-friendly Java Swing interface allows hotel staff to easily manage daily operations, with a MySQL database handling data storage and retrieval.

Features

  •	Room Management: Add, update, and search for rooms.
  
  •	Customer Management: Register new customers, check out customers, view customer info.
  
  •	Employee Management: Add and view employee details, including driver and manager info.
  
  •	Booking and Checkout: Book rooms for new customers and manage checkouts.
  
  •	Dashboard and Reception: Centralized control for hotel staff to handle daily tasks.

  

Class Structure


 The following classes are implemented to organize the functionalities:
 
  •	AddDriver: Manage driver information for pickups.
  
  •	AddEmployee: Add employee details.
  
  •	AddRoom: Add room details.
  
  •	Admin: Admin panel for restricted actions.
  
  •	CheckOut: Check out functionality for customers.
  
  •	Con: Database connection class (MySQL).
  
  •	CustomerInfo: Stores and retrieves customer information.
  
  •	Dashboard: Main interface for admin users.
  
  •	Department: Manage hotel departments.
  
  •	Employee: Stores and retrieves employee information.
  
  •	Login / Login2: Login screens for access control.
  
  •	ManagerInfo: Displays manager details.
  
  •	NewCustomer: Register new customers.
  
  •	Pickup: Manages customer pickups.
  
  •	Reception: Main interface for receptionist users.
  
  •	Room: Stores and retrieves room information.
  
  •	SearchRoom: Search for available rooms.
  
  •	Splash: Splash screen at startup.
  
  •	UpdateCheck: Update booking/check-in status.
  
  •	UpdateRoom: Update room status and details.
  
  
Technologies Used

  •	Java Swing: For building the graphical user interface.
  
  •	MySQL: Database management using MySQL Workbench.
  
  •	IntelliJ IDEA: IDE for project development.
  

  Setup and Installation
  
    Clone the Repository:
    
    Copy code
    
    git clone https://github.com/Jas-raj/HotelManagement.git
    
    
Open in IntelliJ IDEA:

  Open IntelliJ and select Open. Choose the project directory.
  

Setup Database:

  Use MySQL Workbench to create a database named hotel_management.
  
  Import the SQL schema and data from the /sql folder (if provided).
  
  Update the database connection details in Con.java (username, password, database name).
  
  
### MySQL Connector JAR
  To connect the application to a MySQL database, you’ll need the MySQL Connector JAR file.

  1. **Download the JAR**: You can download the MySQL Connector JAR from the [official MySQL website](https://dev.mysql.com/downloads/connector/j/).

  2. **Add to Project**: Place the downloaded `mysql-connector-java-x.x.x.jar` file in your project's library folder (e.g., `/lib`), and add it to your project’s build path:

   - In IntelliJ IDEA, go to **File > Project Structure > Libraries**, click the **+** icon, and add the JAR file.

  Replace `x.x.x` with the correct version number of the JAR file you downloaded.
  
Run the Application:

  Start the application by running the Main class or directly opening the GUI interface through Login.java.

Usage

  Login:
  
      Use the login credentials set up in the database to access the system.
	  
  Navigate through the Dashboard:
  
      The Dashboard and Reception interfaces provide access to the main features of the application.
	  
  Manage Bookings, Rooms, and Employees:
  
      Utilize the various options for managing rooms, customers, and employees as needed.

