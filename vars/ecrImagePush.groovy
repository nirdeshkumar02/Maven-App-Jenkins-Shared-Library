def call(String AWSAccountId, String ECRRepoName, String ECRRegion){
    sh """
        aws ecr get-login-password --region ${ECRRegion} | docker login --username AWS --password-stdin ${AWSAccountId}.dkr.ecr.${ECRRegion}.amazonaws.com
        docker push ${AWSAccountId}.dkr.ecr.${ECRRegion}.amazonaws.com/${ECRRepoName}:latest
    """
}