# Spring-boot-backend

base_url = localhost:8080

# worker

GET 
- api/v1/workers   -> get 10 worker list 
- api/v1/workers?page={pageNumber}&size={pageSize}   -> worker list pagination route 
- api/v1/worker/{id}  -> worker details for particular id
- api/v1/worker?category={categoryId}

POST
- api/v1/workers

  body: {
    "id": 12
    "name":"abhishek sinha",
    "category": 1
  }




# Category

GET
- api/v1/category   -> get list of worker category

POST
- api/v1/category

  body: {
    "id" : 1,
    "name: "electrician"
  }

  Note:
  1. keep the name of category lowerCase
  2. check the id before posting the details 
