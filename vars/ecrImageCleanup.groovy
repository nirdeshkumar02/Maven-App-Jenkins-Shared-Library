def call(String AWSAccountId, String ECRRepoName, String ECRRegion){

    // CleanUp ECR Image

    sh """
     docker rmi ${ECRRepoName}:latest ${AWSAccountId}.dkr.ecr.${ECRRegion}.amazonaws.com/${ECRRepoName}:latest
    """
}