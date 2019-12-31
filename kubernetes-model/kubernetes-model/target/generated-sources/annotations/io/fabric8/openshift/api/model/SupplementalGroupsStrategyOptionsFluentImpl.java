package io.fabric8.openshift.api.model;

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

public class SupplementalGroupsStrategyOptionsFluentImpl<A extends io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<A>{

    private List<io.fabric8.openshift.api.model.IDRangeBuilder> ranges;
    private String type;

    public SupplementalGroupsStrategyOptionsFluentImpl(){
    }
    public SupplementalGroupsStrategyOptionsFluentImpl(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions instance){
            this.withRanges(instance.getRanges()); 
            this.withType(instance.getType()); 
    }

    public A addToRanges(int index,io.fabric8.openshift.api.model.IDRange item){
            if (this.ranges == null) {this.ranges = new ArrayList<io.fabric8.openshift.api.model.IDRangeBuilder>();}
            io.fabric8.openshift.api.model.IDRangeBuilder builder = new io.fabric8.openshift.api.model.IDRangeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ranges.add(index >= 0 ? index : ranges.size(), builder); return (A)this;
    }

    public A setToRanges(int index,io.fabric8.openshift.api.model.IDRange item){
            if (this.ranges == null) {this.ranges = new ArrayList<io.fabric8.openshift.api.model.IDRangeBuilder>();}
            io.fabric8.openshift.api.model.IDRangeBuilder builder = new io.fabric8.openshift.api.model.IDRangeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ranges.size()) { ranges.add(builder); } else { ranges.set(index, builder);}
             return (A)this;
    }

    public A addToRanges(io.fabric8.openshift.api.model.IDRange... items){
            if (this.ranges == null) {this.ranges = new ArrayList<io.fabric8.openshift.api.model.IDRangeBuilder>();}
            for (io.fabric8.openshift.api.model.IDRange item : items) {io.fabric8.openshift.api.model.IDRangeBuilder builder = new io.fabric8.openshift.api.model.IDRangeBuilder(item);_visitables.add(builder);this.ranges.add(builder);} return (A)this;
    }

    public A addAllToRanges(Collection<io.fabric8.openshift.api.model.IDRange> items){
            if (this.ranges == null) {this.ranges = new ArrayList<io.fabric8.openshift.api.model.IDRangeBuilder>();}
            for (io.fabric8.openshift.api.model.IDRange item : items) {io.fabric8.openshift.api.model.IDRangeBuilder builder = new io.fabric8.openshift.api.model.IDRangeBuilder(item);_visitables.add(builder);this.ranges.add(builder);} return (A)this;
    }

    public A removeFromRanges(io.fabric8.openshift.api.model.IDRange... items){
            for (io.fabric8.openshift.api.model.IDRange item : items) {io.fabric8.openshift.api.model.IDRangeBuilder builder = new io.fabric8.openshift.api.model.IDRangeBuilder(item);_visitables.remove(builder);if (this.ranges != null) {this.ranges.remove(builder);}} return (A)this;
    }

    public A removeAllFromRanges(Collection<io.fabric8.openshift.api.model.IDRange> items){
            for (io.fabric8.openshift.api.model.IDRange item : items) {io.fabric8.openshift.api.model.IDRangeBuilder builder = new io.fabric8.openshift.api.model.IDRangeBuilder(item);_visitables.remove(builder);if (this.ranges != null) {this.ranges.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildRanges instead.
 * @return The buildable object.
 */
@Deprecated public List<io.fabric8.openshift.api.model.IDRange> getRanges(){
            return build(ranges);
    }

    public List<io.fabric8.openshift.api.model.IDRange> buildRanges(){
            return build(ranges);
    }

    public io.fabric8.openshift.api.model.IDRange buildRange(int index){
            return this.ranges.get(index).build();
    }

    public io.fabric8.openshift.api.model.IDRange buildFirstRange(){
            return this.ranges.get(0).build();
    }

    public io.fabric8.openshift.api.model.IDRange buildLastRange(){
            return this.ranges.get(ranges.size() - 1).build();
    }

    public io.fabric8.openshift.api.model.IDRange buildMatchingRange(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.IDRangeBuilder> predicate){
            for (io.fabric8.openshift.api.model.IDRangeBuilder item: ranges) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withRanges(List<io.fabric8.openshift.api.model.IDRange> ranges){
            if (this.ranges != null) { _visitables.removeAll(this.ranges);}
            if (ranges != null) {this.ranges = new ArrayList<io.fabric8.openshift.api.model.IDRangeBuilder>(); for (io.fabric8.openshift.api.model.IDRange item : ranges){this.addToRanges(item);}} else { this.ranges = new ArrayList<io.fabric8.openshift.api.model.IDRangeBuilder>();} return (A) this;
    }

    public A withRanges(io.fabric8.openshift.api.model.IDRange... ranges){
            if (this.ranges != null) {this.ranges.clear();}
            if (ranges != null) {for (io.fabric8.openshift.api.model.IDRange item :ranges){ this.addToRanges(item);}} return (A) this;
    }

    public Boolean hasRanges(){
            return ranges != null && !ranges.isEmpty();
    }

    public A addNewRange(Long max,Long min){
            return (A)addToRanges(new IDRange(max, min));
    }

    public SupplementalGroupsStrategyOptionsFluent.RangesNested<A> addNewRange(){
            return new RangesNestedImpl();
    }

    public SupplementalGroupsStrategyOptionsFluent.RangesNested<A> addNewRangeLike(io.fabric8.openshift.api.model.IDRange item){
            return new RangesNestedImpl(-1, item);
    }

    public SupplementalGroupsStrategyOptionsFluent.RangesNested<A> setNewRangeLike(int index,io.fabric8.openshift.api.model.IDRange item){
            return new RangesNestedImpl(index, item);
    }

    public SupplementalGroupsStrategyOptionsFluent.RangesNested<A> editRange(int index){
            if (ranges.size() <= index) throw new RuntimeException("Can't edit ranges. Index exceeds size.");
            return setNewRangeLike(index, buildRange(index));
    }

    public SupplementalGroupsStrategyOptionsFluent.RangesNested<A> editFirstRange(){
            if (ranges.size() == 0) throw new RuntimeException("Can't edit first ranges. The list is empty.");
            return setNewRangeLike(0, buildRange(0));
    }

    public SupplementalGroupsStrategyOptionsFluent.RangesNested<A> editLastRange(){
            int index = ranges.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ranges. The list is empty.");
            return setNewRangeLike(index, buildRange(index));
    }

    public SupplementalGroupsStrategyOptionsFluent.RangesNested<A> editMatchingRange(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.IDRangeBuilder> predicate){
            int index = -1;
            for (int i=0;i<ranges.size();i++) { 
            if (predicate.apply(ranges.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ranges. No match found.");
            return setNewRangeLike(index, buildRange(index));
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SupplementalGroupsStrategyOptionsFluentImpl that = (SupplementalGroupsStrategyOptionsFluentImpl) o;
            if (ranges != null ? !ranges.equals(that.ranges) :that.ranges != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class RangesNestedImpl<N> extends io.fabric8.openshift.api.model.IDRangeFluentImpl<SupplementalGroupsStrategyOptionsFluent.RangesNested<N>> implements SupplementalGroupsStrategyOptionsFluent.RangesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.IDRangeBuilder builder;
        private final int index;
    
            RangesNestedImpl(int index,io.fabric8.openshift.api.model.IDRange item){
                    this.index = index;
                    this.builder = new io.fabric8.openshift.api.model.IDRangeBuilder(this, item);
            }
            RangesNestedImpl(){
                    this.index = -1;
                    this.builder = new io.fabric8.openshift.api.model.IDRangeBuilder(this);
            }
    
    public N and(){
            return (N) SupplementalGroupsStrategyOptionsFluentImpl.this.setToRanges(index, builder.build());
    }
    public N endRange(){
            return and();
    }

}


}
