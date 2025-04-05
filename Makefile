# Lancer l'app en mode dev (par défaut)
dev:
	docker compose up

# Lancer l'app en mode production (jar dans conteneur)
prod:
	BUILD_MODE=prod docker compose up

# Compiler l'application sans tests
build:
	./mvnw clean package -DskipTests

# Nettoyer le projet Maven
clean:
	./mvnw clean

# Supprimer les conteneurs, images et volumes
nuke:
	docker compose down -v --remove-orphans

# Relancer tout (utile si t’as fait des modifs de deps ou Dockerfile)
rebuild:
	docker compose down -v --remove-orphans
	BUILD_MODE=prod docker compose build
	BUILD_MODE=prod docker compose up
