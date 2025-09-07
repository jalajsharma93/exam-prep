# 🏗️ System Architecture

## 🔧 Tech Stack

* **Backend**: Spring Boot, PostgreSQL (hosted on Neon)
* **Frontend (Web)**: React
* **Frontend (Mobile)**: React Native (Expo)
* **ORM**: JPA (Hibernate), manual schema management
* **Hosting**: TBD (e.g., AWS EC2, Render, Railway, etc.)
* **Secrets & Config**: Environment variables + YAML profiles

## ⚙️ Key Components

### 1. **Spring Boot Backend**

* Models and Entities clearly separated
* Environment-based config (local, dev, prod)
* No schema auto-generation (SQL is source of truth)

### 2. **Frontend Web & Mobile**

* Separate UI codebases for Web and Mobile
* Shared backend APIs for data access
* All role-based views supported

### 3. **Roles & Permissions**

* `PARTICIPANT`: Can attempt exams, submit answers
* `ADMIN`: Manages certificates, topics, questions
* `EDITOR`: Can add questions, edit content
* `PROCTOR`: Can view sessions and audit activity
* `DEV`: Internal developer role

### 4. **Database Design Principles**

* `VARCHAR` used for IDs (generated at save time)
* No foreign key constraints yet (for flexibility)
* All datetime columns use `TIMESTAMP`

---

