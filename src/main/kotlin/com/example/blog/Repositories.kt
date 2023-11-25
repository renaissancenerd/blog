package com.example.blog

import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Entities.Article, Long> {
    fun findBySlug(slug: String): Entities.Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Entities.Article>
}

interface UserRepository : CrudRepository<Entities.User, Long> {
    fun findByLogin(login: String): Entities.User?
}