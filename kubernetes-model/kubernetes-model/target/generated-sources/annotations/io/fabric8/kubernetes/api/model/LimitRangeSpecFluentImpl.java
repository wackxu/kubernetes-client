package io.fabric8.kubernetes.api.model;

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

public class LimitRangeSpecFluentImpl<A extends LimitRangeSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LimitRangeSpecFluent<A>{

    private List<LimitRangeItemBuilder> limits;

    public LimitRangeSpecFluentImpl(){
    }
    public LimitRangeSpecFluentImpl(LimitRangeSpec instance){
            this.withLimits(instance.getLimits()); 
    }

    public A addToLimits(int index,LimitRangeItem item){
            if (this.limits == null) {this.limits = new ArrayList<LimitRangeItemBuilder>();}
            LimitRangeItemBuilder builder = new LimitRangeItemBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.limits.add(index >= 0 ? index : limits.size(), builder); return (A)this;
    }

    public A setToLimits(int index,LimitRangeItem item){
            if (this.limits == null) {this.limits = new ArrayList<LimitRangeItemBuilder>();}
            LimitRangeItemBuilder builder = new LimitRangeItemBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= limits.size()) { limits.add(builder); } else { limits.set(index, builder);}
             return (A)this;
    }

    public A addToLimits(LimitRangeItem... items){
            if (this.limits == null) {this.limits = new ArrayList<LimitRangeItemBuilder>();}
            for (LimitRangeItem item : items) {LimitRangeItemBuilder builder = new LimitRangeItemBuilder(item);_visitables.add(builder);this.limits.add(builder);} return (A)this;
    }

    public A addAllToLimits(Collection<LimitRangeItem> items){
            if (this.limits == null) {this.limits = new ArrayList<LimitRangeItemBuilder>();}
            for (LimitRangeItem item : items) {LimitRangeItemBuilder builder = new LimitRangeItemBuilder(item);_visitables.add(builder);this.limits.add(builder);} return (A)this;
    }

    public A removeFromLimits(LimitRangeItem... items){
            for (LimitRangeItem item : items) {LimitRangeItemBuilder builder = new LimitRangeItemBuilder(item);_visitables.remove(builder);if (this.limits != null) {this.limits.remove(builder);}} return (A)this;
    }

    public A removeAllFromLimits(Collection<LimitRangeItem> items){
            for (LimitRangeItem item : items) {LimitRangeItemBuilder builder = new LimitRangeItemBuilder(item);_visitables.remove(builder);if (this.limits != null) {this.limits.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildLimits instead.
 * @return The buildable object.
 */
@Deprecated public List<LimitRangeItem> getLimits(){
            return build(limits);
    }

    public List<LimitRangeItem> buildLimits(){
            return build(limits);
    }

    public LimitRangeItem buildLimit(int index){
            return this.limits.get(index).build();
    }

    public LimitRangeItem buildFirstLimit(){
            return this.limits.get(0).build();
    }

    public LimitRangeItem buildLastLimit(){
            return this.limits.get(limits.size() - 1).build();
    }

    public LimitRangeItem buildMatchingLimit(io.fabric8.kubernetes.api.builder.Predicate<LimitRangeItemBuilder> predicate){
            for (LimitRangeItemBuilder item: limits) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withLimits(List<LimitRangeItem> limits){
            if (this.limits != null) { _visitables.removeAll(this.limits);}
            if (limits != null) {this.limits = new ArrayList<LimitRangeItemBuilder>(); for (LimitRangeItem item : limits){this.addToLimits(item);}} else { this.limits = new ArrayList<LimitRangeItemBuilder>();} return (A) this;
    }

    public A withLimits(LimitRangeItem... limits){
            if (this.limits != null) {this.limits.clear();}
            if (limits != null) {for (LimitRangeItem item :limits){ this.addToLimits(item);}} return (A) this;
    }

    public Boolean hasLimits(){
            return limits != null && !limits.isEmpty();
    }

    public LimitRangeSpecFluent.LimitsNested<A> addNewLimit(){
            return new LimitsNestedImpl();
    }

    public LimitRangeSpecFluent.LimitsNested<A> addNewLimitLike(LimitRangeItem item){
            return new LimitsNestedImpl(-1, item);
    }

    public LimitRangeSpecFluent.LimitsNested<A> setNewLimitLike(int index,LimitRangeItem item){
            return new LimitsNestedImpl(index, item);
    }

    public LimitRangeSpecFluent.LimitsNested<A> editLimit(int index){
            if (limits.size() <= index) throw new RuntimeException("Can't edit limits. Index exceeds size.");
            return setNewLimitLike(index, buildLimit(index));
    }

    public LimitRangeSpecFluent.LimitsNested<A> editFirstLimit(){
            if (limits.size() == 0) throw new RuntimeException("Can't edit first limits. The list is empty.");
            return setNewLimitLike(0, buildLimit(0));
    }

    public LimitRangeSpecFluent.LimitsNested<A> editLastLimit(){
            int index = limits.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last limits. The list is empty.");
            return setNewLimitLike(index, buildLimit(index));
    }

    public LimitRangeSpecFluent.LimitsNested<A> editMatchingLimit(io.fabric8.kubernetes.api.builder.Predicate<LimitRangeItemBuilder> predicate){
            int index = -1;
            for (int i=0;i<limits.size();i++) { 
            if (predicate.apply(limits.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching limits. No match found.");
            return setNewLimitLike(index, buildLimit(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LimitRangeSpecFluentImpl that = (LimitRangeSpecFluentImpl) o;
            if (limits != null ? !limits.equals(that.limits) :that.limits != null) return false;
            return true;
    }


    public class LimitsNestedImpl<N> extends LimitRangeItemFluentImpl<LimitRangeSpecFluent.LimitsNested<N>> implements LimitRangeSpecFluent.LimitsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LimitRangeItemBuilder builder;
        private final int index;
    
            LimitsNestedImpl(int index,LimitRangeItem item){
                    this.index = index;
                    this.builder = new LimitRangeItemBuilder(this, item);
            }
            LimitsNestedImpl(){
                    this.index = -1;
                    this.builder = new LimitRangeItemBuilder(this);
            }
    
    public N and(){
            return (N) LimitRangeSpecFluentImpl.this.setToLimits(index, builder.build());
    }
    public N endLimit(){
            return and();
    }

}


}
