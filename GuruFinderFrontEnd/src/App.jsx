import logo from './logo.svg';
import './App.css';
import './Component/Landing';
import Landing from './Component/Landing';
import {BrowserRouter, Routes } from 'react-router-dom';
import{Route} from 'react-router';
import Login from './Component/Login';
import StudentRegister from './Component/StudentRegister';
import TutorRegister from './Component/TutorRegister';
import CourseList from './Component/CourseList';
import Address from './Component/Address';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Routes>
        <Route path="/" element={<Landing/>}></Route>
        <Route path="/login" element={<Login/>}></Route>
        <Route path="/register/student" element={<StudentRegister/>}></Route>
        <Route path="/register/tutor" element={<TutorRegister/>}></Route>
        <Route path="/courses" element={<CourseList/>}></Route>
        <Route path="/tutor/address" element={<Address/>}></Route>
      </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
