package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface DeploymentRollbackFluent<A extends DeploymentRollbackFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    
/**
 * This method has been deprecated, please use method buildRollbackTo instead.
 * @return The buildable object.
 */
@Deprecated public RollbackConfig getRollbackTo();
    public RollbackConfig buildRollbackTo();
    public A withRollbackTo(RollbackConfig rollbackTo);
    public Boolean hasRollbackTo();
    public A withNewRollbackTo(Long revision);
    public DeploymentRollbackFluent.RollbackToNested<A> withNewRollbackTo();
    public DeploymentRollbackFluent.RollbackToNested<A> withNewRollbackToLike(RollbackConfig item);
    public DeploymentRollbackFluent.RollbackToNested<A> editRollbackTo();
    public DeploymentRollbackFluent.RollbackToNested<A> editOrNewRollbackTo();
    public DeploymentRollbackFluent.RollbackToNested<A> editOrNewRollbackToLike(RollbackConfig item);
    public A addToUpdatedAnnotations(String key,String value);
    public A addToUpdatedAnnotations(Map<String,String> map);
    public A removeFromUpdatedAnnotations(String key);
    public A removeFromUpdatedAnnotations(Map<String,String> map);
    public Map<String,String> getUpdatedAnnotations();
    public A withUpdatedAnnotations(Map<String,String> updatedAnnotations);
    public Boolean hasUpdatedAnnotations();

    public interface RollbackToNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RollbackConfigFluent<DeploymentRollbackFluent.RollbackToNested<N>>{

        
    public N and();    public N endRollbackTo();
}


}
