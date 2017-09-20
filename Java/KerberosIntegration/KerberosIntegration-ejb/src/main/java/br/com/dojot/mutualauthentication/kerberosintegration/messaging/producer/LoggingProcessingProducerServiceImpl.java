package br.com.dojot.mutualauthentication.kerberosintegration.messaging.producer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import br.com.dojot.mutualauthentication.communication.constants.CommunicationKeysConstants;
import br.com.dojot.mutualauthentication.communication.facade.api.CommunicationFacade;
import br.com.dojot.mutualauthentication.communication.facade.impl.CommunicationFacadeBean;
import br.com.dojot.mutualauthentication.kerberosintegration.beans.dto.LoggingDTO;
import br.com.dojot.mutualauthentication.kerberosintegration.dao.api.ConfigDAO;
import br.com.dojot.mutualauthentication.kerberosintegration.messaging.api.LoggingProcessingProducerService;
import br.com.dojot.mutualauthentication.kerberosintegration.utils.KerberosIntegrationConstants;


@Startup
@Singleton
public class LoggingProcessingProducerServiceImpl extends Thread implements LoggingProcessingProducerService {
	private ProducerServiceImpl producer;
	
	@EJB
	private ConfigDAO configDAO;
    
	@PostConstruct
	public void init() {
		CommunicationFacade facade = new CommunicationFacadeBean();
		producer = new ProducerServiceImpl(facade.requestKafkaBrokers(),
				KerberosIntegrationConstants.TOPIC_LOGGING_PROCESSING,
				(String) facade.requestNodeConfigs().get(CommunicationKeysConstants.KEY_VERSION), "ker.logprocessing.");
	}
	
	@PreDestroy
	public void close() {
		producer.close();
	}

	@Override
	public void produce(LoggingDTO dto) {
		producer.produce(dto);
	}

}