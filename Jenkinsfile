pipeline{
  agent any

  tools{
    maven 'maven-3.9.7'
    jdk 'JDK-1.8'
  }
  
  stages{
    stage('Checkout') {
            steps {
                checkout scm
            }
    }
    stage('Build'){
      steps{
        bat 'mvn clean package'
      }
    }
  }
}
  



  

