# gc-example-b

# PRERUQUISITOS
Gradle -> Para compilar el java -> https://gradle.org/install/
Docker -> Para generar la imagen
Cluster de Kubernetes. Se sugiere GKE
ISTIO:  
 - Pilot
 - Ingressgateway
 - Mixer
 - AutoInjector
 - Un namespace con autoinjector habilitado
# INSTRUCCIONES
Tal vez tengan que dar permiso de ejecucion al gradlew que esta en este directorio -> chmod +x gradlew
Cambiar los directorios del DockerfileAllInOne ya que apuntan al directorio de mi maquina personal

Contruir la imagen
$ docker build -f DockerfileAllInOne .
Tagearla
$ docker tag 
Subirla al registry
$ docker push

## GENERAR LOS OBJETOS DE KUBERNETES
Hay dos aproximaciones a manita con kubectl apply o con Helm
# KUBECTL APPLY
Entrar al folder kubernetes-objects y editar los yaml para que coincidan con los namespaces
