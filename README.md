Test is a maven project. The sources are organized in a typical maven2 structure

To release without deploying the site
> mvn release:clean release:prepare release:perform -Dgoals=deploy

To deploy the site
> mvn site site:deploy
