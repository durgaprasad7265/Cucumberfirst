@Tag
Feature:
As admin user want to verify customer and supplier modules
@Supplier
Scenario Outline:
As Admin user validate supplier
Given Users launch browser
When user launch url
When wait for username with "xpath" and "//input[@id='username']" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When Click login button with "id" and "btnsubmit"
When  Wait for logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]" and "10"
Then Validate Title with "Dashboard Stock Accounting"
When Wait for supplier link with "xapath" and "(//a[contains(normalize-space(),'Suppliers')])[2]" and "10"
When Click Suppier link with "xpath" and "(//a[contains(normalize-space(),'Suppliers')])[2]"
When wait for Add Icon with "xapth" and "(//span[contains(@data-phrase,'AddLink')])[1]" and "10"
When Click Add Icon with "xpath" and "(//span[contains(@data-phrase,'AddLink')])[1]"
When wait for supplier number with "name" and "x_Supplier_Number" and "10"
When Capture Supplier number with "name" and "x_Supplier_Number"
When Enter in "<suppliername>" with "name" and "x_Supplier_Name"
When Enter in "<Address>" with "name" and "x_Address"
When Enter in "<City>" with "name" and "x_City"
When Enter in "<Country>" with "name" and "x_Country"
When Enter in "<Contactperson>" with "name" and "x_Contact_Person"
When Enter in "<Phonenumber>" with "name" and "x_Phone_Number"
When Enter in "<Email>" with "name" and "x__Email"
When Enter in "<mobilenumber>" with "name" and "x_Mobile_Number"
When Enter in "<Notes>" with "name" and "x_Notes"
When Click Add button with "id" "btnAction"
When Wait for Confirm ok button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When Click Confirm ok button with "xapth" and "//button[normalize-space()='OK!']"
When Wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When Click Alert ok button with "xapth" and "(//button[starts-with(text(),'OK')])[6]"
Then Validate Supplier number
When Close browser
Examples:
 |suppliername|Address|City|Country|Contactperson|Phonenumber|Email|Mobilenumber|Notes|
 |Durga4|Ameerpet45|Hyderabad678|India|Qedge|1234567890|Test@gmail.com|56789023455|I am new supplier|
  |Durga5|Ameerpet67|Hyderabad345|India|Qedge|1234567890|Test@gmail.com|56789023455|I am new supplier|
  |Durga3|Ameerpet89|Hyderabad234|India|Qedge|1234567890|Test@gmail.com|56789023455|I am new supplier|
  |Durga8|Ameerpet12|Hyderabad897|India|Qedge|1234567890|Test@gmail.com|56789023455|I am new supplier|
  |Durga9|Ameerpet78|Hyderabad675|India|Qedge|1234567890|Test@gmail.com|56789023455|I am new supplier|
 @Customer
 Scenario Outline:
Validate Customer with multiple data
Given Users launch browser
When user launch url
When wait for username with "xpath" and "//input[@id='username']" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When Click login button with "id" and "btnsubmit"
When  Wait for logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]" and "10"
Then Validate Title with "Dashboard Stock Accounting"
When Wait for customer link with "xapath" and "(//a[contains(text(),'Customers')])[2]" and "10"
When Click customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
When wait for Add Icon with "xapth" and "(//span[contains(@data-phrase,'AddLink')])[1]" and "10"
When Click Add Icon with "xpath" and "(//span[contains(@data-phrase,'AddLink')])[1]"
When wait for customer number with "name" and "x_Customer_Number" and "10"
When Capture customer number with "name" and "x_Customer_Number"
When Enter in "<customer>" with "name" and "x_Customer_Name"
When Enter in "<Address>" with "name" and "x_Address"
When Enter in "<City>" with "name" and "x_City"
When Enter in "<Country>" with "name" and "x_Country"
When Enter in "<Contactperson>" with "name" and "x_Contact_Person"
When Enter in "<Phonenumber>" with "name" and "x_Phone_Number"
When Enter in "<Email>" with "name" and "x__Email"
When Enter in "<mobilenumber>" with "name" and "x_Mobile_Number"
When Enter in "<Notes>" with "name" and "x_Notes"
When Click Add button with "id" "btnAction"
When Wait for Confirm ok button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When Click Confirm ok button with "xapth" and "//button[normalize-space()='OK!']"
When Wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When Click Alert ok button with "xapth" and "(//button[starts-with(text(),'OK')])[6]"
Then Validate customer number
When Close browser
 Examples:
|Customername|Address|City|Country|Contactperson|Phonenumber|Email|mobilenumber|Notes|
|Prasad2|Gachibowli56|hyderabad789|India|Qedgetech|3234456788|prasad@gamail.com|7686953456|i am new customer|
|Prasad8|Gachibowli78|hyderabad987|India|Qedgetech|3234456788|prasad@gamail.com|7686953456|i am new customer|
|Prasad9|Gachibowli23|hyderabad456|India|Qedgetech|3234456788|prasad@gamail.com|7686953456|i am new customer|
|Prasad7|Gachibowli45|hyderabad765|India|Qedgetech|3234456788|prasad@gamail.com|7686953456|i am new customer|
|Prasad6|Gachibowli12|hyderabad234|India|Qedgetech|3234456788|prasad@gamail.com|7686953456|i am new customer|