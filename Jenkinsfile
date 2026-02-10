pipeline {
    agent any

    stages {

        stage('Debug Environment') {
            steps {
                sh '''
                  echo "JAVA VERSION"
                  java -version

                  echo "MAVEN VERSION"
                  mvn -version

                  echo "WORKSPACE CONTENT"
                  ls -l
                '''
            }
        }

        stage('Run Tests') {
            steps {
                sh '''
                  mvn clean test
                '''
            }
        }
    }
}

