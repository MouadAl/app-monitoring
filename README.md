# App-monitoring
## What it does ? 
The project is about monitoring a spring boot app deployed on a production server. Two metrics were  chosen  to track (CPU, MEMORY).
I have collected data with Prometheus and  made a dashboard  to visualise it  using Grafana.
Also, I have set an alert rule to send an email whenever the CPU usage is above 60%
![pipeline-image](images/pipeline.jfif)


![ci-cd-image](images/ci-cd.PNG)



## What I learned ? 

<ul>
<li>Spring boot actuator</li>
<li>Prometheus </li>
<li>Grafana </li>

</ul>

## How to run ?
step1: add the lines below to prometheus.yml
```
  - job_name: "spring-actuator"
    metrics_path: "/actuator/prometheus"
    scrape_interval: 5s
    static_configs:
      - targets: ["localhost:8080"]
 ```
 step2: start the app: </br>
  execute `mvn package install` </br>
  then `java -jar "the new jar file on target directory " ` </br>
  
 step3: start Prometheus </br>
 
 step4: start Grafana: </br>
 
 connect grafana with prometheus server </br>
 import the dashboard "memory-cpu-monitoring-dashboard" </br>

