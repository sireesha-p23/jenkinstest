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
		 -Dsonar.host.url=http://13.212.51.147:9090 \
 		-Dsonar.login=35ce1dac06a5712b0e72567a9bba1b856d18977b'''
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
