pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage ('check'){
            steps{
                git 'https://github.com/AaroHaavisto/cal_3012_demo'
            }
        }
        stage ('build'){
            steps{
                bat 'mvn clean install'
            }
        }

        stage('test') {
            steps{
                bat 'mvn test'
            }
        }
        stage('jacoco'){
            steps{
                jacoco()
            }
        }
    }
}