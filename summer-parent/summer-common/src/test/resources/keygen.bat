keytool -genseckey -storetype pkcs12 -keystore springapp.p12 -keyalg HMacSHA256 -keysize 256


keytool -keystore keystore.p12 -storetype pkcs12 -storepass storepass -genkeypair -keyalg RSA

keytool -list -keystore keystore.p12
keytool -list -rfc -keystore keystore.p12 | openssl x509 -inform PEM -pubkey

openssl x509 -in cert.pem -inform PEM -text -pubkey
