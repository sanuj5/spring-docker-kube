podTemplate(
        containers: [
                containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat')
        ],
        volumes:[
                hostPathVolume(hostPath: '/c/Users/sanuj/.m2/', mountPath: '/root/.m2')
        ]
) {
//    agent any
    node(POD_LABEL) {
        container('maven') {
            stage('Checkout'){
                checkout scm
            }
            stage('Build') {
                sh 'mvn clean package jib:build'
            }
        }
    }
}