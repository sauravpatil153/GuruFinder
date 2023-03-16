import axios from "axios";
import React, { useEffect, useState } from "react";
import GNavbar from "./GNavbar";
import bgimage from "../Images/shutterstock_download.jpg";
import { useNavigate } from "react-router-dom";
import "./CSS/tutor.css";
import { MDBBtn,MDBIcon } from "mdb-react-ui-kit";

const CourseList = () => {
  const [arr, setArr] = useState([]);
  useEffect(() => {
    const keyword = localStorage.getItem("keyword");
    axios.get("http://localhost:8080/search_keyword/"+keyword).then((res) => {
      setArr(res.data);
    });
  }, []);
  return (
    <div>
      <GNavbar />
      <section className="h-100 bg-dark">
        <div className="container py-5 h-100">
          <div className="row d-flex justify-content-center align-items-center h-100">
            <div className="col">
              <div className="card card-registration my-4">
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
                        <th>Enroll</th>
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
                            <td>
                            <button type="button" class="btn btn-light">Enroll</button>
                            </td>
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

export default CourseList;
