def call(String DockerHubUser, String ImageName, String ImageTag){
    sh """
        docker push ${DockerHubUser}/${ImageName}:${ImageTag}
        docker push ${DockerHubUser}/${ImageName}:latest
    """
}