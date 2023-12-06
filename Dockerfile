# Imagem oficial do OpenJDK como base
FROM openjdk:17-jdk

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia os arquivos de configuração e código-fonte para o contêiner
COPY . /app

# Define o comando de inicialização do aplicativo
ENTRYPOINT ["java", "-jar", "target/UnitsTests-1.0-SNAPSHOT.jar"]
