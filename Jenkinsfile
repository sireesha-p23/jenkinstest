pipeline { 
	agent any
	 stages{ 
 		stage('Maven Compile'){ 
 		steps{ 
 				echo 'Project compile stage'
  				sh label: 'Compilation running', script: '''mvn compile''' 
	 		} 
 			} 
 		stage('Unit Test') 
 		{ 
 		steps { echo 'Project Testing stage' 
 		sh label: 'Test running', script: '''mvn test''' 
		} 
 		}
		 stage('SonarQube'){
         steps{
            sh label: '', script: '''mvn sonar:sonar \
		 -Dsonar.host.url=http://localhost:9000 \
 		-Dsonar.login=12e888e1026ba5bc990fba5eca10f687e088e673'''
          }
}
	
	 stage('Maven Package'){ 
		 steps{ 
		 echo 'Project packaging stage'
  		sh label: 'Project packaging', script: '''mvn package'''
  		}
   		}
    } 
 } 
