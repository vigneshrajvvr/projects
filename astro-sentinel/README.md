# 🛰️ AstroSentinel

> Real-time space debris visualization and collision risk analysis platform.

## What is this?

AstroSentinel tracks and visualizes thousands of orbital debris objects in real-time on an interactive 3D globe. It fetches live TLE data, computes positions via SGP4 propagation, clusters debris using ML, and flags collision risks.

## Tech Stack

| Layer | Technology |
|---|---|
| Frontend | React + Vite + Three.js (react-three-fiber) |
| Backend | Spring Boot (Java) |
| ML Service | Python FastAPI |
| Messaging | Apache Kafka |
| Infrastructure | Docker Compose |

## Project Structure

```
astro-sentinel/
├── frontend/       # 3D globe UI (React + Three.js)
├── backend/        # TLE fetching, SGP4 propagation, WebSocket (Spring Boot)
├── ml-service/     # DBSCAN clustering + collision risk scoring (Python)
└── docker-compose.yml
```

> See [`project_structure.md`](./project_structure.md) for the full folder breakdown
---

*Work in progress — updated as development progresses.*
