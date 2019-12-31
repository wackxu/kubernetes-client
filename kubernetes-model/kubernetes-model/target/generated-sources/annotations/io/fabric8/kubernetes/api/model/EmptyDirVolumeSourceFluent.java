package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import javax.validation.Valid;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.lang.Object;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import java.util.Map;
import com.fasterxml.jackson.core.JsonParser;

public interface EmptyDirVolumeSourceFluent<A extends EmptyDirVolumeSourceFluent<A>> extends Fluent<A>{


    public String getMedium();
    public A withMedium(String medium);
    public Boolean hasMedium();
    
/**
 * This method has been deprecated, please use method buildSizeLimit instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getSizeLimit();
    public Quantity buildSizeLimit();
    public A withSizeLimit(Quantity sizeLimit);
    public Boolean hasSizeLimit();
    public A withNewSizeLimit(String amount,String format);
    public A withNewSizeLimit(String amount);
    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> withNewSizeLimit();
    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> withNewSizeLimitLike(Quantity item);
    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> editSizeLimit();
    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> editOrNewSizeLimit();
    public EmptyDirVolumeSourceFluent.SizeLimitNested<A> editOrNewSizeLimitLike(Quantity item);

    public interface SizeLimitNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<EmptyDirVolumeSourceFluent.SizeLimitNested<N>>{

        
    public N and();    public N endSizeLimit();
}


}
