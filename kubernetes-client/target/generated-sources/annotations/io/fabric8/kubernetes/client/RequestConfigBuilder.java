package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class RequestConfigBuilder extends RequestConfigFluentImpl<RequestConfigBuilder> implements VisitableBuilder<RequestConfig,RequestConfigBuilder>{

    RequestConfigFluent<?> fluent;
    Boolean validationEnabled;

    public RequestConfigBuilder(){
            this(true);
    }
    public RequestConfigBuilder(Boolean validationEnabled){
            this(new RequestConfig(), validationEnabled);
    }
    public RequestConfigBuilder(RequestConfigFluent<?> fluent){
            this(fluent, true);
    }
    public RequestConfigBuilder(RequestConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RequestConfig(), validationEnabled);
    }
    public RequestConfigBuilder(RequestConfigFluent<?> fluent,RequestConfig instance){
            this(fluent, instance, true);
    }
    public RequestConfigBuilder(RequestConfigFluent<?> fluent,RequestConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withUsername(instance.getUsername()); 
            fluent.withPassword(instance.getPassword()); 
            fluent.withOauthToken(instance.getOauthToken()); 
            fluent.withWatchReconnectLimit(instance.getWatchReconnectLimit()); 
            fluent.withWatchReconnectInterval(instance.getWatchReconnectInterval()); 
            fluent.withConnectionTimeout(instance.getConnectionTimeout()); 
            fluent.withRollingTimeout(instance.getRollingTimeout()); 
            fluent.withRequestTimeout(instance.getRequestTimeout()); 
            fluent.withScaleTimeout(instance.getScaleTimeout()); 
            fluent.withLoggingInterval(instance.getLoggingInterval()); 
            fluent.withWebsocketTimeout(instance.getWebsocketTimeout()); 
            fluent.withWebsocketPingInterval(instance.getWebsocketPingInterval()); 
            fluent.withMaxConcurrentRequests(instance.getMaxConcurrentRequests()); 
            fluent.withMaxConcurrentRequestsPerHost(instance.getMaxConcurrentRequestsPerHost()); 
            fluent.withOauthTokenProvider(instance.getOauthTokenProvider()); 
            fluent.withImpersonateUsername(instance.getImpersonateUsername());

            fluent.withImpersonateGroups(instance.getImpersonateGroups());

            fluent.withImpersonateExtras(instance.getImpersonateExtras());

            this.validationEnabled = validationEnabled; 
    }
    public RequestConfigBuilder(RequestConfig instance){
            this(instance,true);
    }
    public RequestConfigBuilder(RequestConfig instance,Boolean validationEnabled){
            this.fluent = this; 
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

            this.validationEnabled = validationEnabled; 
    }

    public RequestConfig build(){
            RequestConfig buildable = new RequestConfig(fluent.getUsername(),fluent.getPassword(),fluent.getOauthToken(),fluent.getWatchReconnectLimit(),fluent.getWatchReconnectInterval(),fluent.getConnectionTimeout(),fluent.getRollingTimeout(),fluent.getRequestTimeout(),fluent.getScaleTimeout(),fluent.getLoggingInterval(),fluent.getWebsocketTimeout(),fluent.getWebsocketPingInterval(),fluent.getMaxConcurrentRequests(),fluent.getMaxConcurrentRequestsPerHost(),fluent.getOauthTokenProvider());
            buildable.setImpersonateUsername(fluent.getImpersonateUsername());
            buildable.setImpersonateGroups(fluent.getImpersonateGroups());
            buildable.setImpersonateExtras(fluent.getImpersonateExtras());
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RequestConfigBuilder that = (RequestConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
