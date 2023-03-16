import bgimage from "../Images/engin-akyurt-o-99rrlwNVY-unsplash.jpg";
import GNavbar from "./GNavbar";
import { useState, useEffect } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const CourseBrochure = () => {
  var [newCourse, setNewCourse] = useState({
    courseName: "",
    stream: "",
    level: "",
    duration: "",
    time: "",
    fees: "",
    mode: "",
    startDate: "",
    endDate: ""
  });

  const handleChange = (event) => {
    console.log("in handle change");
    const { name, value } = event.target;
    setNewCourse({ ...newCourse, [name]: value });
  };

  const navigate = useNavigate();

  const submitdata = () => {
    const obj = {
      "courseName": newCourse.courseName,
      "stream": newCourse.stream,
      "level": newCourse.level,
      "duration": newCourse.duration,
      "time": newCourse.time,
      "fees": newCourse.fees,
      "mode": newCourse.mode,
      "startDate": newCourse.startDate,
      "endDate": newCourse.endDate
    };
    console.log(obj);
    const tutorId = sessionStorage.getItem("tutorId");
    const jwt = sessionStorage.getItem("tutor");
    const options = {
      method: "POST",
      url: "http://localhost:8080/course/add/" + tutorId,
      headers: { Authorization: `Bearer ${jwt}`,
            "Content-Type": "application/json" 
        },
      data: obj
    };
    axios.request(options).then((res) => {
      console.log(res.data);
      window.alert("Course Succesfully added");
      navigate("/tutor");
    });
  };
  return (
    <div>
      <GNavbar />
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
                      <h3 className="mb-5 text-uppercase">Course Brochure</h3>
                      <div className="row">
                        <div className="col-md-6 mb-4">
                          <div className="form-outline">
                            <input
                              type="text"
                              id="courseName"
                              name="courseName"
                              className="form-control form-control-lg"
                              value={newCourse.courseName}
                              onChange={handleChange}
                            />
                            <label
                              className="form-label"
                              htmlFor="form3Example1m"
                            >
                              Course name
                            </label>
                          </div>
                        </div>
                        <div className="col-md-6 mb-4">
                          <div className="form-outline">
                            <input
                              type="text"
                              id="stream"
                              name="stream"
                              className="form-control form-control-lg"
                              value={newCourse.stream}
                              onChange={handleChange}
                            />
                            <label
                              className="form-label"
                              htmlFor="form3Example1n"
                            >
                              Stream
                            </label>
                          </div>
                        </div>
                      </div>

                      <div className="row">
                        <div className="col-md-6 mb-4">
                        <input
                          type="text"
                          id="level"
                          name="level"
                          className="form-control form-control-lg"
                          value={newCourse.level}
                          onChange={handleChange}
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          Level
                        </label>
                      </div>

                      <div className="col-md-6 mb-4">
                        <input
                          type="number"
                          id="duration"
                          name="duration"
                          className="form-control form-control-lg"
                          value={newCourse.duration}
                          onChange={handleChange}
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          Duration in months
                        </label>
                      </div>
                      </div>
                      <div className="row">
                        <div className="col-md-6 mb-4">
                          <input
                            type="text"
                            id="time"
                            name="time"
                            className="form-control form-control-lg"
                            value={newCourse.time}
                            onChange={handleChange}
                          />
                          <label className="form-label" htmlFor="form3Example8">
                            Time
                          </label>
                        </div>

                        <div className="col-md-6 mb-4">
                          <input
                            type="number"
                            id="fees"
                            name="fees"
                            className="form-control form-control-lg"
                            value={newCourse.fees}
                            onChange={handleChange}
                          />
                          <label className="form-label" htmlFor="form3Example8">
                            Fees
                          </label>
                        </div>
                      </div>
                      <div className="form-outline mb-4">
                        <input
                          type="text"
                          id="mode"
                          name="mode"
                          className="form-control form-control-lg"
                          value={newCourse.mode}
                          onChange={handleChange}
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          Mode
                        </label>
                      </div>

                      <div className="row">
                        <div className="col-md-6 mb-4">
                        <input
                          type="text"
                          id="startDate"
                          name="startDate"
                          className="form-control form-control-lg"
                          value={newCourse.startDate}
                          onChange={handleChange}
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          Start Date
                        </label>
                      </div>

                      <div className="col-md-6 mb-4">
                        <input
                          type="text"
                          id="endDate"
                          name="endDate"
                          className="form-control form-control-lg"
                          value={newCourse.endDate}
                          onChange={handleChange}
                        />
                        <label className="form-label" htmlFor="form3Example8">
                          End Date
                        </label>
                      </div>
                      </div>
                      <div className="d-flex justify-content-center pt-3">
                        <button
                          type="button"
                          class="btn btn-warning btn-lg ms-2"
                          style={{ justifyContent: "center" }}
                          onClick={submitdata}
                        >
                          Submit
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
export default CourseBrochure;
