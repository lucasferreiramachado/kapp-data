package com.lucasferreiramachado.module.data.user

import com.lucasferreiramachado.module.data.user.model.AuthenticatedUser

public interface UserRepository {

    public fun authenticate(username: String, password: String): AuthenticatedUser?

    public fun loggedUser(): AuthenticatedUser?
}