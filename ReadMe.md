keycloak-integration  process to be added

1. From https://start.spring.io/ generate a project with name ‘keycloak-integration’ with deps ‘Web’ , ‘actuator’ , ‘thymeleaf’ . Once downloaded, unzip and add keycloak-boot-starter dependency in maven pom.xml file.
<!-- https://mvnrepository.com/artifact/org.keycloak/keycloak-spring-boot-starter -->
		<dependency>
			<groupId>org.keycloak</groupId>
			<artifactId>keycloak-spring-boot-starter</artifactId>
			<version>12.0.2</version>
		</dependency> 

2. Open the application.properties file to put configurable property to connect/integrate with keycloak server. As we aren’t using spring-security for this demo we do need to provide which patterns of api we need to secure and what role is authorized to pass that barrier.\

                          keycloak.auth-server-url=http://keycloak-keycloak.apps.cluster-59ee.59ee.sandbox702.opentlc.com/auth
                          keycloak.realm=abhiroop-keycloak-poc
                          keycloak.public-client=true
                          keycloak.resource=keycloak-integration


                          keycloak.security-constraints[0].authRoles[0]=role_account_admin
                          keycloak.security-constraints[0].securityCollections[0].patterns[0]=/account-list/*


                          server.tomcat.redirect-context-root=false
                          

3. Create one Restcontroller AccountRestController with few mappings '/' , 'account-list' (this one will be secured via keycloak) etc.
