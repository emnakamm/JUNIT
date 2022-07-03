pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build App'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }
        post{
            failure {
                mail to : kamounemna94@gmail.com, subject :'The Pipeline failed:('
            }
        }
    }
}
