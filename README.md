# Bowling Game Kata

Based upon http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata, but using Junit 5 with some minor stylistic tweaks in GameDavesStyleTest

I used the a https://start.spring.io/ pom because i'm lazy

## The TDD Cycle

1. Add a test
2. See test fail
3. Implement the simplest possible code to make test pass - it can be dumb/temporary code!
4. See all tests pass
5. Refactor implementation and test code, tidying up
6. See all tests pass after refactor

Go back to 1

The PPT linked from http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata shows this cycle starting from slide 11.

When adding code in the test that doesn't compile (e.g. because target class/method doesn't exit), use Intellij to auto create classes/methods via it's suggested actions to resolve the issue