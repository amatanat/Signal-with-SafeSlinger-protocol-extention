Run TextSecure-Server using https
-----------------------------------------

You can generate a root CA, host key and certificates and keystores for the server
using the gencert scripts, for example if your server is running on 192.168.0.201

ALTNAME=IP:192.168.0.201 ./gencerts

Copy the resulting example.keystore to config/ as referenced by local.yml in TextSecure-Server and
the rootCA.crt file to the trusted credentials list in device. 
As well as, add root.crt to Signal-Android -> res -> raw -> whisper.store;redphone.store. Follow this steps: 

Keystore Explorer > Open an existing keystore > Select whisper.store. Password is "whisper". From Tools > import trusted certificate > select your certificate(root.crt) and save. Same for redphone.store. 

Change TEXTSECURE_URL in build.gradle in Signal-Android to be the same as the server's IP address, for example if your server is running on 192.168.0.201 then TEXTSECURE_URL should be "https://192.168.0.201:8080\"


