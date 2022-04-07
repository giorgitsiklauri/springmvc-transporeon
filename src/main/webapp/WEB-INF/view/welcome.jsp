<html>
<head>

</head>

    <body align="center">

        <p>
        Welcome dear user!
        <br>
        Please fill in the form:

        <form action="/profile/create" method="post">
            <input type="text" name="firstname"/><br>
            <input type="text" name="lastname"/><br>
            <input type="text" name="position"/><br>
            <input type="text" name="age"/><br>
            <input type="submit" value="Send data!"/>
        </form>
        </p>



            <p>
            Model Attribute Form example:
                <br>
                Please fill in the form:

                <form action="/ma-example" method="post">
                    <input type="text" name="firstname"/><br>
                    <input type="text" name="lastname"/><br>
                    <input type="text" name="position"/><br>
                    <input type="text" name="age"/><br>
                    <input type="submit" value="Send data!"/>
                </form>
                </p>

    ${footer}
    </body>

</html>
