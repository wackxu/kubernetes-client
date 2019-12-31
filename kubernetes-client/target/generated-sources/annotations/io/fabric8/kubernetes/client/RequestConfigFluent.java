package io.fabric8.kubernetes.client;

import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import io.sundr.builder.annotations.Buildable;
import java.util.LinkedHashMap;

public interface RequestConfigFluent<A extends RequestConfigFluent<A>> extends Fluent<A>{


    public String getUsername();
    public A withUsername(String username);
    public Boolean hasUsername();
    public String getPassword();
    public A withPassword(String password);
    public Boolean hasPassword();
    public String getOauthToken();
    public A withOauthToken(String oauthToken);
    public Boolean hasOauthToken();
    public OAuthTokenProvider getOauthTokenProvider();
    public A withOauthTokenProvider(OAuthTokenProvider oauthTokenProvider);
    public Boolean hasOauthTokenProvider();
    public String getImpersonateUsername();
    public A withImpersonateUsername(String impersonateUsername);
    public Boolean hasImpersonateUsername();
    public A withImpersonateGroups(String... impersonateGroups);
    public String[] getImpersonateGroups();
    public A addToImpersonateGroups(int index,String item);
    public A setToImpersonateGroups(int index,String item);
    public A addToImpersonateGroups(String... items);
    public A addAllToImpersonateGroups(Collection<String> items);
    public A removeFromImpersonateGroups(String... items);
    public A removeAllFromImpersonateGroups(Collection<String> items);
    public Boolean hasImpersonateGroups();
    public A addToImpersonateExtras(String key,List<String> value);
    public A addToImpersonateExtras(Map<String,List<String>> map);
    public A removeFromImpersonateExtras(String key);
    public A removeFromImpersonateExtras(Map<String,List<String>> map);
    public Map<String,List<String>> getImpersonateExtras();
    public A withImpersonateExtras(Map<String,List<String>> impersonateExtras);
    public Boolean hasImpersonateExtras();
    public int getWatchReconnectInterval();
    public A withWatchReconnectInterval(int watchReconnectInterval);
    public Boolean hasWatchReconnectInterval();
    public int getWatchReconnectLimit();
    public A withWatchReconnectLimit(int watchReconnectLimit);
    public Boolean hasWatchReconnectLimit();
    public int getConnectionTimeout();
    public A withConnectionTimeout(int connectionTimeout);
    public Boolean hasConnectionTimeout();
    public int getRequestTimeout();
    public A withRequestTimeout(int requestTimeout);
    public Boolean hasRequestTimeout();
    public long getRollingTimeout();
    public A withRollingTimeout(long rollingTimeout);
    public Boolean hasRollingTimeout();
    public long getScaleTimeout();
    public A withScaleTimeout(long scaleTimeout);
    public Boolean hasScaleTimeout();
    public int getLoggingInterval();
    public A withLoggingInterval(int loggingInterval);
    public Boolean hasLoggingInterval();
    public long getWebsocketTimeout();
    public A withWebsocketTimeout(long websocketTimeout);
    public Boolean hasWebsocketTimeout();
    public long getWebsocketPingInterval();
    public A withWebsocketPingInterval(long websocketPingInterval);
    public Boolean hasWebsocketPingInterval();
    public int getMaxConcurrentRequests();
    public A withMaxConcurrentRequests(int maxConcurrentRequests);
    public Boolean hasMaxConcurrentRequests();
    public int getMaxConcurrentRequestsPerHost();
    public A withMaxConcurrentRequestsPerHost(int maxConcurrentRequestsPerHost);
    public Boolean hasMaxConcurrentRequestsPerHost();



}
