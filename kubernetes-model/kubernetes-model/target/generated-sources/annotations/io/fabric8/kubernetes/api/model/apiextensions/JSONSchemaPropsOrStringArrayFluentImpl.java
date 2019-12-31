package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class JSONSchemaPropsOrStringArrayFluentImpl<A extends JSONSchemaPropsOrStringArrayFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JSONSchemaPropsOrStringArrayFluent<A>{

    private List<String> property;
    private JSONSchemaPropsBuilder schema;

    public JSONSchemaPropsOrStringArrayFluentImpl(){
    }
    public JSONSchemaPropsOrStringArrayFluentImpl(JSONSchemaPropsOrStringArray instance){
            this.withProperty(instance.getProperty()); 
            this.withSchema(instance.getSchema()); 
    }

    public A addToProperty(int index,String item){
            if (this.property == null) {this.property = new ArrayList<String>();}
            this.property.add(index, item);
            return (A)this;
    }

    public A setToProperty(int index,String item){
            if (this.property == null) {this.property = new ArrayList<String>();}
            this.property.set(index, item); return (A)this;
    }

    public A addToProperty(String... items){
            if (this.property == null) {this.property = new ArrayList<String>();}
            for (String item : items) {this.property.add(item);} return (A)this;
    }

    public A addAllToProperty(Collection<String> items){
            if (this.property == null) {this.property = new ArrayList<String>();}
            for (String item : items) {this.property.add(item);} return (A)this;
    }

    public A removeFromProperty(String... items){
            for (String item : items) {if (this.property!= null){ this.property.remove(item);}} return (A)this;
    }

    public A removeAllFromProperty(Collection<String> items){
            for (String item : items) {if (this.property!= null){ this.property.remove(item);}} return (A)this;
    }

    public List<String> getProperty(){
            return this.property;
    }

    public String getProperty(int index){
            return this.property.get(index);
    }

    public String getFirstProperty(){
            return this.property.get(0);
    }

    public String getLastProperty(){
            return this.property.get(property.size() - 1);
    }

    public String getMatchingProperty(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: property) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withProperty(List<String> property){
            if (this.property != null) { _visitables.removeAll(this.property);}
            if (property != null) {this.property = new ArrayList<String>(); for (String item : property){this.addToProperty(item);}} else { this.property = new ArrayList<String>();} return (A) this;
    }

    public A withProperty(String... property){
            if (this.property != null) {this.property.clear();}
            if (property != null) {for (String item :property){ this.addToProperty(item);}} return (A) this;
    }

    public Boolean hasProperty(){
            return property != null && !property.isEmpty();
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

    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> withNewSchema(){
            return new SchemaNestedImpl();
    }

    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> withNewSchemaLike(JSONSchemaProps item){
            return new SchemaNestedImpl(item);
    }

    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> editSchema(){
            return withNewSchemaLike(getSchema());
    }

    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> editOrNewSchema(){
            return withNewSchemaLike(getSchema() != null ? getSchema(): new JSONSchemaPropsBuilder().build());
    }

    public JSONSchemaPropsOrStringArrayFluent.SchemaNested<A> editOrNewSchemaLike(JSONSchemaProps item){
            return withNewSchemaLike(getSchema() != null ? getSchema(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONSchemaPropsOrStringArrayFluentImpl that = (JSONSchemaPropsOrStringArrayFluentImpl) o;
            if (property != null ? !property.equals(that.property) :that.property != null) return false;
            if (schema != null ? !schema.equals(that.schema) :that.schema != null) return false;
            return true;
    }


    public class SchemaNestedImpl<N> extends JSONSchemaPropsFluentImpl<JSONSchemaPropsOrStringArrayFluent.SchemaNested<N>> implements JSONSchemaPropsOrStringArrayFluent.SchemaNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
    
            SchemaNestedImpl(JSONSchemaProps item){
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            SchemaNestedImpl(){
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsOrStringArrayFluentImpl.this.withSchema(builder.build());
    }
    public N endSchema(){
            return and();
    }

}


}
