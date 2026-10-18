# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project overview

A simple Twitter-like REST backend: users, posts, follows, likes and a feed. Spring Boot 2.7.18, Spring Data JPA, MySQL, Lombok, Java 11, Gradle 7.6.4 wrapper. The README links a Postman collection for the APIs: https://www.getpostman.com/collections/0e906467ec6d1f70a530

## Architecture

The main class `com.TwitterApplication` sits in package `com`, so component scanning covers all subpackages:

- `com.model` — JPA entities `User`, `Post`, `Follow`, `Action` (likes). They use Lombok `@Getter`/`@Setter` with public fields.
- `com.repository` — `CrudRepository` interfaces for Post, Follow and Action. **`UserRepository` is in `com.controller`**, not here.
- `com.service.UserService` — the only service layer. The other controllers call repositories directly.
- `com.controller` — REST endpoints: `/user/save`, `/user/userId/{id}`, `/user/username/{name}`, `/user/post/save`, `/user/follow/save`, `/user/action/like`, and `/user/feed/{id}`.
  - `FeedController` builds the feed from the user IDs the user follows, plus IDs taken from their like actions, then loads each one's posts.

Database: MySQL `twitter` on `localhost:3306`, `server.port=8081`, `ddl-auto=update`. The `twitter_*.sql` files at the repo root are MySQL dumps (schema + sample rows) for seeding the database.

## Commands

```bash
./gradlew build
./gradlew bootRun
./gradlew test --tests 'com.java.twitter.TwitterApplicationTests'
```

Build notes:
- Spring Boot 2.7.18 on the Gradle 7.6.4 wrapper, Java 11.
- The DB password comes from the `DB_PASSWORD` environment variable (`DB_PASSWORD=... ./gradlew bootRun`).
- RBAC work is in progress, following `RBAC_PLAN.md`.
