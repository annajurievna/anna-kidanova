# Test plan for API-playground

## 1. Introduction
This is a test plan for API-playground., which is an API training tool for students, educators and other learners.

### 1.1 The Scope
The scope includes testing of the following sections:
- /products
- /categories
- /services
- /stores
- /healthcheck
- /version

### 1.2 Choosing tool for automation
Postman was chosen as a tool to automate testing of API-playground for the following reasons:
- I am already familiar with the tool
- Postman is convinient for sreating test suits
- Postman provides with test report

## 2. Testing strategy

### 2.1 Basic cases

**Scenario 1:** Checking version of API  
**Type:** Automated  
**Expected results:**  
1. Request returns 200 Status code  
2. Response time is less than 200ms  
3. Version is "1.1.0"  

**Scenario 2:** Checking /healthcheck request
**Type:** Automated  
**Expected results:**  
1. Request returns 200 Status code  
2. Response time is less than 200ms  
3. Request returns "uptime"  
4. Request returns "readonly"  
5. Request list of documents 
6. Request returns number of "products"  
7. Request returns number of "stores"  
8. Request returns number of "categories"  


### 2.2 Products

**Scenario 3:** Check /products request  
**Type:** Automated   
**Expected results:**  
1. Request returns 200 Status code  
2. Response time is less than 200ms  
3. Request returns number of products in "total"  
4. Request returns "limit"  
5. Request returns products in "data"   

**Scenario 4:** Check getting product by id  
**Type:** Automated  
**Expected results:**  
1. Request returns 200 Status code  
2. Response time is less than 200ms  
3. Request returns correct product by id  

**Scenario 5:** Check that API returns 404 for wrong product id  
**Type:** Automated  
**Expected results:**  
1. Request returns 404 Status code  
2. API doen't fail when id is incorrect  

**Scenario 6:** Check getting product by partial product name  
**Type:** Automated  
**Expected results:**  
1. Request returns 200 Status code  
2. Request returns correct list of products by partial product name  

**Scenario 7:** Check getting product by category name  
**Type:** Automated  
**Expected results:**  
1. Request returns 200 Status code  
2. Request returns correct list of products by category name  

**Scenario 8:** Check getting sorted products under specific category name  
**Type:** Automated  
**Expected results:**  
1. Request returns 200 Status code  
2. Request returns correct list of products by category name  
3. Request returns sorted list of products  
