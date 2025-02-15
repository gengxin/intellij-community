// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.jetbrains.kotlin.idea.fir.imports;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.idea.base.test.TestRoot;
import org.junit.runner.RunWith;

/**
 * This class is generated by {@link org.jetbrains.kotlin.testGenerator.generator.TestGenerator}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("fir/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("../../idea/tests/testData/editor/autoImport")
public class K2AutoImportTestGenerated extends AbstractK2AutoImportTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("arrayAccessor")
    public void testArrayAccessor() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/arrayAccessor/");
    }

    @TestMetadata("assignmentPlugin")
    public void testAssignmentPlugin() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/assignmentPlugin/");
    }

    @TestMetadata("components")
    public void testComponents() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/components/");
    }

    @TestMetadata("components2")
    public void testComponents2() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/components2/");
    }

    @TestMetadata("constructorReference")
    public void testConstructorReference() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/constructorReference/");
    }

    @TestMetadata("delegationExtFunction")
    public void testDelegationExtFunction() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/delegationExtFunction/");
    }

    @TestMetadata("delegationExtFunctions")
    public void testDelegationExtFunctions() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/delegationExtFunctions/");
    }

    @TestMetadata("extFunctionWithGenerics")
    public void testExtFunctionWithGenerics() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/extFunctionWithGenerics/");
    }

    @TestMetadata("functionReference")
    public void testFunctionReference() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/functionReference/");
    }

    @TestMetadata("invoke")
    public void testInvoke() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/invoke/");
    }

    @TestMetadata("javaClass")
    public void testJavaClass() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/javaClass/");
    }

    @TestMetadata("method")
    public void testMethod() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/method/");
    }

    @TestMetadata("multilineCall")
    public void testMultilineCall() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/multilineCall/");
    }

    @TestMetadata("multipleCandidates")
    public void testMultipleCandidates() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/multipleCandidates/");
    }

    @TestMetadata("multipleCandidates2")
    public void testMultipleCandidates2() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/multipleCandidates2/");
    }

    @TestMetadata("nestedClassifier")
    public void testNestedClassifier() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/nestedClassifier/");
    }

    @TestMetadata("property")
    public void testProperty() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/property/");
    }

    @TestMetadata("recevierAndFunction")
    public void testRecevierAndFunction() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/recevierAndFunction/");
    }

    @TestMetadata("singleImportForMultipleReferences")
    public void testSingleImportForMultipleReferences() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/singleImportForMultipleReferences/");
    }

    @TestMetadata("starImport")
    public void testStarImport() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/starImport/");
    }

    @TestMetadata("superConstructorCall")
    public void testSuperConstructorCall() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/superConstructorCall/");
    }

    @TestMetadata("typeReference")
    public void testTypeReference() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/typeReference/");
    }

    @TestMetadata("typealias")
    public void testTypealias() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/typealias/");
    }

    @TestMetadata("unresolvedExplicitReceiver")
    public void testUnresolvedExplicitReceiver() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/unresolvedExplicitReceiver/");
    }

    @TestMetadata("unresolvedImplicitReceiver")
    public void testUnresolvedImplicitReceiver() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/unresolvedImplicitReceiver/");
    }

    @TestMetadata("unresolvedImport")
    public void testUnresolvedImport() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/unresolvedImport/");
    }

    @TestMetadata("unresolvedImport2")
    public void testUnresolvedImport2() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/unresolvedImport2/");
    }

    @TestMetadata("withoutAutoImport")
    public void testWithoutAutoImport() throws Exception {
        runTest("../../idea/tests/testData/editor/autoImport/withoutAutoImport/");
    }
}
