# CareerPath Finder — demo rebuild

React frontend for a rule-based career recommendation demo. It ranks example careers using selected interests, skills, and learning level.

## Run the frontend
1. Install Node.js (LTS).
2. In this folder run `npm install`.
3. Run `npm run dev` and open the local Vite URL.

## Java backend
The `backend/` folder contains a Java Spring Boot REST API using Spring Data JPA (Hibernate) and H2. It can be run separately; the frontend currently uses local sample career data and is not wired to the API yet.

## Run the backend
Requires JDK 17+ and Maven. In `backend/`, run `mvn spring-boot:run`. The API is at `http://localhost:8080/api/careers`.

## Demo logic and limitations
The recommendation is a simple score-based rules demo, not a trained AI model. The frontend and backend are not connected in this starter version. Do not claim it is a production system or that it has guaranteed 100% real-world accuracy.
