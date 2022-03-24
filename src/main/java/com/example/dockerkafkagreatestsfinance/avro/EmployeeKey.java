package com.example.dockerkafkagreatestsfinance.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class EmployeeKey extends org.apache.avro.specific.SpecificRecordBase
        implements org.apache.avro.specific.SpecificRecord  {

    private static final long serialVersionUID = 3871084507007682445L;

    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse(
            "{\"type\":\"record\",\"name\":\"EmployeeKey\",\"namespace\":\"br.com.tqi.dio\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"departmentName\",\"type\":\"string\"}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<EmployeeKey> ENCODER = new BinaryMessageEncoder<EmployeeKey>(MODEL$,
            SCHEMA$);

    private static final BinaryMessageDecoder<EmployeeKey> DECODER = new BinaryMessageDecoder<EmployeeKey>(MODEL$,
            SCHEMA$);

    public static BinaryMessageEncoder<EmployeeKey> getEncoder() {
        return ENCODER;
    }

    public static BinaryMessageDecoder<EmployeeKey> getDecoder() {
        return DECODER;
    }

    public static BinaryMessageDecoder<EmployeeKey> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<EmployeeKey>(MODEL$, SCHEMA$, resolver);
    }

    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    public static EmployeeKey fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated
    public int id;

    @Deprecated
    public java.lang.CharSequence departmentName;

    public EmployeeKey() {
    }

    public EmployeeKey(java.lang.Integer id, java.lang.CharSequence departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return id;
            case 1:
                return departmentName;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                id = (java.lang.Integer) value$;
                break;
            case 1:
                departmentName = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }


    public int getId() {
        return id;
    }


    public void setId(int value) {
        this.id = value;
    }


    public java.lang.CharSequence getDepartmentName() {
        return departmentName;
    }


    public void setDepartmentName(java.lang.CharSequence value) {
        this.departmentName = value;
    }


    public static EmployeeKey.Builder newBuilder() {
        return new EmployeeKey.Builder();
    }

    public static EmployeeKey.Builder newBuilder(Builder other) {
        if (other == null) {
            return new EmployeeKey.Builder();
        }
        else {
            return new EmployeeKey.Builder(other);
        }
    }

    public static EmployeeKey.Builder newBuilder(EmployeeKey other) {
        if (other == null) {
            return new EmployeeKey.Builder();
        }
        else {
            return new EmployeeKey.Builder(other);
        }
    }

    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmployeeKey>
            implements org.apache.avro.data.RecordBuilder<EmployeeKey> {

        private int id;

        private java.lang.CharSequence departmentName;

        private Builder() {
            super(SCHEMA$);
        }

        private Builder(EmployeeKey.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.departmentName)) {
                this.departmentName = data().deepCopy(fields()[1].schema(), other.departmentName);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
        }


        private Builder(EmployeeKey other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.departmentName)) {
                this.departmentName = data().deepCopy(fields()[1].schema(), other.departmentName);
                fieldSetFlags()[1] = true;
            }
        }

        public EmployeeKey.Builder setId(int value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        public boolean hasId() {
            return fieldSetFlags()[0];
        }

        public EmployeeKey.Builder clearId() {
            fieldSetFlags()[0] = false;
            return this;
        }

        public java.lang.CharSequence getDepartmentName() {
            return departmentName;
        }

        public EmployeeKey.Builder setDepartmentName(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.departmentName = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        public boolean hasDepartmentName() {
            return fieldSetFlags()[1];
        }

        public EmployeeKey.Builder clearDepartmentName() {
            departmentName = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public EmployeeKey build() {
            try {
                EmployeeKey record = new EmployeeKey();
                record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
                record.departmentName = fieldSetFlags()[1] ? this.departmentName
                        : (java.lang.CharSequence) defaultValue(fields()[1]);
                return record;
            }
            catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            }
            catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }

    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<EmployeeKey> WRITER$ = (org.apache.avro.io.DatumWriter<EmployeeKey>) MODEL$
            .createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<EmployeeKey> READER$ = (org.apache.avro.io.DatumReader<EmployeeKey>) MODEL$
            .createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out) throws java.io.IOException {
        out.writeInt(this.id);

        out.writeString(this.departmentName);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in) throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.id = in.readInt();

            this.departmentName = in
                    .readString(this.departmentName instanceof Utf8 ? (Utf8) this.departmentName : null);

        }
        else {
            for (int i = 0; i < 2; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.id = in.readInt();
                        break;

                    case 1:
                        this.departmentName = in
                                .readString(this.departmentName instanceof Utf8 ? (Utf8) this.departmentName : null);
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}
