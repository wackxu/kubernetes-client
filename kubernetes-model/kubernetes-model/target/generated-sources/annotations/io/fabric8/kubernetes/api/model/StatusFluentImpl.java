package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class StatusFluentImpl<A extends StatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StatusFluent<A>{

    private String apiVersion;
    private Integer code;
    private StatusDetailsBuilder details;
    private String kind;
    private String message;
    private ListMetaBuilder metadata;
    private String reason;
    private String status;

    public StatusFluentImpl(){
    }
    public StatusFluentImpl(Status instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withCode(instance.getCode()); 
            this.withDetails(instance.getDetails()); 
            this.withKind(instance.getKind()); 
            this.withMessage(instance.getMessage()); 
            this.withMetadata(instance.getMetadata()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
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

    public Integer getCode(){
            return this.code;
    }

    public A withCode(Integer code){
            this.code=code; return (A) this;
    }

    public Boolean hasCode(){
            return this.code != null;
    }

    
/**
 * This method has been deprecated, please use method buildDetails instead.
 * @return The buildable object.
 */
@Deprecated public StatusDetails getDetails(){
            return this.details!=null?this.details.build():null;
    }

    public StatusDetails buildDetails(){
            return this.details!=null?this.details.build():null;
    }

    public A withDetails(StatusDetails details){
            _visitables.remove(this.details);
            if (details!=null){ this.details= new StatusDetailsBuilder(details); _visitables.add(this.details);} return (A) this;
    }

    public Boolean hasDetails(){
            return this.details != null;
    }

    public StatusFluent.DetailsNested<A> withNewDetails(){
            return new DetailsNestedImpl();
    }

    public StatusFluent.DetailsNested<A> withNewDetailsLike(StatusDetails item){
            return new DetailsNestedImpl(item);
    }

    public StatusFluent.DetailsNested<A> editDetails(){
            return withNewDetailsLike(getDetails());
    }

    public StatusFluent.DetailsNested<A> editOrNewDetails(){
            return withNewDetailsLike(getDetails() != null ? getDetails(): new StatusDetailsBuilder().build());
    }

    public StatusFluent.DetailsNested<A> editOrNewDetailsLike(StatusDetails item){
            return withNewDetailsLike(getDetails() != null ? getDetails(): item);
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

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ListMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ListMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ListMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ListMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public A withNewMetadata(String _continue,String resourceVersion,String selfLink){
            return (A)withMetadata(new ListMeta(_continue, resourceVersion, selfLink));
    }

    public StatusFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public StatusFluent.MetadataNested<A> withNewMetadataLike(ListMeta item){
            return new MetadataNestedImpl(item);
    }

    public StatusFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public StatusFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ListMetaBuilder().build());
    }

    public StatusFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
    }

    public String getStatus(){
            return this.status;
    }

    public A withStatus(String status){
            this.status=status; return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatusFluentImpl that = (StatusFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (code != null ? !code.equals(that.code) :that.code != null) return false;
            if (details != null ? !details.equals(that.details) :that.details != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class DetailsNestedImpl<N> extends StatusDetailsFluentImpl<StatusFluent.DetailsNested<N>> implements StatusFluent.DetailsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusDetailsBuilder builder;
    
            DetailsNestedImpl(StatusDetails item){
                    this.builder = new StatusDetailsBuilder(this, item);
            }
            DetailsNestedImpl(){
                    this.builder = new StatusDetailsBuilder(this);
            }
    
    public N and(){
            return (N) StatusFluentImpl.this.withDetails(builder.build());
    }
    public N endDetails(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ListMetaFluentImpl<StatusFluent.MetadataNested<N>> implements StatusFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ListMetaBuilder builder;
    
            MetadataNestedImpl(ListMeta item){
                    this.builder = new ListMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ListMetaBuilder(this);
            }
    
    public N and(){
            return (N) StatusFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
