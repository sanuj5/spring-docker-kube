podTemplate(containers: [
        containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat')
]) {
//    agent any
    node(POD_LABEL) {
        container('maven') {
            stage('Build') {
                sh 'mvn clean package jib:build'
            }
        }
    }
}