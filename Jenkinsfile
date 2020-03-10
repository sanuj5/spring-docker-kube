podTemplate(containers: [
        containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat')
]) {
//    agent any
    node(POD_LABEL) {
        stage('Build') {
            steps {
                sh 'mvn clean package jib:build'
            }
        }
    }
}