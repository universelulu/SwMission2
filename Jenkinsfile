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
        bat 'mvn clean package
      }
    }
  }
  post{
    always{
      bat 'java -cp C:/ProgramData/Jenkins/.jenkins/workspace/finalMission2/target/finalMission2-0.0.1-SNAPSHOT.jar finalMission2.PerformanceTest > Performance_result.txt'
   }
  }
}

  



  

