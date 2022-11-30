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
![image](https://user-images.githubusercontent.com/58164449/204931298-e6227307-423b-43e4-a4f0-5a33d1587882.png)
3. Right click on the project name, click add framework
4. add web application
![image](https://user-images.githubusercontent.com/58164449/204931329-0992206d-6f3b-4a1e-955f-cb5237e88ffa.png)
5. click add configuration on the up right conner
![image](https://user-images.githubusercontent.com/58164449/204931354-465de3b9-23aa-4d8b-b595-ca5adf1f8430.png)
6. add tomcat local, in the second deployment, add artifact
![image](https://user-images.githubusercontent.com/58164449/204931369-bca6c9af-1bad-4762-9ef0-5ab2db00f24c.png)
![image](https://user-images.githubusercontent.com/58164449/204931378-8b501549-3531-4a08-b5e2-04c0c2bec7ea.png)
7. In the direcotory src/web/web-inf, create a new directory lib
8. put jdbc driver under lib
9. Open File/Project Structure/Module
10. click + at the right, choose JARs or directories
![image](https://user-images.githubusercontent.com/58164449/204931414-2465bdd2-0dad-488f-9a81-87aa78826af7.png)
11. choose jdbc driver under src/web/web-inf/lib, then click apply and ok
![image](https://user-images.githubusercontent.com/58164449/204931428-8a67c622-979b-48c8-9fb4-6a17d2fb61d4.png)
12. run the program by tomcat
13. the website will automatically come out
14. website homepage http://localhost:8080/test_extend_war_exploded/


