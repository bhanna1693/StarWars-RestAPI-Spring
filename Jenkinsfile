pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Validate') {
            steps {
                sh 'mvn validate'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Package and Install') {
            steps {
                sh 'mvn package install'
            }
        }
    }
}
