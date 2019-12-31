package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public class ReplicationControllerSpecFluentImpl<A extends ReplicationControllerSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ReplicationControllerSpecFluent<A>{

    private Integer minReadySeconds;
    private Integer replicas;
    private Map<String,String> selector;
    private PodTemplateSpecBuilder template;

    public ReplicationControllerSpecFluentImpl(){
    }
    public ReplicationControllerSpecFluentImpl(ReplicationControllerSpec instance){
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
    }

    public Integer getMinReadySeconds(){
            return this.minReadySeconds;
    }

    public A withMinReadySeconds(Integer minReadySeconds){
            this.minReadySeconds=minReadySeconds; return (A) this;
    }

    public Boolean hasMinReadySeconds(){
            return this.minReadySeconds != null;
    }

    public Integer getReplicas(){
            return this.replicas;
    }

    public A withReplicas(Integer replicas){
            this.replicas=replicas; return (A) this;
    }

    public Boolean hasReplicas(){
            return this.replicas != null;
    }

    public A addToSelector(String key,String value){
            if(this.selector == null && key != null && value != null) { this.selector = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.selector.put(key, value);} return (A)this;
    }

    public A addToSelector(Map<String,String> map){
            if(this.selector == null && map != null) { this.selector = new LinkedHashMap<String,String>(); }
            if(map != null) { this.selector.putAll(map);} return (A)this;
    }

    public A removeFromSelector(String key){
            if(this.selector == null) { return (A) this; }
            if(key != null && this.selector != null) {this.selector.remove(key);} return (A)this;
    }

    public A removeFromSelector(Map<String,String> map){
            if(this.selector == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.selector != null){this.selector.remove(key);}}} return (A)this;
    }

    public Map<String,String> getSelector(){
            return this.selector;
    }

    public A withSelector(Map<String,String> selector){
            if (selector == null) { this.selector =  new LinkedHashMap<String,String>();} else {this.selector = new LinkedHashMap<String,String>(selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public PodTemplateSpec buildTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public A withTemplate(PodTemplateSpec template){
            _visitables.remove(this.template);
            if (template!=null){ this.template= new PodTemplateSpecBuilder(template); _visitables.add(this.template);} return (A) this;
    }

    public Boolean hasTemplate(){
            return this.template != null;
    }

    public ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplate(){
            return new TemplateNestedImpl();
    }

    public ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item){
            return new TemplateNestedImpl(item);
    }

    public ReplicationControllerSpecFluent.TemplateNested<A> editTemplate(){
            return withNewTemplateLike(getTemplate());
    }

    public ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplate(){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): new PodTemplateSpecBuilder().build());
    }

    public ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicationControllerSpecFluentImpl that = (ReplicationControllerSpecFluentImpl) o;
            if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (template != null ? !template.equals(that.template) :that.template != null) return false;
            return true;
    }


    public class TemplateNestedImpl<N> extends PodTemplateSpecFluentImpl<ReplicationControllerSpecFluent.TemplateNested<N>> implements ReplicationControllerSpecFluent.TemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateSpecBuilder builder;
    
            TemplateNestedImpl(PodTemplateSpec item){
                    this.builder = new PodTemplateSpecBuilder(this, item);
            }
            TemplateNestedImpl(){
                    this.builder = new PodTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) ReplicationControllerSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate(){
            return and();
    }

}


}
