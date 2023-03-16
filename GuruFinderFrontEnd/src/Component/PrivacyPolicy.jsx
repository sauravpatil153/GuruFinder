import React from "react";
import "./CSS/privacypolicy.css";
import GNavbar from "./GNavbar";

const PrivacyPolicy = () => {
  return (
    <div className="privacypolicy">
      <GNavbar />
      <br></br>
      <br></br>
      <br></br>
      <br></br>
      <br></br>
      <div className="privacydiv">
        <h1>Privacy Policy</h1>
        <br></br>
        <p>
          Here at GuruFinder, we take your privacy seriously. We collect certain
          personal information from our users, such as name, email address, and
          location, in order to provide our services. This information is kept
          confidential and is not shared with third parties unless required by
          law.
        </p>
        <p>
          We may also use cookies and tracking technologies to collect data on
          how users interact with our website or application. This data is used
          to improve our services and user experience, but users can opt-out of
          such tracking if they prefer.
        </p>
        <p>
          We take security seriously and have measures in place to protect user
          data from unauthorized access or disclosure. Users have control over
          their data and can modify or delete their personal information at any
          time.
        </p>
        <p>
          If our services are directed at children under 13 years old, we comply
          with the Children's Online Privacy Protection Act (COPPA) and obtain
          parental consent for data collection.
        </p>
        <p>
          This privacy policy may be updated from time to time, and users will
          be informed of any changes. If you have any questions or concerns
          about our privacy policy, please contact us at admin@gurufinder.com.
        </p>
      </div>
      <br></br>
      <br></br>
      <br></br>
      <br></br>
      <br></br>
    </div>
  );
};

export default PrivacyPolicy;
