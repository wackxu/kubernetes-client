package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class JSONSchemaPropsOrBoolFluentImpl<A extends JSONSchemaPropsOrBoolFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JSONSchemaPropsOrBoolFluent<A>{

    private Boolean allows;
    private JSONSchemaPropsBuilder schema;

    public JSONSchemaPropsOrBoolFluentImpl(){
    }
    public JSONSchemaPropsOrBoolFluentImpl(JSONSchemaPropsOrBool instance){
            this.withAllows(instance.getAllows()); 
            this.withSchema(instance.getSchema()); 
    }

    public Boolean isAllows(){
            return this.allows;
    }

    public A withAllows(Boolean allows){
            this.allows=allows; return (A) this;
    }

    public Boolean hasAllows(){
            return this.allows != null;
    }

    public A withNewAllows(String arg1){
            return (A)withAllows(new Boolean(arg1));
    }

    public A withNewAllows(boolean arg1){
            return (A)withAllows(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildSchema instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaProps getSchema(){
            return this.schema!=null?this.schema.build():null;
    }

    public JSONSchemaProps buildSchema(){
            return this.schema!=null?this.schema.build():null;
    }

    public A withSchema(JSONSchemaProps schema){
            _visitables.remove(this.schema);
            if (schema!=null){ this.schema= new JSONSchemaPropsBuilder(schema); _visitables.add(this.schema);} return (A) this;
    }

    public Boolean hasSchema(){
            return this.schema != null;
    }

    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> withNewSchema(){
            return new SchemaNestedImpl();
    }

    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> withNewSchemaLike(JSONSchemaProps item){
            return new SchemaNestedImpl(item);
    }

    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> editSchema(){
            return withNewSchemaLike(getSchema());
    }

    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> editOrNewSchema(){
            return withNewSchemaLike(getSchema() != null ? getSchema(): new JSONSchemaPropsBuilder().build());
    }

    public JSONSchemaPropsOrBoolFluent.SchemaNested<A> editOrNewSchemaLike(JSONSchemaProps item){
            return withNewSchemaLike(getSchema() != null ? getSchema(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONSchemaPropsOrBoolFluentImpl that = (JSONSchemaPropsOrBoolFluentImpl) o;
            if (allows != null ? !allows.equals(that.allows) :that.allows != null) return false;
            if (schema != null ? !schema.equals(that.schema) :that.schema != null) return false;
            return true;
    }


    public class SchemaNestedImpl<N> extends JSONSchemaPropsFluentImpl<JSONSchemaPropsOrBoolFluent.SchemaNested<N>> implements JSONSchemaPropsOrBoolFluent.SchemaNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
    
            SchemaNestedImpl(JSONSchemaProps item){
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            SchemaNestedImpl(){
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsOrBoolFluentImpl.this.withSchema(builder.build());
    }
    public N endSchema(){
            return and();
    }

}


}
