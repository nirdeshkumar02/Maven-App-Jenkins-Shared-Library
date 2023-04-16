def call(String ACCESS_KEY, String SECRET_KEY, String Region) {
    sh """
        terraform init
        terraform plan -var 'access_key=$ACCESS_KEY' -var 'secret_key=$SECRET_KEY' -var 'region=${Region}' --var-file=terraform.tfvars
        terraform apply -var 'access_key=$ACCESS_KEY' -var 'secret_key=$SECRET_KEY' -var 'region=${Region}' --var-file=terraform.tfvars --auto-approve
    """
}