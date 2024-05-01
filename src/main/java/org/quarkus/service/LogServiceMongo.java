package org.quarkus.service;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.quarkus.model.Log;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class LogServiceMongo implements PanacheMongoRepository<Log> {

  public List<Log> getLogs(int N) {
    List<Log> logs = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        for (int k = 0; k < N; k++) {
          Log log = new Log();
          log.id = new ObjectId();
          log.ruc = "ruc" + i + j + k;
          log.businessName = "businessName" + i + j + k;
          log.request = "request" + i + j + k;
          log.response = "response" + i + j + k;
          log.thirdPartyRequestXml = "thirdPartyRequestXml" + i + j + k;
          log.thirdPartyResponseXml = "thirdPartyResponseXml" + i + j + k;
          log.requestDate = "requestDate" + i + j + k;
          log.responseDate = "responseDate" + i + j + k;
          log.thirdPartyServiceInvocationDate = "thirdPartyServiceInvocationDate" + i + j + k;
          log.thirdPartyServiceResponseDate = "thirdPartyServiceResponseDate" + i + j + k;
          log.objectTypeAndDocEntry = "objectTypeAndDocEntry" + i + j + k;
          log.seriesAndCorrelative = "seriesAndCorrelative" + i + j + k;
          logs.add(log);
        }
      }
    }
    return logs;
  }

}