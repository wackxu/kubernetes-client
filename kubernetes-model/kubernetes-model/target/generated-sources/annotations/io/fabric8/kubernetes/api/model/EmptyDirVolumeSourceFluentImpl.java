package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import javax.validation.Valid;
import java.lang.Object;

public class EmptyDirVolumeSourceFluentImpl<A extends EmptyDirVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EmptyDirVolumeSourceFluent<A>{

    private String medium;
    private QuantityBuilder sizeLimit;

    public EmptyDirVolumeSourceFluentImpl(){
    }
    public EmptyDirVolumeSourceFluentImpl(EmptyDirVolumeSource instance){
            this.withMedium(instance.getMedium()); 
            this.withSizeLimit(instance.getSizeLimit()); 
    }

    public String getMedium(){
            return this.medium;
    }

    public A withMedium(String medium){
            this.medium=medium; return (A) this;
    }

    public Boolean hasMedium(){
            return this.medium != null;
    }

    
/**
 * This method has been deprecated, please use method buildSizeLimit instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getSizeLimit(){
            return this.sizeLimit!=null?this.sizeLimit.build():null;
    }

    public Quantity buildSizeLimit(){
            return this.sizeLimit!=null?this.sizeLimit.build():null;
    }

    public A withSizeLimit(Quantity sizeLimit){
            _visitables.remove(this.sizeLimit);
            if (sizeLimit!=null){ this.sizeLimit= new QuantityBuilder(sizeLimit); _visitables.add(this.sizeLimit);} return (A) this;
    }

    public Boolean hasSizeLimit(){
            return this.sizeLimit != null;
    }

    public A withNewSizeLimit(String amount,String format){
            return (A)withSizeLimit(new Quantity(amount, format));
    }

    public A withNewSizeLimit(String amount){
            return (A)withSizeLimit(new Quantity(amount));
    }

    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> withNewSizeLimit(){
            return new SizeLimitNestedImpl();
    }

    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> withNewSizeLimitLike(Quantity item){
            return new SizeLimitNestedImpl(item);
    }

    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> editSizeLimit(){
            return withNewSizeLimitLike(getSizeLimit());
    }

    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> editOrNewSizeLimit(){
            return withNewSizeLimitLike(getSizeLimit() != null ? getSizeLimit(): new QuantityBuilder().build());
    }

    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> editOrNewSizeLimitLike(Quantity item){
            return withNewSizeLimitLike(getSizeLimit() != null ? getSizeLimit(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EmptyDirVolumeSourceFluentImpl that = (EmptyDirVolumeSourceFluentImpl) o;
            if (medium != null ? !medium.equals(that.medium) :that.medium != null) return false;
            if (sizeLimit != null ? !sizeLimit.equals(that.sizeLimit) :that.sizeLimit != null) return false;
            return true;
    }


    public class SizeLimitNestedImpl<N> extends QuantityFluentImpl<EmptyDirVolumeSourceFluent.SizeLimitNested<N>> implements EmptyDirVolumeSourceFluent.SizeLimitNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            SizeLimitNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            SizeLimitNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) EmptyDirVolumeSourceFluentImpl.this.withSizeLimit(builder.build());
    }
    public N endSizeLimit(){
            return and();
    }

}


}
