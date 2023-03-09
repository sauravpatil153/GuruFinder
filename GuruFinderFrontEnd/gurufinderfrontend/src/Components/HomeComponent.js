import StudentRegisterComponent from "./StudentRegisterComponent"
import TutorRegisterComponent from "./TutorRegisterComponent"
import LoginComponent from "./LoginComponent"
import CourseListComponent from "./CourseListComponent"
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom'

const courseList=[
    {
        courseName:"c1",
        startDate:"2023-05-05",
        endDate:"2023-07-05",
        duration:2,
        fees:2000,
        mode:"online",
        time:"2hrs"
    },
    {
        courseName:"c2",
        startDate:"2023-05-05",
        endDate:"2023-07-05",
        duration:2,
        fees:3000,
        mode:"online",
        time:"2hrs"
    }
]

const HomeComponent = () => {
    return(
        <div>
            <BrowserRouter>
                <ul>
                    <li><Link to="/student_register">Student Register</Link></li>
                    <li><Link to="/tutor_register">Tutor Register</Link></li>
                    <li><Link to="/login">Sign In</Link></li>
                </ul>
                <Routes>
                    <Route path="/student_register" component={StudentRegisterComponent}></Route>
                    <Route path="/tutor_register" component={TutorRegisterComponent}></Route>
                    <Route path="/login" component={LoginComponent}></Route>
                    
                </Routes>


            </BrowserRouter>
            <CourseListComponent courseList={courseList}/>
            
        </div>
    )
}

export default HomeComponent