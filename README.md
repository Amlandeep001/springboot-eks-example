# springboot-eks-example
Spring Boot Demo Application for deploying into AWS EKS Cluster

C:\Workspaces\cloud\springboot-eks>aws configure
AWS Access Key ID [None]: <access-key>
AWS Secret Access Key [None]: <secret-key>
Default region name [None]: ap-south-1
Default output format [None]: JSON

------------------------------------------------------------------------------------------------------------------
ECR URI: <ECR-URI> -- update it in k8s.yaml file for "image"


Create EKS Cluster
------------------------------------------------------------------------------------------------------------------
eksctl create cluster --name amlan-cluster --version 1.29 --nodes=1 --node-type=t2.small --region ap-south-1

cluster name: amlan-cluster
version: kubernetes version
t2.small: EC2 instance

Configure kubectl to Use the EKS Cluster:
------------------------------------------------------------------------------------------------------------------
aws eks --region ap-south-1 update-kubeconfig --name amlan-cluster
------------------------------------------------------------------------------------------------------------------

Get the service url(EXTERNAL-IP) from below command:

kubectl get svc

<EXTERNAL-IP>/greetings -> API endpoint testing


Deelete Cluster: 
------------------------------------------------------------------------------------------------------------------
eksctl delete cluster amlan-cluster
