package org.quarkus.model;

import org.bson.types.ObjectId;

public class Log  {
    public ObjectId id;
    public String ruc;
    public String businessName;
    public String request;
    public String response;
    public String thirdPartyRequestXml;
    public String thirdPartyResponseXml;
    public String requestDate;
    public String responseDate;
    public String thirdPartyServiceInvocationDate;
    public String thirdPartyServiceResponseDate;
    public String objectTypeAndDocEntry;
    public String seriesAndCorrelative;
}