<%-- 
    Document   : doctor
    Created on : Jan 3, 2022, 3:13:43 PM
    Author     : ojay
--%>
<%@page import="java.lang.String" %>
<%@page import="java.util.Map" %>
<%@page import="entities.Doctor" %>
<%@page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctors</title>
        <link rel="stylesheet" href="static/bootstrap.min.css">
        <link rel="stylesheet" href="static/icofont/icofont.min.css" />
        <link rel="stylesheet" href="static/index.css" />
        <link rel="stylesheet" href="static/students.css" />
        <meta name="viewport" content="width=device-width, initial-scale=1, max-scale=1, height=device-height"/>
    </head>

    <body>
        <% ArrayList<Doctor> doctors = (ArrayList<Doctor>) request.getAttribute("doctors");


        %>

        <div class="side position-fixed">
            <%@include file="sidebar.html" %>
        </div>
        <div class="ml-17 ">

            <div class=" container mx-auto mx-3 pt-5">
                <h3 class="mb-4 ">
                    Doctors
                </h3>
                <div class="card table-responsive">
                    <table class="table table-hover card-body">
                        <thead>
                            <tr>
                                <th scope="col">Photo</th>
                                <th scope="col"> Name </th>
                                <th scope="col"> Phone Number</th>
                                <th scope="col">Email</th>
                                <th scope="col">Actions</th>

                            </tr>

                        </thead>
                        <tbody>
                            <% for (Doctor doctor : doctors) {%>

                            <tr>
                                <td>
                                    <span
                                        class="rounded-circle bg-secondary d-flex align-items-center justify-content-center"
                                        style="width: 40px;height: 40px">
                                        <span class="btn-icon icofont-user-alt-3 fs-24 text-light"></></span>
                                    </span>
                                </td>
                                <td>
                                    <strong>
                                        <%=doctor.name%>
                                    </strong>
                                </td>
                                <td>
                                    <strong>
                                        <%=doctor.getPhone()%>
                                    </strong>
                                </td>
                                <td>
                                    <div class="d-flex align-items-center nowrap text-primary">
                                        <span class="icofont-ui-email p-0 me-2"></span>
                                        <%=doctor.getEmail()%>
                                    </div>

                                </td>
                                <td>
                                    <div class="actions">

                                        <button class="btn btn-error btn-sm rounded-circle">
                                            <span class="btn-icon icofont-ui-delete"></span>
                                        </button>
                                    </div>
                                </td>
                                <% }%>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div onclick="toggleModal()" class="add-action-box">
            <button class="btn btn-primary btn-lg btn-square rounded-circle" data-bs-toggle="modal"
                    data-bs-target="#add-appointment">
                <span class="btn-icon icofont-doctor fs-48"></></span>
            </button>
        </div>
        <div class="modal fade show" id="modal">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Add new doctor</h5>
                    </div>
                    <form action="doctors" method="post">
                        <div class="modal-body">
                            <div class="row">
                                <div class="form-group col-12 col-sm-6">
                                    <input name="name" required="true" class="form-control my-2" type="text"
                                           placeholder="full name">
                                </div>
                                <div class="form-group col-12 col-sm-6">
                                    <input name="phone" required="true" class="form-control my-2" type="text"
                                           placeholder="phone number">
                                </div>
                                <div class="form-group col-12 col-sm-6">
                                    <input name="email" required="true" class="form-control my-2" type="email"
                                           placeholder="email">
                                </div>
                                <div class="form-group col-12 col-sm-6">


                                    <select name="gender" required="true" class="form-control my-2">
                                        <option>
                                            select gender
                                        </option>
                                        <option value="male">
                                            Male
                                        </option>
                                        <option value="female">
                                            Female
                                        </option>
                                    </select>
                                </div>
                            </div>


                            <div class="modal-footer d-block">
                                <div class="actions justify-content-between">
                                    <button onclick="toggleModal()" type="button" class="btn btn-error">Cancel</button>
                                    <button type="submit" class="btn btn-info">Add doctor</button>
                                </div>
                            </div>
                    </form>
                </div>
            </div>

        </div> </div>
        <%@include file="footer.jsp" %>
    <script>
        const toggleModal = () => {
            document.getElementById("modal").classList.toggle("show-modal");

        };
    </script>
</body>

</html>

