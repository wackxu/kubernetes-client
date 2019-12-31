package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ResourceRequirementsBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ResourceRequirementsFluentImpl;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;

public class DeploymentStrategyFluentImpl<A extends io.fabric8.openshift.api.model.DeploymentStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.openshift.api.model.DeploymentStrategyFluent<A>{

    private Long activeDeadlineSeconds;
    private Map<String,String> annotations;
    private CustomDeploymentStrategyParamsBuilder customParams;
    private Map<String,String> labels;
    private RecreateDeploymentStrategyParamsBuilder recreateParams;
    private ResourceRequirementsBuilder resources;
    private RollingDeploymentStrategyParamsBuilder rollingParams;
    private String type;

    public DeploymentStrategyFluentImpl(){
    }
    public DeploymentStrategyFluentImpl(io.fabric8.openshift.api.model.DeploymentStrategy instance){
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withAnnotations(instance.getAnnotations()); 
            this.withCustomParams(instance.getCustomParams()); 
            this.withLabels(instance.getLabels()); 
            this.withRecreateParams(instance.getRecreateParams()); 
            this.withResources(instance.getResources()); 
            this.withRollingParams(instance.getRollingParams()); 
            this.withType(instance.getType()); 
    }

    public Long getActiveDeadlineSeconds(){
            return this.activeDeadlineSeconds;
    }

    public A withActiveDeadlineSeconds(Long activeDeadlineSeconds){
            this.activeDeadlineSeconds=activeDeadlineSeconds; return (A) this;
    }

    public Boolean hasActiveDeadlineSeconds(){
            return this.activeDeadlineSeconds != null;
    }

    public A withNewActiveDeadlineSeconds(String arg1){
            return (A)withActiveDeadlineSeconds(new Long(arg1));
    }

    public A withNewActiveDeadlineSeconds(long arg1){
            return (A)withActiveDeadlineSeconds(new Long(arg1));
    }

    public A addToAnnotations(String key,String value){
            if(this.annotations == null && key != null && value != null) { this.annotations = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.annotations.put(key, value);} return (A)this;
    }

    public A addToAnnotations(Map<String,String> map){
            if(this.annotations == null && map != null) { this.annotations = new LinkedHashMap<String,String>(); }
            if(map != null) { this.annotations.putAll(map);} return (A)this;
    }

    public A removeFromAnnotations(String key){
            if(this.annotations == null) { return (A) this; }
            if(key != null && this.annotations != null) {this.annotations.remove(key);} return (A)this;
    }

    public A removeFromAnnotations(Map<String,String> map){
            if(this.annotations == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.annotations != null){this.annotations.remove(key);}}} return (A)this;
    }

    public Map<String,String> getAnnotations(){
            return this.annotations;
    }

    public A withAnnotations(Map<String,String> annotations){
            if (annotations == null) { this.annotations =  new LinkedHashMap<String,String>();} else {this.annotations = new LinkedHashMap<String,String>(annotations);} return (A) this;
    }

    public Boolean hasAnnotations(){
            return this.annotations != null;
    }

    
/**
 * This method has been deprecated, please use method buildCustomParams instead.
 * @return The buildable object.
 */
@Deprecated public CustomDeploymentStrategyParams getCustomParams(){
            return this.customParams!=null?this.customParams.build():null;
    }

    public CustomDeploymentStrategyParams buildCustomParams(){
            return this.customParams!=null?this.customParams.build():null;
    }

    public A withCustomParams(CustomDeploymentStrategyParams customParams){
            _visitables.remove(this.customParams);
            if (customParams!=null){ this.customParams= new CustomDeploymentStrategyParamsBuilder(customParams); _visitables.add(this.customParams);} return (A) this;
    }

    public Boolean hasCustomParams(){
            return this.customParams != null;
    }

    public DeploymentStrategyFluent.CustomParamsNested<A> withNewCustomParams(){
            return new CustomParamsNestedImpl();
    }

    public DeploymentStrategyFluent.CustomParamsNested<A> withNewCustomParamsLike(CustomDeploymentStrategyParams item){
            return new CustomParamsNestedImpl(item);
    }

    public DeploymentStrategyFluent.CustomParamsNested<A> editCustomParams(){
            return withNewCustomParamsLike(getCustomParams());
    }

    public DeploymentStrategyFluent.CustomParamsNested<A> editOrNewCustomParams(){
            return withNewCustomParamsLike(getCustomParams() != null ? getCustomParams(): new CustomDeploymentStrategyParamsBuilder().build());
    }

    public DeploymentStrategyFluent.CustomParamsNested<A> editOrNewCustomParamsLike(CustomDeploymentStrategyParams item){
            return withNewCustomParamsLike(getCustomParams() != null ? getCustomParams(): item);
    }

    public A addToLabels(String key,String value){
            if(this.labels == null && key != null && value != null) { this.labels = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.labels.put(key, value);} return (A)this;
    }

    public A addToLabels(Map<String,String> map){
            if(this.labels == null && map != null) { this.labels = new LinkedHashMap<String,String>(); }
            if(map != null) { this.labels.putAll(map);} return (A)this;
    }

    public A removeFromLabels(String key){
            if(this.labels == null) { return (A) this; }
            if(key != null && this.labels != null) {this.labels.remove(key);} return (A)this;
    }

    public A removeFromLabels(Map<String,String> map){
            if(this.labels == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.labels != null){this.labels.remove(key);}}} return (A)this;
    }

    public Map<String,String> getLabels(){
            return this.labels;
    }

    public A withLabels(Map<String,String> labels){
            if (labels == null) { this.labels =  new LinkedHashMap<String,String>();} else {this.labels = new LinkedHashMap<String,String>(labels);} return (A) this;
    }

    public Boolean hasLabels(){
            return this.labels != null;
    }

    
/**
 * This method has been deprecated, please use method buildRecreateParams instead.
 * @return The buildable object.
 */
@Deprecated public RecreateDeploymentStrategyParams getRecreateParams(){
            return this.recreateParams!=null?this.recreateParams.build():null;
    }

    public RecreateDeploymentStrategyParams buildRecreateParams(){
            return this.recreateParams!=null?this.recreateParams.build():null;
    }

    public A withRecreateParams(RecreateDeploymentStrategyParams recreateParams){
            _visitables.remove(this.recreateParams);
            if (recreateParams!=null){ this.recreateParams= new RecreateDeploymentStrategyParamsBuilder(recreateParams); _visitables.add(this.recreateParams);} return (A) this;
    }

    public Boolean hasRecreateParams(){
            return this.recreateParams != null;
    }

    public DeploymentStrategyFluent.RecreateParamsNested<A> withNewRecreateParams(){
            return new RecreateParamsNestedImpl();
    }

    public DeploymentStrategyFluent.RecreateParamsNested<A> withNewRecreateParamsLike(RecreateDeploymentStrategyParams item){
            return new RecreateParamsNestedImpl(item);
    }

    public DeploymentStrategyFluent.RecreateParamsNested<A> editRecreateParams(){
            return withNewRecreateParamsLike(getRecreateParams());
    }

    public DeploymentStrategyFluent.RecreateParamsNested<A> editOrNewRecreateParams(){
            return withNewRecreateParamsLike(getRecreateParams() != null ? getRecreateParams(): new RecreateDeploymentStrategyParamsBuilder().build());
    }

    public DeploymentStrategyFluent.RecreateParamsNested<A> editOrNewRecreateParamsLike(RecreateDeploymentStrategyParams item){
            return withNewRecreateParamsLike(getRecreateParams() != null ? getRecreateParams(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources(){
            return this.resources!=null?this.resources.build():null;
    }

    public ResourceRequirements buildResources(){
            return this.resources!=null?this.resources.build():null;
    }

    public A withResources(ResourceRequirements resources){
            _visitables.remove(this.resources);
            if (resources!=null){ this.resources= new ResourceRequirementsBuilder(resources); _visitables.add(this.resources);} return (A) this;
    }

    public Boolean hasResources(){
            return this.resources != null;
    }

    public DeploymentStrategyFluent.ResourcesNested<A> withNewResources(){
            return new ResourcesNestedImpl();
    }

    public DeploymentStrategyFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item){
            return new ResourcesNestedImpl(item);
    }

    public DeploymentStrategyFluent.ResourcesNested<A> editResources(){
            return withNewResourcesLike(getResources());
    }

    public DeploymentStrategyFluent.ResourcesNested<A> editOrNewResources(){
            return withNewResourcesLike(getResources() != null ? getResources(): new ResourceRequirementsBuilder().build());
    }

    public DeploymentStrategyFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item){
            return withNewResourcesLike(getResources() != null ? getResources(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRollingParams instead.
 * @return The buildable object.
 */
@Deprecated public RollingDeploymentStrategyParams getRollingParams(){
            return this.rollingParams!=null?this.rollingParams.build():null;
    }

    public RollingDeploymentStrategyParams buildRollingParams(){
            return this.rollingParams!=null?this.rollingParams.build():null;
    }

    public A withRollingParams(RollingDeploymentStrategyParams rollingParams){
            _visitables.remove(this.rollingParams);
            if (rollingParams!=null){ this.rollingParams= new RollingDeploymentStrategyParamsBuilder(rollingParams); _visitables.add(this.rollingParams);} return (A) this;
    }

    public Boolean hasRollingParams(){
            return this.rollingParams != null;
    }

    public DeploymentStrategyFluent.RollingParamsNested<A> withNewRollingParams(){
            return new RollingParamsNestedImpl();
    }

    public DeploymentStrategyFluent.RollingParamsNested<A> withNewRollingParamsLike(RollingDeploymentStrategyParams item){
            return new RollingParamsNestedImpl(item);
    }

    public DeploymentStrategyFluent.RollingParamsNested<A> editRollingParams(){
            return withNewRollingParamsLike(getRollingParams());
    }

    public DeploymentStrategyFluent.RollingParamsNested<A> editOrNewRollingParams(){
            return withNewRollingParamsLike(getRollingParams() != null ? getRollingParams(): new RollingDeploymentStrategyParamsBuilder().build());
    }

    public DeploymentStrategyFluent.RollingParamsNested<A> editOrNewRollingParamsLike(RollingDeploymentStrategyParams item){
            return withNewRollingParamsLike(getRollingParams() != null ? getRollingParams(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentStrategyFluentImpl that = (DeploymentStrategyFluentImpl) o;
            if (activeDeadlineSeconds != null ? !activeDeadlineSeconds.equals(that.activeDeadlineSeconds) :that.activeDeadlineSeconds != null) return false;
            if (annotations != null ? !annotations.equals(that.annotations) :that.annotations != null) return false;
            if (customParams != null ? !customParams.equals(that.customParams) :that.customParams != null) return false;
            if (labels != null ? !labels.equals(that.labels) :that.labels != null) return false;
            if (recreateParams != null ? !recreateParams.equals(that.recreateParams) :that.recreateParams != null) return false;
            if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
            if (rollingParams != null ? !rollingParams.equals(that.rollingParams) :that.rollingParams != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class CustomParamsNestedImpl<N> extends CustomDeploymentStrategyParamsFluentImpl<DeploymentStrategyFluent.CustomParamsNested<N>> implements DeploymentStrategyFluent.CustomParamsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomDeploymentStrategyParamsBuilder builder;
    
            CustomParamsNestedImpl(CustomDeploymentStrategyParams item){
                    this.builder = new CustomDeploymentStrategyParamsBuilder(this, item);
            }
            CustomParamsNestedImpl(){
                    this.builder = new CustomDeploymentStrategyParamsBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentStrategyFluentImpl.this.withCustomParams(builder.build());
    }
    public N endCustomParams(){
            return and();
    }

}
    public class RecreateParamsNestedImpl<N> extends RecreateDeploymentStrategyParamsFluentImpl<DeploymentStrategyFluent.RecreateParamsNested<N>> implements DeploymentStrategyFluent.RecreateParamsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RecreateDeploymentStrategyParamsBuilder builder;
    
            RecreateParamsNestedImpl(RecreateDeploymentStrategyParams item){
                    this.builder = new RecreateDeploymentStrategyParamsBuilder(this, item);
            }
            RecreateParamsNestedImpl(){
                    this.builder = new RecreateDeploymentStrategyParamsBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentStrategyFluentImpl.this.withRecreateParams(builder.build());
    }
    public N endRecreateParams(){
            return and();
    }

}
    public class ResourcesNestedImpl<N> extends ResourceRequirementsFluentImpl<DeploymentStrategyFluent.ResourcesNested<N>> implements DeploymentStrategyFluent.ResourcesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceRequirementsBuilder builder;
    
            ResourcesNestedImpl(ResourceRequirements item){
                    this.builder = new ResourceRequirementsBuilder(this, item);
            }
            ResourcesNestedImpl(){
                    this.builder = new ResourceRequirementsBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentStrategyFluentImpl.this.withResources(builder.build());
    }
    public N endResources(){
            return and();
    }

}
    public class RollingParamsNestedImpl<N> extends RollingDeploymentStrategyParamsFluentImpl<DeploymentStrategyFluent.RollingParamsNested<N>> implements DeploymentStrategyFluent.RollingParamsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RollingDeploymentStrategyParamsBuilder builder;
    
            RollingParamsNestedImpl(RollingDeploymentStrategyParams item){
                    this.builder = new RollingDeploymentStrategyParamsBuilder(this, item);
            }
            RollingParamsNestedImpl(){
                    this.builder = new RollingDeploymentStrategyParamsBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentStrategyFluentImpl.this.withRollingParams(builder.build());
    }
    public N endRollingParams(){
            return and();
    }

}


}
