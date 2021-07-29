[![Build Status](https://api.travis-ci.com/den4eg007/taxi-service.svg?branch=master)](https://travis-ci.com/den4eg007/taxi-service)
# Taxi service
>Easy understanding service
 
![car](https://c0.klipartz.com/pngpicture/177/640/gratis-png-audi-a3-concesionaria-de-autos-compactos-audi.png)

##The main goal:
******************************
   The main goal of this project is to 
show how easy it is to create your own taxi 
service with an authentication system and driver 
allocation for a specific car.

####Functions that may be useful for working with controls in this application:
>- Create a new car / manufacturer / driver;
>- Display all cars / manufacturers / drivers;
>- Add driver to car;
>- Remove driver from car;
##Project based on SOLID principles and 3-layer architecture:
******************************
>- Data access layer (DAO);
>- Application layer (services);
>- Presentation layer (controllers);

##Used technologies:
******************************
>- Java 11
>-  Maven 
>-  Maven Checkstyle Plugin
>-  Javax Servlet API 
>-  JSTL 
>-  JSP
>-  JDBC
>-  Apache Tomcat
>- HTML / CSS
>-  MySQL RDBMS
>-  DI(custom injector)
>-  Log4j2

##Let`s go check the app :)

******************************
Just a few steps and go on:
- _Make a tea / coffee_;
1. Clone the project;
2. Configure your Apache Tomcat;
3. Install MySQL and MySQL Workbench; 
4. Create a schema and all the necessary tables by using the script from resources/init_db.sql in MySQL Workbench;
5. In the /util/ConnectionUtil.java change the URL, MYSQL_DRIVER, USERNAME and PASSWORD properties to the ones you specified when installing MySQL or you can use the ones that are already present;
6. After starting tomcat go to http://localhost:your port that you specified while configuring tomcat;
7. Now you can use an app and see how it`s works;
-----------------------------------
-------------------------------------
---------------------------------
- _Thank you for your attention ♥_
