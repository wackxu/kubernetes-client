package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class IngressRuleFluentImpl<A extends IngressRuleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IngressRuleFluent<A>{

    private String host;
    private HTTPIngressRuleValueBuilder http;

    public IngressRuleFluentImpl(){
    }
    public IngressRuleFluentImpl(IngressRule instance){
            this.withHost(instance.getHost()); 
            this.withHttp(instance.getHttp()); 
    }

    public String getHost(){
            return this.host;
    }

    public A withHost(String host){
            this.host=host; return (A) this;
    }

    public Boolean hasHost(){
            return this.host != null;
    }

    
/**
 * This method has been deprecated, please use method buildHttp instead.
 * @return The buildable object.
 */
@Deprecated public HTTPIngressRuleValue getHttp(){
            return this.http!=null?this.http.build():null;
    }

    public HTTPIngressRuleValue buildHttp(){
            return this.http!=null?this.http.build():null;
    }

    public A withHttp(HTTPIngressRuleValue http){
            _visitables.remove(this.http);
            if (http!=null){ this.http= new HTTPIngressRuleValueBuilder(http); _visitables.add(this.http);} return (A) this;
    }

    public Boolean hasHttp(){
            return this.http != null;
    }

    public IngressRuleFluent.HttpNested<A> withNewHttp(){
            return new HttpNestedImpl();
    }

    public IngressRuleFluent.HttpNested<A> withNewHttpLike(HTTPIngressRuleValue item){
            return new HttpNestedImpl(item);
    }

    public IngressRuleFluent.HttpNested<A> editHttp(){
            return withNewHttpLike(getHttp());
    }

    public IngressRuleFluent.HttpNested<A> editOrNewHttp(){
            return withNewHttpLike(getHttp() != null ? getHttp(): new HTTPIngressRuleValueBuilder().build());
    }

    public IngressRuleFluent.HttpNested<A> editOrNewHttpLike(HTTPIngressRuleValue item){
            return withNewHttpLike(getHttp() != null ? getHttp(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressRuleFluentImpl that = (IngressRuleFluentImpl) o;
            if (host != null ? !host.equals(that.host) :that.host != null) return false;
            if (http != null ? !http.equals(that.http) :that.http != null) return false;
            return true;
    }


    public class HttpNestedImpl<N> extends HTTPIngressRuleValueFluentImpl<IngressRuleFluent.HttpNested<N>> implements IngressRuleFluent.HttpNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPIngressRuleValueBuilder builder;
    
            HttpNestedImpl(HTTPIngressRuleValue item){
                    this.builder = new HTTPIngressRuleValueBuilder(this, item);
            }
            HttpNestedImpl(){
                    this.builder = new HTTPIngressRuleValueBuilder(this);
            }
    
    public N and(){
            return (N) IngressRuleFluentImpl.this.withHttp(builder.build());
    }
    public N endHttp(){
            return and();
    }

}


}
