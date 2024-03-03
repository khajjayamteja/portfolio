pipeline {
    agent any
 
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                checkout scm
            }
        }
        stage('Display index.html') {
            steps {
                // Print contents of index.html
                script {
                    def indexFile = readFile('index.html')
                    echo "Contents of index.html:\n${indexFile}"
                }
            }
        }
    }
}
