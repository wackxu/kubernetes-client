package io.fabric8.kubernetes.api.model.authentication;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTokenReview extends TokenReviewFluentImpl<DoneableTokenReview> implements Doneable<TokenReview>{

    private final TokenReviewBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TokenReview,TokenReview> function;

    public DoneableTokenReview(io.fabric8.kubernetes.api.builder.Function<TokenReview,TokenReview> function){
            super();this.builder=new TokenReviewBuilder(this);this.function=function;
    }
    public DoneableTokenReview(TokenReview item,io.fabric8.kubernetes.api.builder.Function<TokenReview,TokenReview> function){
            super(item);this.builder=new TokenReviewBuilder(this, item);this.function=function;
    }
    public DoneableTokenReview(TokenReview item){
            super(item);this.builder=new TokenReviewBuilder(this, item);this.function=new Function<TokenReview, TokenReview>() {
    public TokenReview apply(TokenReview item) {
        return item;
    }
}
;
    }

    public TokenReview done(){
             return function.apply(builder.build());
    }




}
