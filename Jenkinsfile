pipeline {
    agent any
    stages {
        stage('Initial check') {
            steps {
                //Check branch name
                //String  = env.BRANCH_NAME
                //println('Branch name: ' + env.BRANCH_NAME) //development
                jobName = env.JOB_NAME
                jobName = jobName.replace("/","_")
                println('Job name: ' + jobName) //building-a-multibranch-pipeline-project/development
                //println('Job base name: ' + env.JOB_BASE_NAME) //development
                sh 'echo "Print script echo:"'
                sh 'echo "Checking if jobs exists"'
                //Check build-app-job exists
                build job: 'JobSeeder', parameters: [
                    [$class: 'StringParameterValue', name: 'NEW_JOB_NAME', value: jobName + "_build-app"],
                    [$class: 'StringParameterValue', name: 'REPOSITORY_URL', value: scm.getUserRemoteConfigs()[0].getUrl()],
                    [$class: 'StringParameterValue', name: 'DSL_PATH', value: 'jenkins/build-app.dsl.groovy']
                ]
                //if (jenkins.model.Jenkins.instance.getItem( env.JOB_NAME + "_build-app" ) != null) {
                //    println("Job " + env.JOB_NAME + "_build-app" + " exists." )
                //}
                //Check build-image-job exists
                //Check upload-image-exists
                //Check deploy-image exists
                //Check test-job exists
            }
        }
        
        stage('Build app') {
            steps {
                sh 'echo "Hello world!"'
            }
        }
        
        stage('Build image') {
            steps {
                sh 'echo "Hello world!"'
            }
        }
        
        stage('Upload image') {
            steps {
                sh 'echo "Hello world!"'
            }
        }

        
        stage('Deploy image') {
            steps {
                sh 'echo "Hello world!"'
            }
        }

        stage('Test') {
            steps {
                sh 'echo "Hello world!"'
            }
        }

    }
}
