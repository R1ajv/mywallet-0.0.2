# mywallet-0.0.2
My wallet application with OAuth2.0 implementation with MongoDb.


How to do:

Basic Requisites:
1.	This is to create APIs with OAuth 2.0 enabled.  There should a first login with API key and password, and each request must be sent with a Bearer token.
2.	Unit Test Should be there 
3.	Integration Tests Should be covered.
4.	NOSQL Database of your choice.
5.	Use Netflix Eureka for Service Discovery
6.	Use an API Gateway and enable distributed tracing.

My Wallet Requirements:

API Description. 
1.	/createCustomers: POST  - For new user there is an API to create a new customer. 
Request:
{
  "name": "First Name + Last Name",
  "email": "Right email",
  "dob": "Date form",
  "phone": "Phone 10 digits",
  "PostCode": "Alphanumeic"
}

Response:
{
  "customerId": "CustomerId-Numeric",
  "password": "password"
}

2.	/oauthTokens –
 Pass header 
“username”: customerId and 
password: “Defaultpassword” 
received from previous API. 
Response:

{
    "access_token":"access_token"
    "scope": "customer Role",
    "token_type": "Bearer",
    "expires_in": minimum 5 minutes
}

	
3.	/credit: POST This is to add money to Customer wallet. 
Pre-requisites: 	
a.	Should be customer created - API-1.
b.	Should pass the access_token from-  API-2.
     Request:
 Header: Authorization Bearer AccessToken(API-2)
{
  "customerId": "CustomerId",
  "balance": "integer >0, cannot be negative"
}

With this API call Customer balance gets Added. 

4.	/debit: POST This is to reduce moneyfrom  Customer wallet
Pre-requisites: 	
a)	Should be customer created - API-1.
b)	Should pass the access token from-  API-2.
c)	Should have some balance debit cannot be greater than the current balance of the customer
     Request:
 Header: Authorization Bearer AccessToken(API-2)
{
  "customerId": "CustomerId",
  "balance": "integer >0, cannot be negative"
}

With this API call Customer balance gets reduced.

5.	/balances : Get Customer balance 
      Request :  /balances?customerid=
Pass the Authorization Header 
Response:  current balance of the customer

6.	/balanceshistory: 
Get Customer balance history build up for all the debits and credits 
      Request :  /balances?customerid=
Pass the Authorization Header 
Response:  
[
  {
    "customerId": "CustomerId",
    "amount": 100,
    "transType": "Debit",
    "balanceAfterTransaction": "400",
    "transDate": "30-Dec-2021",
    "Category": "RetailSHopping"
  },
  {
    "customerId": "CustomerId",
    "amount": 500,
    "transType": "Credit",
    "balanceAfterTransaction": "900",
    "transDate": "01-Jan-2022",
    "Category": "BankTransfer"
  }
]
