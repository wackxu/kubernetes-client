package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ConfigBuilder extends ConfigFluentImpl<ConfigBuilder> implements VisitableBuilder<Config,ConfigBuilder>{

    ConfigFluent<?> fluent;
    Boolean validationEnabled;

    public ConfigBuilder(){
            this(true);
    }
    public ConfigBuilder(Boolean validationEnabled){
            this(new Config(), validationEnabled);
    }
    public ConfigBuilder(ConfigFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigBuilder(ConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Config(), validationEnabled);
    }
    public ConfigBuilder(ConfigFluent<?> fluent,Config instance){
            this(fluent, instance, true);
    }
    public ConfigBuilder(ConfigFluent<?> fluent,Config instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMasterUrl(instance.getMasterUrl()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withTrustCerts(instance.isTrustCerts()); 
            fluent.withDisableHostnameVerification(instance.isDisableHostnameVerification()); 
            fluent.withCaCertFile(instance.getCaCertFile()); 
            fluent.withCaCertData(instance.getCaCertData()); 
            fluent.withClientCertFile(instance.getClientCertFile()); 
            fluent.withClientCertData(instance.getClientCertData()); 
            fluent.withClientKeyFile(instance.getClientKeyFile()); 
            fluent.withClientKeyData(instance.getClientKeyData()); 
            fluent.withClientKeyAlgo(instance.getClientKeyAlgo()); 
            fluent.withClientKeyPassphrase(instance.getClientKeyPassphrase()); 
            fluent.withUsername(instance.getUsername()); 
            fluent.withPassword(instance.getPassword()); 
            fluent.withOauthToken(instance.getOauthToken()); 
            fluent.withWatchReconnectInterval(instance.getWatchReconnectInterval()); 
            fluent.withWatchReconnectLimit(instance.getWatchReconnectLimit()); 
            fluent.withConnectionTimeout(instance.getConnectionTimeout()); 
            fluent.withRequestTimeout(instance.getRequestTimeout()); 
            fluent.withRollingTimeout(instance.getRollingTimeout()); 
            fluent.withScaleTimeout(instance.getScaleTimeout()); 
            fluent.withLoggingInterval(instance.getLoggingInterval()); 
            fluent.withMaxConcurrentRequestsPerHost(instance.getMaxConcurrentRequestsPerHost()); 
            fluent.withHttpProxy(instance.getHttpProxy()); 
            fluent.withHttpsProxy(instance.getHttpsProxy()); 
            fluent.withNoProxy(instance.getNoProxy()); 
            fluent.withErrorMessages(instance.getErrorMessages()); 
            fluent.withUserAgent(instance.getUserAgent()); 
            fluent.withTlsVersions(instance.getTlsVersions()); 
            fluent.withWebsocketTimeout(instance.getWebsocketTimeout()); 
            fluent.withWebsocketPingInterval(instance.getWebsocketPingInterval()); 
            fluent.withProxyUsername(instance.getProxyUsername()); 
            fluent.withProxyPassword(instance.getProxyPassword()); 
            fluent.withTrustStoreFile(instance.getTrustStoreFile()); 
            fluent.withTrustStorePassphrase(instance.getTrustStorePassphrase()); 
            fluent.withKeyStoreFile(instance.getKeyStoreFile()); 
            fluent.withKeyStorePassphrase(instance.getKeyStorePassphrase()); 
            fluent.withImpersonateUsername(instance.getImpersonateUsername()); 
            fluent.withImpersonateGroups(instance.getImpersonateGroups()); 
            fluent.withImpersonateExtras(instance.getImpersonateExtras()); 
            fluent.withOauthTokenProvider(instance.getOauthTokenProvider()); 
            fluent.withMaxConcurrentRequests(instance.getMaxConcurrentRequests());

            fluent.withImpersonateGroup(instance.getImpersonateGroup());

            this.validationEnabled = validationEnabled; 
    }
    public ConfigBuilder(Config instance){
            this(instance,true);
    }
    public ConfigBuilder(Config instance,Boolean validationEnabled){
            this.fluent = this; 
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

            this.validationEnabled = validationEnabled; 
    }

    public Config build(){
            Config buildable = new Config(fluent.getMasterUrl(),fluent.getApiVersion(),fluent.getNamespace(),fluent.isTrustCerts(),fluent.isDisableHostnameVerification(),fluent.getCaCertFile(),fluent.getCaCertData(),fluent.getClientCertFile(),fluent.getClientCertData(),fluent.getClientKeyFile(),fluent.getClientKeyData(),fluent.getClientKeyAlgo(),fluent.getClientKeyPassphrase(),fluent.getUsername(),fluent.getPassword(),fluent.getOauthToken(),fluent.getWatchReconnectInterval(),fluent.getWatchReconnectLimit(),fluent.getConnectionTimeout(),fluent.getRequestTimeout(),fluent.getRollingTimeout(),fluent.getScaleTimeout(),fluent.getLoggingInterval(),fluent.getMaxConcurrentRequestsPerHost(),fluent.getHttpProxy(),fluent.getHttpsProxy(),fluent.getNoProxy(),fluent.getErrorMessages(),fluent.getUserAgent(),fluent.getTlsVersions(),fluent.getWebsocketTimeout(),fluent.getWebsocketPingInterval(),fluent.getProxyUsername(),fluent.getProxyPassword(),fluent.getTrustStoreFile(),fluent.getTrustStorePassphrase(),fluent.getKeyStoreFile(),fluent.getKeyStorePassphrase(),fluent.getImpersonateUsername(),fluent.getImpersonateGroups(),fluent.getImpersonateExtras(),fluent.getOauthTokenProvider());
            buildable.setMaxConcurrentRequests(fluent.getMaxConcurrentRequests());
            buildable.setImpersonateGroup(fluent.getImpersonateGroup());
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigBuilder that = (ConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
