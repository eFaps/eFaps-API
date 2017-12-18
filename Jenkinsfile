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
        withMaven(maven: 'M3.5', mavenLocalRepo: '.repository', mavenSettingsConfig: 'fb57b2b9-c2e4-4e05-955e-8688bc067515') {
          sh 'mvn clean install'
        }
        
      }
    }
  }
}