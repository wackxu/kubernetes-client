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

public interface JSONSchemaPropsOrStringArrayFluent<A extends JSONSchemaPropsOrStringArrayFluent<A>> extends Fluent<A>{


    public A addToProperty(int index,String item);
    public A setToProperty(int index,String item);
    public A addToProperty(String... items);
    public A addAllToProperty(Collection<String> items);
    public A removeFromProperty(String... items);
    public A removeAllFromProperty(Collection<String> items);
    public List<String> getProperty();
    public String getProperty(int index);
    public String getFirstProperty();
    public String getLastProperty();
    public String getMatchingProperty(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withProperty(List<String> property);
    public A withProperty(String... property);
    public Boolean hasProperty();
    
/**
 * This method has been deprecated, please use method buildSchema instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaProps getSchema();
    public JSONSchemaProps buildSchema();
    public A withSchema(JSONSchemaProps schema);
    public Boolean hasSchema();
    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> withNewSchema();
    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> withNewSchemaLike(JSONSchemaProps item);
    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> editSchema();
    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> editOrNewSchema();
    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> editOrNewSchemaLike(JSONSchemaProps item);

    public interface SchemaNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<JSONSchemaPropsOrStringArrayFluent.SchemaNested<N>>{

        
    public N and();    public N endSchema();
}


}
