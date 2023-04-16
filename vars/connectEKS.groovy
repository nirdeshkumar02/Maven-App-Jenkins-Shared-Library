def call(String ACCESS_KEY, String SECRET_KEY, String Region, String EKSCluster){
    sh """
        aws configure set aws_access_key_id "${ACCESS_KEY}"
        aws configure set aws_secret_access_key "${SECRET_KEY}"
        aws configure set region "${Region}"
        aws eks --region ${Region} update-kubeconfig --name ${EKSCluster}
    """
}