# xemantic-json-schema

Kotlin multiplatform JSON Schema model, parser and serializer

[//]: # (TODO for the shileds below, replace com.xemantic.json group and xemantic-json-schema artifactId)

[<img alt="Maven Central Version" src="https://img.shields.io/maven-central/v/com.xemantic.json/xemantic-json-schema">](https://central.sonatype.com/artifact/com.xemantic.json/xemantic-json-schema)
[<img alt="GitHub Release Date" src="https://img.shields.io/github/release-date/xemantic/xemantic-json-schema">](https://github.com/xemantic/xemantic-json-schema/releases)
[<img alt="license" src="https://img.shields.io/github/license/xemantic/xemantic-json-schema?color=blue">](https://github.com/xemantic/xemantic-json-schema/blob/main/LICENSE)

[<img alt="GitHub Actions Workflow Status" src="https://img.shields.io/github/actions/workflow/status/xemantic/xemantic-json-schema/build-main.yml">](https://github.com/xemantic/xemantic-json-schema/actions/workflows/build-main.yml)
[<img alt="GitHub branch check runs" src="https://img.shields.io/github/check-runs/xemantic/xemantic-json-schema/main">](https://github.com/xemantic/xemantic-json-schema/actions/workflows/build-main.yml)
[<img alt="GitHub commits since latest release" src="https://img.shields.io/github/commits-since/xemantic/xemantic-json-schema/latest">](https://github.com/xemantic/xemantic-json-schema/commits/main/)
[<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/xemantic/xemantic-json-schema">](https://github.com/xemantic/xemantic-json-schema/commits/main/)

[<img alt="GitHub contributors" src="https://img.shields.io/github/contributors/xemantic/xemantic-json-schema">](https://github.com/xemantic/xemantic-json-schema/graphs/contributors)
[<img alt="GitHub commit activity" src="https://img.shields.io/github/commit-activity/t/xemantic/xemantic-json-schema">](https://github.com/xemantic/xemantic-json-schema/commits/main/)
[<img alt="GitHub code size in bytes" src="https://img.shields.io/github/languages/code-size/xemantic/xemantic-json-schema">]()
[<img alt="GitHub Created At" src="https://img.shields.io/github/created-at/xemantic/xemantic-json-schema">](https://github.com/xemantic/xemantic-json-schema/commits)
[<img alt="kotlin version" src="https://img.shields.io/badge/dynamic/toml?url=https%3A%2F%2Fraw.githubusercontent.com%2Fxemantic%2Fxemantic-json-schema%2Fmain%2Fgradle%2Flibs.versions.toml&query=versions.kotlin&label=kotlin">](https://kotlinlang.org/docs/releases.html)
[<img alt="discord users online" src="https://img.shields.io/discord/811561179280965673">](https://discord.gg/vQktqqN2Vn)
[![Bluesky](https://img.shields.io/badge/Bluesky-0285FF?logo=bluesky&logoColor=fff)](https://bsky.app/profile/xemantic.com)

## Why?

We were struggling to find a Kotlin JSON schema library which would check all the points:

* Multiplatform
* Kotlin serialization
* Minimal footprint
* Extensibility to driver other tools based on it

## Usage

In `build.gradle.kts` add:

```kotlin
dependencies {
    implementation("com.xemantic.json:xemantic-json-schema:0.0.1")
}
```
