<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

</head>

    <body align="center">

        <p>
        <h4>Welcome to the Person Profiles page!</h4>
        <br>

     <table align="center" border="1px" class="table" style="width:50%">
                <thead class="thead-light">
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Position</th>
                        <th>Age</th>
                    </tr>
                </thead>

                <c:forEach var="person" items="${p}">
                <tr>
                    <td>${person.firstname}</td>
                    <td>${person.lastname}</td>
                    <td>${person.position}</td>
                    <td>${person.age}</td>
                </tr>
                </c:forEach>
            </table>

        <p align="center"><a href="welcome">Go back</a></p>



    </body>

</html>
