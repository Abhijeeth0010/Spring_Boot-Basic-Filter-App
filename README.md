# 🌱 Spring Boot Basic Filter App

A simple **Spring Boot** web application demonstrating how to add and use a **custom servlet filter** in a Spring Boot project.

Filters are powerful tools that let you intercept HTTP requests and responses before they reach your controllers — commonly used for **logging, authentication checks, request modifications**, and more.:contentReference[oaicite:0]{index=0}

---

## 🧠 What This App Does

This project shows how to:

- Create a **custom servlet filter**  
- Register it in a Spring Boot application  
- Intercept and log incoming HTTP requests  
- See how filter logic runs before controller methods  

Filters are useful for cross-cutting concerns like **global logging, auditing, or preprocessing** of requests.:contentReference[oaicite:1]{index=1}

---

## 🛠 Tech Stack

- **Java** (backend language)  
- **Spring Boot** (web framework)  
- **Maven** (build and dependency management)  
- Servlet **Filter API** for request interception

---

## 📁 Project Structure

🚀 Getting Started (Run Locally)
📌 Prerequisites

Make sure you have installed:

Java 11+

Maven

Git

💻 Clone & Run
# 1. Clone the repo
git clone https://github.com/Abhijeeth0010/Spring_Boot-Basic-Filter-App.git

# 2. Navigate into project
cd Spring_Boot-Basic-Filter-App

# 3. Build & run with Maven
mvn clean spring-boot:run

Your app will start at:

http://localhost:8080

You can test the endpoint in your browser or via tools like Postman / curl.

🧩 How Filters Work

Spring Boot integrates servlet filters from the Jakarta Servlet API into the request lifecycle.
When a request hits your app, the filter’s doFilter() method runs first — then the request moves on to a controller if not blocked or modified.

Typical use cases:

📊 Logging requests

🔐 Authentication checks

💬 Modifying requests or responses

🧪 Testing middleware logic

📚 Resources & Learning

If you’re new to filters or servlets, here are helpful concepts to explore:

What is a Servlet Filter in Java web apps?

How to register a filter manually or with annotations?

Differences between filters vs. interceptors

📄 License

This project is open-source, feel free to use, modify, or redistribute.
