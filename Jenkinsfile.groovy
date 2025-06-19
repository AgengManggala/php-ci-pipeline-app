pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/AgengManggala/php-ci-pipeline-app.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'composer install'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh './vendor/bin/phpunit --testdox'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t php-calc-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8000:80 php-calc-app'
            }
        }
    }
}