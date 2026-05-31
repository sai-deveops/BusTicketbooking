FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY BusTicketbooking.java .

RUN java BusTicketbooking.java

CMD ["java", "BusTicketbooking"]
