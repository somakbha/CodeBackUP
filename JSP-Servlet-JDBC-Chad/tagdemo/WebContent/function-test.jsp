<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>



<html>
<body>

<c:set var="data" value="luv2code" />

Length of the String <b>${data}</b> is: ${fn:length(data)}

<br></br>

UpperCase version of the string <b>${data}</b> is:${fn:toUpperCase(data) }

<br></br>

Does the string <b>${data}</b> starts with <b>"luv"</b> ?:${fn:startsWith(data, "luv") }

</body>




</html>