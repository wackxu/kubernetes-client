package io.fabric8.kubernetes.api.model.scheduling;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class PriorityClassFluentImpl<A extends PriorityClassFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PriorityClassFluent<A>{

    private String apiVersion;
    private String description;
    private Boolean globalDefault;
    private String kind;
    private ObjectMetaBuilder metadata;
    private Integer value;

    public PriorityClassFluentImpl(){
    }
    public PriorityClassFluentImpl(PriorityClass instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withDescription(instance.getDescription()); 
            this.withGlobalDefault(instance.getGlobalDefault()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withValue(instance.getValue()); 
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

    public String getDescription(){
            return this.description;
    }

    public A withDescription(String description){
            this.description=description; return (A) this;
    }

    public Boolean hasDescription(){
            return this.description != null;
    }

    public Boolean isGlobalDefault(){
            return this.globalDefault;
    }

    public A withGlobalDefault(Boolean globalDefault){
            this.globalDefault=globalDefault; return (A) this;
    }

    public Boolean hasGlobalDefault(){
            return this.globalDefault != null;
    }

    public A withNewGlobalDefault(String arg1){
            return (A)withGlobalDefault(new Boolean(arg1));
    }

    public A withNewGlobalDefault(boolean arg1){
            return (A)withGlobalDefault(new Boolean(arg1));
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

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public PriorityClassFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public PriorityClassFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public PriorityClassFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public PriorityClassFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public PriorityClassFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public Integer getValue(){
            return this.value;
    }

    public A withValue(Integer value){
            this.value=value; return (A) this;
    }

    public Boolean hasValue(){
            return this.value != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PriorityClassFluentImpl that = (PriorityClassFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (description != null ? !description.equals(that.description) :that.description != null) return false;
            if (globalDefault != null ? !globalDefault.equals(that.globalDefault) :that.globalDefault != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (value != null ? !value.equals(that.value) :that.value != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<PriorityClassFluent.MetadataNested<N>> implements PriorityClassFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) PriorityClassFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
