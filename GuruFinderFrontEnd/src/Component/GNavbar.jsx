import React from "react";
import { Navbar, Container, Nav, NavDropdown } from "react-bootstrap";
import mainlogo from "./Logos/GuruFinder-logos_white1.png";
import logocss from "./CSS/logo.css";
import navbarcss from "./CSS/navbar.css";
import "./CSS/landing.css";
import { useNavigate } from "react-router-dom";

const GNavbar = () => {
  const navigate = useNavigate();

  const logout = () => {
    if (sessionStorage.getItem("tutor") != null) {
      sessionStorage.removeItem("tutor");
      sessionStorage.removeItem("tutorId");
      window.alert("Log out succesfull");
      navigate("/");
    } else if (sessionStorage.getItem("student") != null) {
      sessionStorage.removeItem("student");
      sessionStorage.removeItem("studentId");
      window.alert("Log out succesfull");
      navigate("/");
    } else {
      window.alert("Error, you have not logged in");
    }
  };

  return (
    <div>
      <Navbar
        style={{ navbarcss }}
        collapseOnSelect
        expand="xl"
        bg="dark"
        variant="dark"
      >
        <Container className="content-justify-end">
          <img src={mainlogo} style={{ logocss }} className="logo"></img>{" "}
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          {/* <Navbar.Brand href="#home">Home</Navbar.Brand> &nbsp;&nbsp;&nbsp;&nbsp; */}
          <Nav>
            <Nav.Link href="/">Home</Nav.Link>
          </Nav>
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav>
              &nbsp;&nbsp;&nbsp;&nbsp;
              <Nav.Link href="/aboutus">About us</Nav.Link>
              &nbsp;&nbsp;&nbsp;&nbsp;
              <NavDropdown title="Register" id="collasible-nav-dropdown">
                <NavDropdown.Item href="/register/student">
                  As a Student
                </NavDropdown.Item>
                <NavDropdown.Item href="/register/tutor">
                  As a Tutor
                </NavDropdown.Item>
              </NavDropdown>
            </Nav>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <Nav>
              <Nav.Link href="/login">Login</Nav.Link>
            </Nav>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <Nav>
              <Nav.Link href="/privacypolicy">Privacy Policy</Nav.Link>
            </Nav>
            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            <Nav className="content-justify-end">
              <Nav.Link onClick={logout}>Logout</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </div>
  );
};

export default GNavbar;
