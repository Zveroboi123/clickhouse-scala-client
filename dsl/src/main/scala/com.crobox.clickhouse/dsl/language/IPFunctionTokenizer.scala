package com.crobox.clickhouse.dsl.language

import com.crobox.clickhouse.dsl._
import com.dongxiguo.fastring.Fastring.Implicits._

trait IPFunctionTokenizer {
  self: ClickhouseTokenizerModule =>

  def tokenizeIPFunction(col: IPFunction[_]): String = col match {
    case IPv4NumToString(col: NumericCol) => fast"IPv4NumToString(${tokenizeColumn(col.column)}"
    case IPv4StringToNum(col: StringColMagnet) => fast"IPv4StringToNum(${tokenizeColumn(col.column)}"
    case IPv4NumToStringClassC(col: NumericCol) => fast"IPv4NumToStringClassC(${tokenizeColumn(col.column)}"
    case IPv6NumToString(col: NumericCol) => fast"IPv6NumToString(${tokenizeColumn(col.column)}"
    case IPv6StringToNum(col: StringColMagnet) => fast"IPv6StringToNum(${tokenizeColumn(col.column)}"
  }

}
