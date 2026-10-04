pipeline {
    agent any

    tools {
        maven 'Maven'
    }
    
    parameters { choice( name: 'BROWSER', choices: ['chrome', 'firefox', 'edge'], description: 'Select browser to execute the tests' ) choice( name: 'TAG', choices: ['@login', '@smoke', '@regression'], description: 'Select Cucumber tag to execute' ) }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub'
            }
        }

        stage('Build & Test') {
            steps {
                echo "Browser: ${params.BROWSER}" echo "Cucumber Tag: ${params.TAG}" bat "mvn clean test -Dbrowser=${params.BROWSER} -Dcucumber.filter.tags=\"${params.TAG}\""
            }
        }
    }
}