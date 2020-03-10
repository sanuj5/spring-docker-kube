podTemplate(containers: [
        containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat')
]) {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package jib:build'
            }
        }
    }
}