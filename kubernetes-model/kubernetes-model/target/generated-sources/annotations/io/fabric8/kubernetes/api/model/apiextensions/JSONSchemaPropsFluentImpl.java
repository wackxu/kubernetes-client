package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Double;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;

public class JSONSchemaPropsFluentImpl<A extends JSONSchemaPropsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JSONSchemaPropsFluent<A>{

    private String $ref;
    private String $schema;
    private JSONSchemaPropsOrBoolBuilder additionalItems;
    private JSONSchemaPropsOrBoolBuilder additionalProperties;
    private List<JSONSchemaPropsBuilder> allOf;
    private List<JSONSchemaPropsBuilder> anyOf;
    private JSONBuilder _default;
    private Map<String,JSONSchemaProps> definitions;
    private Map<String,JSONSchemaPropsOrStringArray> dependencies;
    private String description;
    private List<JSONBuilder> _enum;
    private JSONBuilder example;
    private Boolean exclusiveMaximum;
    private Boolean exclusiveMinimum;
    private ExternalDocumentationBuilder externalDocs;
    private String format;
    private String id;
    private JSONSchemaPropsOrArrayBuilder items;
    private Long maxItems;
    private Long maxLength;
    private Long maxProperties;
    private Double maximum;
    private Long minItems;
    private Long minLength;
    private Long minProperties;
    private Double minimum;
    private Double multipleOf;
    private JSONSchemaPropsBuilder not;
    private List<JSONSchemaPropsBuilder> oneOf;
    private String pattern;
    private Map<String,JSONSchemaProps> patternProperties;
    private Map<String,JSONSchemaProps> properties;
    private List<String> required;
    private String title;
    private String type;
    private Boolean uniqueItems;

    public JSONSchemaPropsFluentImpl(){
    }
    public JSONSchemaPropsFluentImpl(JSONSchemaProps instance){
            this.withRef(instance.get$ref()); 
            this.withSchema(instance.get$schema()); 
            this.withAdditionalItems(instance.getAdditionalItems()); 
            this.withAdditionalProperties(instance.getAdditionalProperties()); 
            this.withAllOf(instance.getAllOf()); 
            this.withAnyOf(instance.getAnyOf()); 
            this.withDefault(instance.getDefault()); 
            this.withDefinitions(instance.getDefinitions()); 
            this.withDependencies(instance.getDependencies()); 
            this.withDescription(instance.getDescription()); 
            this.withEnum(instance.getEnum()); 
            this.withExample(instance.getExample()); 
            this.withExclusiveMaximum(instance.getExclusiveMaximum()); 
            this.withExclusiveMinimum(instance.getExclusiveMinimum()); 
            this.withExternalDocs(instance.getExternalDocs()); 
            this.withFormat(instance.getFormat()); 
            this.withId(instance.getId()); 
            this.withItems(instance.getItems()); 
            this.withMaxItems(instance.getMaxItems()); 
            this.withMaxLength(instance.getMaxLength()); 
            this.withMaxProperties(instance.getMaxProperties()); 
            this.withMaximum(instance.getMaximum()); 
            this.withMinItems(instance.getMinItems()); 
            this.withMinLength(instance.getMinLength()); 
            this.withMinProperties(instance.getMinProperties()); 
            this.withMinimum(instance.getMinimum()); 
            this.withMultipleOf(instance.getMultipleOf()); 
            this.withNot(instance.getNot()); 
            this.withOneOf(instance.getOneOf()); 
            this.withPattern(instance.getPattern()); 
            this.withPatternProperties(instance.getPatternProperties()); 
            this.withProperties(instance.getProperties()); 
            this.withRequired(instance.getRequired()); 
            this.withTitle(instance.getTitle()); 
            this.withType(instance.getType()); 
            this.withUniqueItems(instance.getUniqueItems()); 
    }

    public String getRef(){
            return this.$ref;
    }

    public A withRef(String $ref){
            this.$ref=$ref; return (A) this;
    }

    public Boolean hasRef(){
            return this.$ref != null;
    }

    public String getSchema(){
            return this.$schema;
    }

    public A withSchema(String $schema){
            this.$schema=$schema; return (A) this;
    }

    public Boolean hasSchema(){
            return this.$schema != null;
    }

    
/**
 * This method has been deprecated, please use method buildAdditionalItems instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaPropsOrBool getAdditionalItems(){
            return this.additionalItems!=null?this.additionalItems.build():null;
    }

    public JSONSchemaPropsOrBool buildAdditionalItems(){
            return this.additionalItems!=null?this.additionalItems.build():null;
    }

    public A withAdditionalItems(JSONSchemaPropsOrBool additionalItems){
            _visitables.remove(this.additionalItems);
            if (additionalItems!=null){ this.additionalItems= new JSONSchemaPropsOrBoolBuilder(additionalItems); _visitables.add(this.additionalItems);} return (A) this;
    }

    public Boolean hasAdditionalItems(){
            return this.additionalItems != null;
    }

    public JSONSchemaPropsFluent.AdditionalItemsNested<A> withNewAdditionalItems(){
            return new AdditionalItemsNestedImpl();
    }

    public JSONSchemaPropsFluent.AdditionalItemsNested<A> withNewAdditionalItemsLike(JSONSchemaPropsOrBool item){
            return new AdditionalItemsNestedImpl(item);
    }

    public JSONSchemaPropsFluent.AdditionalItemsNested<A> editAdditionalItems(){
            return withNewAdditionalItemsLike(getAdditionalItems());
    }

    public JSONSchemaPropsFluent.AdditionalItemsNested<A> editOrNewAdditionalItems(){
            return withNewAdditionalItemsLike(getAdditionalItems() != null ? getAdditionalItems(): new JSONSchemaPropsOrBoolBuilder().build());
    }

    public JSONSchemaPropsFluent.AdditionalItemsNested<A> editOrNewAdditionalItemsLike(JSONSchemaPropsOrBool item){
            return withNewAdditionalItemsLike(getAdditionalItems() != null ? getAdditionalItems(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAdditionalProperties instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaPropsOrBool getAdditionalProperties(){
            return this.additionalProperties!=null?this.additionalProperties.build():null;
    }

    public JSONSchemaPropsOrBool buildAdditionalProperties(){
            return this.additionalProperties!=null?this.additionalProperties.build():null;
    }

    public A withAdditionalProperties(JSONSchemaPropsOrBool additionalProperties){
            _visitables.remove(this.additionalProperties);
            if (additionalProperties!=null){ this.additionalProperties= new JSONSchemaPropsOrBoolBuilder(additionalProperties); _visitables.add(this.additionalProperties);} return (A) this;
    }

    public Boolean hasAdditionalProperties(){
            return this.additionalProperties != null;
    }

    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> withNewAdditionalProperties(){
            return new AdditionalPropertiesNestedImpl();
    }

    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> withNewAdditionalPropertiesLike(JSONSchemaPropsOrBool item){
            return new AdditionalPropertiesNestedImpl(item);
    }

    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> editAdditionalProperties(){
            return withNewAdditionalPropertiesLike(getAdditionalProperties());
    }

    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> editOrNewAdditionalProperties(){
            return withNewAdditionalPropertiesLike(getAdditionalProperties() != null ? getAdditionalProperties(): new JSONSchemaPropsOrBoolBuilder().build());
    }

    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> editOrNewAdditionalPropertiesLike(JSONSchemaPropsOrBool item){
            return withNewAdditionalPropertiesLike(getAdditionalProperties() != null ? getAdditionalProperties(): item);
    }

    public A addToAllOf(int index,JSONSchemaProps item){
            if (this.allOf == null) {this.allOf = new ArrayList<JSONSchemaPropsBuilder>();}
            JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.allOf.add(index >= 0 ? index : allOf.size(), builder); return (A)this;
    }

    public A setToAllOf(int index,JSONSchemaProps item){
            if (this.allOf == null) {this.allOf = new ArrayList<JSONSchemaPropsBuilder>();}
            JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= allOf.size()) { allOf.add(builder); } else { allOf.set(index, builder);}
             return (A)this;
    }

    public A addToAllOf(JSONSchemaProps... items){
            if (this.allOf == null) {this.allOf = new ArrayList<JSONSchemaPropsBuilder>();}
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(builder);this.allOf.add(builder);} return (A)this;
    }

    public A addAllToAllOf(Collection<JSONSchemaProps> items){
            if (this.allOf == null) {this.allOf = new ArrayList<JSONSchemaPropsBuilder>();}
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(builder);this.allOf.add(builder);} return (A)this;
    }

    public A removeFromAllOf(JSONSchemaProps... items){
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.remove(builder);if (this.allOf != null) {this.allOf.remove(builder);}} return (A)this;
    }

    public A removeAllFromAllOf(Collection<JSONSchemaProps> items){
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.remove(builder);if (this.allOf != null) {this.allOf.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAllOf instead.
 * @return The buildable object.
 */
@Deprecated public List<JSONSchemaProps> getAllOf(){
            return build(allOf);
    }

    public List<JSONSchemaProps> buildAllOf(){
            return build(allOf);
    }

    public JSONSchemaProps buildAllOf(int index){
            return this.allOf.get(index).build();
    }

    public JSONSchemaProps buildFirstAllOf(){
            return this.allOf.get(0).build();
    }

    public JSONSchemaProps buildLastAllOf(){
            return this.allOf.get(allOf.size() - 1).build();
    }

    public JSONSchemaProps buildMatchingAllOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate){
            for (JSONSchemaPropsBuilder item: allOf) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAllOf(List<JSONSchemaProps> allOf){
            if (this.allOf != null) { _visitables.removeAll(this.allOf);}
            if (allOf != null) {this.allOf = new ArrayList<JSONSchemaPropsBuilder>(); for (JSONSchemaProps item : allOf){this.addToAllOf(item);}} else { this.allOf = new ArrayList<JSONSchemaPropsBuilder>();} return (A) this;
    }

    public A withAllOf(JSONSchemaProps... allOf){
            if (this.allOf != null) {this.allOf.clear();}
            if (allOf != null) {for (JSONSchemaProps item :allOf){ this.addToAllOf(item);}} return (A) this;
    }

    public Boolean hasAllOf(){
            return allOf != null && !allOf.isEmpty();
    }

    public JSONSchemaPropsFluent.AllOfNested<A> addNewAllOf(){
            return new AllOfNestedImpl();
    }

    public JSONSchemaPropsFluent.AllOfNested<A> addNewAllOfLike(JSONSchemaProps item){
            return new AllOfNestedImpl(-1, item);
    }

    public JSONSchemaPropsFluent.AllOfNested<A> setNewAllOfLike(int index,JSONSchemaProps item){
            return new AllOfNestedImpl(index, item);
    }

    public JSONSchemaPropsFluent.AllOfNested<A> editAllOf(int index){
            if (allOf.size() <= index) throw new RuntimeException("Can't edit allOf. Index exceeds size.");
            return setNewAllOfLike(index, buildAllOf(index));
    }

    public JSONSchemaPropsFluent.AllOfNested<A> editFirstAllOf(){
            if (allOf.size() == 0) throw new RuntimeException("Can't edit first allOf. The list is empty.");
            return setNewAllOfLike(0, buildAllOf(0));
    }

    public JSONSchemaPropsFluent.AllOfNested<A> editLastAllOf(){
            int index = allOf.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last allOf. The list is empty.");
            return setNewAllOfLike(index, buildAllOf(index));
    }

    public JSONSchemaPropsFluent.AllOfNested<A> editMatchingAllOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate){
            int index = -1;
            for (int i=0;i<allOf.size();i++) { 
            if (predicate.apply(allOf.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching allOf. No match found.");
            return setNewAllOfLike(index, buildAllOf(index));
    }

    public A addToAnyOf(int index,JSONSchemaProps item){
            if (this.anyOf == null) {this.anyOf = new ArrayList<JSONSchemaPropsBuilder>();}
            JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.anyOf.add(index >= 0 ? index : anyOf.size(), builder); return (A)this;
    }

    public A setToAnyOf(int index,JSONSchemaProps item){
            if (this.anyOf == null) {this.anyOf = new ArrayList<JSONSchemaPropsBuilder>();}
            JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= anyOf.size()) { anyOf.add(builder); } else { anyOf.set(index, builder);}
             return (A)this;
    }

    public A addToAnyOf(JSONSchemaProps... items){
            if (this.anyOf == null) {this.anyOf = new ArrayList<JSONSchemaPropsBuilder>();}
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(builder);this.anyOf.add(builder);} return (A)this;
    }

    public A addAllToAnyOf(Collection<JSONSchemaProps> items){
            if (this.anyOf == null) {this.anyOf = new ArrayList<JSONSchemaPropsBuilder>();}
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(builder);this.anyOf.add(builder);} return (A)this;
    }

    public A removeFromAnyOf(JSONSchemaProps... items){
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.remove(builder);if (this.anyOf != null) {this.anyOf.remove(builder);}} return (A)this;
    }

    public A removeAllFromAnyOf(Collection<JSONSchemaProps> items){
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.remove(builder);if (this.anyOf != null) {this.anyOf.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAnyOf instead.
 * @return The buildable object.
 */
@Deprecated public List<JSONSchemaProps> getAnyOf(){
            return build(anyOf);
    }

    public List<JSONSchemaProps> buildAnyOf(){
            return build(anyOf);
    }

    public JSONSchemaProps buildAnyOf(int index){
            return this.anyOf.get(index).build();
    }

    public JSONSchemaProps buildFirstAnyOf(){
            return this.anyOf.get(0).build();
    }

    public JSONSchemaProps buildLastAnyOf(){
            return this.anyOf.get(anyOf.size() - 1).build();
    }

    public JSONSchemaProps buildMatchingAnyOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate){
            for (JSONSchemaPropsBuilder item: anyOf) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAnyOf(List<JSONSchemaProps> anyOf){
            if (this.anyOf != null) { _visitables.removeAll(this.anyOf);}
            if (anyOf != null) {this.anyOf = new ArrayList<JSONSchemaPropsBuilder>(); for (JSONSchemaProps item : anyOf){this.addToAnyOf(item);}} else { this.anyOf = new ArrayList<JSONSchemaPropsBuilder>();} return (A) this;
    }

    public A withAnyOf(JSONSchemaProps... anyOf){
            if (this.anyOf != null) {this.anyOf.clear();}
            if (anyOf != null) {for (JSONSchemaProps item :anyOf){ this.addToAnyOf(item);}} return (A) this;
    }

    public Boolean hasAnyOf(){
            return anyOf != null && !anyOf.isEmpty();
    }

    public JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOf(){
            return new AnyOfNestedImpl();
    }

    public JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOfLike(JSONSchemaProps item){
            return new AnyOfNestedImpl(-1, item);
    }

    public JSONSchemaPropsFluent.AnyOfNested<A> setNewAnyOfLike(int index,JSONSchemaProps item){
            return new AnyOfNestedImpl(index, item);
    }

    public JSONSchemaPropsFluent.AnyOfNested<A> editAnyOf(int index){
            if (anyOf.size() <= index) throw new RuntimeException("Can't edit anyOf. Index exceeds size.");
            return setNewAnyOfLike(index, buildAnyOf(index));
    }

    public JSONSchemaPropsFluent.AnyOfNested<A> editFirstAnyOf(){
            if (anyOf.size() == 0) throw new RuntimeException("Can't edit first anyOf. The list is empty.");
            return setNewAnyOfLike(0, buildAnyOf(0));
    }

    public JSONSchemaPropsFluent.AnyOfNested<A> editLastAnyOf(){
            int index = anyOf.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last anyOf. The list is empty.");
            return setNewAnyOfLike(index, buildAnyOf(index));
    }

    public JSONSchemaPropsFluent.AnyOfNested<A> editMatchingAnyOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate){
            int index = -1;
            for (int i=0;i<anyOf.size();i++) { 
            if (predicate.apply(anyOf.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching anyOf. No match found.");
            return setNewAnyOfLike(index, buildAnyOf(index));
    }

    
/**
 * This method has been deprecated, please use method buildDefault instead.
 * @return The buildable object.
 */
@Deprecated public JSON getDefault(){
            return this._default!=null?this._default.build():null;
    }

    public JSON buildDefault(){
            return this._default!=null?this._default.build():null;
    }

    public A withDefault(JSON _default){
            _visitables.remove(this._default);
            if (_default!=null){ this._default= new JSONBuilder(_default); _visitables.add(this._default);} return (A) this;
    }

    public Boolean hasDefault(){
            return this._default != null;
    }

    public A withNewDefault(String raw){
            return (A)withDefault(new JSON(raw));
    }

    public JSONSchemaPropsFluent.DefaultNested<A> withNewDefault(){
            return new DefaultNestedImpl();
    }

    public JSONSchemaPropsFluent.DefaultNested<A> withNewDefaultLike(JSON item){
            return new DefaultNestedImpl(item);
    }

    public JSONSchemaPropsFluent.DefaultNested<A> editDefault(){
            return withNewDefaultLike(getDefault());
    }

    public JSONSchemaPropsFluent.DefaultNested<A> editOrNewDefault(){
            return withNewDefaultLike(getDefault() != null ? getDefault(): new JSONBuilder().build());
    }

    public JSONSchemaPropsFluent.DefaultNested<A> editOrNewDefaultLike(JSON item){
            return withNewDefaultLike(getDefault() != null ? getDefault(): item);
    }

    public A addToDefinitions(String key,JSONSchemaProps value){
            if(this.definitions == null && key != null && value != null) { this.definitions = new LinkedHashMap<String,JSONSchemaProps>(); }
            if(key != null && value != null) {this.definitions.put(key, value);} return (A)this;
    }

    public A addToDefinitions(Map<String,JSONSchemaProps> map){
            if(this.definitions == null && map != null) { this.definitions = new LinkedHashMap<String,JSONSchemaProps>(); }
            if(map != null) { this.definitions.putAll(map);} return (A)this;
    }

    public A removeFromDefinitions(String key){
            if(this.definitions == null) { return (A) this; }
            if(key != null && this.definitions != null) {this.definitions.remove(key);} return (A)this;
    }

    public A removeFromDefinitions(Map<String,JSONSchemaProps> map){
            if(this.definitions == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.definitions != null){this.definitions.remove(key);}}} return (A)this;
    }

    public Map<String,JSONSchemaProps> getDefinitions(){
            return this.definitions;
    }

    public A withDefinitions(Map<String,JSONSchemaProps> definitions){
            if (definitions == null) { this.definitions =  new LinkedHashMap<String,JSONSchemaProps>();} else {this.definitions = new LinkedHashMap<String,JSONSchemaProps>(definitions);} return (A) this;
    }

    public Boolean hasDefinitions(){
            return this.definitions != null;
    }

    public A addToDependencies(String key,JSONSchemaPropsOrStringArray value){
            if(this.dependencies == null && key != null && value != null) { this.dependencies = new LinkedHashMap<String,JSONSchemaPropsOrStringArray>(); }
            if(key != null && value != null) {this.dependencies.put(key, value);} return (A)this;
    }

    public A addToDependencies(Map<String,JSONSchemaPropsOrStringArray> map){
            if(this.dependencies == null && map != null) { this.dependencies = new LinkedHashMap<String,JSONSchemaPropsOrStringArray>(); }
            if(map != null) { this.dependencies.putAll(map);} return (A)this;
    }

    public A removeFromDependencies(String key){
            if(this.dependencies == null) { return (A) this; }
            if(key != null && this.dependencies != null) {this.dependencies.remove(key);} return (A)this;
    }

    public A removeFromDependencies(Map<String,JSONSchemaPropsOrStringArray> map){
            if(this.dependencies == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.dependencies != null){this.dependencies.remove(key);}}} return (A)this;
    }

    public Map<String,JSONSchemaPropsOrStringArray> getDependencies(){
            return this.dependencies;
    }

    public A withDependencies(Map<String,JSONSchemaPropsOrStringArray> dependencies){
            if (dependencies == null) { this.dependencies =  new LinkedHashMap<String,JSONSchemaPropsOrStringArray>();} else {this.dependencies = new LinkedHashMap<String,JSONSchemaPropsOrStringArray>(dependencies);} return (A) this;
    }

    public Boolean hasDependencies(){
            return this.dependencies != null;
    }

    public String getDescription(){
            return this.description;
    }

    public A withDescription(String description){
            this.description=description; return (A) this;
    }

    public Boolean hasDescription(){
            return this.description != null;
    }

    public A addToEnum(int index,JSON item){
            if (this._enum == null) {this._enum = new ArrayList<JSONBuilder>();}
            JSONBuilder builder = new JSONBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this._enum.add(index >= 0 ? index : _enum.size(), builder); return (A)this;
    }

    public A setToEnum(int index,JSON item){
            if (this._enum == null) {this._enum = new ArrayList<JSONBuilder>();}
            JSONBuilder builder = new JSONBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= _enum.size()) { _enum.add(builder); } else { _enum.set(index, builder);}
             return (A)this;
    }

    public A addToEnum(JSON... items){
            if (this._enum == null) {this._enum = new ArrayList<JSONBuilder>();}
            for (JSON item : items) {JSONBuilder builder = new JSONBuilder(item);_visitables.add(builder);this._enum.add(builder);} return (A)this;
    }

    public A addAllToEnum(Collection<JSON> items){
            if (this._enum == null) {this._enum = new ArrayList<JSONBuilder>();}
            for (JSON item : items) {JSONBuilder builder = new JSONBuilder(item);_visitables.add(builder);this._enum.add(builder);} return (A)this;
    }

    public A removeFromEnum(JSON... items){
            for (JSON item : items) {JSONBuilder builder = new JSONBuilder(item);_visitables.remove(builder);if (this._enum != null) {this._enum.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnum(Collection<JSON> items){
            for (JSON item : items) {JSONBuilder builder = new JSONBuilder(item);_visitables.remove(builder);if (this._enum != null) {this._enum.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnum instead.
 * @return The buildable object.
 */
@Deprecated public List<JSON> getEnum(){
            return build(_enum);
    }

    public List<JSON> buildEnum(){
            return build(_enum);
    }

    public JSON buildEnum(int index){
            return this._enum.get(index).build();
    }

    public JSON buildFirstEnum(){
            return this._enum.get(0).build();
    }

    public JSON buildLastEnum(){
            return this._enum.get(_enum.size() - 1).build();
    }

    public JSON buildMatchingEnum(io.fabric8.kubernetes.api.builder.Predicate<JSONBuilder> predicate){
            for (JSONBuilder item: _enum) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnum(List<JSON> _enum){
            if (this._enum != null) { _visitables.removeAll(this._enum);}
            if (_enum != null) {this._enum = new ArrayList<JSONBuilder>(); for (JSON item : _enum){this.addToEnum(item);}} else { this._enum = new ArrayList<JSONBuilder>();} return (A) this;
    }

    public A withEnum(JSON... _enum){
            if (this._enum != null) {this._enum.clear();}
            if (_enum != null) {for (JSON item :_enum){ this.addToEnum(item);}} return (A) this;
    }

    public Boolean hasEnum(){
            return _enum != null && !_enum.isEmpty();
    }

    public A addNewEnum(String raw){
            return (A)addToEnum(new JSON(raw));
    }

    public JSONSchemaPropsFluent.EnumNested<A> addNewEnum(){
            return new EnumNestedImpl();
    }

    public JSONSchemaPropsFluent.EnumNested<A> addNewEnumLike(JSON item){
            return new EnumNestedImpl(-1, item);
    }

    public JSONSchemaPropsFluent.EnumNested<A> setNewEnumLike(int index,JSON item){
            return new EnumNestedImpl(index, item);
    }

    public JSONSchemaPropsFluent.EnumNested<A> editEnum(int index){
            if (_enum.size() <= index) throw new RuntimeException("Can't edit _enum. Index exceeds size.");
            return setNewEnumLike(index, buildEnum(index));
    }

    public JSONSchemaPropsFluent.EnumNested<A> editFirstEnum(){
            if (_enum.size() == 0) throw new RuntimeException("Can't edit first _enum. The list is empty.");
            return setNewEnumLike(0, buildEnum(0));
    }

    public JSONSchemaPropsFluent.EnumNested<A> editLastEnum(){
            int index = _enum.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last _enum. The list is empty.");
            return setNewEnumLike(index, buildEnum(index));
    }

    public JSONSchemaPropsFluent.EnumNested<A> editMatchingEnum(io.fabric8.kubernetes.api.builder.Predicate<JSONBuilder> predicate){
            int index = -1;
            for (int i=0;i<_enum.size();i++) { 
            if (predicate.apply(_enum.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching _enum. No match found.");
            return setNewEnumLike(index, buildEnum(index));
    }

    
/**
 * This method has been deprecated, please use method buildExample instead.
 * @return The buildable object.
 */
@Deprecated public JSON getExample(){
            return this.example!=null?this.example.build():null;
    }

    public JSON buildExample(){
            return this.example!=null?this.example.build():null;
    }

    public A withExample(JSON example){
            _visitables.remove(this.example);
            if (example!=null){ this.example= new JSONBuilder(example); _visitables.add(this.example);} return (A) this;
    }

    public Boolean hasExample(){
            return this.example != null;
    }

    public A withNewExample(String raw){
            return (A)withExample(new JSON(raw));
    }

    public JSONSchemaPropsFluent.ExampleNested<A> withNewExample(){
            return new ExampleNestedImpl();
    }

    public JSONSchemaPropsFluent.ExampleNested<A> withNewExampleLike(JSON item){
            return new ExampleNestedImpl(item);
    }

    public JSONSchemaPropsFluent.ExampleNested<A> editExample(){
            return withNewExampleLike(getExample());
    }

    public JSONSchemaPropsFluent.ExampleNested<A> editOrNewExample(){
            return withNewExampleLike(getExample() != null ? getExample(): new JSONBuilder().build());
    }

    public JSONSchemaPropsFluent.ExampleNested<A> editOrNewExampleLike(JSON item){
            return withNewExampleLike(getExample() != null ? getExample(): item);
    }

    public Boolean isExclusiveMaximum(){
            return this.exclusiveMaximum;
    }

    public A withExclusiveMaximum(Boolean exclusiveMaximum){
            this.exclusiveMaximum=exclusiveMaximum; return (A) this;
    }

    public Boolean hasExclusiveMaximum(){
            return this.exclusiveMaximum != null;
    }

    public A withNewExclusiveMaximum(String arg1){
            return (A)withExclusiveMaximum(new Boolean(arg1));
    }

    public A withNewExclusiveMaximum(boolean arg1){
            return (A)withExclusiveMaximum(new Boolean(arg1));
    }

    public Boolean isExclusiveMinimum(){
            return this.exclusiveMinimum;
    }

    public A withExclusiveMinimum(Boolean exclusiveMinimum){
            this.exclusiveMinimum=exclusiveMinimum; return (A) this;
    }

    public Boolean hasExclusiveMinimum(){
            return this.exclusiveMinimum != null;
    }

    public A withNewExclusiveMinimum(String arg1){
            return (A)withExclusiveMinimum(new Boolean(arg1));
    }

    public A withNewExclusiveMinimum(boolean arg1){
            return (A)withExclusiveMinimum(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildExternalDocs instead.
 * @return The buildable object.
 */
@Deprecated public ExternalDocumentation getExternalDocs(){
            return this.externalDocs!=null?this.externalDocs.build():null;
    }

    public ExternalDocumentation buildExternalDocs(){
            return this.externalDocs!=null?this.externalDocs.build():null;
    }

    public A withExternalDocs(ExternalDocumentation externalDocs){
            _visitables.remove(this.externalDocs);
            if (externalDocs!=null){ this.externalDocs= new ExternalDocumentationBuilder(externalDocs); _visitables.add(this.externalDocs);} return (A) this;
    }

    public Boolean hasExternalDocs(){
            return this.externalDocs != null;
    }

    public A withNewExternalDocs(String description,String url){
            return (A)withExternalDocs(new ExternalDocumentation(description, url));
    }

    public JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocs(){
            return new ExternalDocsNestedImpl();
    }

    public JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocsLike(ExternalDocumentation item){
            return new ExternalDocsNestedImpl(item);
    }

    public JSONSchemaPropsFluent.ExternalDocsNested<A> editExternalDocs(){
            return withNewExternalDocsLike(getExternalDocs());
    }

    public JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocs(){
            return withNewExternalDocsLike(getExternalDocs() != null ? getExternalDocs(): new ExternalDocumentationBuilder().build());
    }

    public JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocsLike(ExternalDocumentation item){
            return withNewExternalDocsLike(getExternalDocs() != null ? getExternalDocs(): item);
    }

    public String getFormat(){
            return this.format;
    }

    public A withFormat(String format){
            this.format=format; return (A) this;
    }

    public Boolean hasFormat(){
            return this.format != null;
    }

    public String getId(){
            return this.id;
    }

    public A withId(String id){
            this.id=id; return (A) this;
    }

    public Boolean hasId(){
            return this.id != null;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaPropsOrArray getItems(){
            return this.items!=null?this.items.build():null;
    }

    public JSONSchemaPropsOrArray buildItems(){
            return this.items!=null?this.items.build():null;
    }

    public A withItems(JSONSchemaPropsOrArray items){
            _visitables.remove(this.items);
            if (items!=null){ this.items= new JSONSchemaPropsOrArrayBuilder(items); _visitables.add(this.items);} return (A) this;
    }

    public Boolean hasItems(){
            return this.items != null;
    }

    public JSONSchemaPropsFluent.ItemsNested<A> withNewItems(){
            return new ItemsNestedImpl();
    }

    public JSONSchemaPropsFluent.ItemsNested<A> withNewItemsLike(JSONSchemaPropsOrArray item){
            return new ItemsNestedImpl(item);
    }

    public JSONSchemaPropsFluent.ItemsNested<A> editItems(){
            return withNewItemsLike(getItems());
    }

    public JSONSchemaPropsFluent.ItemsNested<A> editOrNewItems(){
            return withNewItemsLike(getItems() != null ? getItems(): new JSONSchemaPropsOrArrayBuilder().build());
    }

    public JSONSchemaPropsFluent.ItemsNested<A> editOrNewItemsLike(JSONSchemaPropsOrArray item){
            return withNewItemsLike(getItems() != null ? getItems(): item);
    }

    public Long getMaxItems(){
            return this.maxItems;
    }

    public A withMaxItems(Long maxItems){
            this.maxItems=maxItems; return (A) this;
    }

    public Boolean hasMaxItems(){
            return this.maxItems != null;
    }

    public A withNewMaxItems(String arg1){
            return (A)withMaxItems(new Long(arg1));
    }

    public A withNewMaxItems(long arg1){
            return (A)withMaxItems(new Long(arg1));
    }

    public Long getMaxLength(){
            return this.maxLength;
    }

    public A withMaxLength(Long maxLength){
            this.maxLength=maxLength; return (A) this;
    }

    public Boolean hasMaxLength(){
            return this.maxLength != null;
    }

    public A withNewMaxLength(String arg1){
            return (A)withMaxLength(new Long(arg1));
    }

    public A withNewMaxLength(long arg1){
            return (A)withMaxLength(new Long(arg1));
    }

    public Long getMaxProperties(){
            return this.maxProperties;
    }

    public A withMaxProperties(Long maxProperties){
            this.maxProperties=maxProperties; return (A) this;
    }

    public Boolean hasMaxProperties(){
            return this.maxProperties != null;
    }

    public A withNewMaxProperties(String arg1){
            return (A)withMaxProperties(new Long(arg1));
    }

    public A withNewMaxProperties(long arg1){
            return (A)withMaxProperties(new Long(arg1));
    }

    public Double getMaximum(){
            return this.maximum;
    }

    public A withMaximum(Double maximum){
            this.maximum=maximum; return (A) this;
    }

    public Boolean hasMaximum(){
            return this.maximum != null;
    }

    public A withNewMaximum(String arg1){
            return (A)withMaximum(new Double(arg1));
    }

    public A withNewMaximum(double arg1){
            return (A)withMaximum(new Double(arg1));
    }

    public Long getMinItems(){
            return this.minItems;
    }

    public A withMinItems(Long minItems){
            this.minItems=minItems; return (A) this;
    }

    public Boolean hasMinItems(){
            return this.minItems != null;
    }

    public A withNewMinItems(String arg1){
            return (A)withMinItems(new Long(arg1));
    }

    public A withNewMinItems(long arg1){
            return (A)withMinItems(new Long(arg1));
    }

    public Long getMinLength(){
            return this.minLength;
    }

    public A withMinLength(Long minLength){
            this.minLength=minLength; return (A) this;
    }

    public Boolean hasMinLength(){
            return this.minLength != null;
    }

    public A withNewMinLength(String arg1){
            return (A)withMinLength(new Long(arg1));
    }

    public A withNewMinLength(long arg1){
            return (A)withMinLength(new Long(arg1));
    }

    public Long getMinProperties(){
            return this.minProperties;
    }

    public A withMinProperties(Long minProperties){
            this.minProperties=minProperties; return (A) this;
    }

    public Boolean hasMinProperties(){
            return this.minProperties != null;
    }

    public A withNewMinProperties(String arg1){
            return (A)withMinProperties(new Long(arg1));
    }

    public A withNewMinProperties(long arg1){
            return (A)withMinProperties(new Long(arg1));
    }

    public Double getMinimum(){
            return this.minimum;
    }

    public A withMinimum(Double minimum){
            this.minimum=minimum; return (A) this;
    }

    public Boolean hasMinimum(){
            return this.minimum != null;
    }

    public A withNewMinimum(String arg1){
            return (A)withMinimum(new Double(arg1));
    }

    public A withNewMinimum(double arg1){
            return (A)withMinimum(new Double(arg1));
    }

    public Double getMultipleOf(){
            return this.multipleOf;
    }

    public A withMultipleOf(Double multipleOf){
            this.multipleOf=multipleOf; return (A) this;
    }

    public Boolean hasMultipleOf(){
            return this.multipleOf != null;
    }

    public A withNewMultipleOf(String arg1){
            return (A)withMultipleOf(new Double(arg1));
    }

    public A withNewMultipleOf(double arg1){
            return (A)withMultipleOf(new Double(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildNot instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaProps getNot(){
            return this.not!=null?this.not.build():null;
    }

    public JSONSchemaProps buildNot(){
            return this.not!=null?this.not.build():null;
    }

    public A withNot(JSONSchemaProps not){
            _visitables.remove(this.not);
            if (not!=null){ this.not= new JSONSchemaPropsBuilder(not); _visitables.add(this.not);} return (A) this;
    }

    public Boolean hasNot(){
            return this.not != null;
    }

    public JSONSchemaPropsFluent.NotNested<A> withNewNot(){
            return new NotNestedImpl();
    }

    public JSONSchemaPropsFluent.NotNested<A> withNewNotLike(JSONSchemaProps item){
            return new NotNestedImpl(item);
    }

    public JSONSchemaPropsFluent.NotNested<A> editNot(){
            return withNewNotLike(getNot());
    }

    public JSONSchemaPropsFluent.NotNested<A> editOrNewNot(){
            return withNewNotLike(getNot() != null ? getNot(): new JSONSchemaPropsBuilder().build());
    }

    public JSONSchemaPropsFluent.NotNested<A> editOrNewNotLike(JSONSchemaProps item){
            return withNewNotLike(getNot() != null ? getNot(): item);
    }

    public A addToOneOf(int index,JSONSchemaProps item){
            if (this.oneOf == null) {this.oneOf = new ArrayList<JSONSchemaPropsBuilder>();}
            JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.oneOf.add(index >= 0 ? index : oneOf.size(), builder); return (A)this;
    }

    public A setToOneOf(int index,JSONSchemaProps item){
            if (this.oneOf == null) {this.oneOf = new ArrayList<JSONSchemaPropsBuilder>();}
            JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= oneOf.size()) { oneOf.add(builder); } else { oneOf.set(index, builder);}
             return (A)this;
    }

    public A addToOneOf(JSONSchemaProps... items){
            if (this.oneOf == null) {this.oneOf = new ArrayList<JSONSchemaPropsBuilder>();}
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(builder);this.oneOf.add(builder);} return (A)this;
    }

    public A addAllToOneOf(Collection<JSONSchemaProps> items){
            if (this.oneOf == null) {this.oneOf = new ArrayList<JSONSchemaPropsBuilder>();}
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.add(builder);this.oneOf.add(builder);} return (A)this;
    }

    public A removeFromOneOf(JSONSchemaProps... items){
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.remove(builder);if (this.oneOf != null) {this.oneOf.remove(builder);}} return (A)this;
    }

    public A removeAllFromOneOf(Collection<JSONSchemaProps> items){
            for (JSONSchemaProps item : items) {JSONSchemaPropsBuilder builder = new JSONSchemaPropsBuilder(item);_visitables.remove(builder);if (this.oneOf != null) {this.oneOf.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildOneOf instead.
 * @return The buildable object.
 */
@Deprecated public List<JSONSchemaProps> getOneOf(){
            return build(oneOf);
    }

    public List<JSONSchemaProps> buildOneOf(){
            return build(oneOf);
    }

    public JSONSchemaProps buildOneOf(int index){
            return this.oneOf.get(index).build();
    }

    public JSONSchemaProps buildFirstOneOf(){
            return this.oneOf.get(0).build();
    }

    public JSONSchemaProps buildLastOneOf(){
            return this.oneOf.get(oneOf.size() - 1).build();
    }

    public JSONSchemaProps buildMatchingOneOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate){
            for (JSONSchemaPropsBuilder item: oneOf) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withOneOf(List<JSONSchemaProps> oneOf){
            if (this.oneOf != null) { _visitables.removeAll(this.oneOf);}
            if (oneOf != null) {this.oneOf = new ArrayList<JSONSchemaPropsBuilder>(); for (JSONSchemaProps item : oneOf){this.addToOneOf(item);}} else { this.oneOf = new ArrayList<JSONSchemaPropsBuilder>();} return (A) this;
    }

    public A withOneOf(JSONSchemaProps... oneOf){
            if (this.oneOf != null) {this.oneOf.clear();}
            if (oneOf != null) {for (JSONSchemaProps item :oneOf){ this.addToOneOf(item);}} return (A) this;
    }

    public Boolean hasOneOf(){
            return oneOf != null && !oneOf.isEmpty();
    }

    public JSONSchemaPropsFluent.OneOfNested<A> addNewOneOf(){
            return new OneOfNestedImpl();
    }

    public JSONSchemaPropsFluent.OneOfNested<A> addNewOneOfLike(JSONSchemaProps item){
            return new OneOfNestedImpl(-1, item);
    }

    public JSONSchemaPropsFluent.OneOfNested<A> setNewOneOfLike(int index,JSONSchemaProps item){
            return new OneOfNestedImpl(index, item);
    }

    public JSONSchemaPropsFluent.OneOfNested<A> editOneOf(int index){
            if (oneOf.size() <= index) throw new RuntimeException("Can't edit oneOf. Index exceeds size.");
            return setNewOneOfLike(index, buildOneOf(index));
    }

    public JSONSchemaPropsFluent.OneOfNested<A> editFirstOneOf(){
            if (oneOf.size() == 0) throw new RuntimeException("Can't edit first oneOf. The list is empty.");
            return setNewOneOfLike(0, buildOneOf(0));
    }

    public JSONSchemaPropsFluent.OneOfNested<A> editLastOneOf(){
            int index = oneOf.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last oneOf. The list is empty.");
            return setNewOneOfLike(index, buildOneOf(index));
    }

    public JSONSchemaPropsFluent.OneOfNested<A> editMatchingOneOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate){
            int index = -1;
            for (int i=0;i<oneOf.size();i++) { 
            if (predicate.apply(oneOf.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching oneOf. No match found.");
            return setNewOneOfLike(index, buildOneOf(index));
    }

    public String getPattern(){
            return this.pattern;
    }

    public A withPattern(String pattern){
            this.pattern=pattern; return (A) this;
    }

    public Boolean hasPattern(){
            return this.pattern != null;
    }

    public A addToPatternProperties(String key,JSONSchemaProps value){
            if(this.patternProperties == null && key != null && value != null) { this.patternProperties = new LinkedHashMap<String,JSONSchemaProps>(); }
            if(key != null && value != null) {this.patternProperties.put(key, value);} return (A)this;
    }

    public A addToPatternProperties(Map<String,JSONSchemaProps> map){
            if(this.patternProperties == null && map != null) { this.patternProperties = new LinkedHashMap<String,JSONSchemaProps>(); }
            if(map != null) { this.patternProperties.putAll(map);} return (A)this;
    }

    public A removeFromPatternProperties(String key){
            if(this.patternProperties == null) { return (A) this; }
            if(key != null && this.patternProperties != null) {this.patternProperties.remove(key);} return (A)this;
    }

    public A removeFromPatternProperties(Map<String,JSONSchemaProps> map){
            if(this.patternProperties == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.patternProperties != null){this.patternProperties.remove(key);}}} return (A)this;
    }

    public Map<String,JSONSchemaProps> getPatternProperties(){
            return this.patternProperties;
    }

    public A withPatternProperties(Map<String,JSONSchemaProps> patternProperties){
            if (patternProperties == null) { this.patternProperties =  new LinkedHashMap<String,JSONSchemaProps>();} else {this.patternProperties = new LinkedHashMap<String,JSONSchemaProps>(patternProperties);} return (A) this;
    }

    public Boolean hasPatternProperties(){
            return this.patternProperties != null;
    }

    public A addToProperties(String key,JSONSchemaProps value){
            if(this.properties == null && key != null && value != null) { this.properties = new LinkedHashMap<String,JSONSchemaProps>(); }
            if(key != null && value != null) {this.properties.put(key, value);} return (A)this;
    }

    public A addToProperties(Map<String,JSONSchemaProps> map){
            if(this.properties == null && map != null) { this.properties = new LinkedHashMap<String,JSONSchemaProps>(); }
            if(map != null) { this.properties.putAll(map);} return (A)this;
    }

    public A removeFromProperties(String key){
            if(this.properties == null) { return (A) this; }
            if(key != null && this.properties != null) {this.properties.remove(key);} return (A)this;
    }

    public A removeFromProperties(Map<String,JSONSchemaProps> map){
            if(this.properties == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.properties != null){this.properties.remove(key);}}} return (A)this;
    }

    public Map<String,JSONSchemaProps> getProperties(){
            return this.properties;
    }

    public A withProperties(Map<String,JSONSchemaProps> properties){
            if (properties == null) { this.properties =  new LinkedHashMap<String,JSONSchemaProps>();} else {this.properties = new LinkedHashMap<String,JSONSchemaProps>(properties);} return (A) this;
    }

    public Boolean hasProperties(){
            return this.properties != null;
    }

    public A addToRequired(int index,String item){
            if (this.required == null) {this.required = new ArrayList<String>();}
            this.required.add(index, item);
            return (A)this;
    }

    public A setToRequired(int index,String item){
            if (this.required == null) {this.required = new ArrayList<String>();}
            this.required.set(index, item); return (A)this;
    }

    public A addToRequired(String... items){
            if (this.required == null) {this.required = new ArrayList<String>();}
            for (String item : items) {this.required.add(item);} return (A)this;
    }

    public A addAllToRequired(Collection<String> items){
            if (this.required == null) {this.required = new ArrayList<String>();}
            for (String item : items) {this.required.add(item);} return (A)this;
    }

    public A removeFromRequired(String... items){
            for (String item : items) {if (this.required!= null){ this.required.remove(item);}} return (A)this;
    }

    public A removeAllFromRequired(Collection<String> items){
            for (String item : items) {if (this.required!= null){ this.required.remove(item);}} return (A)this;
    }

    public List<String> getRequired(){
            return this.required;
    }

    public String getRequired(int index){
            return this.required.get(index);
    }

    public String getFirstRequired(){
            return this.required.get(0);
    }

    public String getLastRequired(){
            return this.required.get(required.size() - 1);
    }

    public String getMatchingRequired(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: required) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withRequired(List<String> required){
            if (this.required != null) { _visitables.removeAll(this.required);}
            if (required != null) {this.required = new ArrayList<String>(); for (String item : required){this.addToRequired(item);}} else { this.required = new ArrayList<String>();} return (A) this;
    }

    public A withRequired(String... required){
            if (this.required != null) {this.required.clear();}
            if (required != null) {for (String item :required){ this.addToRequired(item);}} return (A) this;
    }

    public Boolean hasRequired(){
            return required != null && !required.isEmpty();
    }

    public String getTitle(){
            return this.title;
    }

    public A withTitle(String title){
            this.title=title; return (A) this;
    }

    public Boolean hasTitle(){
            return this.title != null;
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public Boolean isUniqueItems(){
            return this.uniqueItems;
    }

    public A withUniqueItems(Boolean uniqueItems){
            this.uniqueItems=uniqueItems; return (A) this;
    }

    public Boolean hasUniqueItems(){
            return this.uniqueItems != null;
    }

    public A withNewUniqueItems(String arg1){
            return (A)withUniqueItems(new Boolean(arg1));
    }

    public A withNewUniqueItems(boolean arg1){
            return (A)withUniqueItems(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONSchemaPropsFluentImpl that = (JSONSchemaPropsFluentImpl) o;
            if ($ref != null ? !$ref.equals(that.$ref) :that.$ref != null) return false;
            if ($schema != null ? !$schema.equals(that.$schema) :that.$schema != null) return false;
            if (additionalItems != null ? !additionalItems.equals(that.additionalItems) :that.additionalItems != null) return false;
            if (additionalProperties != null ? !additionalProperties.equals(that.additionalProperties) :that.additionalProperties != null) return false;
            if (allOf != null ? !allOf.equals(that.allOf) :that.allOf != null) return false;
            if (anyOf != null ? !anyOf.equals(that.anyOf) :that.anyOf != null) return false;
            if (_default != null ? !_default.equals(that._default) :that._default != null) return false;
            if (definitions != null ? !definitions.equals(that.definitions) :that.definitions != null) return false;
            if (dependencies != null ? !dependencies.equals(that.dependencies) :that.dependencies != null) return false;
            if (description != null ? !description.equals(that.description) :that.description != null) return false;
            if (_enum != null ? !_enum.equals(that._enum) :that._enum != null) return false;
            if (example != null ? !example.equals(that.example) :that.example != null) return false;
            if (exclusiveMaximum != null ? !exclusiveMaximum.equals(that.exclusiveMaximum) :that.exclusiveMaximum != null) return false;
            if (exclusiveMinimum != null ? !exclusiveMinimum.equals(that.exclusiveMinimum) :that.exclusiveMinimum != null) return false;
            if (externalDocs != null ? !externalDocs.equals(that.externalDocs) :that.externalDocs != null) return false;
            if (format != null ? !format.equals(that.format) :that.format != null) return false;
            if (id != null ? !id.equals(that.id) :that.id != null) return false;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            if (maxItems != null ? !maxItems.equals(that.maxItems) :that.maxItems != null) return false;
            if (maxLength != null ? !maxLength.equals(that.maxLength) :that.maxLength != null) return false;
            if (maxProperties != null ? !maxProperties.equals(that.maxProperties) :that.maxProperties != null) return false;
            if (maximum != null ? !maximum.equals(that.maximum) :that.maximum != null) return false;
            if (minItems != null ? !minItems.equals(that.minItems) :that.minItems != null) return false;
            if (minLength != null ? !minLength.equals(that.minLength) :that.minLength != null) return false;
            if (minProperties != null ? !minProperties.equals(that.minProperties) :that.minProperties != null) return false;
            if (minimum != null ? !minimum.equals(that.minimum) :that.minimum != null) return false;
            if (multipleOf != null ? !multipleOf.equals(that.multipleOf) :that.multipleOf != null) return false;
            if (not != null ? !not.equals(that.not) :that.not != null) return false;
            if (oneOf != null ? !oneOf.equals(that.oneOf) :that.oneOf != null) return false;
            if (pattern != null ? !pattern.equals(that.pattern) :that.pattern != null) return false;
            if (patternProperties != null ? !patternProperties.equals(that.patternProperties) :that.patternProperties != null) return false;
            if (properties != null ? !properties.equals(that.properties) :that.properties != null) return false;
            if (required != null ? !required.equals(that.required) :that.required != null) return false;
            if (title != null ? !title.equals(that.title) :that.title != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            if (uniqueItems != null ? !uniqueItems.equals(that.uniqueItems) :that.uniqueItems != null) return false;
            return true;
    }


    public class AdditionalItemsNestedImpl<N> extends JSONSchemaPropsOrBoolFluentImpl<JSONSchemaPropsFluent.AdditionalItemsNested<N>> implements JSONSchemaPropsFluent.AdditionalItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsOrBoolBuilder builder;
    
            AdditionalItemsNestedImpl(JSONSchemaPropsOrBool item){
                    this.builder = new JSONSchemaPropsOrBoolBuilder(this, item);
            }
            AdditionalItemsNestedImpl(){
                    this.builder = new JSONSchemaPropsOrBoolBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.withAdditionalItems(builder.build());
    }
    public N endAdditionalItems(){
            return and();
    }

}
    public class AdditionalPropertiesNestedImpl<N> extends JSONSchemaPropsOrBoolFluentImpl<JSONSchemaPropsFluent.AdditionalPropertiesNested<N>> implements JSONSchemaPropsFluent.AdditionalPropertiesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsOrBoolBuilder builder;
    
            AdditionalPropertiesNestedImpl(JSONSchemaPropsOrBool item){
                    this.builder = new JSONSchemaPropsOrBoolBuilder(this, item);
            }
            AdditionalPropertiesNestedImpl(){
                    this.builder = new JSONSchemaPropsOrBoolBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.withAdditionalProperties(builder.build());
    }
    public N endAdditionalProperties(){
            return and();
    }

}
    public class AllOfNestedImpl<N> extends JSONSchemaPropsFluentImpl<JSONSchemaPropsFluent.AllOfNested<N>> implements JSONSchemaPropsFluent.AllOfNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
        private final int index;
    
            AllOfNestedImpl(int index,JSONSchemaProps item){
                    this.index = index;
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            AllOfNestedImpl(){
                    this.index = -1;
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.setToAllOf(index, builder.build());
    }
    public N endAllOf(){
            return and();
    }

}
    public class AnyOfNestedImpl<N> extends JSONSchemaPropsFluentImpl<JSONSchemaPropsFluent.AnyOfNested<N>> implements JSONSchemaPropsFluent.AnyOfNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
        private final int index;
    
            AnyOfNestedImpl(int index,JSONSchemaProps item){
                    this.index = index;
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            AnyOfNestedImpl(){
                    this.index = -1;
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.setToAnyOf(index, builder.build());
    }
    public N endAnyOf(){
            return and();
    }

}
    public class DefaultNestedImpl<N> extends JSONFluentImpl<JSONSchemaPropsFluent.DefaultNested<N>> implements JSONSchemaPropsFluent.DefaultNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONBuilder builder;
    
            DefaultNestedImpl(JSON item){
                    this.builder = new JSONBuilder(this, item);
            }
            DefaultNestedImpl(){
                    this.builder = new JSONBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.withDefault(builder.build());
    }
    public N endDefault(){
            return and();
    }

}
    public class EnumNestedImpl<N> extends JSONFluentImpl<JSONSchemaPropsFluent.EnumNested<N>> implements JSONSchemaPropsFluent.EnumNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONBuilder builder;
        private final int index;
    
            EnumNestedImpl(int index,JSON item){
                    this.index = index;
                    this.builder = new JSONBuilder(this, item);
            }
            EnumNestedImpl(){
                    this.index = -1;
                    this.builder = new JSONBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.setToEnum(index, builder.build());
    }
    public N endEnum(){
            return and();
    }

}
    public class ExampleNestedImpl<N> extends JSONFluentImpl<JSONSchemaPropsFluent.ExampleNested<N>> implements JSONSchemaPropsFluent.ExampleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONBuilder builder;
    
            ExampleNestedImpl(JSON item){
                    this.builder = new JSONBuilder(this, item);
            }
            ExampleNestedImpl(){
                    this.builder = new JSONBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.withExample(builder.build());
    }
    public N endExample(){
            return and();
    }

}
    public class ExternalDocsNestedImpl<N> extends ExternalDocumentationFluentImpl<JSONSchemaPropsFluent.ExternalDocsNested<N>> implements JSONSchemaPropsFluent.ExternalDocsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExternalDocumentationBuilder builder;
    
            ExternalDocsNestedImpl(ExternalDocumentation item){
                    this.builder = new ExternalDocumentationBuilder(this, item);
            }
            ExternalDocsNestedImpl(){
                    this.builder = new ExternalDocumentationBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.withExternalDocs(builder.build());
    }
    public N endExternalDocs(){
            return and();
    }

}
    public class ItemsNestedImpl<N> extends JSONSchemaPropsOrArrayFluentImpl<JSONSchemaPropsFluent.ItemsNested<N>> implements JSONSchemaPropsFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsOrArrayBuilder builder;
    
            ItemsNestedImpl(JSONSchemaPropsOrArray item){
                    this.builder = new JSONSchemaPropsOrArrayBuilder(this, item);
            }
            ItemsNestedImpl(){
                    this.builder = new JSONSchemaPropsOrArrayBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.withItems(builder.build());
    }
    public N endItems(){
            return and();
    }

}
    public class NotNestedImpl<N> extends JSONSchemaPropsFluentImpl<JSONSchemaPropsFluent.NotNested<N>> implements JSONSchemaPropsFluent.NotNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
    
            NotNestedImpl(JSONSchemaProps item){
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            NotNestedImpl(){
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.withNot(builder.build());
    }
    public N endNot(){
            return and();
    }

}
    public class OneOfNestedImpl<N> extends JSONSchemaPropsFluentImpl<JSONSchemaPropsFluent.OneOfNested<N>> implements JSONSchemaPropsFluent.OneOfNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JSONSchemaPropsBuilder builder;
        private final int index;
    
            OneOfNestedImpl(int index,JSONSchemaProps item){
                    this.index = index;
                    this.builder = new JSONSchemaPropsBuilder(this, item);
            }
            OneOfNestedImpl(){
                    this.index = -1;
                    this.builder = new JSONSchemaPropsBuilder(this);
            }
    
    public N and(){
            return (N) JSONSchemaPropsFluentImpl.this.setToOneOf(index, builder.build());
    }
    public N endOneOf(){
            return and();
    }

}


}
