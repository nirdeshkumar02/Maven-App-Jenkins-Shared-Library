def call(String credentialsId, String DockerHubUser, String ImageName, String ImageTag){
    withCredentials([usernamePassword(credentialsId: ${credentialsId}, passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker login -u ${USER} -p ${PASS}"
    }
    sh """
        docker push ${DockerHubUser}/${ImageName}:${ImageTag}
        docker push ${DockerHubUser}/${ImageName}:latest
    """
}