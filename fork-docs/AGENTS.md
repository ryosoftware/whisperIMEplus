# AGENTS.md

## 1. General principles

- Follow the existing project architecture, conventions, and coding style.
- Prefer simple, focused, and minimal changes over broad refactoring.
- Do not introduce unnecessary dependencies, abstractions, or configuration changes.
- Do not modify unrelated files or code.
- Preserve backward compatibility unless explicitly instructed otherwise.
- Inspect the repository before making changes.
- Do not assume that existing code, comments, or documentation are obsolete without verification.

## 2. Git and commits

- **Never create commits.** All commits must be performed manually by the user.
- Never amend, rebase, squash, reset, or rewrite Git history.
- Never push, force-push, or modify remote branches.
- Never discard, overwrite, or revert user changes.
- Do not use destructive Git commands.
- Preserve the current working tree, including pre-existing uncommitted changes.
- Do not stage files unless explicitly requested.
- Before finishing, summarize modified and newly created files.

## 3. Upstream compatibility

If the repository has an `upstream` remote:

- Treat the upstream repository as the reference implementation.
- Minimize modifications to files originating from upstream.
- Prefer isolated additions, extensions, adapters, or configuration overrides over modifications to upstream code.
- Avoid changing existing APIs, interfaces, file structures, and behavior unnecessarily.
- Keep modifications easy to identify, review, and reconcile with future upstream updates.
- Do not duplicate upstream functionality without a clear reason.
- Avoid broad formatting changes, mass renaming, or unrelated cleanup.
- Preserve upstream naming conventions and coding patterns.
- When modifying an upstream file is unavoidable, keep the change as small and localized as possible.
- Never assume that upstream changes can be safely overwritten or discarded.

If no upstream remote exists, follow the same minimal-change principles while respecting the repository's existing architecture.

## 4. Before making changes

1. Inspect the repository structure and relevant files.
2. Check the current Git branch and working tree.
3. Identify existing user modifications and avoid interfering with them.
4. Inspect configured remotes and determine whether an upstream exists.
5. Read relevant documentation and existing project instructions.
6. Identify the smallest set of files needed to accomplish the task.
7. Check whether the requested functionality already exists.

## 5. Implementation guidelines

- Make only changes necessary to satisfy the request.
- Prefer modifying existing functionality over introducing parallel implementations.
- Keep changes localized and cohesive.
- Reuse existing utilities, dependencies, and patterns.
- Avoid speculative improvements and premature optimization.
- Do not silently change public interfaces or expected behavior.
- Preserve comments and documentation unless they become inaccurate.
- Add comments only when they provide meaningful information.
- Do not generate files or modify configurations unnecessarily.

## 6. Dependencies and configuration

- Do not add or upgrade dependencies without a clear requirement.
- Prefer existing project dependencies.
- Avoid unnecessary changes to lockfiles and generated files.
- Preserve existing build, lint, test, and formatting configurations.
- Do not modify environment-specific configuration or secrets.
- Never expose credentials, tokens, private keys, or sensitive information.

## 7. Testing and validation

- Follow the project's existing testing conventions.
- Run relevant tests when practical.
- Prefer targeted tests over expensive or unrelated test suites.
- Do not modify tests merely to make an implementation pass.
- Do not claim tests passed unless they were actually executed.
- Report tests that could not be executed and explain why.
- Avoid changing generated artifacts unless explicitly required.

## 8. Documentation

- Update documentation only when necessary to reflect the implemented changes.
- Follow existing documentation conventions.
- Avoid unrelated documentation rewrites.
- Do not introduce redundant documentation.

## 9. Final report

At the end of the task, provide:

- A concise summary of the implementation.
- A list of modified and created files.
- An explanation of any upstream files modified and why.
- Tests and validation performed, including their results.
- Any known limitations or outstanding issues.

**Important:** Do not create commits. Leave all changes in the working tree for the user to review and commit manually.
