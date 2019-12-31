package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JSONSchemaPropsBuilder extends JSONSchemaPropsFluentImpl<JSONSchemaPropsBuilder> implements VisitableBuilder<JSONSchemaProps,JSONSchemaPropsBuilder>{

    JSONSchemaPropsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JSONSchemaPropsBuilder(){
            this(true);
    }
    public JSONSchemaPropsBuilder(Boolean validationEnabled){
            this(new JSONSchemaProps(), validationEnabled);
    }
    public JSONSchemaPropsBuilder(JSONSchemaPropsFluent<?> fluent){
            this(fluent, true);
    }
    public JSONSchemaPropsBuilder(JSONSchemaPropsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JSONSchemaProps(), validationEnabled);
    }
    public JSONSchemaPropsBuilder(JSONSchemaPropsFluent<?> fluent,JSONSchemaProps instance){
            this(fluent, instance, true);
    }
    public JSONSchemaPropsBuilder(JSONSchemaPropsFluent<?> fluent,JSONSchemaProps instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRef(instance.get$ref()); 
            fluent.withSchema(instance.get$schema()); 
            fluent.withAdditionalItems(instance.getAdditionalItems()); 
            fluent.withAdditionalProperties(instance.getAdditionalProperties()); 
            fluent.withAllOf(instance.getAllOf()); 
            fluent.withAnyOf(instance.getAnyOf()); 
            fluent.withDefault(instance.getDefault()); 
            fluent.withDefinitions(instance.getDefinitions()); 
            fluent.withDependencies(instance.getDependencies()); 
            fluent.withDescription(instance.getDescription()); 
            fluent.withEnum(instance.getEnum()); 
            fluent.withExample(instance.getExample()); 
            fluent.withExclusiveMaximum(instance.getExclusiveMaximum()); 
            fluent.withExclusiveMinimum(instance.getExclusiveMinimum()); 
            fluent.withExternalDocs(instance.getExternalDocs()); 
            fluent.withFormat(instance.getFormat()); 
            fluent.withId(instance.getId()); 
            fluent.withItems(instance.getItems()); 
            fluent.withMaxItems(instance.getMaxItems()); 
            fluent.withMaxLength(instance.getMaxLength()); 
            fluent.withMaxProperties(instance.getMaxProperties()); 
            fluent.withMaximum(instance.getMaximum()); 
            fluent.withMinItems(instance.getMinItems()); 
            fluent.withMinLength(instance.getMinLength()); 
            fluent.withMinProperties(instance.getMinProperties()); 
            fluent.withMinimum(instance.getMinimum()); 
            fluent.withMultipleOf(instance.getMultipleOf()); 
            fluent.withNot(instance.getNot()); 
            fluent.withOneOf(instance.getOneOf()); 
            fluent.withPattern(instance.getPattern()); 
            fluent.withPatternProperties(instance.getPatternProperties()); 
            fluent.withProperties(instance.getProperties()); 
            fluent.withRequired(instance.getRequired()); 
            fluent.withTitle(instance.getTitle()); 
            fluent.withType(instance.getType()); 
            fluent.withUniqueItems(instance.getUniqueItems()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONSchemaPropsBuilder(JSONSchemaProps instance){
            this(instance,true);
    }
    public JSONSchemaPropsBuilder(JSONSchemaProps instance,Boolean validationEnabled){
            this.fluent = this; 
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
            this.validationEnabled = validationEnabled; 
    }
    public JSONSchemaPropsBuilder(Validator validator){
            this(new JSONSchemaProps(), true);
    }
    public JSONSchemaPropsBuilder(JSONSchemaPropsFluent<?> fluent,JSONSchemaProps instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRef(instance.get$ref()); 
            fluent.withSchema(instance.get$schema()); 
            fluent.withAdditionalItems(instance.getAdditionalItems()); 
            fluent.withAdditionalProperties(instance.getAdditionalProperties()); 
            fluent.withAllOf(instance.getAllOf()); 
            fluent.withAnyOf(instance.getAnyOf()); 
            fluent.withDefault(instance.getDefault()); 
            fluent.withDefinitions(instance.getDefinitions()); 
            fluent.withDependencies(instance.getDependencies()); 
            fluent.withDescription(instance.getDescription()); 
            fluent.withEnum(instance.getEnum()); 
            fluent.withExample(instance.getExample()); 
            fluent.withExclusiveMaximum(instance.getExclusiveMaximum()); 
            fluent.withExclusiveMinimum(instance.getExclusiveMinimum()); 
            fluent.withExternalDocs(instance.getExternalDocs()); 
            fluent.withFormat(instance.getFormat()); 
            fluent.withId(instance.getId()); 
            fluent.withItems(instance.getItems()); 
            fluent.withMaxItems(instance.getMaxItems()); 
            fluent.withMaxLength(instance.getMaxLength()); 
            fluent.withMaxProperties(instance.getMaxProperties()); 
            fluent.withMaximum(instance.getMaximum()); 
            fluent.withMinItems(instance.getMinItems()); 
            fluent.withMinLength(instance.getMinLength()); 
            fluent.withMinProperties(instance.getMinProperties()); 
            fluent.withMinimum(instance.getMinimum()); 
            fluent.withMultipleOf(instance.getMultipleOf()); 
            fluent.withNot(instance.getNot()); 
            fluent.withOneOf(instance.getOneOf()); 
            fluent.withPattern(instance.getPattern()); 
            fluent.withPatternProperties(instance.getPatternProperties()); 
            fluent.withProperties(instance.getProperties()); 
            fluent.withRequired(instance.getRequired()); 
            fluent.withTitle(instance.getTitle()); 
            fluent.withType(instance.getType()); 
            fluent.withUniqueItems(instance.getUniqueItems()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JSONSchemaPropsBuilder(JSONSchemaProps instance,Validator validator){
            this.fluent = this; 
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
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JSONSchemaProps build(){
            JSONSchemaProps buildable = new JSONSchemaProps(fluent.getRef(),fluent.getSchema(),fluent.getAdditionalItems(),fluent.getAdditionalProperties(),fluent.getAllOf(),fluent.getAnyOf(),fluent.getDefault(),fluent.getDefinitions(),fluent.getDependencies(),fluent.getDescription(),fluent.getEnum(),fluent.getExample(),fluent.isExclusiveMaximum(),fluent.isExclusiveMinimum(),fluent.getExternalDocs(),fluent.getFormat(),fluent.getId(),fluent.getItems(),fluent.getMaxItems(),fluent.getMaxLength(),fluent.getMaxProperties(),fluent.getMaximum(),fluent.getMinItems(),fluent.getMinLength(),fluent.getMinProperties(),fluent.getMinimum(),fluent.getMultipleOf(),fluent.getNot(),fluent.getOneOf(),fluent.getPattern(),fluent.getPatternProperties(),fluent.getProperties(),fluent.getRequired(),fluent.getTitle(),fluent.getType(),fluent.isUniqueItems());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONSchemaPropsBuilder that = (JSONSchemaPropsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
