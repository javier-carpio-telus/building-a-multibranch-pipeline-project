pipeline {
    agent any
    stages {
        stage('Create') { 
            steps {
                
                scm {
                    git("$REPOSITORY_URL")
                }
                jobDsl targets: 'jenkins/build-app.dsl.groovy',
                    ignoreExisting: true,
                    additionalParameters: [
                        NEW_JOB_NAME: "$NEW_JOB_NAME"
                    ]
                sh "echo \"Param NEW_JOB_NAME $NEW_JOB_NAME\" "
            }
        }
    }
}
