# Automate Databases using GithubActions and Azure Pipelines !


## GithubAction Lab 1 : Azure SQL Database and update database as code
[BranchLink : AzureSQLDatabase](https://github.com/jethanivijay/DevOpsforDatabasesHandsonLab/tree/AzureSQLDatabase)

## GithubAction Lab 2 : Azure MYSQL Database and update database as code
[BranchLink : AzureMYSQL](https://github.com/jethanivijay/DevOpsforDatabasesHandsonLab/tree/AzureMYSQLDatabase)

## GithubAction Lab 3 : Azure Postgres Database and update database as code
[BranchLink : AzurePostgresDatabase](https://github.com/jethanivijay/DevOpsforDatabasesHandsonLab/tree/AzurePostgresDatabase)

## GithubAction Lab 4  : Create Online Polls using Django App and PostgreSQL DB
[BranchLink : Django App and PostgreSQL DB](https://github.com/jethanivijay/DevOpsforDatabasesHandsonLab/tree/DjangoPostgresdb)

## GithubAction Lab 5 : Create Webapp for Car Rental Vendor using Java and MySQL
[BranchLink : Java and MySQL DB ](https://github.com/jethanivijay/DevOpsforDatabasesHandsonLab/tree/JavaMySQLdb)

## AzurePipelines Lab 6 :Create Polls using Django App and PostgresQLDB
[BranchLink : Polls App](https://github.com/jethanivijay/DevOpsforDatabasesHandsonLab/tree/AzureDevOps-DjangoPostgredb)

## AzurePipelines Lab 7 :Create Car Rental Wesbite using Java and MySQLDB
[BranchLink : CarRental](https://github.com/jethanivijay/DevOpsforDatabasesHandsonLab/tree/AzureDevOps-JavaMySQL)

##  Instructions to Get Started on this Labs

**Prequisite(Mandate)**
### 1. Github Personal Account

![GithubAccount](/GithubPersonalAccount.JPG)

### 2. Azure Subscription

![AzureFreeAccount](/AzureFreeAccount.JPG)

## Step by Step Guides to help you get started ! 

[**Reference 1 : Github Actions Syntax**](https://docs.github.com/en/free-pro-team@latest/actions/reference/workflow-syntax-for-github-actions)


[**Reference 2 : Connecting to Azure using Service principal**](https://docs.microsoft.com/en-us/cli/azure/create-an-azure-service-principal-azure-cli)

Service Principal is used to Authenticate and perform task on Azure subscription.
Here is command line reference to create one service principal for you

- **Giving Service Principal access to Complete Subscription**

    az ad sp create-for-rbac --name "myApp" --role contributor --scopes /subscriptions/{subscription-id} --sdk-auth

- **If you want scope of service principal retricted to resource Group follow command below**

    az ad sp create-for-rbac --name "myApp" --role contributor --scopes /subscriptions/{subscription-id}/resourceGroups/{resource-group} --sdk-auth

    Output of this will be similar 


      {

        "clientId": "<GUID>",

        "clientSecret": "<GUID>",

        "subscriptionId": "<GUID>",

        "tenantId": "<GUID>",

        (...)

      }

Copy Complete Parenthesis and create Github Secret , This will be our First Github Secret !




## Code Branches for this Hands on Lab

![**Reference 3 : Code Branches for this Hands on Lab**](codebranches.JPG)
