pipeline {
    agent any
    tools {
        maven 'maven-local'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package jib:build'
            }
        }
    }
}