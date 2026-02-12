pipeline {
    agent any

    tools {
        jdk 'JDK11'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Chandanqatester123/JenKinProject.git'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                sh '''
                mvn clean test
                '''
            }
        }
    }
}
