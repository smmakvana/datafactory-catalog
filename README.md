# datafactory-catalog

A catalog of Jakarta-annotated test fixtures — the same shapes written four ways — used to test
[DataFactory](https://github.com/smmakvana/paramichha-datafactory) and
[TestKit](https://github.com/smmakvana/paramichha-testkit).

Each fixture exists as a **record**, a **Lombok** class (`@Value @Builder`), an **all-args** class and a
**JavaBean** (`…Pojo`), so every generator is checked against every way people write a class.

---

## The Paramichha libraries

| Library | What it does | Maven coordinates |
|---|---|---|
| [paramichha-dev](https://github.com/smmakvana/paramichha-dev) | Parent POM: Java 21, shared versions, release setup | `com.paramichha:paramichha-dev` |
| [paramichha-utils](https://github.com/smmakvana/paramichha-utils) | Dependency-free helpers: seeds, naming, token templates, guards | `com.paramichha:paramichha-utils` |
| [datafactory-catalog](https://github.com/smmakvana/datafactory-catalog) | Test fixtures: 141 annotated classes in four styles, for testing DataFactory and TestKit | `com.paramichha:datafactory-catalog` (test scope) |
| [DataFactory](https://github.com/smmakvana/paramichha-datafactory) | Generates valid and invalid test data from Jakarta validation annotations | `com.paramichha:datafactory` (test scope) |
| [TestKit](https://github.com/smmakvana/paramichha-testkit) | Generates JUnit 5 tests for a class, using DataFactory for the data | `com.paramichha:testkit` |
| [TestBuddy](https://github.com/smmakvana/paramichha-testbuddy) | IntelliJ IDEA plugin that runs TestKit from the IDE (Free and Pro) | JetBrains Marketplace |

Dependencies flow downward: TestKit uses DataFactory, DataFactory and TestKit use utils, and the catalog is used only for testing.

---

## Install

Test scope only — this is fixture data, not a library to ship:

```xml
<dependency>
    <groupId>com.paramichha</groupId>
    <artifactId>datafactory-catalog</artifactId>
    <version>0.2.0</version>
    <scope>test</scope>
</dependency>
```

Requires Java 21 or later.

---

## What's inside

141 classes under `com.paramichha.datafactory.catalog`:

| Package | Covers |
|---|---|
| `annotation.*` | One package per constraint: `notnull`, `notblank`, `notempty`, `size`, `numeric`, `decimal`, `email`, `pattern`, `url`, `creditcard`, `isbn`, `ean`, `assertbool`, `temporal`, `combined` |
| `number`, `decimal`, `text`, `logical`, `identifier`, `enumtype` | Scalar types with typical constraints |
| `date`, `datetime`, `timepart` | `LocalDate`, `LocalDateTime`, `Instant`, `LocalTime`, … with `@Past` / `@Future` |
| `collection.*` | `list`, `set`, `queue`, `map`, `array` with `@Size` / `@NotEmpty` |
| `optional`, `nested` | `Optional<T>` fields and nested `@Valid` objects |
| `realworld.*` | Domain-shaped classes: `UserRegistration`, `Payment`, `PostalAddress`, `Trade` / `TradeWithLegs` |
| `unsupported` | Shapes generators are expected to reject or degrade on: `CircularReference`, `ErasedGeneric` |

```java
import com.paramichha.datafactory.catalog.annotation.email.EmailRecord;
import com.paramichha.datafactory.catalog.realworld.trading.TradeWithLegs;

var trade = DataFactory.of(TradeWithLegs.class).valid().get();
```

---

## Features

- **Four styles per shape** — `…Record`, `…Lombok`, `…AllArgs`, `…Pojo` — for instantiation-strategy coverage.
- **One constraint per package** under `annotation.*`, plus combined and real-world classes.
- **Edge cases included** — circular references and erased generics live in `unsupported`.
- **No behaviour** — plain data classes; safe to use in any test.

---

## Limitations

- **Fixtures, not a domain model.** The classes are deliberately simple; they don't model real business rules.
- **Changing a fixture changes test expectations downstream.** DataFactory's snapshot tests and TestKit's tests
  pin generated output for these classes — when you edit one, re-record those snapshots.
- **Built with Lombok.** Lombok is needed only to compile this module; users of the jar don't need it.

---

## License

Apache 2.0
