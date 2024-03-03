pipeline {
    agent any
    environment {
        DOCKER_CREDENTIALS = credentials('docker')
    }
    stages {
        stage('Build') {
            steps {
                script {
                    docker.build("portfolio:v1")
                }
            }
        }
        stage('Push to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', DOCKER_CREDENTIALS) {
                        docker.image("tejasaisrinivaskhajjayam/portfolio").push("latest")
                    }
                }
            }
        }
    }
}
