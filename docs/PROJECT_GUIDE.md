# IJ — Java programming exercises

## Purpose and scope
A collection of small Java examples for object-oriented programming, inheritance, threading and basic console output, rather than a packaged server application.

**Technology:** Java .java standalone source programs; IntelliJ IDEA-style output folder.

## Source map
| Path | Purpose |
|---|---|
| `helloWorld.java` | Hello-world exercise |
| `inheritanceTest.java` | Inheritance demonstration |
| `multiThreading_Classes.java` | Concurrency example |
| `GFG.java` | Programming practice |
| `A.java` | Java class exercise |
| `B.java` | Java class exercise |
| `C.java` | Java class exercise |

## Component architecture
~~~mermaid
flowchart LR
  User[Developer or operator] --> Entry[Java source programs]
  Entry --> Logic[Project logic]
  Logic --> Data[Standard output / example data]
~~~

## Processing flow
~~~mermaid
sequenceDiagram
  participant U as User
  participant P as Program
  participant D as Data / files
  U->>P: Select example or operation
  P->>D: Read/process inputs
  D-->>P: Results
  P-->>U: Output or screen
~~~

## Installation and setup
1. Install a Java Development Kit and verify javac -version and java -version.
2. Clone the project; inspect each top-level .java source file before running it.
3. For standalone files with a main method, compile one exercise at a time using javac Filename.java, then run java ClassName with the declared class name.
4. Alternatively import the directory into IntelliJ IDEA. The out/production/IJ folder is generated output and should not be used as the source of truth.

~~~mermaid
flowchart TD
 Clone[Clone repository] --> Tooling[Install platform and tools]
 Tooling --> Configure[Review dependencies / examples]
 Configure --> Run[Run safe local build or example]
 Run --> Status{Passed?}
 Status -->|Yes| Verify[Inspect actual result]
 Status -->|No| Debug[Review source and missing prerequisites]
 Debug --> Tooling
~~~

## Functionality and examples
Each Java source is a separate exercise; no build tool, central entry point or bundled automated test suite is identified.

## Testing strategy
- GitHub Actions validates local documentation links and Mermaid blocks.
- Actions compiles helloWorld.java with javac as a minimal Java syntax smoke check, not a test of the other exercise files.
- Before calling any release functional, manually run source-specific examples in a disposable environment and record outputs.

## Known constraints and security notes
- Different demos may need separate compilation commands, especially when class names depend on other files.
- Compiled output is checked into out/production; do not treat it as original source.
- No automated functional assertions are present; only a basic source compiler smoke check is safe by default.
- No legitimate reason to invent maps, quantitative performance charts or outputs: no geospatial or benchmark data is committed.
- Source/runtime corrections should be separate from this documentation PR.
