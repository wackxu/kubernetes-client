package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface JSONSchemaPropsOrArrayFluent<A extends JSONSchemaPropsOrArrayFluent<A>> extends Fluent<A>{


    public A addToJSONSchemas(int index,JSONSchemaProps item);
    public A setToJSONSchemas(int index,JSONSchemaProps item);
    public A addToJSONSchemas(JSONSchemaProps... items);
    public A addAllToJSONSchemas(Collection<JSONSchemaProps> items);
    public A removeFromJSONSchemas(JSONSchemaProps... items);
    public A removeAllFromJSONSchemas(Collection<JSONSchemaProps> items);
    
/**
 * This method has been deprecated, please use method buildJSONSchemas instead.
 * @return The buildable object.
 */
@Deprecated public List<JSONSchemaProps> getJSONSchemas();
    public List<JSONSchemaProps> buildJSONSchemas();
    public JSONSchemaProps buildJSONSchema(int index);
    public JSONSchemaProps buildFirstJSONSchema();
    public JSONSchemaProps buildLastJSONSchema();
    public JSONSchemaProps buildMatchingJSONSchema(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate);
    public A withJSONSchemas(List<JSONSchemaProps> jSONSchemas);
    public A withJSONSchemas(JSONSchemaProps... jSONSchemas);
    public Boolean hasJSONSchemas();
    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> addNewJSONSchema();
    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> addNewJSONSchemaLike(JSONSchemaProps item);
    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> setNewJSONSchemaLike(int index,JSONSchemaProps item);
    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> editJSONSchema(int index);
    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> editFirstJSONSchema();
    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> editLastJSONSchema();
    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> editMatchingJSONSchema(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildSchema instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaProps getSchema();
    public JSONSchemaProps buildSchema();
    public A withSchema(JSONSchemaProps schema);
    public Boolean hasSchema();
    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> withNewSchema();
    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> withNewSchemaLike(JSONSchemaProps item);
    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> editSchema();
    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> editOrNewSchema();
    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> editOrNewSchemaLike(JSONSchemaProps item);

    public interface JSONSchemasNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<JSONSchemaPropsOrArrayFluent.JSONSchemasNested<N>>{

        
    public N and();    public N endJSONSchema();
}
    public interface SchemaNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<JSONSchemaPropsOrArrayFluent.SchemaNested<N>>{

        
    public N and();    public N endSchema();
}


}
