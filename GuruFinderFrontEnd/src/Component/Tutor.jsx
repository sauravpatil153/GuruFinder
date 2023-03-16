import React, { useEffect, useState } from "react";
import GNavbar from "./GNavbar";
import bgimage from "../Images/shutterstock_download.jpg";
import "bootstrap";
import { MDBBtn } from "mdb-react-ui-kit";
import Button from "react-bootstrap/Button";
import "./CSS/tutor.css";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import "jwt-decode";
import jwtDecode from "jwt-decode";

const Tutor = () => {
  const [arr, setArr] = useState([]);
  const [tutorId, setTutorId] = useState({});

  const navigate = useNavigate();

  const addCourse = () => {
    navigate("/addcourse");
  };

  useEffect(() => {
    //tutorId = sessionStorage.getItem("tutorId");
    setTutorId(sessionStorage.getItem("tutorId"))
    const jwt = sessionStorage.getItem("tutor");
    const tutortoken = jwtDecode(jwt);
    localStorage.setItem("email", tutortoken.sub);
    const options = {
      method: "GET",
      url: "http://localhost:8080/course/findbyid/" + tutorId,
      headers: {
        Authorization: `Bearer ${jwt}`,
        "Content-Type": "application/json",
      },
    };
    axios.request(options).then((res) => {
      console.log(res.data);
      setArr(res.data);
    });
  }, [tutorId]);

  return (
    <div>
      <GNavbar />
      <section className="h-100 bg-dark">
        <div className="container py-5 h-100">
          <div className="row d-flex justify-content-center align-items-center h-100">
            <div className="col">
              <div className="card card-registration my-4">
                <h4>
                  <b>WELCOME - {`${localStorage.getItem("email")}`}</b>
                </h4>
                <br></br>
                <br></br>
                <div className="container-div">
                  <img src={bgimage} height={200} width={300}></img>
                </div>
                <br></br>
                <br></br>
                <Button
                  variant="dark"
                  size="lg"
                  onClick={addCourse}
                  style={{ maxWidth: "50%", marginLeft: "25%" }}
                >
                  Add course
                </Button>
                <br></br>
                <br></br>
                <div className="justify-content-center align-items-center">
                  <h4>COURSE LIST</h4>
                </div>
                <br></br>
                <div className="coursetable">
                  <table
                    className="table table-hover table-dark"
                    style={{ width: "100%" }}
                  >
                    <thead>
                      <tr>
                        <th>Course name</th>
                        <th>Start Date</th>
                        <th>End Date</th>
                        <th>Duration</th>
                        <th>Fees</th>
                        <th>Mode</th>
                        <th>Time</th>
                        <th></th>
                      </tr>
                    </thead>
                    <tbody>
                      {arr.map((cl) => {
                        return (
                          <tr>
                            <td>{cl.courseName}</td>
                            <td>{cl.startDate}</td>
                            <td>{cl.endDate}</td>
                            <td>{cl.duration}</td>
                            <td>{cl.fees}</td>
                            <td>{cl.mode}</td>
                            <td>{cl.time}</td>
                            <td></td>
                          </tr>
                        );
                      })}
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>
  );
};

export default Tutor;
