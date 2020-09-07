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
	 stage('Maven Package'){ 
		 steps{ 
		 echo 'Project packaging stage'
  		sh label: 'Project packaging', script: '''mvn package'''
  		}
   		}
    } 
 } 