def call(credentialsId, String DockerHubUser, String ImageName, String ImageTag){
    withCredentials([usernamePassword(
        credentialsId: credentialsId,
        usernameVariable: "USER"
        passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    sh """
        docker push ${DockerHubUser}/${ImageName}:${ImageTag}
        docker push ${DockerHubUser}/${ImageName}:latest
    """
}