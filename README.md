# This project shows you how you can use multiple configuration depending on the build profil dev | prod.

# Also how we can set Environment variable.

# In order to build the project with dev profile
./mvnw -Pdev install

# In order to build the project with prod profile
./mvnw -Pprod install

# Run docker image using docker compose providing env variable
ENVIRONMENT_VAR=hello docker-compose up -d

# List active container 
docker container ls 

# See container log with 
docker logs 891e6a114f35  ( Containr Id) 

# To verify the response of WS using curl
curl localhost:8080/api/health/version
curl localhost:8080/api/health/environmentVar
