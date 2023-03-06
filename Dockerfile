# Base image
FROM openjdk:11-jdk-slim-buster

# Set working directory
WORKDIR /app

# Copy source code to working directory
COPY src/ .

# Install dependencies and build frontend
RUN cd frontend && \
    apt-get update && \
    apt-get install -y curl && \
    curl -sL https://deb.nodesource.com/setup_14.x | bash - && \
    apt-get install -y nodejs && \
    npm install && \
    npm run build

# Build backend
RUN cd backend && \
    ./mvnw package

# Expose port 8080 for the backend
EXPOSE 8080

# Start the app
CMD ["java", "-jar", "backend/target/myapp.jar"]
