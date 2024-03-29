package pl.ryder.githubapiconsumer.usersrepositories.githubrepository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SingleRepositoryData(
        String name,
        Owner owner,
        String branches_url,
        Boolean fork
) {}
