def call(){
    sh """
        kubectl delete -f deployment.yaml
    """
}