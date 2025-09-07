# 🧪 Environment Setup

## 🔐 Required ENV Vars

| Variable                 | Description         |
| ------------------------ | ------------------- |
| `SPRING_PROFILES_ACTIVE` | local / dev / prod  |
| `DB_URL`                 | PostgreSQL JDBC URL |
| `DB_USERNAME`            | DB username         |
| `DB_PASSWORD`            | DB password         |

### 🔍 Example for Local (via VM args or .env file)

```bash
-DSPRING_PROFILES_ACTIVE=local \
-DDB_URL=jdbc:postgresql://... \
-DDB_USERNAME=exam_dev_user \
-DDB_PASSWORD=yourpassword
```

---
