<%-- Document : Home Created on : Jan 2, 2022, 11:53:14 AM Author : ojay --%>

  <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
      <link rel="stylesheet" href="static/bootstrap.min.css">
      <link rel="stylesheet" href="static/index.css">
      <link rel="stylesheet" href="static/icofont/icofont.min.css" />
    </head>

    <body>
      <div class="side position-fixed">
        <%@include file="sidebar.html" %>
      </div>
      <div class="ml-17 ">

        <div class="container mx-auto mx-3 mt-5 ">
          <h3 class="mb-4 text-muted">
            Hi,Welcome
          </h3>
          <div class="row main ">
            <div class="col col-12 col-md-6 col-xl-4">
              <div class="card animated fadeInUp delay-01s bg-light">
                <div class="card-body">
                  <div class="row align-items-center">
                    <div class="col col-5">
                      <div class="icon p-0 fs-48 text-primary opacity-50 icofont-first-aid-alt"></div>
                    </div>

                    <div class="col col-7">
                      <h6 class="mt-0 mb-1">Appointments</h6>
                      <div class="count text-primary fs-20">213</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div class="col col-12 col-md-6 col-xl-4">
              <div class="card animated fadeInUp delay-02s bg-light">
                <div class="card-body">
                  <div class="row align-items-center">
                    <div class="col col-5">
                      <div class="icon p-0 fs-48 text-primary opacity-50 icofont-wheelchair"></div>
                    </div>

                    <div class="col col-7">
                      <h6 class="mt-0 mb-1">New patients</h6>
                      <div class="count text-primary fs-20">104</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div class="col col-12 col-md-6 col-xl-4">
              <div class="card animated fadeInUp delay-03s bg-light">
                <div class="card-body">
                  <div class="row align-items-center">
                    <div class="col col-5">
                      <div class="icon p-0 fs-48 text-primary opacity-50 icofont-blood"></div>
                    </div>

                    <div class="col col-7">
                      <h6 class="mt-0 mb-1">Operations</h6>
                      <div class="count text-primary fs-20">24</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>


          </div>
        </div>

      </div>
    </body>

    </html>