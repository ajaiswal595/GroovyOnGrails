<!doctype html>

<html>
<head>
    <title>List Product</title>
</head>

<body>

${allProduct.name} ${allProduct.sku} ${allProduct.price}

<table border="1">
    <g:each in="${allProduct}" var="thisProduct">
        <tr>
            <td>${thisProduct.name}</td>
            <td>${thisProduct.sku}</td>
            <td>${thisProduct.price}</td>
        </tr>
    </g:each>
</table>

</body>
</html>
