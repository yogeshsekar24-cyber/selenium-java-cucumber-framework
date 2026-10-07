pipeline {

    agent any

    parameters {

        choice(
            name: 'BROWSER',
            choices: ['chrome', 'firefox', 'edge'],
            description: 'Select browser to execute the tests'
        )

        choice(
            name: 'TAG',
            choices: ['@login', '@smoke', '@regression'],
            description: 'Select Cucumber tag to execute'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Tests') {
            steps {

                echo "Browser: ${params.BROWSER}"
                echo "Cucumber Tag: ${params.TAG}"

                bat "mvn clean test -Dbrowser=${params.BROWSER} -Dcucumber.filter.tags=\"${params.TAG}\""
            }
        }
    }

    post {

        always {
            echo "Test execution completed"
        }
    }
}