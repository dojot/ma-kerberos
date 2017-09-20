INSERT INTO kerberos_config (id, property, value, description) VALUES 
(nextval('kerberos_config_id_seq'), 'SERVER_KEY', '03030303030303030303030303030303', 'Cryptographic key used to encrypt messages which should be only readable by the kerberos server.');
INSERT INTO kerberos_config (id, property, value, description) VALUES 
(nextval('kerberos_config_id_seq'), 'SERVER_NAME', '0101010101010101010101010101010101010101010101010101010101010101', 'Server name that must be present in kerberos messages exchanged with the kerberos server.');

INSERT INTO timeout (id, integration, description, timeout) VALUES (1, 'TIMEOUT_SAVE_CRYPTO_CHANNEL_SERVICE', 'Integração com o serviço que salva o canal seguro.', 3000);
INSERT INTO timeout (id, integration, description, timeout) VALUES (2, 'TIMEOUT_REGISTER_CRYPTO_CHANNEL_SERVICE', 'Integração com o serviço que registra o canal seguro.', 3000);
INSERT INTO timeout (id, integration, description, timeout) VALUES (3, 'TIMEOUT_UNREGISTER_CRYPTO_CHANNEL_SERVICE', 'Integração com o serviço que cancela o canal seguro.', 3000);
INSERT INTO timeout (id, integration, description, timeout) VALUES (4, 'TIMEOUT_ENCRYPT_SERVICE', 'Integração com o serviço de encriptação.', 3000);
INSERT INTO timeout (id, integration, description, timeout) VALUES (5, 'TIMEOUT_ENCRYPT_CC_SERVICE', 'Integração com o serviço de  encriptação.', 3000);
INSERT INTO timeout (id, integration, description, timeout) VALUES (6, 'TIMEOUT_DECRYPT_SERVICE', 'Integração com o serviço de decriptação.', 3000);
INSERT INTO timeout (id, integration, description, timeout) VALUES (7, 'TIMEOUT_DECRYPT_CC_SERVICE', 'Integração com o serviço de decriptação.', 3000);
