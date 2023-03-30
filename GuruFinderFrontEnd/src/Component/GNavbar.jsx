import React from "react";
import { Navbar, Container, Nav, NavDropdown } from "react-bootstrap";
import mainlogo from "./Logos/GuruFinder-logos_white1.png";
import logocss from "./CSS/logo.css";
import navbarcss from "./CSS/navbar.css";
import "./CSS/landing.css";

const GNavbar = () => {
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
              <Nav.Link href="#pricing">About us</Nav.Link>
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
              <Nav.Link href="#deets">Privacy Policy</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </div>
  );
};

export default GNavbar;
