/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.sql.expression.function;

import static org.opensearch.sql.expression.function.FunctionDSL.impl;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.opensearch.sql.expression.Expression;

class FunctionDSLimplNoArgTest extends FunctionDSLimplTestBase {
  @Override
  SerializableFunction<FunctionName, Pair<FunctionSignature, FunctionBuilder>>
      getImplementationGenerator() {
    return impl(noArg, ANY_TYPE);
  }

  @Override
  List<Expression> getSampleArguments() {
    return List.of();
  }

  @Override
  String getExpected_toString() {
    return "sample()";
  }
}
