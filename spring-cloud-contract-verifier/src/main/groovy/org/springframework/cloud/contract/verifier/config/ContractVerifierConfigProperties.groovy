/*
 *  Copyright 2013-2016 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.contract.verifier.config

/**
 * Represents Contract Verifier configuration properties
 *
 * @author Jakub Kubrynski, codearte.io
 *
 * @since 1.0.0
 */
class ContractVerifierConfigProperties {

	/**
	 * For which unit test library tests should be generated
	 */
	TestFramework targetFramework = TestFramework.JUNIT

	/**
	 * Which mechanism should be used to invoke REST calls during tests
	 */
	TestMode testMode = TestMode.MOCKMVC

	/**
	 * Base package for generated tests
	 */
	String basePackageForTests

	/**
	 * Class which all generated tests should extend
	 */
	String baseClassForTests

	/**
	 * Suffix for generated test classes, like Spec or Test
	 */
	String nameSuffixForTests

	/**
	 * Rule class that should be added to generated tests
	 */
	String ruleClassForTests

	/**
	 * Patterns that should not be taken into account for processing
	 */
	List<String> excludedFiles = []

	/**
	 * Patterns for which generated tests should be @Ignored
	 */
	List<String> ignoredFiles = []

	/**
	 * Imports that should be added to generated tests
	 */
	String[] imports = []

	/**
	 * Static imports that should be added to generated tests
	 */
	String[] staticImports = []

	/**
	 * Directory containing contracts written using the GroovyDSL
	 */
	File contractsDslDir

	/**
	 * Test source directory where tests generated from Groovy DSL should be placed
	 */
	File generatedTestSourcesDir

	/**
	 * Dir where the generated WireMock stubs from Groovy DSL should be placed.
	 * You can then mention them in your packaging task to create jar with stubs
	 */
	File stubsOutputDir

	/**
	 * Suffix for the generated Stubs Jar task
	 */
	String stubsSuffix = 'stubs'

	/**
	 * Incubating feature. You can check the size of JSON arrays. If not turned on
	 * explicitly will be disabled.
	 */
	Boolean assertJsonSize = false

}
