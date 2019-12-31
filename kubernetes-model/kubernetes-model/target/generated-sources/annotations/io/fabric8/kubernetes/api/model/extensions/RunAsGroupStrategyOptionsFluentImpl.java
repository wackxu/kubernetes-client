package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class RunAsGroupStrategyOptionsFluentImpl<A extends RunAsGroupStrategyOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RunAsGroupStrategyOptionsFluent<A>{

    private List<IDRangeBuilder> ranges;
    private String rule;

    public RunAsGroupStrategyOptionsFluentImpl(){
    }
    public RunAsGroupStrategyOptionsFluentImpl(RunAsGroupStrategyOptions instance){
            this.withRanges(instance.getRanges()); 
            this.withRule(instance.getRule()); 
    }

    public A addToRanges(int index,IDRange item){
            if (this.ranges == null) {this.ranges = new ArrayList<IDRangeBuilder>();}
            IDRangeBuilder builder = new IDRangeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ranges.add(index >= 0 ? index : ranges.size(), builder); return (A)this;
    }

    public A setToRanges(int index,IDRange item){
            if (this.ranges == null) {this.ranges = new ArrayList<IDRangeBuilder>();}
            IDRangeBuilder builder = new IDRangeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ranges.size()) { ranges.add(builder); } else { ranges.set(index, builder);}
             return (A)this;
    }

    public A addToRanges(IDRange... items){
            if (this.ranges == null) {this.ranges = new ArrayList<IDRangeBuilder>();}
            for (IDRange item : items) {IDRangeBuilder builder = new IDRangeBuilder(item);_visitables.add(builder);this.ranges.add(builder);} return (A)this;
    }

    public A addAllToRanges(Collection<IDRange> items){
            if (this.ranges == null) {this.ranges = new ArrayList<IDRangeBuilder>();}
            for (IDRange item : items) {IDRangeBuilder builder = new IDRangeBuilder(item);_visitables.add(builder);this.ranges.add(builder);} return (A)this;
    }

    public A removeFromRanges(IDRange... items){
            for (IDRange item : items) {IDRangeBuilder builder = new IDRangeBuilder(item);_visitables.remove(builder);if (this.ranges != null) {this.ranges.remove(builder);}} return (A)this;
    }

    public A removeAllFromRanges(Collection<IDRange> items){
            for (IDRange item : items) {IDRangeBuilder builder = new IDRangeBuilder(item);_visitables.remove(builder);if (this.ranges != null) {this.ranges.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildRanges instead.
 * @return The buildable object.
 */
@Deprecated public List<IDRange> getRanges(){
            return build(ranges);
    }

    public List<IDRange> buildRanges(){
            return build(ranges);
    }

    public IDRange buildRange(int index){
            return this.ranges.get(index).build();
    }

    public IDRange buildFirstRange(){
            return this.ranges.get(0).build();
    }

    public IDRange buildLastRange(){
            return this.ranges.get(ranges.size() - 1).build();
    }

    public IDRange buildMatchingRange(io.fabric8.kubernetes.api.builder.Predicate<IDRangeBuilder> predicate){
            for (IDRangeBuilder item: ranges) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withRanges(List<IDRange> ranges){
            if (this.ranges != null) { _visitables.removeAll(this.ranges);}
            if (ranges != null) {this.ranges = new ArrayList<IDRangeBuilder>(); for (IDRange item : ranges){this.addToRanges(item);}} else { this.ranges = new ArrayList<IDRangeBuilder>();} return (A) this;
    }

    public A withRanges(IDRange... ranges){
            if (this.ranges != null) {this.ranges.clear();}
            if (ranges != null) {for (IDRange item :ranges){ this.addToRanges(item);}} return (A) this;
    }

    public Boolean hasRanges(){
            return ranges != null && !ranges.isEmpty();
    }

    public A addNewRange(Long max,Long min){
            return (A)addToRanges(new IDRange(max, min));
    }

    public RunAsGroupStrategyOptionsFluent.RangesNested<A> addNewRange(){
            return new RangesNestedImpl();
    }

    public RunAsGroupStrategyOptionsFluent.RangesNested<A> addNewRangeLike(IDRange item){
            return new RangesNestedImpl(-1, item);
    }

    public RunAsGroupStrategyOptionsFluent.RangesNested<A> setNewRangeLike(int index,IDRange item){
            return new RangesNestedImpl(index, item);
    }

    public RunAsGroupStrategyOptionsFluent.RangesNested<A> editRange(int index){
            if (ranges.size() <= index) throw new RuntimeException("Can't edit ranges. Index exceeds size.");
            return setNewRangeLike(index, buildRange(index));
    }

    public RunAsGroupStrategyOptionsFluent.RangesNested<A> editFirstRange(){
            if (ranges.size() == 0) throw new RuntimeException("Can't edit first ranges. The list is empty.");
            return setNewRangeLike(0, buildRange(0));
    }

    public RunAsGroupStrategyOptionsFluent.RangesNested<A> editLastRange(){
            int index = ranges.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ranges. The list is empty.");
            return setNewRangeLike(index, buildRange(index));
    }

    public RunAsGroupStrategyOptionsFluent.RangesNested<A> editMatchingRange(io.fabric8.kubernetes.api.builder.Predicate<IDRangeBuilder> predicate){
            int index = -1;
            for (int i=0;i<ranges.size();i++) { 
            if (predicate.apply(ranges.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ranges. No match found.");
            return setNewRangeLike(index, buildRange(index));
    }

    public String getRule(){
            return this.rule;
    }

    public A withRule(String rule){
            this.rule=rule; return (A) this;
    }

    public Boolean hasRule(){
            return this.rule != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RunAsGroupStrategyOptionsFluentImpl that = (RunAsGroupStrategyOptionsFluentImpl) o;
            if (ranges != null ? !ranges.equals(that.ranges) :that.ranges != null) return false;
            if (rule != null ? !rule.equals(that.rule) :that.rule != null) return false;
            return true;
    }


    public class RangesNestedImpl<N> extends IDRangeFluentImpl<RunAsGroupStrategyOptionsFluent.RangesNested<N>> implements RunAsGroupStrategyOptionsFluent.RangesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IDRangeBuilder builder;
        private final int index;
    
            RangesNestedImpl(int index,IDRange item){
                    this.index = index;
                    this.builder = new IDRangeBuilder(this, item);
            }
            RangesNestedImpl(){
                    this.index = -1;
                    this.builder = new IDRangeBuilder(this);
            }
    
    public N and(){
            return (N) RunAsGroupStrategyOptionsFluentImpl.this.setToRanges(index, builder.build());
    }
    public N endRange(){
            return and();
    }

}


}
