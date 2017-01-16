
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="/w3tags.tld" prefix="www" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String path=request.getContextPath(); %>
<www:html>
<www:head>
 <script type="text/javascript">
  
  
   function gotoContact(individualId,email){
	if(!individualId){
		individualId = document.getElementById("urnId").value
	}
	
    var link="<%=path%>/contact.action?"+getParamString(individualId,email);
    window.open(link);
	return false;
  }
  
  function getParamString(individualId,email){
	var paramstring = "";
	if(email){
		paramstring= "param.email="+email
	}else{
		paramstring = "";
	}
	if(individualId != "Not available"){
		if(paramstring)
			paramstring +="&";
      paramstring+="param.individual_id="+individualId;
	}
	
    return paramstring;
  }
</script>
</www:head>
<body  id="w3-ibm-com">
<www:masthead/>
<div id="content">
	<h1 class="access">Start of main content</h1>
		<www:updatedDate/>
		<h1>Contact 360</h1>
		<br/>
		<div>
		<div>
		  <table style="width: 90%">
		      <tr>
		        <td>SalesConnect Id</td>
		        <td>Go To Contact</td>
		      </tr>
		      <tr>
		        <td><input type="text" id="urnId" value="1-3I07OP"></td>
		       <td> <input type="button" value="Submit" onclick="gotoContact()"/></td>
		      </tr>
		  </table>
		</div>
		<div>
		  <table style="width: 90%">
		    <tr>
		      <td></td>
		      <td>Individual Id</td>
		      <td>Email</td>
		      <td>SC ID</td>
		      <td>Country name</td>
		      <td>link</td>
		    </tr>
		    <c:forEach var="list" items="${searchList}" varStatus="st">
		    <tr>
		      <td>${st.index+1}</td>
		      <td>${list.individualId}</td>
		      <td>${list.email}</td>
		      <td>${list.scId}</td>
		      <td>${list.countryName}</td>
		      <td>
		        <div class="buttons">
				<span class="button-blue">
					<a href="#"  onclick="gotoContact('${list.scId != null ? list.scId : -1}','${list.email}');false">
						<img src="img/v2_assets/info.png">
					</a>
				</span>
				
			</div>
		      </td>
		      </tr>
		   </c:forEach>
		  </table>
		</div>
		</div>
		
		<www:footer/>
		
</div>
</body>
</www:html>