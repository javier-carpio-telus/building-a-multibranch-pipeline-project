pipeline ("my_new_pipeline") {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'echo "Job created from seed!"' 
            }
        }
    }
}