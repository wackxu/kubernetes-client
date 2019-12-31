package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class CustomResourceValidationFluentImpl<A extends CustomResourceValidationFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceValidationFluent<A>{

    private JSONSchemaPropsBuilder openAPIV3Schema;

    public CustomResourceValidationFluentImpl(){
    }
    public CustomResourceValidationFluentImpl(CustomResourceValidation instance){
            this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema()); 
    }

    
/**
 * This method has been deprecated, please use method buildOpenAPIV3Schema instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaProps getOpenAPIV3Schema(){
            return this.openAPIV3Schema!=null?this.openAPIV3Schema.build():null;
    }

    public JSONSchemaProps buildOpenAPIV3Schema(){
            return this.openAPIV3Schema!=null?this.openAPIV3Schema.build():null;
    }

    public A withOpenAPIV3Schema(JSONSchemaProps openAPIV3Schema){
            _visitables.remove(this.openAPIV3Schema);
            if (openAPIV3Schema!=null){ this.openAPIV3Schema= new JSONSchemaPropsBuilder(openAPIV3Schema); _visitables.add(this.openAPIV3Schema);} return (A) this;
    }

    public Boolean hasOpenAPIV3Schema(){
            return this.openAPIV3Schema != null;
    }

    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3Schema(){
            return new OpenAPIV3SchemaNestedImpl();
    }

    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3SchemaLike(JSONSchemaProps item){
            return new OpenAPIV3SchemaNestedImpl(item);
    }

    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOpenAPIV3Schema(){
            return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema());
    }

    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3Schema(){
            return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema() != null ? getOpenAPIV3Schema(): new JSONSchemaPropsBuilder().build());
    }

    public CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3SchemaLike(JSONSchemaProps item){
            return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema() != null ? getOpenAPIV3Schema(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceValidationFluentImpl that = (CustomResourceValidationFluentImpl) o;
            if (openAPIV3Schema != null ? !openAPIV3Schema.equals(that.openAPIV3Schema) :that.openAPIV3Schema != null) return false;
            return true;
    }


    public class OpenAPIV3SchemaNestedImpl<N> extends JSONSchemaPropsFluentImpl<CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>> implements CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
    
            OpenAPIV3SchemaNestedImpl(JSONSchemaProps item){
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            OpenAPIV3SchemaNestedImpl(){
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceValidationFluentImpl.this.withOpenAPIV3Schema(builder.build());
    }
    public N endOpenAPIV3Schema(){
            return and();
    }

}


}
