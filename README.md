# IVRIL CALEER MS

### Description
Caller API allows to get Caller history statistics or insert a record in Call History table.

### Latest Release Story
CCT-17974 - [link](https://reqcentral.com/browse/CCT-17974)

### Build instructions
Add below properties in gradle.properties file and gradle folder to build project successfully. 
artifactory_username           = xxxxxx
artifactory_password           = xxxxxx

#### Note: Do not check in above 2 changes to git

### Running Locally
Set an environment variable SPRING_PROFILES_ACTIVE=local.
Update properties in application-local.yml. 
Update logging properties in logback-local.xml.
Update the latest postman collection in doc folder.

### Semantic Versioning

[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)
Always use semantic version commit messages when squashing and merging into main.
For instance, for a fix, use fix: . For a feature, use feat: . For documentation, which doesn't change any code, use docs: . You can also use BREAKING_CHANGE, which results in a major version change.
After committing, the resulting build will be tagged with a version x.y.z, where x is for breaking changes, y is for features, and z is for fixes. This tag can be used instead of the build tag when
specifying the tag in the k8s project. Note that you don't include the "v" in the tag. So if gitHub shows a tag of v2.3.4, put 2.3.4 as the tag in the yaml file in k8s.

# TechStack

- Java 11
- Gradle 6.8.3
- SpringBoot 2.7.8.RELEASE
- Uses Dynatrace for application logging
- Uses k8 to update secretes



