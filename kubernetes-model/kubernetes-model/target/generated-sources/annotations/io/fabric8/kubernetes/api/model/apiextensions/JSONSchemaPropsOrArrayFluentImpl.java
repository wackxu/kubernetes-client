package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class JSONSchemaPropsOrArrayFluentImpl<A extends JSONSchemaPropsOrArrayFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JSONSchemaPropsOrArrayFluent<A>{

    private List<JSONSchemaPropsBuilder> jSONSchemas;
    private JSONSchemaPropsBuilder schema;

    public JSONSchemaPropsOrArrayFluentImpl(){
    }
    public JSONSchemaPropsOrArrayFluentImpl(JSONSchemaPropsOrArray instance){
            this.withJSONSchemas(instance.getJSONSchemas()); 
            this.withSchema(instance.getSchema()); 
    }

    public A addToJSONSchemas(int index,JSONSchemaProps item){
            if (this.jSONSchemas == null) {this.jSONSchemas = new ArrayList<JSONSchemaPropsBuilder>();}
            JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.jSONSchemas.add(index >= 0 ? index : jSONSchemas.size(), builder); return (A)this;
    }

    public A setToJSONSchemas(int index,JSONSchemaProps item){
            if (this.jSONSchemas == null) {this.jSONSchemas = new ArrayList<JSONSchemaPropsBuilder>();}
            JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= jSONSchemas.size()) { jSONSchemas.add(builder); } else { jSONSchemas.set(index, builder);}
             return (A)this;
    }

    public A addToJSONSchemas(JSONSchemaProps... items){
            if (this.jSONSchemas == null) {this.jSONSchemas = new ArrayList<JSONSchemaPropsBuilder>();}
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(builder);this.jSONSchemas.add(builder);} return (A)this;
    }

    public A addAllToJSONSchemas(Collection<JSONSchemaProps> items){
            if (this.jSONSchemas == null) {this.jSONSchemas = new ArrayList<JSONSchemaPropsBuilder>();}
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(builder);this.jSONSchemas.add(builder);} return (A)this;
    }

    public A removeFromJSONSchemas(JSONSchemaProps... items){
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.remove(builder);if (this.jSONSchemas != null) {this.jSONSchemas.remove(builder);}} return (A)this;
    }

    public A removeAllFromJSONSchemas(Collection<JSONSchemaProps> items){
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.remove(builder);if (this.jSONSchemas != null) {this.jSONSchemas.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildJSONSchemas instead.
 * @return The buildable object.
 */
@Deprecated public List<JSONSchemaProps> getJSONSchemas(){
            return build(jSONSchemas);
    }

    public List<JSONSchemaProps> buildJSONSchemas(){
            return build(jSONSchemas);
    }

    public JSONSchemaProps buildJSONSchema(int index){
            return this.jSONSchemas.get(index).build();
    }

    public JSONSchemaProps buildFirstJSONSchema(){
            return this.jSONSchemas.get(0).build();
    }

    public JSONSchemaProps buildLastJSONSchema(){
            return this.jSONSchemas.get(jSONSchemas.size() - 1).build();
    }

    public JSONSchemaProps buildMatchingJSONSchema(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate){
            for (JSONSchemaPropsBuilder item: jSONSchemas) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withJSONSchemas(List<JSONSchemaProps> jSONSchemas){
            if (this.jSONSchemas != null) { _visitables.removeAll(this.jSONSchemas);}
            if (jSONSchemas != null) {this.jSONSchemas = new ArrayList<JSONSchemaPropsBuilder>(); for (JSONSchemaProps item : jSONSchemas){this.addToJSONSchemas(item);}} else { this.jSONSchemas = new ArrayList<JSONSchemaPropsBuilder>();} return (A) this;
    }

    public A withJSONSchemas(JSONSchemaProps... jSONSchemas){
            if (this.jSONSchemas != null) {this.jSONSchemas.clear();}
            if (jSONSchemas != null) {for (JSONSchemaProps item :jSONSchemas){ this.addToJSONSchemas(item);}} return (A) this;
    }

    public Boolean hasJSONSchemas(){
            return jSONSchemas != null && !jSONSchemas.isEmpty();
    }

    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> addNewJSONSchema(){
            return new JSONSchemasNestedImpl();
    }

    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> addNewJSONSchemaLike(JSONSchemaProps item){
            return new JSONSchemasNestedImpl(-1, item);
    }

    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> setNewJSONSchemaLike(int index,JSONSchemaProps item){
            return new JSONSchemasNestedImpl(index, item);
    }

    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> editJSONSchema(int index){
            if (jSONSchemas.size() <= index) throw new RuntimeException("Can't edit jSONSchemas. Index exceeds size.");
            return setNewJSONSchemaLike(index, buildJSONSchema(index));
    }

    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> editFirstJSONSchema(){
            if (jSONSchemas.size() == 0) throw new RuntimeException("Can't edit first jSONSchemas. The list is empty.");
            return setNewJSONSchemaLike(0, buildJSONSchema(0));
    }

    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> editLastJSONSchema(){
            int index = jSONSchemas.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last jSONSchemas. The list is empty.");
            return setNewJSONSchemaLike(index, buildJSONSchema(index));
    }

    public JSONSchemaPropsOrArrayFluent.JSONSchemasNested<A> editMatchingJSONSchema(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate){
            int index = -1;
            for (int i=0;i<jSONSchemas.size();i++) { 
            if (predicate.apply(jSONSchemas.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching jSONSchemas. No match found.");
            return setNewJSONSchemaLike(index, buildJSONSchema(index));
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

    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> withNewSchema(){
            return new SchemaNestedImpl();
    }

    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> withNewSchemaLike(JSONSchemaProps item){
            return new SchemaNestedImpl(item);
    }

    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> editSchema(){
            return withNewSchemaLike(getSchema());
    }

    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> editOrNewSchema(){
            return withNewSchemaLike(getSchema() != null ? getSchema(): new JSONSchemaPropsBuilder().build());
    }

    public JSONSchemaPropsOrArrayFluent.SchemaNested<A> editOrNewSchemaLike(JSONSchemaProps item){
            return withNewSchemaLike(getSchema() != null ? getSchema(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONSchemaPropsOrArrayFluentImpl that = (JSONSchemaPropsOrArrayFluentImpl) o;
            if (jSONSchemas != null ? !jSONSchemas.equals(that.jSONSchemas) :that.jSONSchemas != null) return false;
            if (schema != null ? !schema.equals(that.schema) :that.schema != null) return false;
            return true;
    }


    public class JSONSchemasNestedImpl<N> extends JSONSchemaPropsFluentImpl<JSONSchemaPropsOrArrayFluent.JSONSchemasNested<N>> implements JSONSchemaPropsOrArrayFluent.JSONSchemasNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
        private final int index;
    
            JSONSchemasNestedImpl(int index,JSONSchemaProps item){
                    this.index = index;
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            JSONSchemasNestedImpl(){
                    this.index = -1;
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsOrArrayFluentImpl.this.setToJSONSchemas(index, builder.build());
    }
    public N endJSONSchema(){
            return and();
    }

}
    public class SchemaNestedImpl<N> extends JSONSchemaPropsFluentImpl<JSONSchemaPropsOrArrayFluent.SchemaNested<N>> implements JSONSchemaPropsOrArrayFluent.SchemaNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
    
            SchemaNestedImpl(JSONSchemaProps item){
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            SchemaNestedImpl(){
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsOrArrayFluentImpl.this.withSchema(builder.build());
    }
    public N endSchema(){
            return and();
    }

}


}
