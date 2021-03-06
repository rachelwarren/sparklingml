package com.sparklingpandas.sparklingml

private[sparklingpandas] class CodeGenerator {
  val testRoot = "src/test/scala/com/sparklingpandas/sparklingml"
  val mainRoot = "src/main/scala/com/sparklingpandas/sparklingml"
  val pythonRoot = "sparklingml/"
  val scalaLicenseHeader = """/*
        | * Licensed to the Apache Software Foundation (ASF) under one or more
        | * contributor license agreements.  See the NOTICE file distributed with
        | * this work for additional information regarding copyright ownership.
        | * The ASF licenses this file to You under the Apache License, Version 2.0
        | * (the "License"); you may not use this file except in compliance with
        | * the License.  You may obtain a copy of the License at
        | *
        | *    http://www.apache.org/licenses/LICENSE-2.0
        | *
        | * Unless required by applicable law or agreed to in writing, software
        | * distributed under the License is distributed on an "AS IS" BASIS,
        | * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        | * See the License for the specific language governing permissions and
        | * limitations under the License.
        | */""".stripMargin('|')

  val pythonLicenseHeader =
    """#
      |# Licensed to the Apache Software Foundation (ASF) under one or more
      |# contributor license agreements.  See the NOTICE file distributed with
      |# this work for additional information regarding copyright ownership.
      |# The ASF licenses this file to You under the Apache License, Version 2.0
      |# (the "License"); you may not use this file except in compliance with
      |# the License.  You may obtain a copy of the License at
      |#
      |# http://www.apache.org/licenses/LICENSE-2.0
      |#
      |# Unless required by applicable law or agreed to in writing, software
      |# distributed under the License is distributed on an "AS IS" BASIS,
      |# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      |# See the License for the specific language governing permissions and
      |# limitations under the License.
      |#""".stripMargin('|')

  val pythonDoctestFooter =
    """
    |if __name__ == "__main__":
    |    import doctest
    |    doctest.testmod(optionflags=doctest.ELLIPSIS)
    |""".stripMargin('|')


}
