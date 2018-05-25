# springboot-without-webserver
A simple example displaying how to disable web server in springboot app

Comment the default spring app behaviour

SpringApplication.run(SpringbootWithoutWebServerApplication.class, args)
		
this will disable web server for springboot app by code

new SpringApplicationBuilder(SpringbootWithoutWebServerApplication.class).web(false).run(args);

(or)
		
just add spring.main.web-environment=false to your yml or properties to disable from configurations
