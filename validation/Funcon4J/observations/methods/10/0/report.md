
The body of the method [`funcons.values.recursion.Fwd.equals(java.lang.Object)`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/funcons/values/recursion/Fwd.java#L27) 
was  replaced by  `return false;`  
yet,  [`tests.reference.RecursiveFactoryTest.testFreshFwd`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/RecursiveFactoryTest.java) did not fail. 

When the transformed method is executed, there is no difference with the execution using the original source code. This could mean that the original method always returns the same value. 
Consider creating a modified variant of the  test mentioned  above to make the method produce a different value.

---