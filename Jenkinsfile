pipeline {
    agent any

    tools {
        jdk 'JDK11'
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Selenium TestNG Tests') {
            steps {
                sh '''
                  mvn clean test -DsuiteXmlFile=testng.xml
                '''
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/surefire-reports/*', fingerprint: true
            testng(pattern: '**/testng-results.xml')
        }
    }
}
