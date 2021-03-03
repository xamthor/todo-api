# Todo Api

##Info

Simple Todo Api build with Java, SpringBoot, and MongoDB

### Reference 

Get: task/all

Returns an array of tasks from the database

``[
{
"id": "603ee271cc24c10cc69a8122",
"content": "Hello, World!"
},
{
"id": "603ee271cc24c10cc69a8122",
"content": "Hello, World!"
}]``

Post: task/create

Accepts a json object to create a task

``{
"content": "Hello"
}``

Get: task/id?id=603ee271cc24c10cc69a8122

returns task by id

``{
"id": "603eec86ad156b6422f6ea93",
"content": "Hello, Hello!"
}``

Post: task/update

Accepts a json object to update a task

``{
"id": "603ee271cc24c10cc69a8122",
"content": "Hello World"
}``

Delete: task/delete

Accepts a json object to delete a task

``{
"id": "603ee429a300d741ff6550eb"
}``