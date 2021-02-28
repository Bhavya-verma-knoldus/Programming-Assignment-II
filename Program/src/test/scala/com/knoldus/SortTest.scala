// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SortTest extends AnyFlatSpec {

  val sort = new Sort

  "Sorting" should "be valid when all numbers are positive" in {
    val list = List(8,4,9,5,1,3,6)
    val sortedList = List(1,3,4,5,6,8,9)
    assert(sortedList==sort.bubbleSort(list))
  }

  it should "be valid when all the numbers are negative" in {
    val list = List(-3,-6,-1,-2,-8,-5,-9)
    val sortedList = List(-9,-8,-6,-5,-3,-2,-1)
    assert(sortedList==sort.bubbleSort(list))
  }

  it should "be valid when all the numbers are same" in {
    val list = List(6,6,6,6,6,6)
    val sortedList = List(6,6,6,6,6,6)
    assert(sortedList==sort.bubbleSort(list))
  }

  it should "be valid when list has only one element" in {
    val list = List(2)
    val sortedList = List(2)
    assert(sortedList==sort.bubbleSort(list))
  }

  it should "be valid when list is empty" in {
    val list = List()
    val sortedList = List()
    assert(sortedList==sort.bubbleSort(list))
  }

  it should "be invalid as list is not sorted" in {
    val list = List(8,3,7,5,2)
    val sortedList = List(3,2,8,7,5)
    assert(!(sortedList==sort.bubbleSort(list)))
  }
}
