def call(String AWSAccountId, String ECRRepoName, String Region){
    sh """
        aws ecr get-login-password --region ${Region} | docker login --username AWS --password-stdin ${AWSAccountId}.dkr.ecr.${Region}.amazonaws.com
        docker push ${AWSAccountId}.dkr.ecr.${Region}.amazonaws.com/${ECRRepoName}:latest
    """
}