package com.example.restservice.resolver

import com.example.restservice.resolver.model.RacetrackInfo
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryResolver: GraphQLQueryResolver {
    fun racetrack(countryCode: String): RacetrackInfo {
       return RacetrackInfo("Circuit of the Americas", "USA", 3.426F,  "1:36.169")
    }
}