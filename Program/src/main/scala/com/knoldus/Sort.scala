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

import scala.annotation.tailrec


class Sort {
  def bubbleSort(inputList: List[Int]): List[Int] = {

    @tailrec def getLargest(list: List[Int],largest: Int, remainingList: List[Int]): (Int, List[Int]) = list match {

      /*returns largest value when list is empty*/
      case Nil => (largest, remainingList)

      /*case when list has only 1 element*/
      case head :: Nil  =>
        if(largest > head){
          (largest, remainingList ::: List(head))
        }
        else {
          (head, remainingList ::: List(largest))
        }

      /*case when list has more than one element*/
      case head :: tail =>
        if (largest > head){
          getLargest(tail,largest, remainingList ::: List(head))
        }
        else {
          getLargest(tail,head, remainingList ::: List(largest))
        }
    }

    @tailrec def bubbleSortNested(inputList: List[Int], outputList: List[Int]): List[Int] = inputList match {

      /*returns list when inputList is empty*/
      case Nil => outputList

      /*case when list is not empty*/
      case _   =>
        val (greatest, tail) = getLargest(inputList.tail,inputList(0),Nil)
        bubbleSortNested(tail,  List(greatest) ::: outputList)
    }

    bubbleSortNested(inputList,Nil)
  }

}
