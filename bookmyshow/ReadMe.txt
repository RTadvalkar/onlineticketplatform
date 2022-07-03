###Movie api usage###

Git location : 

----------------------------
Database used : H2 inmemory

Details : 
Url - http://localhost:8090/h2-console/
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
id : sa
pwd : password
-----------------------------
Testing  :

User postman collection to test this api. Service runs on port 8090
This movie api service has below endpoints :
1. add
2. modify
3. listall movies
4. list movies by rating
5. list movies by year


-----------------------------
Docker build command to build image of movie api

Go to parent folder where Dockerfile is placed 

docker build -t movie-api

To run container image 

docker run movie-api -p 8090:8090

----------------------------

