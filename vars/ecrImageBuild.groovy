def call(String AWSAccountId, String ECRRepoName, String Region){
    sh """
        docker build -t ${ECRRepoName} .
        docker tag ${ECRRepoName}:latest ${AWSAccountId}.dkr.ecr.${Region}.amazonaws.com/${ECRRepoName}:latest
    """
}