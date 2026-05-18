def call(String projectname,String imageTag,String DockerHubUser){
 sh "docker build -t ${DockerHubUser}/${projectname}:$imageTag ."
}
