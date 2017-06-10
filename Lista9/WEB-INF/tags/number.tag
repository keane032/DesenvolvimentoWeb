<%@ tag language="java" pageEncoding="UTF-8"%>

<%@	attribute	name="id"	required="true"	%>	
<%@	attribute	name="name"	required="true"	%>	
<%@	attribute	name="label"	required="true"	%>	
	
<label	for="${id}">${label}</label>		
<input	type="text"	id="${id}"	name="${name}"	/>