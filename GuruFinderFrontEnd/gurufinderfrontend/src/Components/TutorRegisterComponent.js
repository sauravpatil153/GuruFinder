import "./TutorRegisterComponent.css"

const TutorRegisterComponent = () => {
  return (
    <div>
      <section className="h-100 bg-dark">
        <div className="container py-5 h-100">
          <div className="row d-flex justify-content-center align-items-center h-100">
            <div className="col">
              <div className="card card-registration my-4">
                <div className="row g-0">
                  <div className="col-xl-6">
                    <div className="card-body p-md-5 text-black">
                      <h3 className="mb-5 text-uppercase">Tutor registration form</h3>
                      <div className="row">
                        <div className="col-md-6 mb-4">
                          <div className="form-outline">
                            <input type="text" id="form3Example1m" className="form-control form-control-lg" />
                            <label className="form-label" htmlFor="form3Example1m">First name</label>
                          </div>
                        </div>
                        <div className="col-md-6 mb-4">
                          <div className="form-outline">
                            <input type="text" id="form3Example1n" className="form-control form-control-lg" />
                            <label className="form-label" htmlFor="form3Example1n">Last name</label>
                          </div>
                        </div>
                      </div>

                      <div className="form-outline mb-4">
                        <input type="email" id="form3Example8" className="form-control form-control-lg" />
                        <label className="form-label" htmlFor="form3Example8">Email</label>
                      </div>

                      <div className="form-outline mb-4">
                        <input type="password" id="form3Example8" className="form-control form-control-lg" />
                        <label className="form-label" htmlFor="form3Example8">Password</label>
                      </div>

                      <div className="form-outline mb-4">
                        <input type="text" id="form3Example8" className="form-control form-control-lg" />
                        <label className="form-label" htmlFor="form3Example8">Mobile No.</label>
                      </div>
                      <div className="d-md-flex justify-content-start align-items-center mb-4 py-2">

                        <h6 className="mb-0 me-4">Gender: </h6>

                        <div className="form-check form-check-inline mb-0 me-4">
                          <input className="form-check-input" type="radio" name="inlineRadioOptions" id="femaleGender"
                            value="option1" />
                          <label className="form-check-label" htmlFor="femaleGender">Female</label>
                        </div>

                        <div className="form-check form-check-inline mb-0 me-4">
                          <input className="form-check-input" type="radio" name="inlineRadioOptions" id="maleGender"
                            value="option2" />
                          <label className="form-check-label" htmlFor="maleGender">Male</label>
                        </div>

                      </div>



                      <div className="form-outline mb-4">
                        <input type="date" id="form3Example9" className="form-control form-control-lg" />
                        <label className="form-label" htmlFor="form3Example9">DOB</label>
                      </div>

                      <div className="form-outline mb-4">
                        <input type="text" id="form3Example8" className="form-control form-control-lg" />
                        <label className="form-label" htmlFor="form3Example8">Tagline</label>
                      </div>

                      <div className="form-outline mb-4">
                        <input type="text-area" id="form3Example8" className="form-control form-control-lg" />
                        <label className="form-label" htmlFor="form3Example8">Summary</label>
                      </div>

                      <div className="form-outline mb-4">
                        <input type="text" id="form3Example8" className="form-control form-control-lg" />
                        <label className="form-label" htmlFor="form3Example8">Experience</label>
                      </div>

                      <div className="row align-items-center py-3">
                        <div className="col-md-3 ps-5">

                          <h6 className="mb-0">Upload Id Proof</h6>

                        </div>
                        <div className="col-md-9 pe-5">

                          <input className="form-control form-control-lg" id="formFileLg" type="file" />
                          <div className="small text-muted mt-2">Upload your Id Proof. Max file
                            size 50 MB</div>

                        </div>
                      </div>

                      <div className="row align-items-center py-3">
                        <div className="col-md-3 ps-5">

                          <h6 className="mb-0">Upload Photo</h6>

                        </div>
                        <div className="col-md-9 pe-5">

                          <input className="form-control form-control-lg" id="formFileLg" type="file" />
                          <div className="small text-muted mt-2">Upload your photo. Max file
                            size 50 MB</div>

                        </div>
                      </div>





                      <div className="d-flex justify-content-end pt-3">
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
  )
}

export default TutorRegisterComponent