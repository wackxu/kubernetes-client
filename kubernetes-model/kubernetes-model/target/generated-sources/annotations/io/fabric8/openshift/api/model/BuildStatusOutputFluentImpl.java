package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class BuildStatusOutputFluentImpl<A extends BuildStatusOutputFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildStatusOutputFluent<A>{

    private BuildStatusOutputToBuilder to;

    public BuildStatusOutputFluentImpl(){
    }
    public BuildStatusOutputFluentImpl(BuildStatusOutput instance){
            this.withTo(instance.getTo()); 
    }

    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public BuildStatusOutputTo getTo(){
            return this.to!=null?this.to.build():null;
    }

    public BuildStatusOutputTo buildTo(){
            return this.to!=null?this.to.build():null;
    }

    public A withTo(BuildStatusOutputTo to){
            _visitables.remove(this.to);
            if (to!=null){ this.to= new BuildStatusOutputToBuilder(to); _visitables.add(this.to);} return (A) this;
    }

    public Boolean hasTo(){
            return this.to != null;
    }

    public A withNewTo(String imageDigest){
            return (A)withTo(new BuildStatusOutputTo(imageDigest));
    }

    public BuildStatusOutputFluent.ToNested<A> withNewTo(){
            return new ToNestedImpl();
    }

    public BuildStatusOutputFluent.ToNested<A> withNewToLike(BuildStatusOutputTo item){
            return new ToNestedImpl(item);
    }

    public BuildStatusOutputFluent.ToNested<A> editTo(){
            return withNewToLike(getTo());
    }

    public BuildStatusOutputFluent.ToNested<A> editOrNewTo(){
            return withNewToLike(getTo() != null ? getTo(): new BuildStatusOutputToBuilder().build());
    }

    public BuildStatusOutputFluent.ToNested<A> editOrNewToLike(BuildStatusOutputTo item){
            return withNewToLike(getTo() != null ? getTo(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildStatusOutputFluentImpl that = (BuildStatusOutputFluentImpl) o;
            if (to != null ? !to.equals(that.to) :that.to != null) return false;
            return true;
    }


    public class ToNestedImpl<N> extends BuildStatusOutputToFluentImpl<BuildStatusOutputFluent.ToNested<N>> implements BuildStatusOutputFluent.ToNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStatusOutputToBuilder builder;
    
            ToNestedImpl(BuildStatusOutputTo item){
                    this.builder = new BuildStatusOutputToBuilder(this, item);
            }
            ToNestedImpl(){
                    this.builder = new BuildStatusOutputToBuilder(this);
            }
    
    public N and(){
            return (N) BuildStatusOutputFluentImpl.this.withTo(builder.build());
    }
    public N endTo(){
            return and();
    }

}


}
