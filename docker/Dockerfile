# Use an official OpenJDK runtime as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY . /app

# If you are using Maven, you might want to run Maven to build your project
# This will require Maven to be installed in your base image or you can use a Maven image
RUN ./mvnw clean package

# Or if you're using Gradle, you can replace the Maven command with Gradle commands
# RUN ./gradlew build

# Expose the port your Java app will run on (optional)
EXPOSE 8080

# Run the compiled JAR file (you can change this to your actual JAR filename)
CMD ["java", "-jar", "target/your-application.jar"]
