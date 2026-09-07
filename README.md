# CS4273 26 Group - Innospec Inventory Management System

## Project Description

This project is being developed by Group C for the University of Oklahoma CS 4273 Software Engineering Project course with Innospec Oilfield Services.

The goal of the project is to improve how inventory is entered, tracked, and reconciled across Innospec yards and warehouses.

Our goal is to develop a standardized and practical inventory management solution that:

- Simplifies inventory entry and tracking.
- Reduces unnecessary manual data entry.
- Improves visibility into current inventory levels.
- Tracks product movements between locations.
- Helps identify and reconcile inventory discrepancies.
- Maintains historical records of inventory transactions and adjustments.
- Provides useful inventory information through dashboards or reports.
- Supports integration with existing delivery and ERP systems where practical.
- Remains scalable, maintainable, and easy to use across multiple locations.

---

## Identified Technologies and Tools

The following technologies and tools are being considered or evaluated for development.

### Application Technologies

- **Python**
  Used for application development and prototyping.

- **JavaScript**
  Used for web-based user interfaces and application functionality.

- **Java**
  Used as an additional implementation technology for feature comparison and prototyping.

### Frameworks and Libraries

- **PySide6 / Qt**
  Used to create the Python implementation of our employee login-screen prototype.

- **React**
  Considered for development of the application's web-based user interface and dashboard.

- **Flask**
  Considered for development of a Python-based backend REST API.

### Data Storage

- **PostgreSQL**
  Considered as a persistent relational database for storing inventory information.

- **SQLite**
  Considered as a lightweight database for development, testing, and prototyping.

### Development and Deployment Tools

- **Docker**
  Used to containerize application components and provide a consistent development and deployment environment.

- **Git**
  Used for source control and tracking changes to the project.

- **GitHub**
  Used for collaboration, source-code hosting, documentation, issue tracking, and version control.

---

## Identified Feature: Employee Login Screen

For our initial technology evaluation, the team identified an employee login screen as a feature that can be implemented using multiple technologies.

The purpose of this prototype is not yet to provide a complete authentication system. Instead, it allows the team to implement the same user-interface requirements using different technologies and compare the development process.

Each implementation should provide:

- A username or employee ID field.
- A password field.
- Hidden password input.
- A Login button.
- Basic feedback when the Login button is selected.

### Prototype Implementations

The login-screen prototype will be implemented three different ways:

1. **Python + PySide6 (Qt)**
2. **JavaScript + HTML/CSS**
3. **Java + a Java GUI framework**

Using the same feature requirements for each implementation will allow the team to compare the technologies under similar conditions.

---

## Testing

Each implementation of the login-screen prototype will contain unit tests for its basic UI requirements.

Tests verify that:

- The username field exists.
- The password field exists.
- The password field masks the entered password.
- The Login button exists.
- The Login button contains the correct text.
- Selecting the Login button produces the expected placeholder response.

The same general test requirements will be applied across the different implementations to ensure consisten testing practices.

---

## Project Goals

Our primary goals are to:

1. Understand Innospec's current inventory workflows and identify the causes of unnecessary manual work and inventory discrepancies.
2. Define standardized requirements for inventory tracking across yards and warehouses.
3. Evaluate technologies that can support a maintainable and scalable solution.
4. Develop and test prototypes of important system features.
5. Design a system capable of recording inventory movements such as deliveries, usage, transfers, returns, and physical inventory counts.
6. Provide visibility into current inventory levels and inventory variances.
7. Investigate integration with Innospec's existing delivery and ERP systems.

---

## Progress Plan

### Phase 1 — Problem and Requirements Analysis

- Review the existing inventory-management process.
- Meet with project stakeholders.
- Identify current pain points and sources of inventory discrepancies.
- Determine functional and non-functional requirements.
- Document project scope and objectives.

### Phase 2 — Technology Evaluation

- Identify candidate technologies and development tools.
- Research learning resources for each technology.
- Implement a small feature using multiple technologies.
- Write unit tests for each prototype.
- Compare the advantages and disadvantages of each approach.

### Phase 3 — System Design

- Define the system architecture.
- Design the inventory data model.
- Define how inventory movements will be represented.
- Design the user interface and dashboard.
- Determine how external delivery and ERP systems may interact with the application.

### Phase 4 — Prototype Development

- Develop the core inventory-tracking functionality.
- Implement inventory entry and movement tracking.
- Develop the dashboard or reporting interface.
- Connect application components to persistent storage.
- Create integrations or mock integrations where appropriate.

### Phase 5 — Testing and Refinement

- Perform unit and integration testing.
- Test inventory workflows.
- Evaluate usability.
- Identify and resolve defects.
- Refine the system based on stakeholder feedback.

### Phase 6 — Final Proof of Concept

- Complete the working prototype.
- Finalize documentation.
- Demonstrate the recommended inventory-management process.
- Present the final solution and project results.

---

## Team

**Group C**
University of Oklahoma
CS 4273 — Software Engineering Project
Fall 2026

**Client:** Innospec Oilfield Services
