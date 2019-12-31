package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class CustomResourceDefinitionVersionFluentImpl<A extends CustomResourceDefinitionVersionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceDefinitionVersionFluent<A>{

    private List<CustomResourceColumnDefinitionBuilder> additionalPrinterColumns;
    private String name;
    private CustomResourceValidationBuilder schema;
    private Boolean served;
    private Boolean storage;
    private CustomResourceSubresourcesBuilder subresources;

    public CustomResourceDefinitionVersionFluentImpl(){
    }
    public CustomResourceDefinitionVersionFluentImpl(CustomResourceDefinitionVersion instance){
            this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            this.withName(instance.getName()); 
            this.withSchema(instance.getSchema()); 
            this.withServed(instance.getServed()); 
            this.withStorage(instance.getStorage()); 
            this.withSubresources(instance.getSubresources()); 
    }

    public A addToAdditionalPrinterColumns(int index,CustomResourceColumnDefinition item){
            if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();}
            CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.additionalPrinterColumns.add(index >= 0 ? index : additionalPrinterColumns.size(), builder); return (A)this;
    }

    public A setToAdditionalPrinterColumns(int index,CustomResourceColumnDefinition item){
            if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();}
            CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= additionalPrinterColumns.size()) { additionalPrinterColumns.add(builder); } else { additionalPrinterColumns.set(index, builder);}
             return (A)this;
    }

    public A addToAdditionalPrinterColumns(CustomResourceColumnDefinition... items){
            if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();}
            for (CustomResourceColumnDefinition item : items) {CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
    }

    public A addAllToAdditionalPrinterColumns(Collection<CustomResourceColumnDefinition> items){
            if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();}
            for (CustomResourceColumnDefinition item : items) {CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
    }

    public A removeFromAdditionalPrinterColumns(CustomResourceColumnDefinition... items){
            for (CustomResourceColumnDefinition item : items) {CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.remove(builder);if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.remove(builder);}} return (A)this;
    }

    public A removeAllFromAdditionalPrinterColumns(Collection<CustomResourceColumnDefinition> items){
            for (CustomResourceColumnDefinition item : items) {CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.remove(builder);if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns(){
            return build(additionalPrinterColumns);
    }

    public List<CustomResourceColumnDefinition> buildAdditionalPrinterColumns(){
            return build(additionalPrinterColumns);
    }

    public CustomResourceColumnDefinition buildAdditionalPrinterColumn(int index){
            return this.additionalPrinterColumns.get(index).build();
    }

    public CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn(){
            return this.additionalPrinterColumns.get(0).build();
    }

    public CustomResourceColumnDefinition buildLastAdditionalPrinterColumn(){
            return this.additionalPrinterColumns.get(additionalPrinterColumns.size() - 1).build();
    }

    public CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceColumnDefinitionBuilder> predicate){
            for (CustomResourceColumnDefinitionBuilder item: additionalPrinterColumns) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAdditionalPrinterColumns(List<CustomResourceColumnDefinition> additionalPrinterColumns){
            if (this.additionalPrinterColumns != null) { _visitables.removeAll(this.additionalPrinterColumns);}
            if (additionalPrinterColumns != null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>(); for (CustomResourceColumnDefinition item : additionalPrinterColumns){this.addToAdditionalPrinterColumns(item);}} else { this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();} return (A) this;
    }

    public A withAdditionalPrinterColumns(CustomResourceColumnDefinition... additionalPrinterColumns){
            if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.clear();}
            if (additionalPrinterColumns != null) {for (CustomResourceColumnDefinition item :additionalPrinterColumns){ this.addToAdditionalPrinterColumns(item);}} return (A) this;
    }

    public Boolean hasAdditionalPrinterColumns(){
            return additionalPrinterColumns != null && !additionalPrinterColumns.isEmpty();
    }

    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn(){
            return new AdditionalPrinterColumnsNestedImpl();
    }

    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(CustomResourceColumnDefinition item){
            return new AdditionalPrinterColumnsNestedImpl(-1, item);
    }

    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,CustomResourceColumnDefinition item){
            return new AdditionalPrinterColumnsNestedImpl(index, item);
    }

    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index){
            if (additionalPrinterColumns.size() <= index) throw new RuntimeException("Can't edit additionalPrinterColumns. Index exceeds size.");
            return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn(){
            if (additionalPrinterColumns.size() == 0) throw new RuntimeException("Can't edit first additionalPrinterColumns. The list is empty.");
            return setNewAdditionalPrinterColumnLike(0, buildAdditionalPrinterColumn(0));
    }

    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn(){
            int index = additionalPrinterColumns.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last additionalPrinterColumns. The list is empty.");
            return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceColumnDefinitionBuilder> predicate){
            int index = -1;
            for (int i=0;i<additionalPrinterColumns.size();i++) { 
            if (predicate.apply(additionalPrinterColumns.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching additionalPrinterColumns. No match found.");
            return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    
/**
 * This method has been deprecated, please use method buildSchema instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceValidation getSchema(){
            return this.schema!=null?this.schema.build():null;
    }

    public CustomResourceValidation buildSchema(){
            return this.schema!=null?this.schema.build():null;
    }

    public A withSchema(CustomResourceValidation schema){
            _visitables.remove(this.schema);
            if (schema!=null){ this.schema= new CustomResourceValidationBuilder(schema); _visitables.add(this.schema);} return (A) this;
    }

    public Boolean hasSchema(){
            return this.schema != null;
    }

    public CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchema(){
            return new SchemaNestedImpl();
    }

    public CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchemaLike(CustomResourceValidation item){
            return new SchemaNestedImpl(item);
    }

    public CustomResourceDefinitionVersionFluent.SchemaNested<A> editSchema(){
            return withNewSchemaLike(getSchema());
    }

    public CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchema(){
            return withNewSchemaLike(getSchema() != null ? getSchema(): new CustomResourceValidationBuilder().build());
    }

    public CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchemaLike(CustomResourceValidation item){
            return withNewSchemaLike(getSchema() != null ? getSchema(): item);
    }

    public Boolean isServed(){
            return this.served;
    }

    public A withServed(Boolean served){
            this.served=served; return (A) this;
    }

    public Boolean hasServed(){
            return this.served != null;
    }

    public A withNewServed(String arg1){
            return (A)withServed(new Boolean(arg1));
    }

    public A withNewServed(boolean arg1){
            return (A)withServed(new Boolean(arg1));
    }

    public Boolean isStorage(){
            return this.storage;
    }

    public A withStorage(Boolean storage){
            this.storage=storage; return (A) this;
    }

    public Boolean hasStorage(){
            return this.storage != null;
    }

    public A withNewStorage(String arg1){
            return (A)withStorage(new Boolean(arg1));
    }

    public A withNewStorage(boolean arg1){
            return (A)withStorage(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildSubresources instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceSubresources getSubresources(){
            return this.subresources!=null?this.subresources.build():null;
    }

    public CustomResourceSubresources buildSubresources(){
            return this.subresources!=null?this.subresources.build():null;
    }

    public A withSubresources(CustomResourceSubresources subresources){
            _visitables.remove(this.subresources);
            if (subresources!=null){ this.subresources= new CustomResourceSubresourcesBuilder(subresources); _visitables.add(this.subresources);} return (A) this;
    }

    public Boolean hasSubresources(){
            return this.subresources != null;
    }

    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresources(){
            return new SubresourcesNestedImpl();
    }

    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresourcesLike(CustomResourceSubresources item){
            return new SubresourcesNestedImpl(item);
    }

    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editSubresources(){
            return withNewSubresourcesLike(getSubresources());
    }

    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresources(){
            return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): new CustomResourceSubresourcesBuilder().build());
    }

    public CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresourcesLike(CustomResourceSubresources item){
            return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionVersionFluentImpl that = (CustomResourceDefinitionVersionFluentImpl) o;
            if (additionalPrinterColumns != null ? !additionalPrinterColumns.equals(that.additionalPrinterColumns) :that.additionalPrinterColumns != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (schema != null ? !schema.equals(that.schema) :that.schema != null) return false;
            if (served != null ? !served.equals(that.served) :that.served != null) return false;
            if (storage != null ? !storage.equals(that.storage) :that.storage != null) return false;
            if (subresources != null ? !subresources.equals(that.subresources) :that.subresources != null) return false;
            return true;
    }


    public class AdditionalPrinterColumnsNestedImpl<N> extends CustomResourceColumnDefinitionFluentImpl<CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>> implements CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceColumnDefinitionBuilder builder;
        private final int index;
    
            AdditionalPrinterColumnsNestedImpl(int index,CustomResourceColumnDefinition item){
                    this.index = index;
                    this.builder = new CustomResourceColumnDefinitionBuilder(this, item);
            }
            AdditionalPrinterColumnsNestedImpl(){
                    this.index = -1;
                    this.builder = new CustomResourceColumnDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionVersionFluentImpl.this.setToAdditionalPrinterColumns(index, builder.build());
    }
    public N endAdditionalPrinterColumn(){
            return and();
    }

}
    public class SchemaNestedImpl<N> extends CustomResourceValidationFluentImpl<CustomResourceDefinitionVersionFluent.SchemaNested<N>> implements CustomResourceDefinitionVersionFluent.SchemaNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceValidationBuilder builder;
    
            SchemaNestedImpl(CustomResourceValidation item){
                    this.builder = new CustomResourceValidationBuilder(this, item);
            }
            SchemaNestedImpl(){
                    this.builder = new CustomResourceValidationBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionVersionFluentImpl.this.withSchema(builder.build());
    }
    public N endSchema(){
            return and();
    }

}
    public class SubresourcesNestedImpl<N> extends CustomResourceSubresourcesFluentImpl<CustomResourceDefinitionVersionFluent.SubresourcesNested<N>> implements CustomResourceDefinitionVersionFluent.SubresourcesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceSubresourcesBuilder builder;
    
            SubresourcesNestedImpl(CustomResourceSubresources item){
                    this.builder = new CustomResourceSubresourcesBuilder(this, item);
            }
            SubresourcesNestedImpl(){
                    this.builder = new CustomResourceSubresourcesBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionVersionFluentImpl.this.withSubresources(builder.build());
    }
    public N endSubresources(){
            return and();
    }

}


}
