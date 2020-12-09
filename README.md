Instructions:

Start Springboot application in path \src\main\java\com\springboot\exercise\user\UserApplication.java
or mvn clean spring-boot:run from the application path

10 users are created and loaded to in memory DB

Retreive all user details:
curl -v localhost:8080/api/userdetails

Retreive a user detail with id:
curl -v localhost:8080/api/userdetails/1

Update an user detail:
curl -X PUT localhost:8080/api/userdetails/1 -H "Content-type:application/json" -d "{\"firstName\": \"test11\", \"lastName\": \"test11lastname\"}"
