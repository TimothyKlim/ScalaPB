// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.`type`

/** A protocol buffer message type.
  *
  * @param name
  *   The fully qualified message name.
  * @param fields
  *   The list of fields.
  * @param oneofs
  *   The list of types appearing in `oneof` definitions in this type.
  * @param options
  *   The protocol buffer options.
  * @param sourceContext
  *   The source context.
  * @param syntax
  *   The source syntax.
  */
@SerialVersionUID(0L)
final case class Type(
    name: _root_.scala.Predef.String = "",
    fields: _root_.scala.Seq[com.google.protobuf.`type`.Field] = _root_.scala.Seq.empty,
    oneofs: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    options: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto] = _root_.scala.Seq.empty,
    sourceContext: _root_.scala.Option[com.google.protobuf.source_context.SourceContext] = _root_.scala.None,
    syntax: com.google.protobuf.`type`.Syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Type] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      fields.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      oneofs.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      }
      options.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      if (sourceContext.isDefined) {
        val __value = sourceContext.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = syntax.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(6, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      fields.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      oneofs.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sourceContext.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = syntax.value
        if (__v != 0) {
          _output__.writeEnum(6, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): Type = copy(name = __v)
    def clearFields = copy(fields = _root_.scala.Seq.empty)
    def addFields(__vs: com.google.protobuf.`type`.Field*): Type = addAllFields(__vs)
    def addAllFields(__vs: Iterable[com.google.protobuf.`type`.Field]): Type = copy(fields = fields ++ __vs)
    def withFields(__v: _root_.scala.Seq[com.google.protobuf.`type`.Field]): Type = copy(fields = __v)
    def clearOneofs = copy(oneofs = _root_.scala.Seq.empty)
    def addOneofs(__vs: _root_.scala.Predef.String*): Type = addAllOneofs(__vs)
    def addAllOneofs(__vs: Iterable[_root_.scala.Predef.String]): Type = copy(oneofs = oneofs ++ __vs)
    def withOneofs(__v: _root_.scala.Seq[_root_.scala.Predef.String]): Type = copy(oneofs = __v)
    def clearOptions = copy(options = _root_.scala.Seq.empty)
    def addOptions(__vs: com.google.protobuf.`type`.OptionProto*): Type = addAllOptions(__vs)
    def addAllOptions(__vs: Iterable[com.google.protobuf.`type`.OptionProto]): Type = copy(options = options ++ __vs)
    def withOptions(__v: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto]): Type = copy(options = __v)
    def getSourceContext: com.google.protobuf.source_context.SourceContext = sourceContext.getOrElse(com.google.protobuf.source_context.SourceContext.defaultInstance)
    def clearSourceContext: Type = copy(sourceContext = _root_.scala.None)
    def withSourceContext(__v: com.google.protobuf.source_context.SourceContext): Type = copy(sourceContext = Option(__v))
    def withSyntax(__v: com.google.protobuf.`type`.Syntax): Type = copy(syntax = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => fields
        case 3 => oneofs
        case 4 => options
        case 5 => sourceContext.orNull
        case 6 => {
          val __t = syntax.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PRepeated(fields.iterator.map(_.toPMessage).toVector)
        case 3 => _root_.scalapb.descriptors.PRepeated(oneofs.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 4 => _root_.scalapb.descriptors.PRepeated(options.iterator.map(_.toPMessage).toVector)
        case 5 => sourceContext.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => _root_.scalapb.descriptors.PEnum(syntax.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.`type`.Type
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.Type])
}

object Type extends scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Type] with scalapb.HasBuilder[com.google.protobuf.`type`.Type] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Type] with scalapb.HasBuilder[com.google.protobuf.`type`.Type] = this
  def merge(`_message__`: com.google.protobuf.`type`.Type, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.`type`.Type = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.`type`.Type] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.`type`.Type(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        fields = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.protobuf.`type`.Field]]).getOrElse(_root_.scala.Seq.empty),
        oneofs = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Seq[com.google.protobuf.`type`.OptionProto]]).getOrElse(_root_.scala.Seq.empty),
        sourceContext = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.source_context.SourceContext]]),
        syntax = com.google.protobuf.`type`.Syntax.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TypeProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TypeProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.`type`.Field
      case 4 => __out = com.google.protobuf.`type`.OptionProto
      case 5 => __out = com.google.protobuf.source_context.SourceContext
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 6 => com.google.protobuf.`type`.Syntax
    }
  }
  lazy val defaultInstance = com.google.protobuf.`type`.Type(
    name = "",
    fields = _root_.scala.Seq.empty,
    oneofs = _root_.scala.Seq.empty,
    options = _root_.scala.Seq.empty,
    sourceContext = _root_.scala.None,
    syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2
  )
  final class Builder private (
    private var __name: _root_.scala.Predef.String,
    private val __fields: _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.`type`.Field],
    private val __oneofs: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String],
    private val __options: _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.`type`.OptionProto],
    private var __sourceContext: _root_.scala.Option[com.google.protobuf.source_context.SourceContext],
    private var __syntax: com.google.protobuf.`type`.Syntax,
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.`type`.Type] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readStringRequireUtf8()
          case 18 =>
            __fields += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.`type`.Field](_input__)
          case 26 =>
            __oneofs += _input__.readStringRequireUtf8()
          case 34 =>
            __options += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.`type`.OptionProto](_input__)
          case 42 =>
            __sourceContext = Option(__sourceContext.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.source_context.SourceContext](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 48 =>
            __syntax = com.google.protobuf.`type`.Syntax.fromValue(_input__.readEnum())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.`type`.Type = {
      com.google.protobuf.`type`.Type(
          name = __name,
          fields = __fields.result(),
          oneofs = __oneofs.result(),
          options = __options.result(),
          sourceContext = __sourceContext,
          syntax = __syntax,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.`type`.Type, com.google.protobuf.`type`.Type.Builder] {
    def apply(): Builder = new Builder(
      __name = "",
      __fields = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.`type`.Field],
      __oneofs = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String],
      __options = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.`type`.OptionProto],
      __sourceContext = _root_.scala.None,
      __syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2,
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.`type`.Type): Builder = new Builder(
      __name = _message__.name,
      __fields = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.`type`.Field] ++= _message__.fields,
      __oneofs = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] ++= _message__.oneofs,
      __options = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.`type`.OptionProto] ++= _message__.options,
      __sourceContext = _message__.sourceContext,
      __syntax = _message__.syntax,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.`type`.Type.Builder()
  def newBuilder(`_message__`: com.google.protobuf.`type`.Type): Builder = com.google.protobuf.`type`.Type.Builder(_message__)
  implicit class TypeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.Type]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.`type`.Type](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def fields: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.`type`.Field]] = field(_.fields)((c_, f_) => c_.copy(fields = f_))
    def oneofs: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.oneofs)((c_, f_) => c_.copy(oneofs = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.`type`.OptionProto]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def sourceContext: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.source_context.SourceContext] = field(_.getSourceContext)((c_, f_) => c_.copy(sourceContext = Option(f_)))
    def optionalSourceContext: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.source_context.SourceContext]] = field(_.sourceContext)((c_, f_) => c_.copy(sourceContext = f_))
    def syntax: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.Syntax] = field(_.syntax)((c_, f_) => c_.copy(syntax = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val FIELDS_FIELD_NUMBER = 2
  final val ONEOFS_FIELD_NUMBER = 3
  final val OPTIONS_FIELD_NUMBER = 4
  final val SOURCE_CONTEXT_FIELD_NUMBER = 5
  final val SYNTAX_FIELD_NUMBER = 6
  def of(
    name: _root_.scala.Predef.String,
    fields: _root_.scala.Seq[com.google.protobuf.`type`.Field],
    oneofs: _root_.scala.Seq[_root_.scala.Predef.String],
    options: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto],
    sourceContext: _root_.scala.Option[com.google.protobuf.source_context.SourceContext],
    syntax: com.google.protobuf.`type`.Syntax
  ): _root_.com.google.protobuf.`type`.Type = _root_.com.google.protobuf.`type`.Type(
    name,
    fields,
    oneofs,
    options,
    sourceContext,
    syntax
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.Type])
}
