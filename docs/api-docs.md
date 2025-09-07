---

# 📘 API Documentation: Certification Exam Platform

## 📝 Base URL

```
https://yourdomain.com/api/v1
```

---

## 🧑‍🎓 User APIs

### 🔐 POST /auth/signup

Create new user account
**Body:**

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "secret",
  "role": "PARTICIPANT"
}
```

### 🔐 POST /auth/login

Login and get JWT token
**Body:**

```json
{
  "email": "john@example.com",
  "password": "secret"
}
```

**Response:**

```json
{
  "token": "JWT_TOKEN_HERE",
  "userId": "user_123"
}
```

---

## 🎓 Certificate APIs

### 📄 GET /certificates

List all certificates

### 📄 GET /certificates/{certificateId}

Get certificate by ID

### ✍️ POST /certificates

Create a certificate
**Body:**

```json
{
  "name": "AWS Developer Associate",
  "description": "Covers AWS Lambda, DynamoDB, etc.",
  "active": true
}
```

---

## 🧬 Topic APIs

### 📄 GET /certificates/{certificateId}/topics

List all topics under a certificate

### ✍️ POST /topics

Create a topic
**Body:**

```json
{
  "certificateId": "cert_123",
  "name": "Lambda Basics",
  "description": "Intro to Lambda",
  "orderIndex": 1
}
```

---

## ❓ Question APIs

### 📄 GET /topics/{topicId}/questions

List all questions under a topic

### ✍️ POST /questions

Add new question
**Body:**

```json
{
  "topicId": "topic_123",
  "text": "What is Lambda?",
  "questionType": "MCQ",
  "difficultyLevel": "EASY",
  "active": true
}
```

---

## 🔘 Option APIs

### ✍️ POST /options

Add options to a question
**Body:**

```json
{
  "questionId": "ques_123",
  "text": "Lambda is a compute service.",
  "isCorrect": true,
  "explanation": "Lambda lets you run code without provisioning servers"
}
```

---

## 🧪 Practice APIs

### ▶️ POST /practice/start

Start quick practice mode
**Body:**

```json
{
  "topicId": "topic_123",
  "numQuestions": 5
}
```

### 📤 POST /practice/submit

Submit answers and get result
**Body:**

```json
{
  "userId": "user_123",
  "questionId": "ques_123",
  "selectedOptionId": "opt_456"
}
```

---

## 📝 Answer Submission APIs

### 📤 POST /submissions

Submit exam answers
**Body:**

```json
{
  "examSessionId": "exam_456",
  "answers": [
    {
      "questionId": "ques_1",
      "selectedOptionId": "opt_1"
    },
    {
      "questionId": "ques_2",
      "answerText": "Descriptive answer here"
    }
  ]
}
```

---

## 📊 Report & Score APIs

### 📄 GET /results/{userId}

Get user's practice/test results

### 📈 GET /analytics/certificate/{certificateId}

Performance analytics for a certificate

---

## ⚙️ Admin/Management APIs

### 👤 GET /users

List all users

### 📄 GET /audit-logs

View all actions (create/edit/delete)

---

## 📦 Deployment Notes

* Use JWT tokens in `Authorization: Bearer <token>` for protected routes
* Enable CORS for frontend domain
* Use environment-specific `.yml` configs for DB and deployment

---
