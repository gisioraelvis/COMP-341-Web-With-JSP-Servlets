

<div class="app-footer">
    <%
        String url = request.getRequestURI();
        String[] urlItems = url.split("/");
    %>
    <div class="footer-wrap">
        <div class="row h-100 align-items-center">
            <div class="col-12 col-md-6 d-none d-md-block">

                <ul class="page-breadcrumbs">
                    <% for (String s : urlItems) {%>


                    <li class="item">
                        <a href="<%=s%>" class="link"><%=s%> </a>

                        <i class="separator icofont-thin-right"></i>
                    </li>
                    <%}%>
                </ul>
            </div>


        </div>


    </div>
</div>

