package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class LimitRangeFluentImpl<A extends LimitRangeFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LimitRangeFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private LimitRangeSpecBuilder spec;

    public LimitRangeFluentImpl(){
    }
    public LimitRangeFluentImpl(LimitRange instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
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

    public LimitRangeFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public LimitRangeFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public LimitRangeFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public LimitRangeFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public LimitRangeFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public LimitRangeSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public LimitRangeSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(LimitRangeSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new LimitRangeSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public LimitRangeFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public LimitRangeFluent.SpecNested<A> withNewSpecLike(LimitRangeSpec item){
            return new SpecNestedImpl(item);
    }

    public LimitRangeFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public LimitRangeFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new LimitRangeSpecBuilder().build());
    }

    public LimitRangeFluent.SpecNested<A> editOrNewSpecLike(LimitRangeSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LimitRangeFluentImpl that = (LimitRangeFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<LimitRangeFluent.MetadataNested<N>> implements LimitRangeFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) LimitRangeFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends LimitRangeSpecFluentImpl<LimitRangeFluent.SpecNested<N>> implements LimitRangeFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeSpecBuilder builder;
    
            SpecNestedImpl(LimitRangeSpec item){
                    this.builder = new LimitRangeSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new LimitRangeSpecBuilder(this);
            }
    
    public N and(){
            return (N) LimitRangeFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}


}
