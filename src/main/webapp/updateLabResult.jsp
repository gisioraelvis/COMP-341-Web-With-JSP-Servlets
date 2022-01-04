<%@page import="java.lang.String" %>
<%@page import="java.util.Map" %>
<%@page import="entities.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Lab Result</title>
        <link rel="stylesheet" href="static/bootstrap.min.css">
        <link rel="stylesheet" href="static/icofont/icofont.min.css" />
        <link rel="stylesheet" href="static/index.css" />
        <link rel="stylesheet" href="static/students.css" />
        <meta name="viewport" content="width=device-width, initial-scale=1, max-scale=1, height=device-height"/>
    </head>

    <body>
        <%
            Diagnosis diagnosis = (Diagnosis) request.getAttribute("diagnosis");

        %>

        <div class="side position-fixed">
            <%@include file="sidebar.html" %>
        </div>
        <div class="ml-17 ">

            <div class="container  mx-auto mx-3 pt-5">

                <h3 class="mb-4">
                   Update Lab Result
                </h3>
                <div class="card">
                    <div class="card-body">
                        
                                    <div class="col-6 mb-3">
                                        <strong>Patient Name:</strong>
                                        <span class="ms-4">
                                            <%=diagnosis.user.getName()%>
                                        </span>

                                    </div>
                        <div class="table-light">
                            <form method="post" action="<%="lab-update?id=" +  diagnosis.id %>">
                                <table class="table table-hover card-body">
                                    <thead>
                                        <tr>
                                            <th scope="col">Test </th>
                                            <th scope="col"> Result</th>




                                        </tr>

                                    </thead>
                                    <tbody>
                                        <% for (Lab l : diagnosis.lab) {%>

                                        <tr>
                                            <td
                                                <strong>
                                                <%=l.test%>
                                                </strong>
                                            </td>


                                            <td>
                                                <input class="form-control" name="<%=l.test%>" type="text">



                                            </td>


                                        </tr>
                                        <% }%>
                                    </tbody>
                                </table>
                                    <input  type="submit" value="Update Result" class="btn btn-info">     
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="footer.jsp" %>
        <script>

        </script>
    </body>

</html>


