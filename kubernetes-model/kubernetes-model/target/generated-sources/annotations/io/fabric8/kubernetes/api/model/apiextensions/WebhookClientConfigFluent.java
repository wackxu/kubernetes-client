package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface WebhookClientConfigFluent<A extends io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigFluent<A>> extends Fluent<A>{


    public String getCaBundle();
    public A withCaBundle(String caBundle);
    public Boolean hasCaBundle();
    
/**
 * This method has been deprecated, please use method buildService instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.kubernetes.api.model.apiextensions.ServiceReference getService();
    public io.fabric8.kubernetes.api.model.apiextensions.ServiceReference buildService();
    public A withService(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference service);
    public Boolean hasService();
    public A withNewService(String name,String namespace,String path);
    public WebhookClientConfigFluent.ServiceNested<A> withNewService();
    public WebhookClientConfigFluent.ServiceNested<A> withNewServiceLike(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference item);
    public WebhookClientConfigFluent.ServiceNested<A> editService();
    public WebhookClientConfigFluent.ServiceNested<A> editOrNewService();
    public WebhookClientConfigFluent.ServiceNested<A> editOrNewServiceLike(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference item);
    public String getUrl();
    public A withUrl(String url);
    public Boolean hasUrl();

    public interface ServiceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceFluent<WebhookClientConfigFluent.ServiceNested<N>>{

        
    public N and();    public N endService();
}


}
