const StudentEducationalDetails = () => {
    return (
        <div>
            <form method="post">
                <section className="h-100 bg-dark">
                    <div className="container py-5 h-100">
                        <div className="row d-flex justify-content-center align-items-center h-100">
                            <div className="col">
                                <div className="card card-registration my-4">
                                    <div className="row g-0">
                                        <div className="col-xl-6">
                                            <div className="card-body p-md-5 text-black">
                                                <h3 className="mb-5 text-uppercase">Student Educational Details</h3>
                                                <div className="row">
                                                    <div className="col-md-6 mb-4">
                                                        <div className="form-outline">
                                                            <input type="text" id="form3Example1m" className="form-control form-control-lg" />
                                                            <label className="form-label" htmlFor="form3Example1m">Stream</label>
                                                        </div>
                                                    </div>
                                                    <div className="col-md-6 mb-4">
                                                        <div className="form-outline">
                                                            <input type="text" id="form3Example1n" className="form-control form-control-lg" />
                                                            <label className="form-label" htmlFor="form3Example1n">Level</label>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div className="form-outline mb-4">
                                                    <input type="text" id="form3Example8" className="form-control form-control-lg" />
                                                    <label className="form-label" htmlFor="form3Example8">Board</label>
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
            </form>

        </div>
    )
}

export default StudentEducationalDetails