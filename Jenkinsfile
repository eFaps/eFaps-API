pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(poll: true, url: 'https://github.com/eFaps/eFaps-API.git', branch: 'master', changelog: true)
      }
    }
    stage('Build') {
      steps {
        withMaven(maven: 'M3.5', mavenLocalRepo: '.repository') {
          sh 'mvn clean install'
        }
        
      }
    }
  }
}