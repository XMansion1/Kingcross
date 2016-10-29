# Kingcross
Spring boot project integrated with keycloak. Small sample thal talks about how to integrate keycoak with spring boot module

To enable support for Keycloak security following things needs to be added.
 1. Setup a keycloak server
 2. Add dependecies for keycloak *(Refer build.gradle)*
 3. Keycloak provides an implementation of spring security *Refer keycloakSecurity.xml* in the resource folder
 4. Inside the above xml we provide the intercept urls and roles which possibly have access to the url
 5. In the controller, we have provided two endpoints */echo* which will be accessible to everyone and */secured_echo* which will be accesible only for authenticated users
 6. *KeycloakSecurity.xml* requires *keycloak.json* which can be found under resources. This *keycloak.json* is pretty much empty in this case, you can get your own once you set up the keycloak and add your clients
