node {
  
   def tomcatWeb = 'C:\\apache-tomcat\\webapps'
   def tomcatBin = 'C:\\apache-tomcat\\bin'
   def mvnHome = 'C:\\apache-maven-3.5.4'
  
  stage('SCM CheckOut') {
    git 'https://github.com/ManuelKumar/timezone.git'
  }
  
  stage('Build Stage') {
     //def mvnHome = tool name: 'maven-3', type: 'maven'
     bat "${mvnHome}/bin/mvn package"
  }  
  
  stage('Sonar Analysis') {
     //def mvnHome = tool name: 'maven-3', type: 'maven'
     withSonarQubeEnv('sonar-6') {
      bat "${mvnHome}/bin/mvn sonar:sonar"
     } 
  }  
  
  stage('Deploy to Tomcat') {
    bat "copy target\\timezone.war \"{tomcatWeb}\\timezone.war\""
  }
  
}
