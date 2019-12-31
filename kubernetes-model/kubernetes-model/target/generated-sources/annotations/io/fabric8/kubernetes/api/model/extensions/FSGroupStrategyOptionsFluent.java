package io.fabric8.kubernetes.api.model.extensions;

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

public interface FSGroupStrategyOptionsFluent<A extends FSGroupStrategyOptionsFluent<A>> extends Fluent<A>{


    public A addToRanges(int index,IDRange item);
    public A setToRanges(int index,IDRange item);
    public A addToRanges(IDRange... items);
    public A addAllToRanges(Collection<IDRange> items);
    public A removeFromRanges(IDRange... items);
    public A removeAllFromRanges(Collection<IDRange> items);
    
/**
 * This method has been deprecated, please use method buildRanges instead.
 * @return The buildable object.
 */
@Deprecated public List<IDRange> getRanges();
    public List<IDRange> buildRanges();
    public IDRange buildRange(int index);
    public IDRange buildFirstRange();
    public IDRange buildLastRange();
    public IDRange buildMatchingRange(io.fabric8.kubernetes.api.builder.Predicate<IDRangeBuilder> predicate);
    public A withRanges(List<IDRange> ranges);
    public A withRanges(IDRange... ranges);
    public Boolean hasRanges();
    public A addNewRange(Long max,Long min);
    public FSGroupStrategyOptionsFluent.RangesNested<A> addNewRange();
    public FSGroupStrategyOptionsFluent.RangesNested<A> addNewRangeLike(IDRange item);
    public FSGroupStrategyOptionsFluent.RangesNested<A> setNewRangeLike(int index,IDRange item);
    public FSGroupStrategyOptionsFluent.RangesNested<A> editRange(int index);
    public FSGroupStrategyOptionsFluent.RangesNested<A> editFirstRange();
    public FSGroupStrategyOptionsFluent.RangesNested<A> editLastRange();
    public FSGroupStrategyOptionsFluent.RangesNested<A> editMatchingRange(io.fabric8.kubernetes.api.builder.Predicate<IDRangeBuilder> predicate);
    public String getRule();
    public A withRule(String rule);
    public Boolean hasRule();

    public interface RangesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IDRangeFluent<FSGroupStrategyOptionsFluent.RangesNested<N>>{

        
    public N and();    public N endRange();
}


}
