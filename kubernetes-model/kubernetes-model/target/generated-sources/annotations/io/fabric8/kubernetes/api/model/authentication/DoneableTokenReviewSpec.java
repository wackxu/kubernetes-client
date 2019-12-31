package io.fabric8.kubernetes.api.model.authentication;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTokenReviewSpec extends TokenReviewSpecFluentImpl<DoneableTokenReviewSpec> implements Doneable<TokenReviewSpec>{

    private final TokenReviewSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TokenReviewSpec,TokenReviewSpec> function;

    public DoneableTokenReviewSpec(io.fabric8.kubernetes.api.builder.Function<TokenReviewSpec,TokenReviewSpec> function){
            super();this.builder=new TokenReviewSpecBuilder(this);this.function=function;
    }
    public DoneableTokenReviewSpec(TokenReviewSpec item,io.fabric8.kubernetes.api.builder.Function<TokenReviewSpec,TokenReviewSpec> function){
            super(item);this.builder=new TokenReviewSpecBuilder(this, item);this.function=function;
    }
    public DoneableTokenReviewSpec(TokenReviewSpec item){
            super(item);this.builder=new TokenReviewSpecBuilder(this, item);this.function=new Function<TokenReviewSpec, TokenReviewSpec>() {
    public TokenReviewSpec apply(TokenReviewSpec item) {
        return item;
    }
}
;
    }

    public TokenReviewSpec done(){
             return function.apply(builder.build());
    }




}
