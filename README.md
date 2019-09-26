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

## kafka-tools
```
http://www.kafkatool.com/download.html
clicar em Linux	8 MB	Download para linux
abrirá uma pagina com um script.sh   http://www.kafkatool.com/download2/kafkatool.sh

1-nessa pagina clique com o botão direito e escolha salvar como
2-copie o  arquivo kafkatoll.sh   que esta na pasta dowload e cole em outra pasta
3-de permissão ao arquivo chmod +x kafkatool.sh
4-./kafkatool.sh     e agora sera instalado o kafikatool no linux

```

## Configurar kafka-tools apos rodar o docker
```
Cluster name: produtor-kafka_zoo1_1
Kafka cluster Version: 2.0
Zookeeper Host: localhost
Zookeeper port: 2181
chroot path: /
Bootstrap servers: 127.0.0.1:9092

clique em testar
clique em add

```