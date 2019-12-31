package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface LimitRangeSpecFluent<A extends LimitRangeSpecFluent<A>> extends Fluent<A>{


    public A addToLimits(int index,LimitRangeItem item);
    public A setToLimits(int index,LimitRangeItem item);
    public A addToLimits(LimitRangeItem... items);
    public A addAllToLimits(Collection<LimitRangeItem> items);
    public A removeFromLimits(LimitRangeItem... items);
    public A removeAllFromLimits(Collection<LimitRangeItem> items);
    
/**
 * This method has been deprecated, please use method buildLimits instead.
 * @return The buildable object.
 */
@Deprecated public List<LimitRangeItem> getLimits();
    public List<LimitRangeItem> buildLimits();
    public LimitRangeItem buildLimit(int index);
    public LimitRangeItem buildFirstLimit();
    public LimitRangeItem buildLastLimit();
    public LimitRangeItem buildMatchingLimit(io.fabric8.kubernetes.api.builder.Predicate<LimitRangeItemBuilder> predicate);
    public A withLimits(List<LimitRangeItem> limits);
    public A withLimits(LimitRangeItem... limits);
    public Boolean hasLimits();
    public LimitRangeSpecFluent.LimitsNested<A> addNewLimit();
    public LimitRangeSpecFluent.LimitsNested<A> addNewLimitLike(LimitRangeItem item);
    public LimitRangeSpecFluent.LimitsNested<A> setNewLimitLike(int index,LimitRangeItem item);
    public LimitRangeSpecFluent.LimitsNested<A> editLimit(int index);
    public LimitRangeSpecFluent.LimitsNested<A> editFirstLimit();
    public LimitRangeSpecFluent.LimitsNested<A> editLastLimit();
    public LimitRangeSpecFluent.LimitsNested<A> editMatchingLimit(io.fabric8.kubernetes.api.builder.Predicate<LimitRangeItemBuilder> predicate);

    public interface LimitsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeItemFluent<LimitRangeSpecFluent.LimitsNested<N>>{

        
    public N and();    public N endLimit();
}


}
