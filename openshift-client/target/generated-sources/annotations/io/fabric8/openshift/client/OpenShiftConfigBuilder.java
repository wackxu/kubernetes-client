package io.fabric8.openshift.client;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class OpenShiftConfigBuilder extends OpenShiftConfigFluentImpl<OpenShiftConfigBuilder> implements VisitableBuilder<OpenShiftConfig,OpenShiftConfigBuilder>{

    OpenShiftConfigFluent<?> fluent;
    Boolean validationEnabled;

    public OpenShiftConfigBuilder(){
            this(true);
    }
    public OpenShiftConfigBuilder(Boolean validationEnabled){
            this(new OpenShiftConfig(), validationEnabled);
    }
    public OpenShiftConfigBuilder(OpenShiftConfigFluent<?> fluent){
            this(fluent, true);
    }
    public OpenShiftConfigBuilder(OpenShiftConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenShiftConfig(), validationEnabled);
    }
    public OpenShiftConfigBuilder(OpenShiftConfigFluent<?> fluent,OpenShiftConfig instance){
            this(fluent, instance, true);
    }
    public OpenShiftConfigBuilder(OpenShiftConfigFluent<?> fluent,OpenShiftConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withOpenShiftUrl(instance.getOpenShiftUrl()); 
            fluent.withOapiVersion(instance.getOapiVersion()); 
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
            fluent.withBuildTimeout(instance.getBuildTimeout()); 
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
            fluent.withDisableApiGroupCheck(instance.isDisableApiGroupCheck());

            fluent.withMaxConcurrentRequests(instance.getMaxConcurrentRequests());

            fluent.withOauthTokenProvider(instance.getOauthTokenProvider());

            fluent.withImpersonateGroup(instance.getImpersonateGroup());

            this.validationEnabled = validationEnabled; 
    }
    public OpenShiftConfigBuilder(OpenShiftConfig instance){
            this(instance,true);
    }
    public OpenShiftConfigBuilder(OpenShiftConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withOpenShiftUrl(instance.getOpenShiftUrl()); 
            this.withOapiVersion(instance.getOapiVersion()); 
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
            this.withBuildTimeout(instance.getBuildTimeout()); 
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
            this.withDisableApiGroupCheck(instance.isDisableApiGroupCheck());

            this.withMaxConcurrentRequests(instance.getMaxConcurrentRequests());

            this.withOauthTokenProvider(instance.getOauthTokenProvider());

            this.withImpersonateGroup(instance.getImpersonateGroup());

            this.validationEnabled = validationEnabled; 
    }

    public OpenShiftConfig build(){
            OpenShiftConfig buildable = new OpenShiftConfig(fluent.getOpenShiftUrl(),fluent.getOapiVersion(),fluent.getMasterUrl(),fluent.getApiVersion(),fluent.getNamespace(),fluent.isTrustCerts(),fluent.isDisableHostnameVerification(),fluent.getCaCertFile(),fluent.getCaCertData(),fluent.getClientCertFile(),fluent.getClientCertData(),fluent.getClientKeyFile(),fluent.getClientKeyData(),fluent.getClientKeyAlgo(),fluent.getClientKeyPassphrase(),fluent.getUsername(),fluent.getPassword(),fluent.getOauthToken(),fluent.getWatchReconnectInterval(),fluent.getWatchReconnectLimit(),fluent.getConnectionTimeout(),fluent.getRequestTimeout(),fluent.getRollingTimeout(),fluent.getScaleTimeout(),fluent.getLoggingInterval(),fluent.getMaxConcurrentRequestsPerHost(),fluent.getHttpProxy(),fluent.getHttpsProxy(),fluent.getNoProxy(),fluent.getErrorMessages(),fluent.getUserAgent(),fluent.getTlsVersions(),fluent.getBuildTimeout(),fluent.getWebsocketTimeout(),fluent.getWebsocketPingInterval(),fluent.getProxyUsername(),fluent.getProxyPassword(),fluent.getTrustStoreFile(),fluent.getTrustStorePassphrase(),fluent.getKeyStoreFile(),fluent.getKeyStorePassphrase(),fluent.getImpersonateUsername(),fluent.getImpersonateGroups(),fluent.getImpersonateExtras());
            buildable.setMaxConcurrentRequests(fluent.getMaxConcurrentRequests());
            buildable.setOauthTokenProvider(fluent.getOauthTokenProvider());
            buildable.setImpersonateGroup(fluent.getImpersonateGroup());
            buildable.setDisableApiGroupCheck(fluent.isDisableApiGroupCheck());
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenShiftConfigBuilder that = (OpenShiftConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
