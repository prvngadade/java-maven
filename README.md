[![CI/CD - Build and Push Docker Image, then deploy to EC2](https://github.com/Joska99/simple-java-maven-app/actions/workflows/docker-ci.yml/badge.svg)](https://github.com/Joska99/simple-java-maven-app/actions/workflows/docker-ci.yml)

# Requirements:

- EC2 instance
- SSH key for EC2 instance
- DockerHub Repository
- Repository secrets

# Provide secrets:

1. Settings -> Secrets and Variables -> Actions -> Secrets -> New Repository secret
2. Provide those secrets:
   > DOCKERHUB_PSWD  
   > DOCKERHUB_USER\
   > EC2_IP\
   > EC2_USER\
   > SSH_KEY_JOSKA_EC2\
   > SSH_PORT
