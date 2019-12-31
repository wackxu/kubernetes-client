package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface CustomResourceDefinitionVersionFluent<A extends CustomResourceDefinitionVersionFluent<A>> extends Fluent<A>{


    public A addToAdditionalPrinterColumns(int index,CustomResourceColumnDefinition item);
    public A setToAdditionalPrinterColumns(int index,CustomResourceColumnDefinition item);
    public A addToAdditionalPrinterColumns(CustomResourceColumnDefinition... items);
    public A addAllToAdditionalPrinterColumns(Collection<CustomResourceColumnDefinition> items);
    public A removeFromAdditionalPrinterColumns(CustomResourceColumnDefinition... items);
    public A removeAllFromAdditionalPrinterColumns(Collection<CustomResourceColumnDefinition> items);
    
/**
 * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns();
    public List<CustomResourceColumnDefinition> buildAdditionalPrinterColumns();
    public CustomResourceColumnDefinition buildAdditionalPrinterColumn(int index);
    public CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn();
    public CustomResourceColumnDefinition buildLastAdditionalPrinterColumn();
    public CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceColumnDefinitionBuilder> predicate);
    public A withAdditionalPrinterColumns(List<CustomResourceColumnDefinition> additionalPrinterColumns);
    public A withAdditionalPrinterColumns(CustomResourceColumnDefinition... additionalPrinterColumns);
    public Boolean hasAdditionalPrinterColumns();
    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn();
    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(CustomResourceColumnDefinition item);
    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,CustomResourceColumnDefinition item);
    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index);
    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn();
    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn();
    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceColumnDefinitionBuilder> predicate);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    
/**
 * This method has been deprecated, please use method buildSchema instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceValidation getSchema();
    public CustomResourceValidation buildSchema();
    public A withSchema(CustomResourceValidation schema);
    public Boolean hasSchema();
    public CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchema();
    public CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchemaLike(CustomResourceValidation item);
    public CustomResourceDefinitionVersionFluent.SchemaNested<A> editSchema();
    public CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchema();
    public CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchemaLike(CustomResourceValidation item);
    public Boolean isServed();
    public A withServed(Boolean served);
    public Boolean hasServed();
    public A withNewServed(String arg1);
    public A withNewServed(boolean arg1);
    public Boolean isStorage();
    public A withStorage(Boolean storage);
    public Boolean hasStorage();
    public A withNewStorage(String arg1);
    public A withNewStorage(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildSubresources instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceSubresources getSubresources();
    public CustomResourceSubresources buildSubresources();
    public A withSubresources(CustomResourceSubresources subresources);
    public Boolean hasSubresources();
    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresources();
    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresourcesLike(CustomResourceSubresources item);
    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editSubresources();
    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresources();
    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresourcesLike(CustomResourceSubresources item);

    public interface AdditionalPrinterColumnsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceColumnDefinitionFluent<CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>>{

        
    public N and();    public N endAdditionalPrinterColumn();
}
    public interface SchemaNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceValidationFluent<CustomResourceDefinitionVersionFluent.SchemaNested<N>>{

        
    public N and();    public N endSchema();
}
    public interface SubresourcesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceSubresourcesFluent<CustomResourceDefinitionVersionFluent.SubresourcesNested<N>>{

        
    public N and();    public N endSubresources();
}


}
