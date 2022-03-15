<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="customerModel" action="register" method="post">
<fieldset>
<legend>Enter Your Details</legend>
 <p>
<form:label for="firstname" path="firstname" >FirstName</form:label>
  <br />
      <form:input path = "firstname" />                                                                        
  </p>                                                                       
<p>
<form:label for="lastname" path="lastname" >LastName</form:label>
<br />
 <form:input  path="lastname"/>
</p>
<p>
<form:label for="username" path="username" >UserName</form:label>
<br />
<form:input path="username"/>
</p>
<p><form:label for="password" path="password" >Password</form:label>
<br />
<form:input path="password"/>
</p>

   <p>                                                                 
  <form:label for="mobileno" path="mobileno" >Mobileno </form:label>
   <br />                                                                            
    <form:input path="mobileno"/>                                                                             
</p>
   <p>                                                                              
<form:label for="alternatemobno" path="alternateMobNo" >Alternate Mobileno </form:label>
 <br />
<form:input path="alternateMobNo"/>
 </p>
<p>
<form:label for="emailid" path="emailId" >Email Id </form:label>
<br />
<form:input path="emailId"/>
</p>
<p>
Country<form:select path="country" items="${country}"></form:select>
<br />
</p>
<p>                                                                              
State<form:select path="state" items="${state}"></form:select>
<br />                                                                    
   </p>                                                                    
 <p>
City <form:select path="city" items="${city}"></form:select>                                                                          
 <br />                                                                                
 </p>
   <p>                                                                              
<form:label for="street" path="street" >Street</form:label>
   <br />                                                                              
 <form:input path="street"/>
 </p>                                                                  
<p>
<form:label for="pinCode" path="pinCode" >Pincode</form:label>                                                                   
 <br />
 <form:input path="pinCode"/>                                                                               
</p>
<p>                                                                               
<button type="submit">Submit</button>
  </p>                                                                               
 </fieldset>
</form:form>                                                                   
</body>
</html>                                                                  

                                                                                

                                                                               

                                                                               

                                                                    

                                                                     

                                                                                

                                                                               

                                                                                

                                                                    

                                                                    

                                                                               

                                                                   

                               





