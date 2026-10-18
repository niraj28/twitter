# Twitter-style REST backend

A small social-network backend in Spring Boot: users, posts, follows, likes and a home feed built from the people you follow.

**Stack:** Java 11 · Spring Boot 2.7 · Spring Data JPA · MySQL 8 · Lombok · Gradle

## Features

- Create users and look them up by id or username
- Publish posts
- Follow other users
- Like posts (stored as `Action` records)
- Home feed: posts from the users you follow plus the users whose posts you liked

## API

| Method | Path | What it does |
|---|---|---|
| POST | `/user/save` | Create a user |
| GET | `/user/userId/{id}` | Get a user by id |
| GET | `/user/username/{name}` | Get a user by username |
| POST | `/user/post/save` | Publish a post |
| POST | `/user/follow/save` | Follow a user |
| POST | `/user/action/like` | Like a post |
| GET | `/user/feed/{id}` | Home feed for a user |

A Postman collection with sample requests: https://www.getpostman.com/collections/0e906467ec6d1f70a530

## Project layout

```
src/main/java/com
├── TwitterApplication.java   Spring Boot entry point
├── controller/               REST controllers (user, post, follow, action, feed)
├── service/                  UserService
├── repository/               Spring Data repositories
└── model/                    JPA entities: User, Post, Follow, Action
```

## Run it locally

1. Start MySQL 8 and create the database:
   ```sql
   CREATE DATABASE twitter;
   ```
   Optionally load sample data from the `twitter_*.sql` dumps in the repo root.
2. Start the app on port 8081. The database password comes from an environment variable:
   ```bash
   DB_PASSWORD=your_mysql_password ./gradlew bootRun
   ```
3. Try it:
   ```bash
   curl http://localhost:8081/user/feed/1
   ```

Tables are created automatically (`ddl-auto=update`).
