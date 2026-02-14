# 🚀 Spring Boot Microservices Learning

This repository contains my hands-on learning journey of **Microservices Architecture using Spring Boot & Spring Cloud**.

The goal of this repo is to understand how real production microservices are built, connected, secured, and scaled.

---

## 📌 What is Microservices?

Microservices is an architectural style where a large application is divided into **small independent services**.

Each service:
- Runs independently  
- Has its own database  
- Communicates via APIs  
- Can be deployed separately  

Instead of one huge monolithic app, we build **many small apps working together**.

---

## ❤️ Why Spring Boot for Microservices?

Spring Boot makes microservices **simple, fast, and production-ready**.

### Without Spring Boot
- Heavy configuration 😓  
- Complex setup 😵‍💫  
- Lots of boilerplate code 🧱  

### With Spring Boot
- Auto configuration ⚡  
- Embedded servers 🚀  
- Easy REST API creation 🌐  
- Production ready in minutes ⏱️  

**Spring Boot + Spring Cloud = Microservices made easy**

---

## 🧩 Project Modules

This repository contains multiple microservices that work together.

### 🔎 Service Discovery — Eureka Server
Registers all services and allows them to find each other.

**Why needed?**
- Services don’t need hardcoded URLs  
- Dynamic service discovery  
- Scalable architecture  

---

### 🌐 API Gateway
Single entry point for all client requests.

**Responsibilities**
- Route requests to correct service  
- Security & authentication  
- Centralized logging  
- Load balancing  

Clients talk only to the gateway, not individual services.

---

### 🔗 Inter-Service Communication
Microservices need to talk to each other.

Implemented using:
- REST communication  
- Service discovery integration  

This simulates real-world service collaboration.

---

## 🏗️ Architecture Flow

```
Client → API Gateway → Microservices → Database
```

1. Client sends request to Gateway  
2. Gateway finds service via Eureka  
3. Service processes request  
4. Response returns through Gateway  

This is how modern cloud systems work.

---

## 🎯 What I’m Learning

- Microservices fundamentals  
- Service Discovery (Eureka)  
- API Gateway routing  
- Service-to-Service communication  
- Distributed system basics  
- Real production architecture mindset  

---

## 💡 Why This Repo Exists

This repo is not just code — it’s a **learning playground** to understand how real companies build scalable backend systems.

**Step-by-step journey:**
```
Monolith ➜ Distributed Systems ➜ Microservices 🚀
```

---

## ▶️ How to Run the Project

Start services in this order:

1️⃣ Start Eureka Server  
2️⃣ Start Microservices  
3️⃣ Start API Gateway  

Now access services through the Gateway.

---

## ⭐ Final Note

Microservices may look complex at first, but **Spring Boot & Spring Cloud make them surprisingly simple and powerful**.

If you are learning microservices, this repo can help you understand the real architecture step-by-step.
