# Task-Filebeat-Logstash-Kibana
<details>
<summary>TASK Description</summary>

Install Logstash.

Install Kibana.

Install Filebeat.


Create small Java application and log some messages using log4j to the file on file system.

Configure filebeat to read log file and send log messages into the Logstash.

Configure Logstash to read logs from the filebeat(beats input plugin) and send logs to Elasticsearch (elasticsearch logstash output plugin).

Look at result data in the ElasticSearch using Kibana.


Task result: application, logstash and filebeat configuration files. 


Links:

Downloads: 

https://www.elastic.co/downloads

Logstash DOC: https://www.elastic.co/guide/en/logstash/current/index.html

Logstash input plugins: https://www.elastic.co/guide/en/logstash/current/input-plugins.html

Logstash output plugins: https://www.elastic.co/guide/en/logstash/current/output-plugins.html

</details>

## Configuration

Copy ***filebeat.yml*** to filebeat home folder.

Copy ***logstash.conf*** to logstash home folder.


## RUN 

I propose to follow the next order of actions
(To avoid errors)

<details>
<summary>Start ElasticSearch</summary>
  
```
 bin\elasticsearch
```
</details>
 
<details>
<summary>Start Kibana (optional)</summary> 
  
  ```
   bin\kibana
  ```
</details>

<details>
<summary>Start Logstash</summary> 
   
  ``` 
   bin\logstash -f logstash.conf  --config.reload.automatic
  ``` 
</details>
 
 
<details>
<summary>Start Filebeat</summary> 

  ```  
   filebeat.exe -e -c filebeat.yml -d "publish"
  ``` 
</details>
 
### Run elasticsearch-filebeat-logstash-kibana

For  configuration test use ***elasticsearch-filebeat-logstash-kibana*** application.

This application create records for logfile.

(my default path: C:\TEMP\VIKHLIAYEU\logs\elasticsearch-filebeat-logstash-kibana\*.log)

<details>
<summary>Build application with maven</summary> 
Go to folder ***elasticsearch-filebeat-logstash-kibana*** and build application with maven

  ```
  cd elasticsearch-filebeat-logstash-kibana
  
  mvn clean package install
  ```
</details>

You can run this application from IDE or use run jar (executable file)/

<details>
<summary>Execute runnable jar file</summary> 
 
  ```
  java -jar elasticsearch-filebeat-logstash-kibana-1.0-jar-with-dependencies.jar
  ```
</details>

After all step show result in kibana 
http://localhost:5601