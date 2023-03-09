import bgimage from "../Images/timothy-eberly-1mPBkYvbu3w-unsplash.jpg";
import GNavbar from "./GNavbar";

const Address = () => {
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
                      <h3 className="mb-5 text-uppercase">Address Details</h3>
                      <div className="row">
                        <div className="col-md-6 mb-4">
                          <div className="form-outline">
                            <input
                              type="text-area"
                              id="form3Example1m"
                              className="form-control form-control-lg"
                            />
                            <label
                              className="form-label"
                              htmlFor="form3Example1m"
                            >
                              Address Line1
                            </label>
                          </div>
                        </div>
                        <div className="col-md-6 mb-4">
                          <div className="form-outline">
                            <input
                              type="text-area"
                              id="form3Example1n"
                              className="form-control form-control-lg"
                            />
                            <label
                              className="form-label"
                              htmlFor="form3Example1n"
                            >
                              Address Line2
                            </label>
                          </div>
                        </div>
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          type="text"
                          id="form3Example8"
                          className="form-control form-control-lg"
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          City
                        </label>
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          type="text"
                          id="form3Example8"
                          className="form-control form-control-lg"
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          District
                        </label>
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          type="text"
                          id="form3Example8"
                          className="form-control form-control-lg"
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          State
                        </label>
                      </div>

                      <div className="form-outline mb-4">
                        <input
                          type="text"
                          id="form3Example8"
                          className="form-control form-control-lg"
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          Pin Code
                        </label>
                      </div>

                      <div className="d-flex justify-content-center pt-3">
                        <button
                          type="button"
                          class="btn btn-warning btn-lg ms-2"
                          style={{ justifyContent: "center" }}
                        //   onClick={}
                        >
                          Next
                        </button>
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

export default Address;
