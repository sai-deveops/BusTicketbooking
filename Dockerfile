FROM openjdk:17-jdk-slim

WORKDIR /app

COPY BusTicketbooking.java .

RUN javac BusTicketbooking.java

CMD ["java", "BusTicketbooking"]
