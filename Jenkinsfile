@Library("library") _

pipeline {
    agent any
    
    stages {
        stage('cloning') {
            steps {
                script {
                    clone("https://github.com/AkshayDurgade/Jenkins.git", "main")
                }
            }
        }

        stage('build') {
            steps {
                script {
                    build()
                }
            }
        }
    }
}