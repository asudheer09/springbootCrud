
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <link rel="stylesheet" href="/resources/bootstrap.min.css">
 <script type="text/javascript" src="/resources/jquery-3.3.1.min.js"></script>
 <script type="text/javascript" src="/resources/bootstrap.min.js"></script> 
  
<h1>Customers List</h1>  
    <a href="/addCustomers">Submit another message</a>

<table border="2" width="70%" cellpadding="2">  
<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Phone Number</th>
	<th>Village Name</th>
	<th>Quantity </th>
</tr>  
   <c:forEach var="customer" items="${customers}">   
   <tr>  
   <td>${customer.firstName}</td>  
   <td>${customer.lastName}</td>  
   <td>${customer.phoneNumber}</td> 
   <td>${customer.villageName}</td>  
   <td>${customer.milkQuantity}</td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  