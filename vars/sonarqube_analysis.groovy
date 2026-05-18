def call(String SonarQubeAPI,String projectname,String projectkey){
  withSonarQubeEnv("${SonarQubeAPI}"){
     sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${projectname} -Dsonar.projectKey=${projectkey} -X"
  }
}
