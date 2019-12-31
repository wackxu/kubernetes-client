package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Double;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.util.Map;

public interface JSONSchemaPropsFluent<A extends JSONSchemaPropsFluent<A>> extends Fluent<A>{


    public String getRef();
    public A withRef(String $ref);
    public Boolean hasRef();
    public String getSchema();
    public A withSchema(String $schema);
    public Boolean hasSchema();
    
/**
 * This method has been deprecated, please use method buildAdditionalItems instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaPropsOrBool getAdditionalItems();
    public JSONSchemaPropsOrBool buildAdditionalItems();
    public A withAdditionalItems(JSONSchemaPropsOrBool additionalItems);
    public Boolean hasAdditionalItems();
    public JSONSchemaPropsFluent.AdditionalItemsNested<A> withNewAdditionalItems();
    public JSONSchemaPropsFluent.AdditionalItemsNested<A> withNewAdditionalItemsLike(JSONSchemaPropsOrBool item);
    public JSONSchemaPropsFluent.AdditionalItemsNested<A> editAdditionalItems();
    public JSONSchemaPropsFluent.AdditionalItemsNested<A> editOrNewAdditionalItems();
    public JSONSchemaPropsFluent.AdditionalItemsNested<A> editOrNewAdditionalItemsLike(JSONSchemaPropsOrBool item);
    
/**
 * This method has been deprecated, please use method buildAdditionalProperties instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaPropsOrBool getAdditionalProperties();
    public JSONSchemaPropsOrBool buildAdditionalProperties();
    public A withAdditionalProperties(JSONSchemaPropsOrBool additionalProperties);
    public Boolean hasAdditionalProperties();
    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> withNewAdditionalProperties();
    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> withNewAdditionalPropertiesLike(JSONSchemaPropsOrBool item);
    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> editAdditionalProperties();
    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> editOrNewAdditionalProperties();
    public JSONSchemaPropsFluent.AdditionalPropertiesNested<A> editOrNewAdditionalPropertiesLike(JSONSchemaPropsOrBool item);
    public A addToAllOf(int index,JSONSchemaProps item);
    public A setToAllOf(int index,JSONSchemaProps item);
    public A addToAllOf(JSONSchemaProps... items);
    public A addAllToAllOf(Collection<JSONSchemaProps> items);
    public A removeFromAllOf(JSONSchemaProps... items);
    public A removeAllFromAllOf(Collection<JSONSchemaProps> items);
    
/**
 * This method has been deprecated, please use method buildAllOf instead.
 * @return The buildable object.
 */
@Deprecated public List<JSONSchemaProps> getAllOf();
    public List<JSONSchemaProps> buildAllOf();
    public JSONSchemaProps buildAllOf(int index);
    public JSONSchemaProps buildFirstAllOf();
    public JSONSchemaProps buildLastAllOf();
    public JSONSchemaProps buildMatchingAllOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate);
    public A withAllOf(List<JSONSchemaProps> allOf);
    public A withAllOf(JSONSchemaProps... allOf);
    public Boolean hasAllOf();
    public JSONSchemaPropsFluent.AllOfNested<A> addNewAllOf();
    public JSONSchemaPropsFluent.AllOfNested<A> addNewAllOfLike(JSONSchemaProps item);
    public JSONSchemaPropsFluent.AllOfNested<A> setNewAllOfLike(int index,JSONSchemaProps item);
    public JSONSchemaPropsFluent.AllOfNested<A> editAllOf(int index);
    public JSONSchemaPropsFluent.AllOfNested<A> editFirstAllOf();
    public JSONSchemaPropsFluent.AllOfNested<A> editLastAllOf();
    public JSONSchemaPropsFluent.AllOfNested<A> editMatchingAllOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate);
    public A addToAnyOf(int index,JSONSchemaProps item);
    public A setToAnyOf(int index,JSONSchemaProps item);
    public A addToAnyOf(JSONSchemaProps... items);
    public A addAllToAnyOf(Collection<JSONSchemaProps> items);
    public A removeFromAnyOf(JSONSchemaProps... items);
    public A removeAllFromAnyOf(Collection<JSONSchemaProps> items);
    
/**
 * This method has been deprecated, please use method buildAnyOf instead.
 * @return The buildable object.
 */
@Deprecated public List<JSONSchemaProps> getAnyOf();
    public List<JSONSchemaProps> buildAnyOf();
    public JSONSchemaProps buildAnyOf(int index);
    public JSONSchemaProps buildFirstAnyOf();
    public JSONSchemaProps buildLastAnyOf();
    public JSONSchemaProps buildMatchingAnyOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate);
    public A withAnyOf(List<JSONSchemaProps> anyOf);
    public A withAnyOf(JSONSchemaProps... anyOf);
    public Boolean hasAnyOf();
    public JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOf();
    public JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOfLike(JSONSchemaProps item);
    public JSONSchemaPropsFluent.AnyOfNested<A> setNewAnyOfLike(int index,JSONSchemaProps item);
    public JSONSchemaPropsFluent.AnyOfNested<A> editAnyOf(int index);
    public JSONSchemaPropsFluent.AnyOfNested<A> editFirstAnyOf();
    public JSONSchemaPropsFluent.AnyOfNested<A> editLastAnyOf();
    public JSONSchemaPropsFluent.AnyOfNested<A> editMatchingAnyOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildDefault instead.
 * @return The buildable object.
 */
@Deprecated public JSON getDefault();
    public JSON buildDefault();
    public A withDefault(JSON _default);
    public Boolean hasDefault();
    public A withNewDefault(String raw);
    public JSONSchemaPropsFluent.DefaultNested<A> withNewDefault();
    public JSONSchemaPropsFluent.DefaultNested<A> withNewDefaultLike(JSON item);
    public JSONSchemaPropsFluent.DefaultNested<A> editDefault();
    public JSONSchemaPropsFluent.DefaultNested<A> editOrNewDefault();
    public JSONSchemaPropsFluent.DefaultNested<A> editOrNewDefaultLike(JSON item);
    public A addToDefinitions(String key,JSONSchemaProps value);
    public A addToDefinitions(Map<String,JSONSchemaProps> map);
    public A removeFromDefinitions(String key);
    public A removeFromDefinitions(Map<String,JSONSchemaProps> map);
    public Map<String,JSONSchemaProps> getDefinitions();
    public A withDefinitions(Map<String,JSONSchemaProps> definitions);
    public Boolean hasDefinitions();
    public A addToDependencies(String key,JSONSchemaPropsOrStringArray value);
    public A addToDependencies(Map<String,JSONSchemaPropsOrStringArray> map);
    public A removeFromDependencies(String key);
    public A removeFromDependencies(Map<String,JSONSchemaPropsOrStringArray> map);
    public Map<String,JSONSchemaPropsOrStringArray> getDependencies();
    public A withDependencies(Map<String,JSONSchemaPropsOrStringArray> dependencies);
    public Boolean hasDependencies();
    public String getDescription();
    public A withDescription(String description);
    public Boolean hasDescription();
    public A addToEnum(int index,JSON item);
    public A setToEnum(int index,JSON item);
    public A addToEnum(JSON... items);
    public A addAllToEnum(Collection<JSON> items);
    public A removeFromEnum(JSON... items);
    public A removeAllFromEnum(Collection<JSON> items);
    
/**
 * This method has been deprecated, please use method buildEnum instead.
 * @return The buildable object.
 */
@Deprecated public List<JSON> getEnum();
    public List<JSON> buildEnum();
    public JSON buildEnum(int index);
    public JSON buildFirstEnum();
    public JSON buildLastEnum();
    public JSON buildMatchingEnum(io.fabric8.kubernetes.api.builder.Predicate<JSONBuilder> predicate);
    public A withEnum(List<JSON> _enum);
    public A withEnum(JSON... _enum);
    public Boolean hasEnum();
    public A addNewEnum(String raw);
    public JSONSchemaPropsFluent.EnumNested<A> addNewEnum();
    public JSONSchemaPropsFluent.EnumNested<A> addNewEnumLike(JSON item);
    public JSONSchemaPropsFluent.EnumNested<A> setNewEnumLike(int index,JSON item);
    public JSONSchemaPropsFluent.EnumNested<A> editEnum(int index);
    public JSONSchemaPropsFluent.EnumNested<A> editFirstEnum();
    public JSONSchemaPropsFluent.EnumNested<A> editLastEnum();
    public JSONSchemaPropsFluent.EnumNested<A> editMatchingEnum(io.fabric8.kubernetes.api.builder.Predicate<JSONBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildExample instead.
 * @return The buildable object.
 */
@Deprecated public JSON getExample();
    public JSON buildExample();
    public A withExample(JSON example);
    public Boolean hasExample();
    public A withNewExample(String raw);
    public JSONSchemaPropsFluent.ExampleNested<A> withNewExample();
    public JSONSchemaPropsFluent.ExampleNested<A> withNewExampleLike(JSON item);
    public JSONSchemaPropsFluent.ExampleNested<A> editExample();
    public JSONSchemaPropsFluent.ExampleNested<A> editOrNewExample();
    public JSONSchemaPropsFluent.ExampleNested<A> editOrNewExampleLike(JSON item);
    public Boolean isExclusiveMaximum();
    public A withExclusiveMaximum(Boolean exclusiveMaximum);
    public Boolean hasExclusiveMaximum();
    public A withNewExclusiveMaximum(String arg1);
    public A withNewExclusiveMaximum(boolean arg1);
    public Boolean isExclusiveMinimum();
    public A withExclusiveMinimum(Boolean exclusiveMinimum);
    public Boolean hasExclusiveMinimum();
    public A withNewExclusiveMinimum(String arg1);
    public A withNewExclusiveMinimum(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildExternalDocs instead.
 * @return The buildable object.
 */
@Deprecated public ExternalDocumentation getExternalDocs();
    public ExternalDocumentation buildExternalDocs();
    public A withExternalDocs(ExternalDocumentation externalDocs);
    public Boolean hasExternalDocs();
    public A withNewExternalDocs(String description,String url);
    public JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocs();
    public JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocsLike(ExternalDocumentation item);
    public JSONSchemaPropsFluent.ExternalDocsNested<A> editExternalDocs();
    public JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocs();
    public JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocsLike(ExternalDocumentation item);
    public String getFormat();
    public A withFormat(String format);
    public Boolean hasFormat();
    public String getId();
    public A withId(String id);
    public Boolean hasId();
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaPropsOrArray getItems();
    public JSONSchemaPropsOrArray buildItems();
    public A withItems(JSONSchemaPropsOrArray items);
    public Boolean hasItems();
    public JSONSchemaPropsFluent.ItemsNested<A> withNewItems();
    public JSONSchemaPropsFluent.ItemsNested<A> withNewItemsLike(JSONSchemaPropsOrArray item);
    public JSONSchemaPropsFluent.ItemsNested<A> editItems();
    public JSONSchemaPropsFluent.ItemsNested<A> editOrNewItems();
    public JSONSchemaPropsFluent.ItemsNested<A> editOrNewItemsLike(JSONSchemaPropsOrArray item);
    public Long getMaxItems();
    public A withMaxItems(Long maxItems);
    public Boolean hasMaxItems();
    public A withNewMaxItems(String arg1);
    public A withNewMaxItems(long arg1);
    public Long getMaxLength();
    public A withMaxLength(Long maxLength);
    public Boolean hasMaxLength();
    public A withNewMaxLength(String arg1);
    public A withNewMaxLength(long arg1);
    public Long getMaxProperties();
    public A withMaxProperties(Long maxProperties);
    public Boolean hasMaxProperties();
    public A withNewMaxProperties(String arg1);
    public A withNewMaxProperties(long arg1);
    public Double getMaximum();
    public A withMaximum(Double maximum);
    public Boolean hasMaximum();
    public A withNewMaximum(String arg1);
    public A withNewMaximum(double arg1);
    public Long getMinItems();
    public A withMinItems(Long minItems);
    public Boolean hasMinItems();
    public A withNewMinItems(String arg1);
    public A withNewMinItems(long arg1);
    public Long getMinLength();
    public A withMinLength(Long minLength);
    public Boolean hasMinLength();
    public A withNewMinLength(String arg1);
    public A withNewMinLength(long arg1);
    public Long getMinProperties();
    public A withMinProperties(Long minProperties);
    public Boolean hasMinProperties();
    public A withNewMinProperties(String arg1);
    public A withNewMinProperties(long arg1);
    public Double getMinimum();
    public A withMinimum(Double minimum);
    public Boolean hasMinimum();
    public A withNewMinimum(String arg1);
    public A withNewMinimum(double arg1);
    public Double getMultipleOf();
    public A withMultipleOf(Double multipleOf);
    public Boolean hasMultipleOf();
    public A withNewMultipleOf(String arg1);
    public A withNewMultipleOf(double arg1);
    
/**
 * This method has been deprecated, please use method buildNot instead.
 * @return The buildable object.
 */
@Deprecated public JSONSchemaProps getNot();
    public JSONSchemaProps buildNot();
    public A withNot(JSONSchemaProps not);
    public Boolean hasNot();
    public JSONSchemaPropsFluent.NotNested<A> withNewNot();
    public JSONSchemaPropsFluent.NotNested<A> withNewNotLike(JSONSchemaProps item);
    public JSONSchemaPropsFluent.NotNested<A> editNot();
    public JSONSchemaPropsFluent.NotNested<A> editOrNewNot();
    public JSONSchemaPropsFluent.NotNested<A> editOrNewNotLike(JSONSchemaProps item);
    public A addToOneOf(int index,JSONSchemaProps item);
    public A setToOneOf(int index,JSONSchemaProps item);
    public A addToOneOf(JSONSchemaProps... items);
    public A addAllToOneOf(Collection<JSONSchemaProps> items);
    public A removeFromOneOf(JSONSchemaProps... items);
    public A removeAllFromOneOf(Collection<JSONSchemaProps> items);
    
/**
 * This method has been deprecated, please use method buildOneOf instead.
 * @return The buildable object.
 */
@Deprecated public List<JSONSchemaProps> getOneOf();
    public List<JSONSchemaProps> buildOneOf();
    public JSONSchemaProps buildOneOf(int index);
    public JSONSchemaProps buildFirstOneOf();
    public JSONSchemaProps buildLastOneOf();
    public JSONSchemaProps buildMatchingOneOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate);
    public A withOneOf(List<JSONSchemaProps> oneOf);
    public A withOneOf(JSONSchemaProps... oneOf);
    public Boolean hasOneOf();
    public JSONSchemaPropsFluent.OneOfNested<A> addNewOneOf();
    public JSONSchemaPropsFluent.OneOfNested<A> addNewOneOfLike(JSONSchemaProps item);
    public JSONSchemaPropsFluent.OneOfNested<A> setNewOneOfLike(int index,JSONSchemaProps item);
    public JSONSchemaPropsFluent.OneOfNested<A> editOneOf(int index);
    public JSONSchemaPropsFluent.OneOfNested<A> editFirstOneOf();
    public JSONSchemaPropsFluent.OneOfNested<A> editLastOneOf();
    public JSONSchemaPropsFluent.OneOfNested<A> editMatchingOneOf(io.fabric8.kubernetes.api.builder.Predicate<JSONSchemaPropsBuilder> predicate);
    public String getPattern();
    public A withPattern(String pattern);
    public Boolean hasPattern();
    public A addToPatternProperties(String key,JSONSchemaProps value);
    public A addToPatternProperties(Map<String,JSONSchemaProps> map);
    public A removeFromPatternProperties(String key);
    public A removeFromPatternProperties(Map<String,JSONSchemaProps> map);
    public Map<String,JSONSchemaProps> getPatternProperties();
    public A withPatternProperties(Map<String,JSONSchemaProps> patternProperties);
    public Boolean hasPatternProperties();
    public A addToProperties(String key,JSONSchemaProps value);
    public A addToProperties(Map<String,JSONSchemaProps> map);
    public A removeFromProperties(String key);
    public A removeFromProperties(Map<String,JSONSchemaProps> map);
    public Map<String,JSONSchemaProps> getProperties();
    public A withProperties(Map<String,JSONSchemaProps> properties);
    public Boolean hasProperties();
    public A addToRequired(int index,String item);
    public A setToRequired(int index,String item);
    public A addToRequired(String... items);
    public A addAllToRequired(Collection<String> items);
    public A removeFromRequired(String... items);
    public A removeAllFromRequired(Collection<String> items);
    public List<String> getRequired();
    public String getRequired(int index);
    public String getFirstRequired();
    public String getLastRequired();
    public String getMatchingRequired(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withRequired(List<String> required);
    public A withRequired(String... required);
    public Boolean hasRequired();
    public String getTitle();
    public A withTitle(String title);
    public Boolean hasTitle();
    public String getType();
    public A withType(String type);
    public Boolean hasType();
    public Boolean isUniqueItems();
    public A withUniqueItems(Boolean uniqueItems);
    public Boolean hasUniqueItems();
    public A withNewUniqueItems(String arg1);
    public A withNewUniqueItems(boolean arg1);

    public interface AdditionalItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsOrBoolFluent<JSONSchemaPropsFluent.AdditionalItemsNested<N>>{

        
    public N and();    public N endAdditionalItems();
}
    public interface AdditionalPropertiesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsOrBoolFluent<JSONSchemaPropsFluent.AdditionalPropertiesNested<N>>{

        
    public N and();    public N endAdditionalProperties();
}
    public interface AllOfNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<JSONSchemaPropsFluent.AllOfNested<N>>{

        
    public N and();    public N endAllOf();
}
    public interface AnyOfNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<JSONSchemaPropsFluent.AnyOfNested<N>>{

        
    public N and();    public N endAnyOf();
}
    public interface DefaultNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONFluent<JSONSchemaPropsFluent.DefaultNested<N>>{

        
    public N and();    public N endDefault();
}
    public interface EnumNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONFluent<JSONSchemaPropsFluent.EnumNested<N>>{

        
    public N and();    public N endEnum();
}
    public interface ExampleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONFluent<JSONSchemaPropsFluent.ExampleNested<N>>{

        
    public N and();    public N endExample();
}
    public interface ExternalDocsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExternalDocumentationFluent<JSONSchemaPropsFluent.ExternalDocsNested<N>>{

        
    public N and();    public N endExternalDocs();
}
    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsOrArrayFluent<JSONSchemaPropsFluent.ItemsNested<N>>{

        
    public N and();    public N endItems();
}
    public interface NotNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<JSONSchemaPropsFluent.NotNested<N>>{

        
    public N and();    public N endNot();
}
    public interface OneOfNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JSONSchemaPropsFluent<JSONSchemaPropsFluent.OneOfNested<N>>{

        
    public N and();    public N endOneOf();
}


}
