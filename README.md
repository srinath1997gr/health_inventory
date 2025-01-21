# Healthcare Inventory Managemnet System

## Project Description
The Healthcare Inventory Mangemnet system is designed to helps track health records, add and manage inventory data, helath records using CRUD operations in java, sprigboot technologies. 

## API endpoints
### 1. **Add Health Record**
- **URL**: `/api`
- **Method**: `POST`
- **Request Body**:
  ```json
  {
    "name": "Jord Doe",
    "bornDate": "1999-01-01",
    "phoneNumber": 1234567890,
    "age": 33
  }
  
- **Response**:
  ```
  Record added successfully.
  ```

### 2. **Get All Health Records**
- **URL**: `/api`
- **Method**: `GET`
- **Response**:
  ```json
  [
   {
     "id": 1,
    "name": "Jord Doe",
    "bornDate": "1999-01-01",
    "phoneNumber": 1234567890,
    "age": 33
  }
  ]
  ```

### 3. Get Health Record by ID
**URL:** `/api/{id}`  
**Method:** `GET`  
**Description:** Retrieves a specific health record by its ID.  
**Request Parameters:**  
- `id` (Path Variable): The ID of the health record to retrieve.  
**Response:**  
```json
{
     "id": 1,
    "name": "Jord Doe",
    "bornDate": "1999-01-01",
    "phoneNumber": 1234567890,
    "age": 33
}
```

### 4. **Delete Health Record by ID**
- **URL**: `/api/{id}`
- **Method**: `DELETE`
- **Request Parameters:**  
     `id` (Path Variable): The ID of the health record to retrieve. 
- **Response**:
  ```
  Record is deleted for id = 1
  ```

## Setup Instructions

  ### 1. Generate the Project
  - Go to [Spring Initializer](https://start.spring.io/).
  - Configure the project with the following settings:
    - **Project**: Maven
    - **Language**: Java
    - **Java Version**: 21
    - **Dependencies**:
      - Spring Web
      - Spring Data JPA
      - MySQL Driver
      - Project Lombok
  - Download the generated project and unzip it.

  ### 2. Configure the Database
  Update the `application.properties` file with your database credentials:

  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/healthcare_inventory
  spring.datasource.username=root
  spring.datasource.password=root123
  spring.jpa.hibernate.ddl-auto=update
  ```

  ### 3. Build and Run the Application
  - Use the following Maven commands:
    - **Clean and Install Dependencies**:
      ```bash
      mvn clean install
      ```
    - **Run the Application**:

    - Run the `main` method in your application's main class (`HealthcareInventoryApplication`) from your IDE.

## API Endpoints

  1. **Create a New Health Record**:
     - **POST**: `http://localhost:8080/api`
  2. **Get All Health Records**:
     - **GET**: `http://localhost:8080/api`
  3. **Get a Health Record by ID**:
     - **GET**: `http://localhost:8080/api/{id}`
  4. **Delete a Health Record by ID**:
     - **DELETE**: `http://localhost:8080/api/{id}`

