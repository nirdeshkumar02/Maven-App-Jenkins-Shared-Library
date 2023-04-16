def call(String AWSAccountId, String ECRRepoName, String Region){

    // CleanUp ECR Image

    sh """
     docker rmi ${ECRRepoName}:latest ${AWSAccountId}.dkr.ecr.${Region}.amazonaws.com/${ECRRepoName}:latest
    """
}