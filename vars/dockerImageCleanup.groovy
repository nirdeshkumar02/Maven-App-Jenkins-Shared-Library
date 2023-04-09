def call(String DockerHubUser, String ImageName, String ImageTag){

    // CleanUp Docker Image

    sh """
     docker rmi ${DockerHubUser}/${ImageName}:${ImageTag}
     docker rmi ${DockerHubUser}/${ImageName}:latest
    """
}