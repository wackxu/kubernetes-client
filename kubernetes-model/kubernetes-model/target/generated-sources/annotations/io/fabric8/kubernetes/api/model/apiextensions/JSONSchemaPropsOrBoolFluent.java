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

public interface JSONSchemaPropsOrBoolFluent<A extends JSONSchemaPropsOrBoolFluent<A>> extends Fluent<A>{


    public Boolean isAllows();
    public A withAllows(Boolean allows);
    public Boolean hasAllows();
    public A withNewAllows(String arg1);
    public A withNewAllows(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildSchema instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaProps getSchema();
    public JSONSchemaProps buildSchema();
    public A withSchema(JSONSchemaProps schema);
    public Boolean hasSchema();
    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> withNewSchema();
    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> withNewSchemaLike(JSONSchemaProps item);
    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> editSchema();
    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> editOrNewSchema();
    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> editOrNewSchemaLike(JSONSchemaProps item);

    public interface SchemaNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<JSONSchemaPropsOrBoolFluent.SchemaNested<N>>{

        
    public N and();    public N endSchema();
}


}
