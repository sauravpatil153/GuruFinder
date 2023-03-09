import { BrowserRouter, Link, Routes, Route } from "react-router-dom"
import TutorDetailsComponent from "./TutorDetailsComponent"

const CourseListComponent = ({ courseList }) =>{
    return(
        <div>
            <table className="table table-responsive">
                <thead>
                    <tr>
                        <th>Course name</th>
                        <th>Start Date</th>
                        <th>End Date</th>
                        <th>Duration</th>
                        <th>Fees</th>
                        <th>Mode</th>
                        <th>Time</th>
                        <th>Tutor Details</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    {courseList.map(cl => {
                        return <tr>
                            <td>{cl.courseName}</td>
                            <td>{cl.startDate}</td>
                            <td>{cl.endDate}</td>
                            <td>{cl.duration}</td>
                            <td>{cl.fees}</td>
                            <td>{cl.mode}</td>
                            <td>{cl.time}</td>
                            <td>
                                <BrowserRouter>
                                    <Link to="/tutor_details">View</Link>
                                    <Routes>
                                        <Route path="/tutor_details" component={TutorDetailsComponent}></Route>
                                    </Routes>
                                </BrowserRouter>

                            </td>
                            <td><button type="button" className="btn btn-primary">Enroll</button></td>
                        </tr>
                    })}
                </tbody>
            </table>
        </div>
    )
}

export default CourseListComponent