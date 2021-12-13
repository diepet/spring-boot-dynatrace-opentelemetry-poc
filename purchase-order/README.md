# purchase-order

This POC microservice uses an H2 in-memory database having only one table:

```sql
CREATE TABLE PURCHASE_ORDER (
	ID NUMBER(19,0), 
	USER_CODE VARCHAR2(32),
	DESCRIPTION VARCHAR2(255)
);
```

and exposes few endpoints (following the examples if the app runs locally on 8080 port):

```shell
# For creating a new purchase order
curl -X POST -H "Content-Type: application/json" -d '{ "userCode":"0001", "description":"TV Samsung" }' http://localhost:8080/api/purchaseorder

# For getting the list of all purchase orders
curl -X GET -H "Content-Type: application/json"  http://localhost:8080/api/purchaseorder

# For getting a single purchase order (last number is purchase order ID)
curl -X GET -H "Content-Type: application/json"  http://localhost:8080/api/purchaseorder/1
```

## Build instructions

Just launch 