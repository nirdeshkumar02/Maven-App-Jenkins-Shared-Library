def call(String AWSAccountId, String ECRRepoName, String ECRRegion){

    // Scanning ecr Images

    sh """
     trivy image ${AWSAccountId}.dkr.ecr.${ECRRegion}.amazonaws.com/${ECRRepoName}:latest > ecr_scan.txt
     cat ecr_scan.txt
    """
}