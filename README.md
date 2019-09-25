# produtor-kafka dowlond do kafka kafka_2.11-1.1.0

## startar o zookeeper
```
bin/zookeeper-server-start.sh config/zookeeper.properties
```
## startar o server
```
bin/kafka-server-start.sh config/server.properties
```
## criar topic
```
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example_json
```
## deletar um topico
```
bin/kafka-topics.sh --delete --zookeeper localhost:2181  --topic Kafka_Example
```
## listar
```
bin/kafka-topics.sh --list --zookeeper localhost:2181
```
## Producer
```
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Kafka_Example
```
## consumer mandando pelo postman
```
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic "Kafka_Example" --from-beginning
```
## consumer
```
bin/kafka-console-consumer.sh --zookeeper localhost:2181 --topic "Kafka_Example" --from-beginning
```

## 1 - Startar o kafka pelo docker
```
export DOCKER_HOST_IP=127.0.0.1
```


## 2 - Run with:
```
docker-compose -f zk-single-kafka-single.yml up
docker-compose -f zk-single-kafka-single.yml down
```
## 3 - Postman
```
curl: POST localhost:8081/kafka/publish
{
	"name":"Goku",
	"idade":"31"
}
```
