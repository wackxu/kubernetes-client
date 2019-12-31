package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface FSGroupStrategyOptionsFluent<A extends io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<A>> extends Fluent<A>{


    public A addToRanges(int index,io.fabric8.openshift.api.model.IDRange item);
    public A setToRanges(int index,io.fabric8.openshift.api.model.IDRange item);
    public A addToRanges(io.fabric8.openshift.api.model.IDRange... items);
    public A addAllToRanges(Collection<io.fabric8.openshift.api.model.IDRange> items);
    public A removeFromRanges(io.fabric8.openshift.api.model.IDRange... items);
    public A removeAllFromRanges(Collection<io.fabric8.openshift.api.model.IDRange> items);
    
/**
 * This method has been deprecated, please use method buildRanges instead.
 * @return The buildable object.
 */
@Deprecated public List<io.fabric8.openshift.api.model.IDRange> getRanges();
    public List<io.fabric8.openshift.api.model.IDRange> buildRanges();
    public io.fabric8.openshift.api.model.IDRange buildRange(int index);
    public io.fabric8.openshift.api.model.IDRange buildFirstRange();
    public io.fabric8.openshift.api.model.IDRange buildLastRange();
    public io.fabric8.openshift.api.model.IDRange buildMatchingRange(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.IDRangeBuilder> predicate);
    public A withRanges(List<io.fabric8.openshift.api.model.IDRange> ranges);
    public A withRanges(io.fabric8.openshift.api.model.IDRange... ranges);
    public Boolean hasRanges();
    public A addNewRange(Long max,Long min);
    public FSGroupStrategyOptionsFluent.RangesNested<A> addNewRange();
    public FSGroupStrategyOptionsFluent.RangesNested<A> addNewRangeLike(io.fabric8.openshift.api.model.IDRange item);
    public FSGroupStrategyOptionsFluent.RangesNested<A> setNewRangeLike(int index,io.fabric8.openshift.api.model.IDRange item);
    public FSGroupStrategyOptionsFluent.RangesNested<A> editRange(int index);
    public FSGroupStrategyOptionsFluent.RangesNested<A> editFirstRange();
    public FSGroupStrategyOptionsFluent.RangesNested<A> editLastRange();
    public FSGroupStrategyOptionsFluent.RangesNested<A> editMatchingRange(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.IDRangeBuilder> predicate);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface RangesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.IDRangeFluent<FSGroupStrategyOptionsFluent.RangesNested<N>>{

        
    public N and();    public N endRange();
}


}
