单机模式启动nacos
sh startup.sh -m standalone


启动sentinel控制台
java -Dserver.port=8071 -Dcsp.sentinel.dashboard.server=localhost:8071 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.2.jar