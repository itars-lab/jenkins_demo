pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        git(url: 'https://github.com/itars-lab/jenkins_demo', branch: 'master')
        sh 'mvn clean test package'
      }
    }
    stage('Test') {
      steps {
        echo 'Echo message'
      }
    }
    stage('Publish') {
      steps {
        echo 'Publish message'
      }
    }
  }
}