package com.example.restservice.resolver

import com.example.restservice.graphql.model.RacetrackInfo
import graphql.kickstart.tools.GraphQLQueryResolver
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component

@Component
class QueryResolver: GraphQLQueryResolver {
    fun racetrack(countryCode: String,env: DataFetchingEnvironment): RacetrackInfo {
       return RacetrackInfo("Circuit of the Americas", "USA", 3.426F,  "1:36.169")
    }
}