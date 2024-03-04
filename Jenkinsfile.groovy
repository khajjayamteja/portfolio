pipeline {
    agent any
    
    environment {
        DOCKER_IMAGE = 'Test'
    }
    
    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build(DOCKER_IMAGE)
                }
            }
        }
    }
}
