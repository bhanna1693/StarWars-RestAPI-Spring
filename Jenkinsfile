pipeline {
    agent {
        dockerfile true
    }
    
    stages {
        stage('Clean and Package') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
