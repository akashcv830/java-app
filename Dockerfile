FROM ubuntu:latest
RUN apt update && apt install -y python3
WORKDIR /app
RUN echo "<h1>Hello from Akash</h1>
index.html
CMD ["python3", "-m", "http.server", "8080"]
