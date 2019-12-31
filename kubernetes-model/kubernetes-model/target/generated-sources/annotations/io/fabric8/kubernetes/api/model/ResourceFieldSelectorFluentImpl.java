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

public class ResourceFieldSelectorFluentImpl<A extends ResourceFieldSelectorFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ResourceFieldSelectorFluent<A>{

    private String containerName;
    private QuantityBuilder divisor;
    private String resource;

    public ResourceFieldSelectorFluentImpl(){
    }
    public ResourceFieldSelectorFluentImpl(ResourceFieldSelector instance){
            this.withContainerName(instance.getContainerName()); 
            this.withDivisor(instance.getDivisor()); 
            this.withResource(instance.getResource()); 
    }

    public String getContainerName(){
            return this.containerName;
    }

    public A withContainerName(String containerName){
            this.containerName=containerName; return (A) this;
    }

    public Boolean hasContainerName(){
            return this.containerName != null;
    }

    
/**
 * This method has been deprecated, please use method buildDivisor instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getDivisor(){
            return this.divisor!=null?this.divisor.build():null;
    }

    public Quantity buildDivisor(){
            return this.divisor!=null?this.divisor.build():null;
    }

    public A withDivisor(Quantity divisor){
            _visitables.remove(this.divisor);
            if (divisor!=null){ this.divisor= new QuantityBuilder(divisor); _visitables.add(this.divisor);} return (A) this;
    }

    public Boolean hasDivisor(){
            return this.divisor != null;
    }

    public A withNewDivisor(String amount,String format){
            return (A)withDivisor(new Quantity(amount, format));
    }

    public A withNewDivisor(String amount){
            return (A)withDivisor(new Quantity(amount));
    }

    public ResourceFieldSelectorFluent.DivisorNested<A> withNewDivisor(){
            return new DivisorNestedImpl();
    }

    public ResourceFieldSelectorFluent.DivisorNested<A> withNewDivisorLike(Quantity item){
            return new DivisorNestedImpl(item);
    }

    public ResourceFieldSelectorFluent.DivisorNested<A> editDivisor(){
            return withNewDivisorLike(getDivisor());
    }

    public ResourceFieldSelectorFluent.DivisorNested<A> editOrNewDivisor(){
            return withNewDivisorLike(getDivisor() != null ? getDivisor(): new QuantityBuilder().build());
    }

    public ResourceFieldSelectorFluent.DivisorNested<A> editOrNewDivisorLike(Quantity item){
            return withNewDivisorLike(getDivisor() != null ? getDivisor(): item);
    }

    public String getResource(){
            return this.resource;
    }

    public A withResource(String resource){
            this.resource=resource; return (A) this;
    }

    public Boolean hasResource(){
            return this.resource != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceFieldSelectorFluentImpl that = (ResourceFieldSelectorFluentImpl) o;
            if (containerName != null ? !containerName.equals(that.containerName) :that.containerName != null) return false;
            if (divisor != null ? !divisor.equals(that.divisor) :that.divisor != null) return false;
            if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
            return true;
    }


    public class DivisorNestedImpl<N> extends QuantityFluentImpl<ResourceFieldSelectorFluent.DivisorNested<N>> implements ResourceFieldSelectorFluent.DivisorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            DivisorNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            DivisorNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ResourceFieldSelectorFluentImpl.this.withDivisor(builder.build());
    }
    public N endDivisor(){
            return and();
    }

}


}
