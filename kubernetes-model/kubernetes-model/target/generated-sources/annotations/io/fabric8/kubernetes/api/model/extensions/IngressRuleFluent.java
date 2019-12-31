package io.fabric8.kubernetes.api.model.extensions;

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

public interface IngressRuleFluent<A extends IngressRuleFluent<A>> extends Fluent<A>{


    public String getHost();
    public A withHost(String host);
    public Boolean hasHost();
    
/**
 * This method has been deprecated, please use method buildHttp instead.
 * @return The buildable object.
 */
@Deprecated public HTTPIngressRuleValue getHttp();
    public HTTPIngressRuleValue buildHttp();
    public A withHttp(HTTPIngressRuleValue http);
    public Boolean hasHttp();
    public IngressRuleFluent.HttpNested<A> withNewHttp();
    public IngressRuleFluent.HttpNested<A> withNewHttpLike(HTTPIngressRuleValue item);
    public IngressRuleFluent.HttpNested<A> editHttp();
    public IngressRuleFluent.HttpNested<A> editOrNewHttp();
    public IngressRuleFluent.HttpNested<A> editOrNewHttpLike(HTTPIngressRuleValue item);

    public interface HttpNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPIngressRuleValueFluent<IngressRuleFluent.HttpNested<N>>{

        
    public N and();    public N endHttp();
}


}
