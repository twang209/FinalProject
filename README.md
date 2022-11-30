# CSE412Project
Enviroment: Mac OS
Program Language: Java, JDK 1.8
ToolsNeed: Intellij IDEA, PostgreSQL JDBC Driver, Postgre SQL database

Before the program start:
You are expected have database with 5 tables, including marvelmovie, director, producer, actor, and oscar.


If you clone this repo:
Step:
1. Use IDEA open this project
2. use tomcat run the project
3. the website will automatically come out
4. website homepage http://localhost:8080/test_extend_war_exploded/

If you not:
Step:
1. This is an web application, need set web environment.
2. Open IDEA, create a new project
3. Right click on the project name, click add framework
4. add web application
5. click add configuration on the up right conner
6. add tomcat local, in the second deployment, add artifact
7. In the direcotory src/web/web-inf, create a new directory lib
8. put jdbc driver under lib
9. Open File/Project Structure/Module
10. click + at the right, choose JARs or directories
11. choose jdbc driver under src/web/web-inf/lib, then click apply and ok
12. run the program by tomcat
13. the website will automatically come out
14. website homepage http://localhost:8080/test_extend_war_exploded/


