package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public class DeploymentRollbackFluentImpl<A extends DeploymentRollbackFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentRollbackFluent<A>{

    private String apiVersion;
    private String kind;
    private String name;
    private RollbackConfigBuilder rollbackTo;
    private Map<String,String> updatedAnnotations;

    public DeploymentRollbackFluentImpl(){
    }
    public DeploymentRollbackFluentImpl(DeploymentRollback instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withName(instance.getName()); 
            this.withRollbackTo(instance.getRollbackTo()); 
            this.withUpdatedAnnotations(instance.getUpdatedAnnotations()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    
/**
 * This method has been deprecated, please use method buildRollbackTo instead.
 * @return The buildable object.
 */
@Deprecated public RollbackConfig getRollbackTo(){
            return this.rollbackTo!=null?this.rollbackTo.build():null;
    }

    public RollbackConfig buildRollbackTo(){
            return this.rollbackTo!=null?this.rollbackTo.build():null;
    }

    public A withRollbackTo(RollbackConfig rollbackTo){
            _visitables.remove(this.rollbackTo);
            if (rollbackTo!=null){ this.rollbackTo= new RollbackConfigBuilder(rollbackTo); _visitables.add(this.rollbackTo);} return (A) this;
    }

    public Boolean hasRollbackTo(){
            return this.rollbackTo != null;
    }

    public A withNewRollbackTo(Long revision){
            return (A)withRollbackTo(new RollbackConfig(revision));
    }

    public DeploymentRollbackFluent.RollbackToNested<A> withNewRollbackTo(){
            return new RollbackToNestedImpl();
    }

    public DeploymentRollbackFluent.RollbackToNested<A> withNewRollbackToLike(RollbackConfig item){
            return new RollbackToNestedImpl(item);
    }

    public DeploymentRollbackFluent.RollbackToNested<A> editRollbackTo(){
            return withNewRollbackToLike(getRollbackTo());
    }

    public DeploymentRollbackFluent.RollbackToNested<A> editOrNewRollbackTo(){
            return withNewRollbackToLike(getRollbackTo() != null ? getRollbackTo(): new RollbackConfigBuilder().build());
    }

    public DeploymentRollbackFluent.RollbackToNested<A> editOrNewRollbackToLike(RollbackConfig item){
            return withNewRollbackToLike(getRollbackTo() != null ? getRollbackTo(): item);
    }

    public A addToUpdatedAnnotations(String key,String value){
            if(this.updatedAnnotations == null && key != null && value != null) { this.updatedAnnotations = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.updatedAnnotations.put(key, value);} return (A)this;
    }

    public A addToUpdatedAnnotations(Map<String,String> map){
            if(this.updatedAnnotations == null && map != null) { this.updatedAnnotations = new LinkedHashMap<String,String>(); }
            if(map != null) { this.updatedAnnotations.putAll(map);} return (A)this;
    }

    public A removeFromUpdatedAnnotations(String key){
            if(this.updatedAnnotations == null) { return (A) this; }
            if(key != null && this.updatedAnnotations != null) {this.updatedAnnotations.remove(key);} return (A)this;
    }

    public A removeFromUpdatedAnnotations(Map<String,String> map){
            if(this.updatedAnnotations == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.updatedAnnotations != null){this.updatedAnnotations.remove(key);}}} return (A)this;
    }

    public Map<String,String> getUpdatedAnnotations(){
            return this.updatedAnnotations;
    }

    public A withUpdatedAnnotations(Map<String,String> updatedAnnotations){
            if (updatedAnnotations == null) { this.updatedAnnotations =  new LinkedHashMap<String,String>();} else {this.updatedAnnotations = new LinkedHashMap<String,String>(updatedAnnotations);} return (A) this;
    }

    public Boolean hasUpdatedAnnotations(){
            return this.updatedAnnotations != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentRollbackFluentImpl that = (DeploymentRollbackFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (rollbackTo != null ? !rollbackTo.equals(that.rollbackTo) :that.rollbackTo != null) return false;
            if (updatedAnnotations != null ? !updatedAnnotations.equals(that.updatedAnnotations) :that.updatedAnnotations != null) return false;
            return true;
    }


    public class RollbackToNestedImpl<N> extends RollbackConfigFluentImpl<DeploymentRollbackFluent.RollbackToNested<N>> implements DeploymentRollbackFluent.RollbackToNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollbackConfigBuilder builder;
    
            RollbackToNestedImpl(RollbackConfig item){
                    this.builder = new RollbackConfigBuilder(this, item);
            }
            RollbackToNestedImpl(){
                    this.builder = new RollbackConfigBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentRollbackFluentImpl.this.withRollbackTo(builder.build());
    }
    public N endRollbackTo(){
            return and();
    }

}


}
