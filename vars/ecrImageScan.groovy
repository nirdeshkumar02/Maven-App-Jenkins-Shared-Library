def call(String AWSAccountId, String ECRRepoName, String Region){

    // Scanning ecr Images

    sh """
     trivy image ${AWSAccountId}.dkr.ecr.${Region}.amazonaws.com/${ECRRepoName}:latest > ecr_scan.txt
     cat ecr_scan.txt
    """
}