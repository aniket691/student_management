# student_management
To run the project:
localhost:9111/student:

# EndPoints:
1. (localhost:9111/student) :  method get : get all students
<br>
2. (localhost:9111/student) : method post : insert a student
ex, json object for query : 
{
    "id":"101",
    "address":"Nigeria",
    "age":"28",
    "college_name":"NGG",
    "department":"Mechanical",
    "name": "Raju Malodia"
}
<br>
3. (localhost:9111/student/{id}) : method put : update student
ex, Json object for query ; 
{
    "id":"101",
    "address":"Uganda",
    "age":"28",
    "college_name":"NGG",
    "department":"Mechanical",
    "name": "Raju Malodia"
}
<br>
4. (localhost:9111/student/{id}) : method delete : delete student

