package pl.ryder.githubapiconsumer.usersrepositories.githubrepository.branch;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Commit(
        String sha,
        String url
) {}