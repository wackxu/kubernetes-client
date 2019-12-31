package io.fabric8.kubernetes.api.model.authentication;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTokenReviewStatus extends TokenReviewStatusFluentImpl<DoneableTokenReviewStatus> implements Doneable<TokenReviewStatus>{

    private final TokenReviewStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TokenReviewStatus,TokenReviewStatus> function;

    public DoneableTokenReviewStatus(io.fabric8.kubernetes.api.builder.Function<TokenReviewStatus,TokenReviewStatus> function){
            super();this.builder=new TokenReviewStatusBuilder(this);this.function=function;
    }
    public DoneableTokenReviewStatus(TokenReviewStatus item,io.fabric8.kubernetes.api.builder.Function<TokenReviewStatus,TokenReviewStatus> function){
            super(item);this.builder=new TokenReviewStatusBuilder(this, item);this.function=function;
    }
    public DoneableTokenReviewStatus(TokenReviewStatus item){
            super(item);this.builder=new TokenReviewStatusBuilder(this, item);this.function=new Function<TokenReviewStatus, TokenReviewStatus>() {
    public TokenReviewStatus apply(TokenReviewStatus item) {
        return item;
    }
}
;
    }

    public TokenReviewStatus done(){
             return function.apply(builder.build());
    }




}
