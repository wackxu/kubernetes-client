package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class CustomResourceSubresourcesFluentImpl<A extends CustomResourceSubresourcesFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceSubresourcesFluent<A>{

    private CustomResourceSubresourceScaleBuilder scale;
    private CustomResourceSubresourceStatusBuilder status;

    public CustomResourceSubresourcesFluentImpl(){
    }
    public CustomResourceSubresourcesFluentImpl(CustomResourceSubresources instance){
            this.withScale(instance.getScale()); 
            this.withStatus(instance.getStatus()); 
    }

    
/**
 * This method has been deprecated, please use method buildScale instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceSubresourceScale getScale(){
            return this.scale!=null?this.scale.build():null;
    }

    public CustomResourceSubresourceScale buildScale(){
            return this.scale!=null?this.scale.build():null;
    }

    public A withScale(CustomResourceSubresourceScale scale){
            _visitables.remove(this.scale);
            if (scale!=null){ this.scale= new CustomResourceSubresourceScaleBuilder(scale); _visitables.add(this.scale);} return (A) this;
    }

    public Boolean hasScale(){
            return this.scale != null;
    }

    public A withNewScale(String labelSelectorPath,String specReplicasPath,String statusReplicasPath){
            return (A)withScale(new CustomResourceSubresourceScale(labelSelectorPath, specReplicasPath, statusReplicasPath));
    }

    public CustomResourceSubresourcesFluent.ScaleNested<A> withNewScale(){
            return new ScaleNestedImpl();
    }

    public CustomResourceSubresourcesFluent.ScaleNested<A> withNewScaleLike(CustomResourceSubresourceScale item){
            return new ScaleNestedImpl(item);
    }

    public CustomResourceSubresourcesFluent.ScaleNested<A> editScale(){
            return withNewScaleLike(getScale());
    }

    public CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScale(){
            return withNewScaleLike(getScale() != null ? getScale(): new CustomResourceSubresourceScaleBuilder().build());
    }

    public CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScaleLike(CustomResourceSubresourceScale item){
            return withNewScaleLike(getScale() != null ? getScale(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceSubresourceStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public CustomResourceSubresourceStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(CustomResourceSubresourceStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new CustomResourceSubresourceStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public CustomResourceSubresourcesFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public CustomResourceSubresourcesFluent.StatusNested<A> withNewStatusLike(CustomResourceSubresourceStatus item){
            return new StatusNestedImpl(item);
    }

    public CustomResourceSubresourcesFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public CustomResourceSubresourcesFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new CustomResourceSubresourceStatusBuilder().build());
    }

    public CustomResourceSubresourcesFluent.StatusNested<A> editOrNewStatusLike(CustomResourceSubresourceStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceSubresourcesFluentImpl that = (CustomResourceSubresourcesFluentImpl) o;
            if (scale != null ? !scale.equals(that.scale) :that.scale != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class ScaleNestedImpl<N> extends CustomResourceSubresourceScaleFluentImpl<CustomResourceSubresourcesFluent.ScaleNested<N>> implements CustomResourceSubresourcesFluent.ScaleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceSubresourceScaleBuilder builder;
    
            ScaleNestedImpl(CustomResourceSubresourceScale item){
                    this.builder = new CustomResourceSubresourceScaleBuilder(this, item);
            }
            ScaleNestedImpl(){
                    this.builder = new CustomResourceSubresourceScaleBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceSubresourcesFluentImpl.this.withScale(builder.build());
    }
    public N endScale(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends CustomResourceSubresourceStatusFluentImpl<CustomResourceSubresourcesFluent.StatusNested<N>> implements CustomResourceSubresourcesFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceSubresourceStatusBuilder builder;
    
            StatusNestedImpl(CustomResourceSubresourceStatus item){
                    this.builder = new CustomResourceSubresourceStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new CustomResourceSubresourceStatusBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceSubresourcesFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
