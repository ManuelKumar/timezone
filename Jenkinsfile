node {
  
   def tomcatWeb = 'C:\\apache-tomcat-8.5.64\\webapps'
   def tomcatBin = 'C:\\apache-tomcat-8.5.64\\bin'
   
  
  stage('SCM CheckOut') {
    git 'https://github.com/ManuelKumar/timezone.git'
  }
  
  stage('Build Stage') {
     def mvnHome = tool name: 'maven-3', type: 'maven'
     bat "${mvnHome}/bin/mvn package"
  }  
  
  /*stage('Sonar Analysis') {
     def mvnHome = tool name: 'maven-3', type: 'maven'
     withSonarQubeEnv('sonar-6') {
      bat "${mvnHome}/bin/mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2.0.1227:sonar"
     } 
  }  */
  
  stage('Deploy to Tomcat') {
    bat 'copy target\\timezone.war "C:\\apache-tomcat-8.5.64\\webapps\\timezone.war"'
  }
  
}
