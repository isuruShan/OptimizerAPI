package com.treset.optimizer_api.auth;

import io.jsonwebtoken.impl.DefaultClaims;

public class MutedClaims extends DefaultClaims {

    @Override
    public String getSubject() {
        return this.getString("sub");
    }
}
