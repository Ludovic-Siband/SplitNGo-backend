.PHONY: dev prod build clean down nuke rebuild

# Launch the app in development mode (default)
dev:
	docker compose up

# Launch the app in production mode (JAR inside container)
prod:
	BUILD_MODE=prod docker compose up

# Build the application without running tests
build:
	./mvnw clean package -DskipTests

# Clean the Maven project
clean:
	./mvnw clean

# Stop the containers
down:
	docker-compose down

# Remove containers, images, and volumes
nuke:
	docker compose down -v --remove-orphans

# Rebuild everything (useful after dependency or Dockerfile changes)
rebuild:
	docker compose down -v --remove-orphans
	BUILD_MODE=prod docker compose build
	BUILD_MODE=prod docker compose up
