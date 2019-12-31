package io.fabric8.kubernetes.client;

import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class RequestConfigFluentImpl<A extends RequestConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RequestConfigFluent<A>{

    private String username;
    private String password;
    private String oauthToken;
    private OAuthTokenProvider oauthTokenProvider;
    private String impersonateUsername;
    private List<String> impersonateGroups;
    private Map<String,List<String>> impersonateExtras;
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

    public RequestConfigFluentImpl(){
    }
    public RequestConfigFluentImpl(RequestConfig instance){
            this.withUsername(instance.getUsername()); 
            this.withPassword(instance.getPassword()); 
            this.withOauthToken(instance.getOauthToken()); 
            this.withWatchReconnectLimit(instance.getWatchReconnectLimit()); 
            this.withWatchReconnectInterval(instance.getWatchReconnectInterval()); 
            this.withConnectionTimeout(instance.getConnectionTimeout()); 
            this.withRollingTimeout(instance.getRollingTimeout()); 
            this.withRequestTimeout(instance.getRequestTimeout()); 
            this.withScaleTimeout(instance.getScaleTimeout()); 
            this.withLoggingInterval(instance.getLoggingInterval()); 
            this.withWebsocketTimeout(instance.getWebsocketTimeout()); 
            this.withWebsocketPingInterval(instance.getWebsocketPingInterval()); 
            this.withMaxConcurrentRequests(instance.getMaxConcurrentRequests()); 
            this.withMaxConcurrentRequestsPerHost(instance.getMaxConcurrentRequestsPerHost()); 
            this.withOauthTokenProvider(instance.getOauthTokenProvider()); 
            this.withImpersonateUsername(instance.getImpersonateUsername());

            this.withImpersonateGroups(instance.getImpersonateGroups());

            this.withImpersonateExtras(instance.getImpersonateExtras());

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

    public OAuthTokenProvider getOauthTokenProvider(){
            return this.oauthTokenProvider;
    }

    public A withOauthTokenProvider(OAuthTokenProvider oauthTokenProvider){
            this.oauthTokenProvider=oauthTokenProvider; return (A) this;
    }

    public Boolean hasOauthTokenProvider(){
            return this.oauthTokenProvider != null;
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RequestConfigFluentImpl that = (RequestConfigFluentImpl) o;
            if (username != null ? !username.equals(that.username) :that.username != null) return false;
            if (password != null ? !password.equals(that.password) :that.password != null) return false;
            if (oauthToken != null ? !oauthToken.equals(that.oauthToken) :that.oauthToken != null) return false;
            if (oauthTokenProvider != null ? !oauthTokenProvider.equals(that.oauthTokenProvider) :that.oauthTokenProvider != null) return false;
            if (impersonateUsername != null ? !impersonateUsername.equals(that.impersonateUsername) :that.impersonateUsername != null) return false;
            if (impersonateGroups != null ? !impersonateGroups.equals(that.impersonateGroups) :that.impersonateGroups != null) return false;
            if (impersonateExtras != null ? !impersonateExtras.equals(that.impersonateExtras) :that.impersonateExtras != null) return false;
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
            return true;
    }




}
