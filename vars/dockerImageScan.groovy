def call(String DockerHubUser, String ImageName){

    // Scanning Docker Images

    sh """
     trivy image ${DockerHubUser}/${ImageName}:latest > scan.txt
     cat scan.txt
    """
}