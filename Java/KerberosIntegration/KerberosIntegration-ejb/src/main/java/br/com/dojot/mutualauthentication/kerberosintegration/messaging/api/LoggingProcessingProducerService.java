package br.com.dojot.mutualauthentication.kerberosintegration.messaging.api;

import br.com.dojot.mutualauthentication.kerberosintegration.beans.dto.LoggingDTO;

public interface LoggingProcessingProducerService {
	
	void produce(LoggingDTO dto);
}
