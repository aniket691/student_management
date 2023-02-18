# Student Management system

# Endpoints

* Get all students (GET): [https://localhost:9111/student](([localhost:9111/student](http://localhost:9111/student))

* Insert a student (POST): [localhost:9111/student](([localhost:9111/student](http://localhost:9111/student)) 
  ex,
  `{
  "id":"101",
  "address":"Nigeria",
  "age":"28",
  "college_name":"NGG",
  "department":"Mechanical",
  "name": "Raju Malodia"
  }`

* Update a student (PUT): [localhost:9111/student/{id}](([localhost:9111/student/{id}](http://localhost:9111/student/{id}))
  ex,
  `{
  "id":"101",
  "address":"Uganda",
  "age":"28",
  "college_name":"NGG",
  "department":"Mechanical",
  "name": "Raju Malodia"
  }`

* Delete a student(DELETE): [localhost:9111/student/{id}](([localhost:9111/student/{id}](http://localhost:9111/student/{id}))
