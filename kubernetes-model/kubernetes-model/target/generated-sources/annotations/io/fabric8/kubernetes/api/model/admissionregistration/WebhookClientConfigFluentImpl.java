package io.fabric8.kubernetes.api.model.admissionregistration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class WebhookClientConfigFluentImpl<A extends WebhookClientConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements WebhookClientConfigFluent<A>{

    private String caBundle;
    private ServiceReferenceBuilder service;
    private String url;

    public WebhookClientConfigFluentImpl(){
    }
    public WebhookClientConfigFluentImpl(WebhookClientConfig instance){
            this.withCaBundle(instance.getCaBundle()); 
            this.withService(instance.getService()); 
            this.withUrl(instance.getUrl()); 
    }

    public String getCaBundle(){
            return this.caBundle;
    }

    public A withCaBundle(String caBundle){
            this.caBundle=caBundle; return (A) this;
    }

    public Boolean hasCaBundle(){
            return this.caBundle != null;
    }

    
/**
 * This method has been deprecated, please use method buildService instead.
 * @return The buildable object.
 */
@Deprecated public ServiceReference getService(){
            return this.service!=null?this.service.build():null;
    }

    public ServiceReference buildService(){
            return this.service!=null?this.service.build():null;
    }

    public A withService(ServiceReference service){
            _visitables.remove(this.service);
            if (service!=null){ this.service= new ServiceReferenceBuilder(service); _visitables.add(this.service);} return (A) this;
    }

    public Boolean hasService(){
            return this.service != null;
    }

    public A withNewService(String name,String namespace,String path){
            return (A)withService(new ServiceReference(name, namespace, path));
    }

    public WebhookClientConfigFluent.ServiceNested<A> withNewService(){
            return new ServiceNestedImpl();
    }

    public WebhookClientConfigFluent.ServiceNested<A> withNewServiceLike(ServiceReference item){
            return new ServiceNestedImpl(item);
    }

    public WebhookClientConfigFluent.ServiceNested<A> editService(){
            return withNewServiceLike(getService());
    }

    public WebhookClientConfigFluent.ServiceNested<A> editOrNewService(){
            return withNewServiceLike(getService() != null ? getService(): new ServiceReferenceBuilder().build());
    }

    public WebhookClientConfigFluent.ServiceNested<A> editOrNewServiceLike(ServiceReference item){
            return withNewServiceLike(getService() != null ? getService(): item);
    }

    public String getUrl(){
            return this.url;
    }

    public A withUrl(String url){
            this.url=url; return (A) this;
    }

    public Boolean hasUrl(){
            return this.url != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WebhookClientConfigFluentImpl that = (WebhookClientConfigFluentImpl) o;
            if (caBundle != null ? !caBundle.equals(that.caBundle) :that.caBundle != null) return false;
            if (service != null ? !service.equals(that.service) :that.service != null) return false;
            if (url != null ? !url.equals(that.url) :that.url != null) return false;
            return true;
    }


    public class ServiceNestedImpl<N> extends ServiceReferenceFluentImpl<WebhookClientConfigFluent.ServiceNested<N>> implements WebhookClientConfigFluent.ServiceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceReferenceBuilder builder;
    
            ServiceNestedImpl(ServiceReference item){
                    this.builder = new ServiceReferenceBuilder(this, item);
            }
            ServiceNestedImpl(){
                    this.builder = new ServiceReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WebhookClientConfigFluentImpl.this.withService(builder.build());
    }
    public N endService(){
            return and();
    }

}


}
