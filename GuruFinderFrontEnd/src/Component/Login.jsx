
import bgimage from '../Images/artem-maltsev-0CvHQ62gwY8-unsplash.jpg';
import { ReactDOM } from "react";
import GNavbar from './GNavbar';
const LoginComponent = () => {
  return (
    <div>
       <GNavbar/>
      <section className="h-100 bg-dark">
        <div className="container py-5 h-100">
          <div className="row d-flex justify-content-center align-items-center h-100">
            <div className="col">
              <div className="card card-registration my-4">
                <div className="row g-0">
                <div className="col-xl-6 d-none d-xl-block">
                    <img
                      src={bgimage}
                      alt="Sample photo"
                      className="img-fluid"
                      style={{
                        borderTopLeftRadius: ".25rem",
                        borderTopLeftRadius: ".25rem",
                      }}
                    />
                  </div>
                  <div className="col-xl-6">
                    <div className="card-body p-md-5 text-black">
                      <h3 className="mb-5 text-uppercase">
                        Login
                      </h3>

                      <div className="form-outline mb-4">
                        <input
                          type="email"
                          id="form3Example8"
                          className="form-control form-control-lg"
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          Email
                        </label>
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          type="password"
                          id="form3Example8"
                          className="form-control form-control-lg"
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          Password
                        </label>
                      </div>
                      <div className="d-flex justify-content-center pt-3">
                        <button type="button" className="btn btn-warning btn-lg ms-2">Submit</button>
                      </div>

                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>
  );
};

export default LoginComponent;
