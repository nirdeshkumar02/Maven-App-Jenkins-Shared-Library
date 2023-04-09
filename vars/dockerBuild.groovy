def call(String DockerHubUser, String ImageName, String ImageTag){

    // Building and Tagging Docker Hub Image

    sh """
     docker build -t ${DockerHubUser}/${ImageName} . 
     docker tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:${ImageTag}
     docker tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:latest
    """
}