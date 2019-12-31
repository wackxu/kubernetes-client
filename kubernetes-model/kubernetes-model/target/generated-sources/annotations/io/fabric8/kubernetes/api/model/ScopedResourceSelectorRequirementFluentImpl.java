package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ScopedResourceSelectorRequirementFluentImpl<A extends ScopedResourceSelectorRequirementFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ScopedResourceSelectorRequirementFluent<A>{

    private String operator;
    private String scopeName;
    private List<String> values;

    public ScopedResourceSelectorRequirementFluentImpl(){
    }
    public ScopedResourceSelectorRequirementFluentImpl(ScopedResourceSelectorRequirement instance){
            this.withOperator(instance.getOperator()); 
            this.withScopeName(instance.getScopeName()); 
            this.withValues(instance.getValues()); 
    }

    public String getOperator(){
            return this.operator;
    }

    public A withOperator(String operator){
            this.operator=operator; return (A) this;
    }

    public Boolean hasOperator(){
            return this.operator != null;
    }

    public String getScopeName(){
            return this.scopeName;
    }

    public A withScopeName(String scopeName){
            this.scopeName=scopeName; return (A) this;
    }

    public Boolean hasScopeName(){
            return this.scopeName != null;
    }

    public A addToValues(int index,String item){
            if (this.values == null) {this.values = new ArrayList<String>();}
            this.values.add(index, item);
            return (A)this;
    }

    public A setToValues(int index,String item){
            if (this.values == null) {this.values = new ArrayList<String>();}
            this.values.set(index, item); return (A)this;
    }

    public A addToValues(String... items){
            if (this.values == null) {this.values = new ArrayList<String>();}
            for (String item : items) {this.values.add(item);} return (A)this;
    }

    public A addAllToValues(Collection<String> items){
            if (this.values == null) {this.values = new ArrayList<String>();}
            for (String item : items) {this.values.add(item);} return (A)this;
    }

    public A removeFromValues(String... items){
            for (String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
    }

    public A removeAllFromValues(Collection<String> items){
            for (String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
    }

    public List<String> getValues(){
            return this.values;
    }

    public String getValue(int index){
            return this.values.get(index);
    }

    public String getFirstValue(){
            return this.values.get(0);
    }

    public String getLastValue(){
            return this.values.get(values.size() - 1);
    }

    public String getMatchingValue(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: values) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withValues(List<String> values){
            if (this.values != null) { _visitables.removeAll(this.values);}
            if (values != null) {this.values = new ArrayList<String>(); for (String item : values){this.addToValues(item);}} else { this.values = new ArrayList<String>();} return (A) this;
    }

    public A withValues(String... values){
            if (this.values != null) {this.values.clear();}
            if (values != null) {for (String item :values){ this.addToValues(item);}} return (A) this;
    }

    public Boolean hasValues(){
            return values != null && !values.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScopedResourceSelectorRequirementFluentImpl that = (ScopedResourceSelectorRequirementFluentImpl) o;
            if (operator != null ? !operator.equals(that.operator) :that.operator != null) return false;
            if (scopeName != null ? !scopeName.equals(that.scopeName) :that.scopeName != null) return false;
            if (values != null ? !values.equals(that.values) :that.values != null) return false;
            return true;
    }




}
