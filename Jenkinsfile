pipeline {
    agent any
    stages {
        stage('Initial check') {
            steps {
                //Check branch name
                //String  = env.BRANCH_NAME
                println('Branch name: ' + env.BRANCH_NAME)
                println('Job name: ' + env.JOB_NAME)
                println('Job base name: ' + env.JOB_BASE_NAME)
                sh 'echo "Print script echo:"'
                sh 'echo "Checking if jobs exists"'
                //Check build-app-job exists
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
