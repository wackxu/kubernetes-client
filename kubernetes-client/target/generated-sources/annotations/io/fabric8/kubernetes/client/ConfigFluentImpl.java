package io.fabric8.kubernetes.client;

import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Integer;
import okhttp3.TlsVersion;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class ConfigFluentImpl<A extends ConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConfigFluent<A>{

    private boolean trustCerts;
    private boolean disableHostnameVerification;
    private String masterUrl;
    private String apiVersion;
    private String namespace;
    private String caCertFile;
    private String caCertData;
    private String clientCertFile;
    private String clientCertData;
    private String clientKeyFile;
    private String clientKeyData;
    private String clientKeyAlgo;
    private String clientKeyPassphrase;
    private String trustStoreFile;
    private String trustStorePassphrase;
    private String keyStoreFile;
    private String keyStorePassphrase;
    private String username;
    private String password;
    private String oauthToken;
    private int watchReconnectInterval;
    private int watchReconnectLimit;
    private int connectionTimeout;
    private int requestTimeout;
    private long rollingTimeout;
    private long scaleTimeout;
    private int loggingInterval;
    private long websocketTimeout;
    private long websocketPingInterval;
    private int maxConcurrentRequests;
    private int maxConcurrentRequestsPerHost;
    private String impersonateUsername;
    private OAuthTokenProvider oauthTokenProvider;
    private String impersonateGroup;
    private List<String> impersonateGroups;
    private Map<String,List<String>> impersonateExtras;
    private String httpProxy;
    private String httpsProxy;
    private String proxyUsername;
    private String proxyPassword;
    private List<String> noProxy;
    private String userAgent;
    private List<TlsVersion> tlsVersions;
    private Map<Integer,String> errorMessages;

    public ConfigFluentImpl(){
    }
    public ConfigFluentImpl(Config instance){
            this.withMasterUrl(instance.getMasterUrl()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withNamespace(instance.getNamespace()); 
            this.withTrustCerts(instance.isTrustCerts()); 
            this.withDisableHostnameVerification(instance.isDisableHostnameVerification()); 
            this.withCaCertFile(instance.getCaCertFile()); 
            this.withCaCertData(instance.getCaCertData()); 
            this.withClientCertFile(instance.getClientCertFile()); 
            this.withClientCertData(instance.getClientCertData()); 
            this.withClientKeyFile(instance.getClientKeyFile()); 
            this.withClientKeyData(instance.getClientKeyData()); 
            this.withClientKeyAlgo(instance.getClientKeyAlgo()); 
            this.withClientKeyPassphrase(instance.getClientKeyPassphrase()); 
            this.withUsername(instance.getUsername()); 
            this.withPassword(instance.getPassword()); 
            this.withOauthToken(instance.getOauthToken()); 
            this.withWatchReconnectInterval(instance.getWatchReconnectInterval()); 
            this.withWatchReconnectLimit(instance.getWatchReconnectLimit()); 
            this.withConnectionTimeout(instance.getConnectionTimeout()); 
            this.withRequestTimeout(instance.getRequestTimeout()); 
            this.withRollingTimeout(instance.getRollingTimeout()); 
            this.withScaleTimeout(instance.getScaleTimeout()); 
            this.withLoggingInterval(instance.getLoggingInterval()); 
            this.withMaxConcurrentRequestsPerHost(instance.getMaxConcurrentRequestsPerHost()); 
            this.withHttpProxy(instance.getHttpProxy()); 
            this.withHttpsProxy(instance.getHttpsProxy()); 
            this.withNoProxy(instance.getNoProxy()); 
            this.withErrorMessages(instance.getErrorMessages()); 
            this.withUserAgent(instance.getUserAgent()); 
            this.withTlsVersions(instance.getTlsVersions()); 
            this.withWebsocketTimeout(instance.getWebsocketTimeout()); 
            this.withWebsocketPingInterval(instance.getWebsocketPingInterval()); 
            this.withProxyUsername(instance.getProxyUsername()); 
            this.withProxyPassword(instance.getProxyPassword()); 
            this.withTrustStoreFile(instance.getTrustStoreFile()); 
            this.withTrustStorePassphrase(instance.getTrustStorePassphrase()); 
            this.withKeyStoreFile(instance.getKeyStoreFile()); 
            this.withKeyStorePassphrase(instance.getKeyStorePassphrase()); 
            this.withImpersonateUsername(instance.getImpersonateUsername()); 
            this.withImpersonateGroups(instance.getImpersonateGroups()); 
            this.withImpersonateExtras(instance.getImpersonateExtras()); 
            this.withOauthTokenProvider(instance.getOauthTokenProvider()); 
            this.withMaxConcurrentRequests(instance.getMaxConcurrentRequests());

            this.withImpersonateGroup(instance.getImpersonateGroup());

    }

    public boolean isTrustCerts(){
            return this.trustCerts;
    }

    public A withTrustCerts(boolean trustCerts){
            this.trustCerts=trustCerts; return (A) this;
    }

    public Boolean hasTrustCerts(){
            return true;
    }

    public boolean isDisableHostnameVerification(){
            return this.disableHostnameVerification;
    }

    public A withDisableHostnameVerification(boolean disableHostnameVerification){
            this.disableHostnameVerification=disableHostnameVerification; return (A) this;
    }

    public Boolean hasDisableHostnameVerification(){
            return true;
    }

    public String getMasterUrl(){
            return this.masterUrl;
    }

    public A withMasterUrl(String masterUrl){
            this.masterUrl=masterUrl; return (A) this;
    }

    public Boolean hasMasterUrl(){
            return this.masterUrl != null;
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public String getNamespace(){
            return this.namespace;
    }

    public A withNamespace(String namespace){
            this.namespace=namespace; return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    public String getCaCertFile(){
            return this.caCertFile;
    }

    public A withCaCertFile(String caCertFile){
            this.caCertFile=caCertFile; return (A) this;
    }

    public Boolean hasCaCertFile(){
            return this.caCertFile != null;
    }

    public String getCaCertData(){
            return this.caCertData;
    }

    public A withCaCertData(String caCertData){
            this.caCertData=caCertData; return (A) this;
    }

    public Boolean hasCaCertData(){
            return this.caCertData != null;
    }

    public String getClientCertFile(){
            return this.clientCertFile;
    }

    public A withClientCertFile(String clientCertFile){
            this.clientCertFile=clientCertFile; return (A) this;
    }

    public Boolean hasClientCertFile(){
            return this.clientCertFile != null;
    }

    public String getClientCertData(){
            return this.clientCertData;
    }

    public A withClientCertData(String clientCertData){
            this.clientCertData=clientCertData; return (A) this;
    }

    public Boolean hasClientCertData(){
            return this.clientCertData != null;
    }

    public String getClientKeyFile(){
            return this.clientKeyFile;
    }

    public A withClientKeyFile(String clientKeyFile){
            this.clientKeyFile=clientKeyFile; return (A) this;
    }

    public Boolean hasClientKeyFile(){
            return this.clientKeyFile != null;
    }

    public String getClientKeyData(){
            return this.clientKeyData;
    }

    public A withClientKeyData(String clientKeyData){
            this.clientKeyData=clientKeyData; return (A) this;
    }

    public Boolean hasClientKeyData(){
            return this.clientKeyData != null;
    }

    public String getClientKeyAlgo(){
            return this.clientKeyAlgo;
    }

    public A withClientKeyAlgo(String clientKeyAlgo){
            this.clientKeyAlgo=clientKeyAlgo; return (A) this;
    }

    public Boolean hasClientKeyAlgo(){
            return this.clientKeyAlgo != null;
    }

    public String getClientKeyPassphrase(){
            return this.clientKeyPassphrase;
    }

    public A withClientKeyPassphrase(String clientKeyPassphrase){
            this.clientKeyPassphrase=clientKeyPassphrase; return (A) this;
    }

    public Boolean hasClientKeyPassphrase(){
            return this.clientKeyPassphrase != null;
    }

    public String getTrustStoreFile(){
            return this.trustStoreFile;
    }

    public A withTrustStoreFile(String trustStoreFile){
            this.trustStoreFile=trustStoreFile; return (A) this;
    }

    public Boolean hasTrustStoreFile(){
            return this.trustStoreFile != null;
    }

    public String getTrustStorePassphrase(){
            return this.trustStorePassphrase;
    }

    public A withTrustStorePassphrase(String trustStorePassphrase){
            this.trustStorePassphrase=trustStorePassphrase; return (A) this;
    }

    public Boolean hasTrustStorePassphrase(){
            return this.trustStorePassphrase != null;
    }

    public String getKeyStoreFile(){
            return this.keyStoreFile;
    }

    public A withKeyStoreFile(String keyStoreFile){
            this.keyStoreFile=keyStoreFile; return (A) this;
    }

    public Boolean hasKeyStoreFile(){
            return this.keyStoreFile != null;
    }

    public String getKeyStorePassphrase(){
            return this.keyStorePassphrase;
    }

    public A withKeyStorePassphrase(String keyStorePassphrase){
            this.keyStorePassphrase=keyStorePassphrase; return (A) this;
    }

    public Boolean hasKeyStorePassphrase(){
            return this.keyStorePassphrase != null;
    }

    public String getUsername(){
            return this.username;
    }

    public A withUsername(String username){
            this.username=username; return (A) this;
    }

    public Boolean hasUsername(){
            return this.username != null;
    }

    public String getPassword(){
            return this.password;
    }

    public A withPassword(String password){
            this.password=password; return (A) this;
    }

    public Boolean hasPassword(){
            return this.password != null;
    }

    public String getOauthToken(){
            return this.oauthToken;
    }

    public A withOauthToken(String oauthToken){
            this.oauthToken=oauthToken; return (A) this;
    }

    public Boolean hasOauthToken(){
            return this.oauthToken != null;
    }

    public int getWatchReconnectInterval(){
            return this.watchReconnectInterval;
    }

    public A withWatchReconnectInterval(int watchReconnectInterval){
            this.watchReconnectInterval=watchReconnectInterval; return (A) this;
    }

    public Boolean hasWatchReconnectInterval(){
            return true;
    }

    public int getWatchReconnectLimit(){
            return this.watchReconnectLimit;
    }

    public A withWatchReconnectLimit(int watchReconnectLimit){
            this.watchReconnectLimit=watchReconnectLimit; return (A) this;
    }

    public Boolean hasWatchReconnectLimit(){
            return true;
    }

    public int getConnectionTimeout(){
            return this.connectionTimeout;
    }

    public A withConnectionTimeout(int connectionTimeout){
            this.connectionTimeout=connectionTimeout; return (A) this;
    }

    public Boolean hasConnectionTimeout(){
            return true;
    }

    public int getRequestTimeout(){
            return this.requestTimeout;
    }

    public A withRequestTimeout(int requestTimeout){
            this.requestTimeout=requestTimeout; return (A) this;
    }

    public Boolean hasRequestTimeout(){
            return true;
    }

    public long getRollingTimeout(){
            return this.rollingTimeout;
    }

    public A withRollingTimeout(long rollingTimeout){
            this.rollingTimeout=rollingTimeout; return (A) this;
    }

    public Boolean hasRollingTimeout(){
            return true;
    }

    public long getScaleTimeout(){
            return this.scaleTimeout;
    }

    public A withScaleTimeout(long scaleTimeout){
            this.scaleTimeout=scaleTimeout; return (A) this;
    }

    public Boolean hasScaleTimeout(){
            return true;
    }

    public int getLoggingInterval(){
            return this.loggingInterval;
    }

    public A withLoggingInterval(int loggingInterval){
            this.loggingInterval=loggingInterval; return (A) this;
    }

    public Boolean hasLoggingInterval(){
            return true;
    }

    public long getWebsocketTimeout(){
            return this.websocketTimeout;
    }

    public A withWebsocketTimeout(long websocketTimeout){
            this.websocketTimeout=websocketTimeout; return (A) this;
    }

    public Boolean hasWebsocketTimeout(){
            return true;
    }

    public long getWebsocketPingInterval(){
            return this.websocketPingInterval;
    }

    public A withWebsocketPingInterval(long websocketPingInterval){
            this.websocketPingInterval=websocketPingInterval; return (A) this;
    }

    public Boolean hasWebsocketPingInterval(){
            return true;
    }

    public int getMaxConcurrentRequests(){
            return this.maxConcurrentRequests;
    }

    public A withMaxConcurrentRequests(int maxConcurrentRequests){
            this.maxConcurrentRequests=maxConcurrentRequests; return (A) this;
    }

    public Boolean hasMaxConcurrentRequests(){
            return true;
    }

    public int getMaxConcurrentRequestsPerHost(){
            return this.maxConcurrentRequestsPerHost;
    }

    public A withMaxConcurrentRequestsPerHost(int maxConcurrentRequestsPerHost){
            this.maxConcurrentRequestsPerHost=maxConcurrentRequestsPerHost; return (A) this;
    }

    public Boolean hasMaxConcurrentRequestsPerHost(){
            return true;
    }

    public String getImpersonateUsername(){
            return this.impersonateUsername;
    }

    public A withImpersonateUsername(String impersonateUsername){
            this.impersonateUsername=impersonateUsername; return (A) this;
    }

    public Boolean hasImpersonateUsername(){
            return this.impersonateUsername != null;
    }

    public OAuthTokenProvider getOauthTokenProvider(){
            return this.oauthTokenProvider;
    }

    public A withOauthTokenProvider(OAuthTokenProvider oauthTokenProvider){
            this.oauthTokenProvider=oauthTokenProvider; return (A) this;
    }

    public Boolean hasOauthTokenProvider(){
            return this.oauthTokenProvider != null;
    }

    public String getImpersonateGroup(){
            return this.impersonateGroup;
    }

    public A withImpersonateGroup(String impersonateGroup){
            this.impersonateGroup=impersonateGroup; return (A) this;
    }

    public Boolean hasImpersonateGroup(){
            return this.impersonateGroup != null;
    }

    public A withImpersonateGroups(String... impersonateGroups){
            if (this.impersonateGroups != null) {this.impersonateGroups.clear();}
            if (impersonateGroups != null) {for (String item :impersonateGroups){ this.addToImpersonateGroups(item);}} return (A) this;
    }

    public String[] getImpersonateGroups(){
            //This needs to work with primitives, so we use arrays.
int size = impersonateGroups != null ? impersonateGroups.size() : 0;
String[] result = new String[size];
if (size == 0) {
   return result;
}
int index = 0;
for (String item : impersonateGroups) {
    result[index++]=item;
}
return result;

    }

    public A addToImpersonateGroups(int index,String item){
            if (this.impersonateGroups == null) {this.impersonateGroups = new ArrayList<String>();}
            this.impersonateGroups.add(index, item);
            return (A)this;
    }

    public A setToImpersonateGroups(int index,String item){
            if (this.impersonateGroups == null) {this.impersonateGroups = new ArrayList<String>();}
            this.impersonateGroups.set(index, item); return (A)this;
    }

    public A addToImpersonateGroups(String... items){
            if (this.impersonateGroups == null) {this.impersonateGroups = new ArrayList<String>();}
            for (String item : items) {this.impersonateGroups.add(item);} return (A)this;
    }

    public A addAllToImpersonateGroups(Collection<String> items){
            if (this.impersonateGroups == null) {this.impersonateGroups = new ArrayList<String>();}
            for (String item : items) {this.impersonateGroups.add(item);} return (A)this;
    }

    public A removeFromImpersonateGroups(String... items){
            for (String item : items) {if (this.impersonateGroups!= null){ this.impersonateGroups.remove(item);}} return (A)this;
    }

    public A removeAllFromImpersonateGroups(Collection<String> items){
            for (String item : items) {if (this.impersonateGroups!= null){ this.impersonateGroups.remove(item);}} return (A)this;
    }

    public Boolean hasImpersonateGroups(){
            return impersonateGroups != null && !impersonateGroups.isEmpty();
    }

    public A addToImpersonateExtras(String key,List<String> value){
            if(this.impersonateExtras == null && key != null && value != null) { this.impersonateExtras = new LinkedHashMap<String,List<String>>(); }
            if(key != null && value != null) {this.impersonateExtras.put(key, value);} return (A)this;
    }

    public A addToImpersonateExtras(Map<String,List<String>> map){
            if(this.impersonateExtras == null && map != null) { this.impersonateExtras = new LinkedHashMap<String,List<String>>(); }
            if(map != null) { this.impersonateExtras.putAll(map);} return (A)this;
    }

    public A removeFromImpersonateExtras(String key){
            if(this.impersonateExtras == null) { return (A) this; }
            if(key != null && this.impersonateExtras != null) {this.impersonateExtras.remove(key);} return (A)this;
    }

    public A removeFromImpersonateExtras(Map<String,List<String>> map){
            if(this.impersonateExtras == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.impersonateExtras != null){this.impersonateExtras.remove(key);}}} return (A)this;
    }

    public Map<String,List<String>> getImpersonateExtras(){
            return this.impersonateExtras;
    }

    public A withImpersonateExtras(Map<String,List<String>> impersonateExtras){
            if (impersonateExtras == null) { this.impersonateExtras =  new LinkedHashMap<String,List<String>>();} else {this.impersonateExtras = new LinkedHashMap<String,List<String>>(impersonateExtras);} return (A) this;
    }

    public Boolean hasImpersonateExtras(){
            return this.impersonateExtras != null;
    }

    public String getHttpProxy(){
            return this.httpProxy;
    }

    public A withHttpProxy(String httpProxy){
            this.httpProxy=httpProxy; return (A) this;
    }

    public Boolean hasHttpProxy(){
            return this.httpProxy != null;
    }

    public String getHttpsProxy(){
            return this.httpsProxy;
    }

    public A withHttpsProxy(String httpsProxy){
            this.httpsProxy=httpsProxy; return (A) this;
    }

    public Boolean hasHttpsProxy(){
            return this.httpsProxy != null;
    }

    public String getProxyUsername(){
            return this.proxyUsername;
    }

    public A withProxyUsername(String proxyUsername){
            this.proxyUsername=proxyUsername; return (A) this;
    }

    public Boolean hasProxyUsername(){
            return this.proxyUsername != null;
    }

    public String getProxyPassword(){
            return this.proxyPassword;
    }

    public A withProxyPassword(String proxyPassword){
            this.proxyPassword=proxyPassword; return (A) this;
    }

    public Boolean hasProxyPassword(){
            return this.proxyPassword != null;
    }

    public A withNoProxy(String... noProxy){
            if (this.noProxy != null) {this.noProxy.clear();}
            if (noProxy != null) {for (String item :noProxy){ this.addToNoProxy(item);}} return (A) this;
    }

    public String[] getNoProxy(){
            //This needs to work with primitives, so we use arrays.
int size = noProxy != null ? noProxy.size() : 0;
String[] result = new String[size];
if (size == 0) {
   return result;
}
int index = 0;
for (String item : noProxy) {
    result[index++]=item;
}
return result;

    }

    public A addToNoProxy(int index,String item){
            if (this.noProxy == null) {this.noProxy = new ArrayList<String>();}
            this.noProxy.add(index, item);
            return (A)this;
    }

    public A setToNoProxy(int index,String item){
            if (this.noProxy == null) {this.noProxy = new ArrayList<String>();}
            this.noProxy.set(index, item); return (A)this;
    }

    public A addToNoProxy(String... items){
            if (this.noProxy == null) {this.noProxy = new ArrayList<String>();}
            for (String item : items) {this.noProxy.add(item);} return (A)this;
    }

    public A addAllToNoProxy(Collection<String> items){
            if (this.noProxy == null) {this.noProxy = new ArrayList<String>();}
            for (String item : items) {this.noProxy.add(item);} return (A)this;
    }

    public A removeFromNoProxy(String... items){
            for (String item : items) {if (this.noProxy!= null){ this.noProxy.remove(item);}} return (A)this;
    }

    public A removeAllFromNoProxy(Collection<String> items){
            for (String item : items) {if (this.noProxy!= null){ this.noProxy.remove(item);}} return (A)this;
    }

    public Boolean hasNoProxy(){
            return noProxy != null && !noProxy.isEmpty();
    }

    public String getUserAgent(){
            return this.userAgent;
    }

    public A withUserAgent(String userAgent){
            this.userAgent=userAgent; return (A) this;
    }

    public Boolean hasUserAgent(){
            return this.userAgent != null;
    }

    public A withTlsVersions(TlsVersion... tlsVersions){
            if (this.tlsVersions != null) {this.tlsVersions.clear();}
            if (tlsVersions != null) {for (TlsVersion item :tlsVersions){ this.addToTlsVersions(item);}} return (A) this;
    }

    public TlsVersion[] getTlsVersions(){
            //This needs to work with primitives, so we use arrays.
int size = tlsVersions != null ? tlsVersions.size() : 0;
TlsVersion[] result = new TlsVersion[size];
if (size == 0) {
   return result;
}
int index = 0;
for (TlsVersion item : tlsVersions) {
    result[index++]=item;
}
return result;

    }

    public A addToTlsVersions(int index,TlsVersion item){
            if (this.tlsVersions == null) {this.tlsVersions = new ArrayList<TlsVersion>();}
            this.tlsVersions.add(index, item);
            return (A)this;
    }

    public A setToTlsVersions(int index,TlsVersion item){
            if (this.tlsVersions == null) {this.tlsVersions = new ArrayList<TlsVersion>();}
            this.tlsVersions.set(index, item); return (A)this;
    }

    public A addToTlsVersions(TlsVersion... items){
            if (this.tlsVersions == null) {this.tlsVersions = new ArrayList<TlsVersion>();}
            for (TlsVersion item : items) {this.tlsVersions.add(item);} return (A)this;
    }

    public A addAllToTlsVersions(Collection<TlsVersion> items){
            if (this.tlsVersions == null) {this.tlsVersions = new ArrayList<TlsVersion>();}
            for (TlsVersion item : items) {this.tlsVersions.add(item);} return (A)this;
    }

    public A removeFromTlsVersions(TlsVersion... items){
            for (TlsVersion item : items) {if (this.tlsVersions!= null){ this.tlsVersions.remove(item);}} return (A)this;
    }

    public A removeAllFromTlsVersions(Collection<TlsVersion> items){
            for (TlsVersion item : items) {if (this.tlsVersions!= null){ this.tlsVersions.remove(item);}} return (A)this;
    }

    public Boolean hasTlsVersions(){
            return tlsVersions != null && !tlsVersions.isEmpty();
    }

    public A addToErrorMessages(Integer key,String value){
            if(this.errorMessages == null && key != null && value != null) { this.errorMessages = new LinkedHashMap<Integer,String>(); }
            if(key != null && value != null) {this.errorMessages.put(key, value);} return (A)this;
    }

    public A addToErrorMessages(Map<Integer,String> map){
            if(this.errorMessages == null && map != null) { this.errorMessages = new LinkedHashMap<Integer,String>(); }
            if(map != null) { this.errorMessages.putAll(map);} return (A)this;
    }

    public A removeFromErrorMessages(Integer key){
            if(this.errorMessages == null) { return (A) this; }
            if(key != null && this.errorMessages != null) {this.errorMessages.remove(key);} return (A)this;
    }

    public A removeFromErrorMessages(Map<Integer,String> map){
            if(this.errorMessages == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.errorMessages != null){this.errorMessages.remove(key);}}} return (A)this;
    }

    public Map<Integer,String> getErrorMessages(){
            return this.errorMessages;
    }

    public A withErrorMessages(Map<Integer,String> errorMessages){
            if (errorMessages == null) { this.errorMessages =  new LinkedHashMap<Integer,String>();} else {this.errorMessages = new LinkedHashMap<Integer,String>(errorMessages);} return (A) this;
    }

    public Boolean hasErrorMessages(){
            return this.errorMessages != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigFluentImpl that = (ConfigFluentImpl) o;
            if (trustCerts != that.trustCerts) return false;
            if (disableHostnameVerification != that.disableHostnameVerification) return false;
            if (masterUrl != null ? !masterUrl.equals(that.masterUrl) :that.masterUrl != null) return false;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (caCertFile != null ? !caCertFile.equals(that.caCertFile) :that.caCertFile != null) return false;
            if (caCertData != null ? !caCertData.equals(that.caCertData) :that.caCertData != null) return false;
            if (clientCertFile != null ? !clientCertFile.equals(that.clientCertFile) :that.clientCertFile != null) return false;
            if (clientCertData != null ? !clientCertData.equals(that.clientCertData) :that.clientCertData != null) return false;
            if (clientKeyFile != null ? !clientKeyFile.equals(that.clientKeyFile) :that.clientKeyFile != null) return false;
            if (clientKeyData != null ? !clientKeyData.equals(that.clientKeyData) :that.clientKeyData != null) return false;
            if (clientKeyAlgo != null ? !clientKeyAlgo.equals(that.clientKeyAlgo) :that.clientKeyAlgo != null) return false;
            if (clientKeyPassphrase != null ? !clientKeyPassphrase.equals(that.clientKeyPassphrase) :that.clientKeyPassphrase != null) return false;
            if (trustStoreFile != null ? !trustStoreFile.equals(that.trustStoreFile) :that.trustStoreFile != null) return false;
            if (trustStorePassphrase != null ? !trustStorePassphrase.equals(that.trustStorePassphrase) :that.trustStorePassphrase != null) return false;
            if (keyStoreFile != null ? !keyStoreFile.equals(that.keyStoreFile) :that.keyStoreFile != null) return false;
            if (keyStorePassphrase != null ? !keyStorePassphrase.equals(that.keyStorePassphrase) :that.keyStorePassphrase != null) return false;
            if (username != null ? !username.equals(that.username) :that.username != null) return false;
            if (password != null ? !password.equals(that.password) :that.password != null) return false;
            if (oauthToken != null ? !oauthToken.equals(that.oauthToken) :that.oauthToken != null) return false;
            if (watchReconnectInterval != that.watchReconnectInterval) return false;
            if (watchReconnectLimit != that.watchReconnectLimit) return false;
            if (connectionTimeout != that.connectionTimeout) return false;
            if (requestTimeout != that.requestTimeout) return false;
            if (rollingTimeout != that.rollingTimeout) return false;
            if (scaleTimeout != that.scaleTimeout) return false;
            if (loggingInterval != that.loggingInterval) return false;
            if (websocketTimeout != that.websocketTimeout) return false;
            if (websocketPingInterval != that.websocketPingInterval) return false;
            if (maxConcurrentRequests != that.maxConcurrentRequests) return false;
            if (maxConcurrentRequestsPerHost != that.maxConcurrentRequestsPerHost) return false;
            if (impersonateUsername != null ? !impersonateUsername.equals(that.impersonateUsername) :that.impersonateUsername != null) return false;
            if (oauthTokenProvider != null ? !oauthTokenProvider.equals(that.oauthTokenProvider) :that.oauthTokenProvider != null) return false;
            if (impersonateGroup != null ? !impersonateGroup.equals(that.impersonateGroup) :that.impersonateGroup != null) return false;
            if (impersonateGroups != null ? !impersonateGroups.equals(that.impersonateGroups) :that.impersonateGroups != null) return false;
            if (impersonateExtras != null ? !impersonateExtras.equals(that.impersonateExtras) :that.impersonateExtras != null) return false;
            if (httpProxy != null ? !httpProxy.equals(that.httpProxy) :that.httpProxy != null) return false;
            if (httpsProxy != null ? !httpsProxy.equals(that.httpsProxy) :that.httpsProxy != null) return false;
            if (proxyUsername != null ? !proxyUsername.equals(that.proxyUsername) :that.proxyUsername != null) return false;
            if (proxyPassword != null ? !proxyPassword.equals(that.proxyPassword) :that.proxyPassword != null) return false;
            if (noProxy != null ? !noProxy.equals(that.noProxy) :that.noProxy != null) return false;
            if (userAgent != null ? !userAgent.equals(that.userAgent) :that.userAgent != null) return false;
            if (tlsVersions != null ? !tlsVersions.equals(that.tlsVersions) :that.tlsVersions != null) return false;
            if (errorMessages != null ? !errorMessages.equals(that.errorMessages) :that.errorMessages != null) return false;
            return true;
    }




}
