def call(String AWSAccountId, String ECRRepoName, String ECRRegion){
    sh """
        docker build -t ${ECRRepoName} .
        docker tag ${ECRRepoName}:latest ${AWSAccountId}.dkr.ecr.${ECRRegion}.amazonaws.com/${ECRRepoName}:latest
    """
}