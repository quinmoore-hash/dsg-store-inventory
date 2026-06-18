# DSG Store Ops — Inventory Management

Minimal internal inventory app for a sporting goods retailer (demo).

## Tech Stack

- Kotlin + Spring Boot 3.4.1
- Thymeleaf server-side templates
- Spring Security 6 (form login, `SecurityFilterChain` bean)
- H2 in-memory database (seeded with 20 products)
- Gradle Kotlin DSL, Java 17 target

## Running

```bash
./gradlew bootRun
```

Open http://localhost:8080 — login with `admin` / `dsgops2024`.

## Tests

```bash
./gradlew test
```

## Project Structure

```
src/main/kotlin/com/dsg/inventory/
  Application.kt        — Boot entry point
  Product.kt            — JPA entity
  ProductRepository.kt  — Spring Data repository
  SecurityConfig.kt     — Security setup (SecurityFilterChain bean)
  InventoryController.kt — Login + inventory pages
  DataSeeder.kt         — Seeds 20 sporting goods products on startup
src/main/resources/
  application.properties
  templates/login.html
  templates/inventory.html
```
