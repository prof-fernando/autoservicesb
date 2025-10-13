# criar uma imagem somente com Java
FROM eclipse-temurin:latest
# na maquina a ser criada, cria um diretorio na raiz
WORKDIR /app
# copia o arquivo executavel para dentro da maquina
COPY target/api-0.0.1-SNAPSHOT.jar api.jar
# abre a porta 8080 para acesso de fora do container
EXPOSE 8080
# executa o comando para iniciar a aplicação
CMD ["java", "-jar", "api.jar"]