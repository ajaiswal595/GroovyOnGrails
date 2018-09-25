<!doctype html>
<html>

<head>
	<title>Kiosk</title>
	<asset:stylesheet src="application.css"/>
	<script src="js/respond.js"></script>
</head>

<body>
	<g:form url="[resource:customerInstance, action:'customerLookup']" >
			<g:render template="kioskForm"/>
	</g:form>
	
	
	<g:javascript library="jquery"/>
	<asset:javascript src="application.js"/>
</body>
</html>