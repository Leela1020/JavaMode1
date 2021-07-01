<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Pet</title>
   <!-- <style>
.center {
    margin: 50px 300px;
}
.right {
    position: absolute;
    right: 325px;
    color: white;
}
table {
    border-spacing: 0 10px;
}
a {
    color: white;
    text-decoration: none;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}
li {
    display: block;
    float: left;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li a:hover {
    background-color: #111;
}
.button {
    width: fit-content;
    text-decoration: none;
    color: #fff;
    border: #6c757d;
    background: blue;
    border-radius: .25rem;
    font-size: 1rem;
    padding: .375rem .75rem;
    margin-top: 10px;
}
.button:hover {
    color: blue;
    background: black;
}
form {
    padding: 0px 100px;
    padding-left: 8px;
}
input[type=text], [type=number] {
    border-radius: 4px;
    border: 2px solid #DCDCDC;
    width: 100%;
}

.pettable {
    border-collapse: collapse;
    border-spacing: 0;
    border-color: #ccc;
}

.pettable td {
    font-family: Arial, sans-serif;
    font-size: 16px;
    padding: 10px 8px;
    overflow: hidden;
    word-break: normal;
    border- color: #ccc;
    color: #00FF00;
}
.pettable th {
    font-family: Arial, sans-serif;
    font-size: 16px;
    font-weight: normal;
    padding: 16px 8px;
    border-style: solid;
    border-width: 2px;
    overflow: hidden;
    word-break: normal;
    border- color: #ccc;
    color: #000000;
}

/* .pettable .pettable-4eph{background-color:#C0C0C0} */
</style> -->
</head>
<body>
    <div class="center">
        <ul>
            <li>Pet Shop</li>
            <li><a href="home">Home</a></li>
            <li><a href="addPetPage">Add Pet</a></li>
            <li><a href="myPetsPage">My Pet</a></li>
            <li><a href="login" class="right">Logout</a></li>
        </ul>
    </div>
    <form:form method="post" action="savePet" modelAttribute="pet">
        <table align="center">

            <tr>
                <td>PetName</td>
            </tr>
            <tr>
                <td><form:input path="petName" type="text" size="100%" /></td>
            </tr>
            <tr>
       <td><form:errors path="petName" cssStyle="color: #ff0000"></form:errors></td>
            </tr>

            <tr>

                <td>PetAge</td>

            </tr>
 <tr>

     <td><form:input path="petAge" type="number" size="100%" /></td>
            </tr>
            <tr>
                <td><form:errors path="petAge" cssStyle="color: #ff0000"></form:errors></td>
            </tr>
            <tr>
                <td>PetBreed</td>

            </tr>

            <tr>
                <td><form:input path="petBreed" type="text" size="100%" /></td>
            </tr>

            <tr>
                <td><form:errors path="petBreed" cssStyle="color: #ff0000"></form:errors></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add Pet" class="button"></td>

                <td><input type="submit" value="Cancel" class="button"></td>

            </tr> 
        </table>
    </form:form>
</body>
</html>