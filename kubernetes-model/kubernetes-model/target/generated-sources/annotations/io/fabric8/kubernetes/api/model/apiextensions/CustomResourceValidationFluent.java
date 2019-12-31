package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface CustomResourceValidationFluent<A extends CustomResourceValidationFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildOpenAPIV3Schema instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaProps getOpenAPIV3Schema();
    public JSONSchemaProps buildOpenAPIV3Schema();
    public A withOpenAPIV3Schema(JSONSchemaProps openAPIV3Schema);
    public Boolean hasOpenAPIV3Schema();
    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3Schema();
    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3SchemaLike(JSONSchemaProps item);
    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOpenAPIV3Schema();
    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3Schema();
    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3SchemaLike(JSONSchemaProps item);

    public interface OpenAPIV3SchemaNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>>{

        
    public N and();    public N endOpenAPIV3Schema();
}


}
