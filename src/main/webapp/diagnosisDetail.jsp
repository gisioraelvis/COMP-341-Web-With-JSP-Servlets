<%@page import="java.lang.String" %>
<%@page import="java.util.Map" %>
<%@page import="entities.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diagnosis</title>
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
                    Diagnosis Detail
                </h3>
                <div class="card">
                    <div class="card-body">

                        <div class="row ">
                            <div class="col-6 my-1">
                                <h5 class="text-black-50 text-center mb-4" >Details</h5>

                                <div class="row">
                                    <div class="col-6">
                                        <strong>Patient Name:</strong>
                                        <span class="ms-4">
                                            <%=diagnosis.user.getName()%>
                                        </span>

                                    </div>
                                    <div class="col-6 my-1">
                                        <strong>Date:</strong>
                                        <span class="ms-4">
                                            <%=diagnosis.date%>
                                        </span>

                                    </div>
                                    <div class="col-12 my-1">
                                        <strong>Prescription :</strong>
                                        <span class="ms-4">
                                            <%=diagnosis.prescription%>
                                        </span>

                                    </div>
                                    <div class="col-12 my-1">
                                        <strong>Notes:</strong>
                                        <span class="ms-4">
                                            <%=diagnosis.notes%>
                                        </span>

                                    </div>      
                                </div>

                            </div>


                            <div class="col-6 table-light">
                                <h5 class="text-black-50 text-center mb-4" >Lab results</h5>

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
                                                <%=l.results%>

                                            </td>


                                        </tr>
                                        <% }%>
                                    </tbody>
                                </table>
                            </div>
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

