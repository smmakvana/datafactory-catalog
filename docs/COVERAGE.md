# Coverage

Generated from the source. Each row is one package of fixtures. A ✓ means the package has that style:
**Record** (`record`), **Lombok** (`@Value @Builder`), **AllArgs** (`@Value @AllArgsConstructor`), **Pojo** (JavaBean).

| Package | Classes | Record | Lombok | AllArgs | Pojo | What it covers |
|---|---:|:-:|:-:|:-:|:-:|---|
| `annotation/assertbool` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @AssertTrue and @AssertFalse on boolean fields. |
| `annotation/combined` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures that combine several constraints on the same fields. |
| `annotation/creditcard` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @CreditCardNumber. |
| `annotation/decimal` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @DecimalMin and @DecimalMax on decimal fields. |
| `annotation/ean` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @EAN barcode numbers. |
| `annotation/email` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @Email. |
| `annotation/isbn` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @ISBN book numbers. |
| `annotation/notblank` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @NotBlank on strings. |
| `annotation/notempty` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @NotEmpty on strings and collections. |
| `annotation/notnull` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @NotNull on each supported type. |
| `annotation/numeric` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @Min, @Max, @Positive and related numeric constraints. |
| `annotation/pattern` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @Pattern regular-expression constraints. |
| `annotation/size` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @Size on strings, collections and maps. |
| `annotation/temporal` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @Past, @Future and their variants on date and time types. |
| `annotation/url` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for @URL. |
| `collection/array` | 4 | ✓ | ✓ | ✓ | ✓ | Array fields with size and element constraints. |
| `collection/list` | 4 | ✓ | ✓ | ✓ | ✓ | List fields with size and element constraints. |
| `collection/map` | 4 | ✓ | ✓ | ✓ | ✓ | Map fields with size constraints. |
| `collection/queue` | 4 | ✓ | ✓ | ✓ | ✓ | Queue fields with size constraints. |
| `collection/set` | 4 | ✓ | ✓ | ✓ | ✓ | Set fields with size constraints. |
| `date` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for java.time date types. |
| `datetime` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for java.time date-and-time types. |
| `decimal` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for BigDecimal and floating-point fields. |
| `enumtype` | 5 | ✓ | ✓ | ✓ | ✓ | Fixtures for enum-typed fields. |
| `identifier` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for identifier types such as UUID and similar. |
| `logical` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for boolean and logical fields. |
| `nested` | 5 | ✓ | ✓ | ✓ | ✓ | Fixtures with nested objects validated through @Valid. |
| `number` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for integral numeric types. |
| `optional` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for java.util.Optional fields. |
| `realworld/address` | 2 | – | – | – | ✓ | Realistic postal address classes. |
| `realworld/payment` | 3 | – | – | – | – | Realistic payment classes with IBAN, amount and reference fields. |
| `realworld/registration` | 3 | – | – | – | – | Realistic user registration classes. |
| `realworld/trading` | 5 | – | – | – | – | Realistic trade classes with legs and nested validation. |
| `text` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for string fields. |
| `timepart` | 4 | ✓ | ✓ | ✓ | ✓ | Fixtures for java.time parts such as LocalTime. |
| `unsupported` | 2 | – | – | – | – | Shapes that generators are expected to reject or degrade on: circular references and erased * generics. |

Total: 141 classes in 36 packages.
