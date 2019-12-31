package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface ReplicationControllerSpecFluent<A extends ReplicationControllerSpecFluent<A>> extends Fluent<A>{


    public Integer getMinReadySeconds();
    public A withMinReadySeconds(Integer minReadySeconds);
    public Boolean hasMinReadySeconds();
    public Integer getReplicas();
    public A withReplicas(Integer replicas);
    public Boolean hasReplicas();
    public A addToSelector(String key,String value);
    public A addToSelector(Map<String,String> map);
    public A removeFromSelector(String key);
    public A removeFromSelector(Map<String,String> map);
    public Map<String,String> getSelector();
    public A withSelector(Map<String,String> selector);
    public Boolean hasSelector();
    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate();
    public PodTemplateSpec buildTemplate();
    public A withTemplate(PodTemplateSpec template);
    public Boolean hasTemplate();
    public ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplate();
    public ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item);
    public ReplicationControllerSpecFluent.TemplateNested<A> editTemplate();
    public ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplate();
    public ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item);

    public interface TemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateSpecFluent<ReplicationControllerSpecFluent.TemplateNested<N>>{

        
    public N and();    public N endTemplate();
}


}
